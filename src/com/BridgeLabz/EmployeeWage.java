package com.BridgeLabz;
public class EmployeeWage {
    static final int EMPLOYEE_PRESENT=1;
    static final int WAGE_PER_HOUR=20;
    static final int FULL_DAY=16;
    static final int PART_TIME=8;

    public static void main(String[] args){
        System.out.println("Welcome to Employee Wage Program");

        int employeePresent=(int)Math.floor(Math.random()*10)%2;
        int dailyWage=0;

        if(employeePresent==1) {
            System.out.println("Employee is Present!!");
            dailyWage=WAGE_PER_HOUR*FULL_DAY;
        }
        else
            System.out.println("Employee is Absent!!");

        System.out.println("Employee Daily Wage = Rs. "+dailyWage);

    }
}
