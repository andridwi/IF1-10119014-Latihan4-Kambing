/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119014.latihan4.kambing;

/**
 *
 * @author Andri
 * Nama : Andri Dwi p
 * Kelas: IF-1
 * NIM  : 10119014
 */
public class Kambing {
    
    public void tambahKambing() {
        //Deklarasi variabel lokal
        int jumlahKambing =0;
        
        jumlahKambing = jumlahKambing + 5;
        System.out.println("Jumlah Kambing setelah ditambah: " + jumlahKambing);
        
    }
        
    
    public static void main(String[] args){
        Kambing kambingJantan = new Kambing();
        kambingJantan.tambahKambing();
        
    }
}
  
