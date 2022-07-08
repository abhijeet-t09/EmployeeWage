package com.BridgeLabz;
public class EmployeeWage {
    //static final int EMPLOYEE_PRESENT=1;
    static final int WAGE_PER_HOUR=20;
    static final int FULL_DAY_HOUR=16;
    static final int PART_TIME_HOUR=8;
    static final int IS_PART_TIME=1;
    static final int IS_FULL_TIME=2;

    public static void main(String[] args){
        System.out.println("Welcome to Employee Wage Program");

        int employeePresent=(int)Math.floor(Math.random()*10)%3;
        int dailyWage=0;

        if(employeePresent==IS_FULL_TIME) {
            System.out.println("Employee is Present!!");
            dailyWage=WAGE_PER_HOUR * FULL_DAY_HOUR;
        }
        else if(employeePresent==IS_PART_TIME){
            System.out.println("Employee works Part-time!!");
            dailyWage=WAGE_PER_HOUR * PART_TIME_HOUR;
        }
        else
            System.out.println("Employee is Absent!!");

        System.out.println("Employee Daily Wage = Rs. "+dailyWage);

    }
}
