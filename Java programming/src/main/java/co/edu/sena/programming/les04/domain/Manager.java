package co.edu.sena.programming.les04.domain;

import java.text.NumberFormat;

public class Manager extends Employee {
    private String deptName;

    public Manager(int empId, String name, String ssn, double salary, String deptName) {
        super(empId, name, ssn, salary);
        this.deptName = deptName;
    }

    public String getDeptName() {
        return deptName;
    }

    @Override
    public String toString(){
        return super.toString() +", "+ "\'Department:" + getDeptName()+", ";
    }
}