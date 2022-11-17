/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritence;

/**
 *
 * @author HP
 */
class RodaDua extends Kendaraan {
    double NaikHargaKe = 0.20;
    void hargaAkhir(){
        hargaDasar = hargaDasar + (hargaDasar + NaikHargaKe);
        System.out.println("Setelah di Modifikasi, Harga Sepeda Menjadi Rp."+ hargaDasar);
    }   
}