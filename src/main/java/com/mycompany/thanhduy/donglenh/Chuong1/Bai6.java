/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.thanhduy.donglenh.Chuong1;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 *
 * @author USER
 */
public class Bai6 {
    public static void main(String[] args) throws ParseException
    {
     SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH);
     String input = "01-01-2001";
     Date ngaysinh = df.parse(input);
     Person person = new Person("Nguyen van A", 0, ngaysinh);
    
     System.out.println("Ho ten: " + person.getHoten() + 
                "; gioi tinh: " + person.getGioitinh() + 
                "; ngay sinh: " + df.format(person.getNgaysinh()));
     
     Student sinhvien = new Student();
     sinhvien.setHoten("Nguyen Van B");
    sinhvien.setGioitinh(1);
    sinhvien.setNgaysinh(df.parse("01-01-2001"));
    sinhvien.setTruonghoc("Dai hoc Hue");
    System.out.println("Ho ten: " + sinhvien.getHoten() + 
            "; gioi tinh: " + sinhvien.getGioitinh() +
            "; ngay sinh: " + sinhvien.getNgaysinh() +
            "; truong hoc: " +  sinhvien.getTruonghoc());
        System.out.println(sinhvien.calcTax(1200));
        
    Worker congnhan = new Worker();
    congnhan.setHoten("Nguyen Thi C");
    congnhan.setGioitinh(0);
    congnhan.setNgaysinh(df.parse("01-02-2000"));
    congnhan.setCongty("IBM");
    System.out.println("Ho ten: " + congnhan.getHoten() + 
                       "; gioi tinh: " + congnhan.getGioitinh() + 
                       "; ngay sinh: " + congnhan.getNgaysinh() + 
                       "; cong ty: " + congnhan.getCongty());
        System.out.println(congnhan.calcTax(2000));
    }
    
}
