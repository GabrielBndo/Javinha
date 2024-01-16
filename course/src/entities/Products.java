/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;


public class Products {
        public String name;
        public double price;
        public int quantity;
        
        public double totalValueInStock(){
            return price * quantity; 
        }
        
        public void addProducts(int quantity){
            this.quantity +=  quantity;
}
        public void removeProducts(int quantity) {
            this.quantity -= quantity;
        }
}
