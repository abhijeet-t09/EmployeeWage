package com.BridgeLabz;
public class EmployeeWage {
    static final int IS_PART_TIME=1;
    static final int IS_FULL_TIME=2;
    //    static final int WAGE_PER_HOUR=20;
    //    static final int FULL_DAY_HOUR=16;
    //    static final int PART_TIME_HOUR=8;
    //    static final int  TOTAL_WORKING_HOURS=100;
    //    static final int TOTAL_WORKING_DAYS=20;


    static void wageCalculation(String companyName, int wagePerHour, int totalWorkingDays, int totalWorkingHour){

        int days=0;
        int empHours=0;
        int workingHours=0;
        int totalWage=0;

        while(days < totalWorkingDays && workingHours <= totalWorkingHour) {
            int empRandom = (int) Math.floor(Math.random() * 10) % 3;
            int dailyWage = 0;

            switch (empRandom) {
                case IS_FULL_TIME:
                    System.out.println("Employee is Present!!");
                    empHours=8;
                    break;

                case IS_PART_TIME:
                    System.out.println("Employee works Part-time!!");
                    empHours=4;
                    break;

                default:
                    empHours=0;
                    System.out.println("Employee is Absent!!");

            }
            workingHours+=empHours;
//            System.out.println("Employee Daily Wage = Rs. " + dailyWage);
            days++;
        }
        totalWage = workingHours * wagePerHour;
        System.out.println();
        System.out.println("Total Hours Worked: "+totalWorkingHour);
        System.out.println("Total Days Worked: "+days);
        System.out.println("Employee Monthly Wage = Rs. "+ totalWage);
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Program");
        wageCalculation("Zydus Cadila", 50, 24, 80);
        System.out.println();
        wageCalculation("Sun Pharma", 80, 20, 100);
    }
}
