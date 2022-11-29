
package com.mycompany.uts_no2_a_3113;

/**
 *
 * @author Rajendra Nandana
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class UTS_NO2_A_3113 {

    public static void main(String[] args) {
        SalariedEmployee_3113 se = new SalariedEmployee_3113();
        CommissionEmployee_3113 ce = new CommissionEmployee_3113();
        ProjectPlanner_3113 pp = new ProjectPlanner_3113();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));        
        try{
            System.out.println("Data Pegawai");
            System.out.print("Nama: ");
            se.Nama_3113 = br.readLine();
            System.out.print("NIP: ");
            se.NIP_3113 = br.readLine();
            System.out.print("Gaji Pokok: ");
            se.GajiPokok_3113 = Float.parseFloat(br.readLine());
            se.TampilData_3113();
            
            System.out.print("Nama: ");
            ce.Nama_3113 = br.readLine();
            System.out.print("NIP: ");
            ce.NIP_3113 = br.readLine();
            System.out.print("GajiPokok: ");
            ce.GajiPokok_3113 = Float.parseFloat(br.readLine());
            System.out.print("Komisi: ");
            ce.Komisi_3113 = Float.parseFloat(br.readLine());
            System.out.print("Total Penjualan: ");
            ce.TotalPenjualan_3113 = Float.parseFloat(br.readLine());
            ce.TotalGaji_3113();
            ce.TampilData_3113();
            
            System.out.print("Nama: ");
            pp.Nama_3113 = br.readLine();
            System.out.print("NIP: ");
            pp.NIP_3113 = br.readLine();
            System.out.print("Gaji Pokok: ");
            pp.GajiPokok_3113 = Float.parseFloat(br.readLine());
            System.out.print("Komisi: ");
            pp.Komisi_3113 = Float.parseFloat(br.readLine());
            System.out.print("Total Hasil Proyek: ");
            pp.TotalHslProyek_3113 = Float.parseFloat(br.readLine());
            pp.TotalGaji_3113();
            pp.TampilData_3113();
        }catch(Exception ex){
            System.out.println(ex);
        }
    }
}
