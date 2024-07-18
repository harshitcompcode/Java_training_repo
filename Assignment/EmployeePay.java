package com.graymatter.Assignment;

public class EmployeePay {
	
    public static void main(String[] args) {
        Employee[] employees = {
        		new Employee("Divyanshu", 1101, 690000.0),
        		new Employee("Aman", 1102, 40000.0),
        		new Employee("Amit", 1103, 29000.0),
        		new Employee("Sarah", 1104, 64000.0),
        		new Employee("Uday", 1105, 62000.0),
        		new Employee("Namita", 1106, 51000.0),
        		new Employee("Rekha", 1107, 49000.0)
        	 };
        
        for (Employee emp : employees) {
        	
            emp.calculateSal();
                        
            System.out.println("Employee Name: " + emp.getEmpName());
            System.out.println("Employee ID: " + emp.getEmpId());
            System.out.println("Basic Pay: $" + emp.getBasicPay());
            System.out.println("Gross Salary: $" + emp.grossSal);
            System.out.println("Net Salary: $" + emp.netSal);
            System.out.println();
        }
    }

    private static class Employee {
        private String empName;
        private int empId;
        private double basicPay;
        private double grossSal;
        private double netSal;

        public Employee(String empName, int empId, double basicPay) {
            this.empName = empName;
            this.empId = empId;
            this.basicPay = basicPay;
        }

        public String getEmpName() {
            return empName;
        }

        public int getEmpId() {
            return empId;
        }

        public double getBasicPay() {
            return basicPay;
        }

        public void calculateSal() {
            if (basicPay > 70000.0 && basicPay <= 90000.0) {
                double hra = 0.15 * basicPay;
                double ta = 0.10 * basicPay;
                double da = 0.10 * basicPay;
                grossSal = basicPay + hra + ta + da;
            
                double incomeTax = 0.10 * basicPay;
                netSal = grossSal - incomeTax;
            }
            
            else if (basicPay > 50000.0 && basicPay <= 70000.0) {
                double hra = 0.13 * basicPay;
                double ta = 0.08 * basicPay;
                double da = 0.08 * basicPay;
                grossSal = basicPay + hra + ta + da;
                
                double incomeTax = 0.09 * basicPay;
                netSal = grossSal - incomeTax;
            }
            
            else if (basicPay > 30000.0 && basicPay <= 50000.0) {
                double hra = 0.10 * basicPay;
                double ta = 0.07 * basicPay;
                double da = 0.07 * basicPay;
                grossSal = basicPay + hra + ta + da;
                
                double incomeTax = 0.08 * basicPay;
                netSal = grossSal - incomeTax;
            }
            
            else if (basicPay <= 30000.0) {
                double hra = 0.08 * basicPay;
                double ta = 0.06 * basicPay;
                double da = 0.06 * basicPay;
                grossSal = basicPay + hra + ta + da;
                
                double incomeTax = 0.00 * basicPay;
                netSal = grossSal - incomeTax;
            }
        }
    }
}



