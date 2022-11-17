/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Abstraction;

/**
 *
 * @author HP
 */
public class AnakUmur1Tahun extends Orang{
    public void namaAyahku(){
        System.out.println("Nama Ayahku Adalah : "+ namaAyah);
    }

    @Override
    public void makan(){
        System.out.println("anak Umur 1 Tahun Makan Asi");
    }

    @Override
    public void minum(){
        System.out.println("Anak Umur 1 Tahun Minum Asi");
    }    
}