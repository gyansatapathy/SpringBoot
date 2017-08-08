package com.gyan.model;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by Gyan on 7/21/2017.
 */

@XmlRootElement
public class Employee {
    @Override
    public String toString() {
        return "Employee [id=" + id + ", balance=" + balance + "]";
    }
    private int id;
    private double balance;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public Employee() {
        super();
        System.out.println("Hi");
    }
    public Employee(int id, double balance) {
        super();
        this.id = id;
        this.balance = balance;
    }
    @XmlElement(name="Bal")
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }


}