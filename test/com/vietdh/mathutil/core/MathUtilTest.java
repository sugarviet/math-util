/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.vietdh.mathutil.core;

import org.junit.Assert;
import org.junit.Test;


/**
 *
 * @author Dang Viet
 */
public class MathUtilTest {
    
     @Test
        public void testFactorialGivenRightArgumentReturnsWell2(){
//          Test case #3: n = 1; hy vong ham tra ve 1  
            Assert.assertEquals(6, MathUtil.getFactorial(3));
            
//          Test case #4: n = 2; hy vong ham tra ve 2  
            Assert.assertEquals(24, MathUtil.getFactorial(4));
        } 
//    Ten ham phao=i noi len y nghia cua viec kiem thu
        @Test
        public void testFactorialGivenRightArgumentReturnsWell(){
            long expected =  1;
            long actual = MathUtil.getFactorial(0);
            
            Assert.assertEquals(expected, actual);
            
//          Test case #2: n = 1; hy vong ham tra ve 1  
            Assert.assertEquals(1, MathUtil.getFactorial(1));
            
//          Test case #3: n = 2; hy vong ham tra ve 2  
            Assert.assertEquals(2, MathUtil.getFactorial(2));
        }    
//    @Test ra lenh cho thu vien Junit tu dong generate ra cai ham public static void main()
//    Va gui ham main() nay cho JVM chay - Java Virtual Machine
//    @Test ~~~ main()
//    Ko @Test thi class ko co main(), lay gi ma runable
    
    @Test
    public void tryJUnitComparision(){
    //@ - annotation
    Assert.assertEquals(200, 200);
    }
    
//    @Test(expected = IllegalArgumentException.class)
//        @Test(expected = Exception.class)
//    public  void testFactorialGivenWrongArgumentThrowsException(){
//        //Dua data ca chon, n am, n qua lon
//        //Thay ngoai le mung roi nuoc mat, xuat hien nhu ki vong -> passed test cased
//        MathUtil.getFactorial(-5);
//    }
    
}

//Class này dev sẽ viết các hàm để test code chính 
//so sánh expected và actual
//Ex: JUnit, TestNG (Java)
//    xUnit, MSTest, NUnit (c#)
//Test script: Code dùng để test code
// Test script là các đoạn code đc viết ra để test code chính (DAO, DTO, Controller, ...)
//Test script sẽ sử dụng các test case
//Test case la gi 
//