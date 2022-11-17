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
public class EncapsulationBuah {
    private String namaBuah;
    private String hargaBuah;
    private String warnaBuah;
    
    public EncapsulationBuah(String namaBuah, String hargaBuah, String warnaBuah){
        this.namaBuah = namaBuah;
        this.hargaBuah = hargaBuah;
        this.warnaBuah = warnaBuah;
    }
    
    public void setName(String namaBuah){
        this.namaBuah = namaBuah;
    }
    
    public void setPrice(String hargaBuah){
        this.hargaBuah = hargaBuah;
    }
    
    public void setcolor(String warnaBuah){
        this.warnaBuah = warnaBuah;
    }
    
    public String getname(){
        return namaBuah;
    }
    
    public String getPrice(){
        return hargaBuah;
    }
    
    public String getColor(){
        return warnaBuah;
    }
}