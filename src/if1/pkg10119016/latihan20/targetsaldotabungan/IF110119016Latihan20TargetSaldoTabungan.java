/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119016.latihan20.targetsaldotabungan;

/**
 *
 * @author aditi
 * NAMA              : Aditya Ilham Subagja
 * KELAS             : IF1
 * NIM               : 10119016
 * Deskripsi Program : Program ini berisi program untuk menampilkan cara 
 * melakukan penghitungan target saldo
 */
public class IF110119016Latihan20TargetSaldoTabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       double saldo_awal = 3500000;
        double i = 0;
        do {
            i += 1;
            saldo_awal += Math.floor(saldo_awal * 0.08);
            System.out.printf("Saldo di bulan ke- %1$.0f Rp. %2$,.0f%n" , i , saldo_awal);
        } while (saldo_awal<6000000);
    }
}