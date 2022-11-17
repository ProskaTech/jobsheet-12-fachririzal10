/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PolymorphismeDynamic;

/**
 *
 * @author HP
 */
public class polymorphismDynamic {
    public static void main(String[] args) {
        Bank B;
        B = new BRI();
        System.out.println("Tingkat Suku Bunga BRI Adalah : "+ B.sukuBunga());
        B = new BNI();
        System.out.println("Tingkat Suku Bunga BNI Adalah : "+ B.sukuBunga());
        B = new Mandiri();
        System.out.println("Tingkat Suku Bunga Mandiri Adalah : "+ B.sukuBunga());      
    }    
}