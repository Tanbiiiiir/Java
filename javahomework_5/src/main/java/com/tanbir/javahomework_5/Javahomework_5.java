/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.tanbir.javahomework_5;

/**
 *
 * @author TANBIR
 */
public class Javahomework_5 {

    public static void main(String[] args) {
        Javahomework_5 obj1 = new Javahomework_5();
        String name = obj1.getName();
        int age = obj1.getAge();
        String address = obj1.getAddress();
        int hour = 6;
        int hsalary = 100;
        int salary = obj1.calculateSalary(hour,hsalary);
        
        System.out.println("Hi there.I'm " + name + "." );
        System.out.println("I'm  " + age + "years old" );
        System.out.println("My address is " + address + "." );
        System.out.println("My salary is " + salary + "." );
    }
    public String getName(){
        return "Tanbir";
    }
    public String getAddress(){
        return "Gobindagonj";
    }
    public int getAge(){
        
        return 19;
    }
    public int calculateSalary(int hour,int hsalary){
        
        return   hour * hsalary;
    }
        
}