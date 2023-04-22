package com.xqj.mapper;

import com.xqj.entity.EmployeeEntity;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface EmployeeMapper {

    @Insert("INSERT INTO `hrms`.`employee` (`id`, `name`, `gender`, `politics`, `age`, `job`, `department`, `phone`, `award`) " +
            "VALUES (null, #{name}, #{gender}, #{politics}, #{age}, #{job}, #{department}, #{phone}, #{award});")
    int insertEmployee(EmployeeEntity employeeEntity);

    @Delete("delete from employee where id=#{id}")
    int deleteById(Integer id);

    @Update("UPDATE `hrms`.`employee` SET `name` = #{name}, `gender` = #{gender}, `politics` = #{politics}, `age` = #{age}," +
            " `job` = #{job}, `department` = #{department}, `phone` = #{phone}, `award` = #{award}  WHERE `id` = #{id};")
    int updateEmployee(EmployeeEntity employeeEntity);

    @Select("select * from employee where id=#{id}")
    EmployeeEntity getById(Integer id);

    @Select("select id from employee where id=#{id}")
    Integer haveId(Integer id);

    @Select("select * from employee")
    List<EmployeeEntity> getEmployeesAll();

}
