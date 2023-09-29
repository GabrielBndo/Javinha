/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package application;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author gabri
 */
public class Program {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double xA, xB, xC, yA, yB, yC;
        
        System.out.println("Diga a medida do traiangulo X: ");
        xA = sc.nextDouble();
        xB = sc.nextDouble();
        xC = sc.nextDouble();
        System.out.println("Diga a medida do traiangulo Y: ");
        yA = sc.nextDouble();
        yB = sc.nextDouble();
        yC = sc.nextDouble();
        
        double p = (xA + xB + xC) / 2.0;
        double areaX = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC));
        
        double areaY = Math.sqrt(p * (p - yA) * (p - yB) * (p - yC));
        
        System.out.printf("Traingle x area: %.4f%n", areaX);
        System.out.printf("Traingle y area: %.4f%n", areaY);
        
        if (areaX > areaY) {
            System.out.println("Area maior X");   
       }
        else {
            System.out.println("Area maor Y"); 
        }
        
        sc.close();
    }
}
