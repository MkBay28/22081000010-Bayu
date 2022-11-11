/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bmi;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class BMI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        orang orang = new orang();
        System.out.println("Masukan Berat badan (Kg): ");
        orang.weight = sc.nextDouble();
        System.out.println("Masukan Tinggi Badan (cm): ");
        orang.height = sc.nextDouble();
        orang.kalkulatorBMI();
        
       
    }
}
