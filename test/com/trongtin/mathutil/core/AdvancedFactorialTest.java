/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.trongtin.mathutil.core;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

/**
 *
 * @author trongtin2002
 */
@RunWith(value = Parameterized.class)// bao cho biet nay la class nay la class tham so hoa
public class AdvancedFactorialTest {

    // tach toan bo data can test, gom dau vao/input va expected/output
    // ra 1 cho cho de quan ly/de theo doi /de thong ke du cac tinh huong can test hay chua
   @Parameters // co y nghia la tap hop cac tham so
    public static Object[][] initData() {
        // ta co the dac bo data nay o file txt, csv
        return new Integer[][]{
            {0, 1}, {1, 1}, {2, 2}, {3, 6}, {4, 24}, {5, 120}, {6, 720}
        //-- > ham nay goi la Tham SO Hoa
        // Data Driven : Huong ve data
        };
    }
    // chuan bi 2 bien hung data tu mang, sau do thay vao ham test
    
    @Parameterized.Parameter(value = 0) // dung de map value cua mang
    public int input; // input map cot 0 cua mang
    
    @Parameter(value = 1)
    public long expected;// expected map cot 1 cua mang
    @Test
       public void checkFactorialGivenCorrectArgumentReturnsWell() {
        // tui ky vong khi goi ham tinh 5! thi may phai tra ve 120
        
        Assert.assertEquals(expected, MathUtil.getFactorial(input));

       }
}
