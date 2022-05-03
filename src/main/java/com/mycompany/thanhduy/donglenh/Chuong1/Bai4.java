/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.thanhduy.donglenh.Chuong1;

/**
 *
 * @author USER
 */
public class Bai4 {
    public static void main(String[] args) {
//        Cirde htron = new Cirde(5, 1, 2);
//        System.out.println("Chu vi cua hinh tron la " + htron.calcPerimeter());
//        System.out.println("Dien tich cua hinh tron la " + htron.calcArea());
//
//        Rectangle hcn = new Rectangle(3, 15, 8, 5);
//        System.out.println("Chu vi hinh chu nhat " + hcn.calcPerimeter());
//        System.out.println("Dien tich hinh chu nhat " + hcn.calcArea());
        
        Shape htron = new Cirde(5, 1, 2);
//        System.out.println("Chu vi cua hinh tron la " + htron.calcPerimeter());
//        System.out.println("Dien tich cua hinh tron la " + htron.calcArea());
        System.out.println(htron.toString());

        Shape hcn = new Rectangle(3, 15, 8, 5);
//        System.out.println("Chu vi hinh chu nhat " + hcn.calcPerimeter());
//        System.out.println("Dien tich hinh chu nhat " + hcn.calcArea());
        System.out.println(hcn);
    }
}
