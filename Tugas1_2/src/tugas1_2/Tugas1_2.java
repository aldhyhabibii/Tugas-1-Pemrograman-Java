/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas1_2;

/**
 *
 * @author Pc
 */
public class Tugas1_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
       	int no1,no2,no3,max;
        no1 = 10;
        no2 = 23;
        no3 = 5;
        System.out.println("Nomor 1 = " +no1);
        System.out.println("Nomor 2 = " +no2);
        System.out.println("Nomor 3 = " +no3);
        max = (no1>no2)?no1:no2;
        max = (max>no3)?max:no3;
        System.out.println("Nilai tertingginya adalah angka = " +max);
    }
    
}
