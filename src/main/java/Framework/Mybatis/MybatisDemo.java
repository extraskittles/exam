package Framework.Mybatis;

import Framework.Mybatis.dao.PeopleMapper;
import Framework.Mybatis.dao.UserMapper;
import Framework.Mybatis.pojo.People;
import Framework.Mybatis.pojo.User;
import Framework.Mybatis.util.MyPage;
import Framework.Mybatis.util.MybatisUtil;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;

import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;

import java.util.List;

public class MybatisDemo {
    private static SqlSessionFactory sqlSessionFactory;
    static {
        sqlSessionFactory = MybatisUtil.getSqlSessionFactory();
    }
    @Test
    public void testMybatis(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        User user2 = (User)sqlSession.selectOne("Framework.Mybatis.dao.UserMapper.select", 2);
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user = userMapper.select(2);
        System.out.println(user.getName());
    }
    @Test
    public void testPageHelper(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        Page<Object> page = PageHelper.startPage(1, 33);
        List<User> users = userMapper.selectAllUser();
        System.out.println(users);
    }
    @Test
    public void testTypeHandler(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        PeopleMapper peopleMapper = sqlSession.getMapper(PeopleMapper.class);
        People people = new People();
        String[] hobbits = {"aa", "bb"};
        people.setHobbits(hobbits);
        int i = peopleMapper.insert(people);
        sqlSession.commit();
        System.out.println(i);
        People select = peopleMapper.select(1);
        System.out.println(select.getHobbits()[0]);
        System.out.println(select.getHobbits()[1]);
    }
    @Test
    public void testRowBounds(){
        long start = System.currentTimeMillis();
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        RowBounds rowBounds = new RowBounds(2,1);
        List<User> users = userMapper.selectAllUserByPage(rowBounds);
        long end =System.currentTimeMillis();
        long middle=end-start;
        System.out.println(middle);
    }
    @Test
    public void testMyPagePlugin(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        List<User> users = userMapper.selectAllByPage();
        System.out.println(users);
    }
    @Test
    public void testCache(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        long start = System.currentTimeMillis();
        User user = (User)sqlSession.selectOne("Framework.Mybatis.dao.UserMapper.select", 2);
        long start2=System.currentTimeMillis();
        System.out.println("第一次查询时间"+(start2-start));
        User user2 = (User)sqlSession.selectOne("Framework.Mybatis.dao.UserMapper.select", 3);
        long start3 =System.currentTimeMillis();
        System.out.println("第二次查询时间"+(start3-start2));
    }
}
