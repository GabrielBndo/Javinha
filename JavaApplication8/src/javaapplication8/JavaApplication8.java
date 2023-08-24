/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication8;

import java.util.Scanner;

/**
 *
 * @author gabri
 */
public class JavaApplication8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int x;
        
        System.out.println("Quantas horas?");
        x = sc.nextInt();
     
        if (x >= 12) {
            System.out.println("boa tarde");
        }
        else {
           if (x >= 18) { 
               System.out.println("bom noite");
           }
           else{
               System.out.println("Bom dia");
           }
        }
    
    }
    
 
    
}
