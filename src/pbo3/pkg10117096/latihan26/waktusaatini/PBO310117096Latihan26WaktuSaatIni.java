/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117096.latihan26.waktusaatini;

import java.text.SimpleDateFormat;
import java.util.Date;


/**
 *
 * @author 
 * NAMA         : Miftah Muhammad Sidqi
 * NIM          : 10117096
 * KELAS        : PBO3
 * DESKRIPSI    : Program ini berisi program untuk menampilkan waktu saat ini
 */
public class PBO310117096Latihan26WaktuSaatIni {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         

      Date HariSekarang = new Date( );
      SimpleDateFormat ft = 
      new SimpleDateFormat ("E dd/MM/yyyy 'pukul' HH:mm:ss  ");

      System.out.println("Tanggal dan waktu saat ini: " + ft.format(HariSekarang));
    }
    
}
