package com.gyan.repository;

import com.gyan.model.Employee;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Gyan on 7/24/2017.
 *
 */

public class EmployeeResourceStub {
    public List<Employee> getAllEmployees(){
        List<Employee> list=new ArrayList<Employee>();

        list.add(new Employee(1,200.5));
        list.add(new Employee(2,335.5));
        list.add(new Employee(3,1223.5));

        return list;
    }
    public Employee findEmployee(int eid) {
        return new Employee(eid, 1232.55);

    }
    public Employee update(Employee eemp) {
        // TODO Auto-generated method stub
        return eemp;
    }
    public List<Employee> findByid(List<String> values) {
//		System.out.println(values);
        List<Employee> rs=new ArrayList<Employee>();
        for(String i:values){
//			int iss=Integer.parseInt(i);
//			rs.add(new Employee(iss, iss*200.43));
            System.out.println("Hi"+i);
        }
        return rs;
    }

}



