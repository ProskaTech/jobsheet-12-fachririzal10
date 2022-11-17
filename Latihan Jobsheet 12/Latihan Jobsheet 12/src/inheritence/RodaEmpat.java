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
public class RodaEmpat extends Kendaraan {
    double NaikHargaKe = 8;
    void hargaAkhir(){
        hargaDasar = hargaDasar + (hargaDasar + NaikHargaKe);
        System.out.println("Setelah di Modifikasi, Harga Mobil Menjadi Rp."+ hargaDasar);
    }
}