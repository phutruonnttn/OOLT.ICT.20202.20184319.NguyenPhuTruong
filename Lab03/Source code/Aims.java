/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab03;

/**
 *
 * @author truongnguyen
 */
public class Aims {
    public static void main(String[] args) {
        //create a new cart
        Cart anOrder = new Cart();
        
        //add DVD to the cart
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        anOrder.addDigitalVideoDisc(dvd1);
        
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
        anOrder.addDigitalVideoDisc(dvd2);
        
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 19.95f);
        anOrder.addDigitalVideoDisc(dvd3);
        
        DigitalVideoDisc dvd4 = new DigitalVideoDisc("Harry Potter");
        anOrder.addDigitalVideoDisc(dvd4);
        
        //show the cart
        anOrder.displayCart();
        
        //remove DVD from the cart
        anOrder.removeDigitalVideoDisc(dvd3);
        anOrder.displayCart();
        
        //print total cost
        System.out.print("Total Cost is: ");
        System.out.println(anOrder.totalCost());
    }
}
