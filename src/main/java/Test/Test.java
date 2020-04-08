package Test;

import Framework.Mybatis.pojo.User;
import org.apache.ibatis.executor.statement.StatementHandler;
import org.apache.ibatis.javassist.tools.reflect.Metaobject;
import org.apache.ibatis.reflection.MetaObject;
import org.apache.ibatis.reflection.SystemMetaObject;
import org.apache.ibatis.type.TypeHandler;

import java.util.ArrayList;
import java.util.List;

public class Test {
    @org.junit.Test
    public void test(){
        TestMeta testMeta = new TestMeta();
        MetaObject metaObject = SystemMetaObject.forObject(testMeta);
        String aaa = (String)metaObject.getValue("aaa");
        System.out.println(aaa);
    }
}
