/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Encapsulation;

/**
 *
 * @author HP
 */
public class BuahUtama {
    public static void main(String[] args) {
        EncapsulationBuah Apel = new EncapsulationBuah("Apel", "Rp.3000", "Merah");
        System.out.println("Nama Buah : "+ Apel.getname()+"\nHarga : "+Apel.getPrice()+"\nWarna : "+Apel.getColor());
        
        Apel.setcolor("Hijau");
        Apel.setPrice("Rp.7000");
        System.out.println("\nInformasi Terkait Apel Setelah di Update");
        System.out.println("Nama Buah : "+ Apel.getname()+"\nHarga : "+Apel.getPrice()+"\nWarna : "+ Apel.getColor());
    }
}