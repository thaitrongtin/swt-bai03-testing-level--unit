/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.trongtin.mathutil.main;

import com.trongtin.mathutil.core.MathUtil;

/**
 *
 * @author trongtin2002
 */
public class Main {

    public static void main(String[] args) {
        //test = tay, manual testing
        System.out.println("0! : 1? " + MathUtil.getFactorial(0));
        System.out.println("1! : 1? " + MathUtil.getFactorial(1));

        System.out.println("2! : 2? " + MathUtil.getFactorial(2));

        System.out.println("5! : 120? " + MathUtil.getFactorial(5));

        System.out.println("0! : 1? " + MathUtil.getFactorial(0));

    }
}
