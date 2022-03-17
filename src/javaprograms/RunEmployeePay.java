/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaprograms;

import java.util.Scanner;

/**
 *
 * @author Llauderes
 */
public class RunEmployeePay{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        
        PartTimeEmployee pt = new PartTimeEmployee();
        FullTimeEmployee ft = new FullTimeEmployee();
        
        char loop = 'y';
        while(loop != 'n'){
            System.out.print("Enter name: ");
            String name = in.nextLine();

            System.out.print("F - Full time\nP - Part time\nOption: ");
            String pick = in.nextLine();
            char choice = Character.toLowerCase(pick.charAt(0));

            switch (choice) {
                case 'f':
                    System.out.print("Enter your Monthly Salary: ");
                    double salary = in.nextDouble();
                    ft.setName(name);
                    ft.setMonthlySalary(salary);
                    System.out.println("Name: " + ft.getName());
                    System.out.printf("Monthly Salary: %.2f \n", ft.getMonthlySalary());
                    break;
                case 'p':
                    System.out.print("Enter your Rate per Hour: ");
                    pt.ratePerHour = in.nextDouble();
                    System.out.print("Enter your hours worked in a month: ");
                    pt.hoursWorked = in.nextInt();
                    double wage = pt.ratePerHour * pt.hoursWorked;
                    pt.setName(name);
                    pt.setWage(wage);
                    System.out.println("Name: " + pt.getName());
                    System.out.printf("Wage this month: %.2f \n", pt.getWage());
                    break;
                default:
                    System.out.println("Invalid Choice!");
                    break;
            }
            System.out.println("");
            in.nextLine();//
            System.out.print("Try Again?Y/N: ");
            String temp = in.nextLine().toLowerCase();
            loop = temp.charAt(0);
        }
        System.out.println("Program Terminated!");
        
        in.close();
    }
}
class Employee {
    String name;
    
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
}

class FullTimeEmployee extends Employee {
    double monthlySalary;
    public void setMonthlySalary(double salary){
        this.monthlySalary = salary;
    }
    public double getMonthlySalary(){
        return monthlySalary;
    }
}

class PartTimeEmployee extends Employee {
    double ratePerHour, wage;
    int hoursWorked;
    public void setWage(double wage){
        this.wage = wage;
    }
    public double getWage(){
        return wage;
    }
}
