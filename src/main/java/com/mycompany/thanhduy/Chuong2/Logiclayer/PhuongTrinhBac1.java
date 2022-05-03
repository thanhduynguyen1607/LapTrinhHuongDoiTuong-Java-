/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.thanhduy.Chuong2.Logiclayer;

/**
 *
 * @author USER
 */
public class PhuongTrinhBac1 implements PhuongTrinhInterface{
     private double a;
    private double b;
    private double nghiem_x;
    private  String ketqua;

    public PhuongTrinhBac1() {
    }

    public PhuongTrinhBac1(double a, double b) {
        this.a = a;
        this.b = b;
        
    }

    @Override
    public void GiaiPhuongTrinh() {
        if(a != 0){
            nghiem_x = -b/a;
            ketqua = "Phuong trinh bac 1 co nghiem la: " + nghiem_x;
        }
        else{
            if(b != 0){
                ketqua ="Phuong trinh bac 1 vo nghiem";
            }
            else{
                ketqua = "Phuong trinh bac 1 co vo so nghiem";
            }
        }
    }

    @Override
    public String toString() {
        if(ketqua == null || ketqua.isEmpty()){
            GiaiPhuongTrinh();
        }
        return ketqua;
    }

    String getKetqua() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
