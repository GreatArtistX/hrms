package com.xqj.service;


import com.xqj.entity.EmployeeEntity;
import com.xqj.mapper.EmployeeMapper;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {


    @Autowired
    private EmployeeMapper employeeMapper;

    public int insertEmployee(EmployeeEntity employeeEntity){
        return employeeMapper.insertEmployee(employeeEntity);
    }

    public int deleteById(Integer id){
        return employeeMapper.deleteById(id);
    }

    public int updateEmployee(EmployeeEntity employeeEntity){
        return employeeMapper.updateEmployee(employeeEntity);
    }

    public EmployeeEntity getById(Integer id){
        return employeeMapper.getById(id);
    }

    public Integer haveId(Integer id){
        return employeeMapper.haveId(id);
    }

    public List<EmployeeEntity> getEmployeesAll(){
        return employeeMapper.getEmployeesAll();
    };
}
