/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.trongtin.mathutil.core;

/**
 *
 * @author trongtin2002
 */
// TDD - Test Driven Development - Viet test code truoc khi viet code
// Test First Development - viet, suy nghi ve bo test case/cac tinh huong
public class MathUtil {

    public static long getFactorial(int n) {
        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("n must be between 0 .. 20");
        }
        if (n == 0 || n == 1) {
            return 1;
        }

        long product = 1;// khoi dau  giai thua bai 1
        for (int i = 2; i <= n; i++) {
            product *= i;
        }
        return product;
    }
}
