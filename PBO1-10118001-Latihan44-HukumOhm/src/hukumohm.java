/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author
 * Nama      : Alfian Soasiu
 * Kelas     : PBO1
 * NIM       : 10118001
 * Deskripsi : Menampilkan output hukum ohm
 * 
 */
public class hukumohm {
    
    public static void main(String[] args) {
        
        Baterai baterai = new Baterai();
        Baterai ohm = new Baterai(3,12);
        System.out.println("Kuat Arus : " + ohm.getKuatArus() + " ampere");
        System.out.println("Hambatan : " + ohm.getHambatan() + " ohm");
        System.out.println("Hasil Tegangan : " + ohm.hitungTegangan()+ " volt");
    }
}
