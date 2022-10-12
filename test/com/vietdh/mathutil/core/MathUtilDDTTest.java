/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.vietdh.mathutil.core;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static com.vietdh.mathutil.core.MathUtil.*;

/**
 *
 * @author Dang Viet
 */
@RunWith(value = Parameterized.class)
public class MathUtilDDTTest {
   
  
    
    @Parameterized.Parameters
    public static Object[][] initData(){
          //1. Chuẩn bị bộ data, là mảng 2 chiều, 2 cột ứng với Expected và n dòng ứng với các test case
    // Mảng object, số thì dùng Wrapper class - gói các primitive 
//    Ta sẽ map/ánh xạ các cột của mỗi dòng, ví dụ dòng đầu tiên
//    có 2 cột là 1 0 -> ta sẽ ánh xạ 1 vào biến expected. 0 vào biến n
//    tương tự cho các dòng còn lại
        int a[] = {5,10,15,20,25};
        int b[][] = {{1, 0}, {1, 1}, {2, 2}, {6, 3}, {24, 4}, {120, 5}, {720,6}};
        
        
        return new Integer[][]{
            {1, 0}, {1, 1}, {2, 2}, {6, 3}, {24, 4}, {120, 5}, {720,6}
        };
        
    }
    

     @Parameterized.Parameter(value = 0)
     public long expected; //map vào cột 0 của mảng
     
     @Parameterized.Parameter(value = 1)
     public int n; //map vào cột 1 của mảng
    
     
     @Test //Kiểm thử các data dc trích ra từ mảng map vào 2 biến tương ứng
     public void testFactorialGivenArgumentReturnsWell(){
         assertEquals(expected, getFactorial(n));
     }
   
   
    
}

//Phân tích cách ta viết code cho phần test hàm getF() hôm trước
//Assert.assertEquals(???, Math.Util.getFactorial(???)); 
//lệnh dùng để test
//hàm method. Lệnh này dùng lặp đi lặp lại cho các data ta đưa vào
//để lát hồi ta thay data 1 0 thành các dât tương ứng khác
//Nếu ta có dc cách nào đó mà tách dc đám data ra 1 chỗ
//Sau đó từ từ nhồi/móm/feed data này vào câu lệnh test hàm ở trên
//Coi như chỉ cần nhồi 1 lệnh gọi test hàm, data cứ thế tuần tự đẩy vào
//Kỹ thuật tách data ra khỏi các câu lệnh test, sau đó nó nhồi nó vô
//Các câuu lệnh test, giúp rút gọn số câu lệnh test, giúp dể dàng kiểm tra tính thiếu đủ của các test case
//Kỹ thuật này là DDT - Data Driven Testing
//Viết code kiểm thử theo hướng tách data
//Còn gọi 1 tên khác là: Kiểm thử theo kiểu tham số hóa - Parameterize
//Dấu ??? ở câu lệnh gọi hàm chính là tên biến sẽ dùng để nhận
//data từ tập data đã tách ra - CONVERT DATA Thành biến


//Chơi với DDT ta cần
//Bộ data test - tách riêng
//các tham số ứng với bộ data - chính các biến dùng trích data

//Toàn bộ Code trong class này đc viết ra dùng để test code chính ở bên src package 
//Code dc viết ra dùng để đi test code khác
//thì code này dc gọi là test script
//1 test script sẽ chứa mjoeefi code để test hàm chính
//1 test script sẽ chứa nhiều test case 
//                             test case: tình huống xài hàm
//1 test script có thể xài DDT để dẽ bảo trì code test
//Viết code chính có thể xài TDD