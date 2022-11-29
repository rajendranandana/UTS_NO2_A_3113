/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uts_no2_a_3113;

/**
 *
 * @author Rajendra Nandana
 */
public class CommissionEmployee_3113 extends Employee_3113{
    public float Komisi_3113;
    public float TotalPenjualan_3113;
    public float Totalgaji_3113;
    
    public CommissionEmployee_3113(){
        
    }
    
    public float TotalGaji_3113(){
        Totalgaji_3113 = GajiPokok_3113 + (Komisi_3113 * TotalPenjualan_3113);
        return Totalgaji_3113;
    }
    
    public void TampilData_3113(){
        System.out.println("Commission Employee");
        Tampil_3113();
        System.out.println("Total Gaji: " + Totalgaji_3113);
    }
}
