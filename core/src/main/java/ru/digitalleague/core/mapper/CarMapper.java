package ru.digitalleague.core.mapper;


import org.apache.ibatis.annotations.*;
import ru.digitalleague.core.model.Car;

@Mapper
public interface CarMapper {

    @Select("select * from testliquibase.taxi_service.car where id = #{carId}")
    Car getById(Long carId);

    @Insert("insert into testliquibase.taxi_service.car (model, createdttm) values (#{model}, #{createDttm})")
    void insert(Car car);

    @Delete("delete from testliquibase.taxi_service.car where id = #{carId}")
    int delete(Long carId);

    @Update("update testliquibase.taxi_service.car set model = #{model}, createdttm = #{createDttm}")
    int update(Long carId);
}
