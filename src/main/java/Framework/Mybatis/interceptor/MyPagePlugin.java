package Framework.Mybatis.interceptor;


import org.apache.ibatis.builder.StaticSqlSource;
import org.apache.ibatis.executor.ErrorContext;
import org.apache.ibatis.executor.Executor;
import org.apache.ibatis.mapping.*;
import org.apache.ibatis.plugin.*;

import org.apache.ibatis.session.ResultHandler;
import org.apache.ibatis.session.RowBounds;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Field;

import java.util.Properties;

@Intercepts({
        @Signature(
                type = Executor.class,
                method = "query",
                args = {MappedStatement.class,Object.class, RowBounds.class, ResultHandler.class}
        )
})
public class MyPagePlugin implements Interceptor {

    private static final int STATEMENT_INDEX = 0;
    private static final int PARAMETER_INDEX = 1;
    private static final int Row_Bounds_INDEX = 2;
    Logger logger = LoggerFactory.getLogger(getClass());


    public Object intercept(Invocation invocation) throws Throwable {
        //获取分页信息
        Object[] args = invocation.getArgs();
        RowBounds rb = (RowBounds)args[Row_Bounds_INDEX];

        //如果没有分页参数，就放行
        if(rb == RowBounds.DEFAULT){
            return invocation.proceed();
        }

        //关闭默认分页
        args[Row_Bounds_INDEX] = RowBounds.DEFAULT;

        MappedStatement ms = (MappedStatement) args[STATEMENT_INDEX];
        BoundSql boundSql = ms.getBoundSql(args[PARAMETER_INDEX]);

        //给sql拼接limit
        String sql = boundSql.getSql();
        if(sql.contains(";")){
            sql = sql.replace(";","");
        }
        String limit = String.format("limit %d,%d",rb.getOffset(),rb.getLimit());
        sql = sql + " " + limit ;

        //将拼接好的sql传入SqlSource
        SqlSource sqlSource = new StaticSqlSource(ms.getConfiguration(),sql,boundSql.getParameterMappings());

        //使用反射获取sqlSource字段并传值
        Field field = MappedStatement.class.getDeclaredField("sqlSource");
        field.setAccessible(true);
        field.set(ms,sqlSource);

        logger.info("===分页插件执行===");
        return invocation.proceed();
    }

    public Object plugin(Object target) {
        return Plugin.wrap(target,this);
    }

    public void setProperties(Properties properties) {

    }
}
