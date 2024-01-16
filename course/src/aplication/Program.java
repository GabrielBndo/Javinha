/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplication;

import entities.Products;
import java.util.Locale;
import java.util.Scanner;
public class Program {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        Products products = new Products();
        System.out.println("Enter product data:");
        System.out.print("Name: ");
        products.name = sc.nextLine();
        System.out.print("Price: ");
        products.price = sc.nextDouble();
        System.out.print("Quantity: ");
        products.quantity = sc.nextInt();
        
        System.out.println(products.name + ", " + products.price + ", " + products.quantity);
        
        sc.close();
    }
}
