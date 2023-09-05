/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tanbir.basic;


public class using_logical_operator {
    
    public static void main(String[] args) {
            
            int a = 20;
            int b = 18;
            int c = 23;
            boolean statement1 = (c>a && c>=b);
            boolean statement2 = (c<a || c==a);
            
            System.out.println("The statement is "  +statement1);
            System.out.println("The statement is "  + statement2);
    }
}
