/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

/**
 *
 * @author HP
 */
class AktivitasPagiAnak implements AktivitasPagi{

    @Override
    public void lari() {
        System.out.println("Aktivitas Pertama Pagi Ini Adalah lari Pagi");
    }

    @Override
    public void berenang() {
        System.out.println("Aktivitas Kedua Pagi Ini Adalah berenang");
    } 
}
