/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.vietdh.mathutil.main;

import com.vietdh.mathutil.core.MathUtil;

/**
 *
 * @author Dang Viet
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        long expected = 120;
//        int n = 5;
//        
//        long actual = MathUtil.getFactorial(n);
//        
//         System.out.println("expected:" + expected  + ",actual:" + actual);

        //Test ngoai le
        testFactorialGivenWrongArgumentThrowsException();
         
    }
    
    public static void testFactorialGivenWrongArgumentThrowsException(){
        //Dua data ca chon, n am, n qua lon
        //Thay ngoai le mung roi nuoc mat, xuat hien nhu ki vong -> passed test cased
        MathUtil.getFactorial(5);
    }
    
    
}
