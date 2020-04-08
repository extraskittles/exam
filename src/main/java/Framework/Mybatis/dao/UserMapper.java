package Framework.Mybatis.dao;

import Framework.Mybatis.pojo.User;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

public interface UserMapper {
    public List<User> selectAllUserByPage(RowBounds rowBounds);
    public User select(int id);
    public List<User> selectAllUser();
    public List<User> selectAllByPage();
    public void insert(User user);
}
