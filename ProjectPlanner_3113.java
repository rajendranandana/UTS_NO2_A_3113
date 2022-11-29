/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uts_no2_a_3113;

/**
 *
 * @author Rajendra Nandana
 */
public class ProjectPlanner_3113 extends Employee_3113{
    public float Komisi_3113;
    public float TotalHslProyek_3113;
    public double Totalgaji_3113;
    
    public ProjectPlanner_3113(){
        
    }
            
    public double TotalGaji_3113(){
        Totalgaji_3113 = GajiPokok_3113 + (Komisi_3113 * TotalHslProyek_3113) - (GajiPokok_3113*5/100);
        return Totalgaji_3113;
    }
    
    public void TampilData_3113(){
        System.out.println("Project Plannner");
        Tampil_3113();
        System.out.println("Total Gaji: " + Totalgaji_3113);
    }
}
