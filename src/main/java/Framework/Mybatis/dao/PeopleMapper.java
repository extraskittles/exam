package Framework.Mybatis.dao;

import Framework.Mybatis.pojo.People;

public interface PeopleMapper {
    int insert(People people);
    People select(int id);
}
