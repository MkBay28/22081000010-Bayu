/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bmi;

/**
 *
 * @author USER
 */
public class orang {
    double height, weight, hasil;
    
    void kalkulatorBMI(){
        hasil = weight / (height * height);
        System.out.println("Hasil Body Mask Indexmu (BMI) adalah : " + hasil + " kg/m2 ");
        if (hasil <18.5) {
            System.out.println("Anda Terlalu Kurus :( ");
        } 
        else if (hasil < 25) {
            System.out.println("Anda Normal :) ");
        }
        else if (hasil < 30) {
            System.out.println("Anda Sedikit Gemuk :| ");
        }
        else {
            System.out.println("Anda Obesitas :( ");
        }
    }
}
