package com.gyan.controller;

import com.gyan.model.Employee;
import com.gyan.repository.EmployeeResourceStub;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * Created by Gyan on 7/24/2017.
 */
@RestController
public class EmployeeDetails {
//
//    @RequestMapping(name = "/", method = RequestMethod.GET )
//    public String hello(){
//        return "Hiiiiiiiiiiiiiiiiiiiiiiiii";
//
//    }

    EmployeeResourceStub e = new EmployeeResourceStub();

    @RequestMapping(name ="/allfind", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Collection<Employee>> wayne() {

        Collection<Employee> temp= e.getAllEmployees();

        return new ResponseEntity<Collection<Employee>>(temp, HttpStatus.OK);
    }

    @RequestMapping(value = "/gyan/getemp/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Employee> getEmp(@PathVariable("id") int id){

        return new ResponseEntity<Employee>(e.findEmployee(id), HttpStatus.OK);
    }

    @RequestMapping(value = "/gyan/getme", method = RequestMethod.POST,consumes = MediaType.APPLICATION_JSON_VALUE ,produces = MediaType.APPLICATION_XML_VALUE)
    public ResponseEntity<Employee> getMe(@RequestBody Employee emp){

        return new ResponseEntity<Employee>(emp, HttpStatus.OK);
    }
}
