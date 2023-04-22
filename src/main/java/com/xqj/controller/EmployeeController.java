package com.xqj.controller;

import com.xqj.entity.EmployeeEntity;
import com.xqj.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;



@RestController
@RequestMapping("/employee")
@CrossOrigin(origins = "*", maxAge = 3600)
public class EmployeeController extends BaseController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/getById/{id}")
    public Map<String, Object> getById(@PathVariable("id") Integer id){
        if (id == null){
            return setResultError("id is null");
        }
        EmployeeEntity employee = employeeService.getById(id);
        if (employee == null){
            return setResultError("该Id未查询到数据");
        }
        return setResultSuccess(employee);
    }

    @PostMapping("/insertEmployee")
    public Map<String, Object> insertEmployee(@RequestBody EmployeeEntity employeeEntity){
        return employeeService.insertEmployee(employeeEntity)>0
                ? setResult(200, "ok", null)
                : setResult(500, "no", null);
    }

    @DeleteMapping ("/deleteById/{id}")
    public Map<String, Object> deleteById(@PathVariable("id") Integer id){
        if (id == null){
            return setResult(500,"id is null",null);
        }else {
            EmployeeEntity employee = employeeService.getById(id);
            employeeService.deleteById(id);
            return setResult(200,"success",employee);
        }
    }

    @PutMapping("/updateEmployee")
    public Map<String, Object> updateEmployee(@RequestBody EmployeeEntity employeeEntity){
        Integer a = employeeService.haveId(employeeEntity.getId());
        if(a == null){
            return setResultError("无该id");
        }else {
            return employeeService.updateEmployee(employeeEntity)>0
                    ? setResultSuccess1("更改成功")
                    : setResultError("更改失败");
        }
    }

    @GetMapping("/getEmployeesAll")
    public Map<String, Object> getEmployeesAll(){
        List<EmployeeEntity> listEmployee = employeeService.getEmployeesAll();
        return setResult(200,"success",listEmployee);
    }

}
