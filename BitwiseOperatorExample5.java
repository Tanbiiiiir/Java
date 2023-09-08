/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tanbir.basic;


public class BitwiseOperatorExample5 {
    public static void main(String[] args) {
        int a = 6;
        int b = 7;
        int and = a & b;
        int or = a | b;
        int xor = a ^ b;
        int rightshift = 6 >> 2;
        int leftShift = 8 << 2;
        
        System.out.println("A & B = " + and);
        System.out.println("A | B = " + or);
        System.out.println(" A ^ B = " + xor);
        System.out.println("6 >> 2 = " + rightshift);
        System.out.println("8 << 2 " + leftShift);
        
        
    }
    
}
