package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;


public class Program {
		public static void main(String[] args) {
			
			Locale.setDefault(Locale.US);
			Scanner sc = new Scanner(System.in);
			
			Rectangle rect = new Rectangle();
			
			System.out.println("Enter rectangle width and height: ");
			rect.width = sc.nextDouble();
			rect.height = sc.nextDouble();
			
			System.out.printf("AREA =  ", rect.area());
			System.out.printf("PERIMETER =  ", rect.perimeter());
			System.out.printf("DIAGONAL =  ", rect.diagonal());
			
			sc.close();
		}
}
