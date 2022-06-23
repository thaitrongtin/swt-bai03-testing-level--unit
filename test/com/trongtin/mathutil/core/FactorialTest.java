/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.trongtin.mathutil.core;

import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author trongtin2002
 */
public class FactorialTest {

    @Test
    public void checkFactorialGivenCorrectArgumentReturnsWell() {
        // tui ky vong khi goi ham tinh 5! thi may phai tra ve 120
        long expected = 720;
        long actual = MathUtil.getFactorial(6);

        Assert.assertEquals(expected, actual);

        // dung quen con nhieu tinh huong/test case(cho cac gi cu the de test ham) chua xai
        Assert.assertEquals(720, MathUtil.getFactorial(6));
        Assert.assertEquals(1, MathUtil.getFactorial(0));
        Assert.assertEquals(1, MathUtil.getFactorial(1));

    }

    @Test(expected = IllegalArgumentException.class)// may cu chay ham -5 di, neu ma co loi thi tao dap
    // dap may cai ngoai le(IllegalArgumentException.class) tu dong new cho may cai ngoai le 
// co y nghia la: biem ham nay thanh public static void main()
    //day la cu phat / quy tac cua bo thu vien Junit
    public void checkFactorialGivenWrongArgumentThrowsException() {
        Assert.assertEquals(1, MathUtil.getFactorial(-5));
        MathUtil.getFactorial(21);
        // am tinh ko tinh giai thua
        // >=21 bi trong tpye long. hong tinh luon
        // 2 tinh huong nay co ko co value tra ve, ko the so sanh dc
        // ko asserEquals() so sanh coi co bang hay ko?
    }
}
