/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117064.latihan51.gajikaryawan;

import java.util.Scanner;

/**
 *
 * @author WAHID HERLAMBANG
 * NAMA     : Wahid Herlambang Suroso
 * KELAS    : PBO2
 * NIM      : 10117064
 * Deskripsi Program : Program ini berisi program untuk menghitung total 
 * gaji karyawan menurut golongan, jabatan dan kehadiran.
 */
public class PBO210117064Latihan51GajiKaryawan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scn = new Scanner (System.in);
        Manager mng = new Manager ();
        
        System.out.println("====Program Perhitungan Gaji Karyawan====");
        System.out.print("Masukkan NIK : ");
        mng.setNik(scn.nextLine());
        
        System.out.print("Masukkan Nama : ");
        mng.setNama(scn.nextLine());
        
        System.out.print("Masukkan Golongan (1/2/3) : ");
        mng.setGolongan(scn.nextInt());
        
        System.out.print("Masukkan Jabatan (Manager/Kabag) : ");
        mng.setJabatan(scn.next());
        
        System.out.print("Masukkan Jumlah Kehadiran : ");
        mng.setKehadiran(scn.nextInt());
        
        System.out.println("\n"+"====Hasil Perhitungan====");
        System.out.println("NIK\t\t: " + mng.getNik());
        System.out.println("NAMA\t\t: " + mng.getNama());
        System.out.println("GOLONGAN\t: " + mng.getGolongan());
        System.out.println("JABATAN\t\t: " + mng.getJabatan());
        
        System.out.println("\n"+"TUNJANGAN GOLONGAN\t: " 
                + mng.tunjanganGolongan(mng.getGolongan()));
        System.out.println("TUNJANGAN JABATAN\t: " 
                + mng.tunjanganJabatan(mng.getJabatan()));
        System.out.println("TUNJANGAN KEHADIRAN\t: " 
                + mng.tunjanganKehadiran(mng.getKehadiran()));
        
        System.out.println("\n"+"GAJI TOTAL\t: " + mng.gajiTotal());
    }
}