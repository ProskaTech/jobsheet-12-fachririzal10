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
abstract class Orang {
    public String namaAyah = "Randi Proska";
    abstract void makan();
    public void minum(){
        System.out.println("Minum Air Teh dan Kopi");
    }  
}
