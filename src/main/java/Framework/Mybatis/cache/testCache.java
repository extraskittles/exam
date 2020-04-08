package Framework.Mybatis.cache;

import Framework.Mybatis.dao.UserMapper;
import Framework.Mybatis.pojo.User;
import Framework.Mybatis.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;

public class testCache {
    private static SqlSessionFactory sqlSessionFactory;
    static{
        sqlSessionFactory = MybatisUtil.getSqlSessionFactory();
    }
    @Test
    public void testCache(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        SqlSession sqlSession2 = sqlSessionFactory.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        userMapper.select(2);
        sqlSession.commit();
        UserMapper userMapper2 = sqlSession2.getMapper(UserMapper.class);
        userMapper2.select(2);

    }
    @Test
    public void testInsert(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        User user = new User();

    }
}
