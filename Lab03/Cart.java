/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab03;

import java.util.ArrayList;

/**
 *
 * @author truongnguyen
 */
public class Cart {
    public static final int MAX_NUMBERS_ORDERED = 20;
    //private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
    ArrayList <DigitalVideoDisc> itemsOrdered = new ArrayList<>();
//    private int qtyOrdered;

//    public int getQtyOrdered() {
//        return qtyOrdered;
//    }
//
//    public void setQtyOrdered(int qtyOrdered) {
//        this.qtyOrdered = qtyOrdered;
//    }
    
    public void addDigitalVideoDisc(DigitalVideoDisc disc){
        if (itemsOrdered.size() + 1 > MAX_NUMBERS_ORDERED) {
            System.out.println("The cart is almost full!");
        } else {
            itemsOrdered.add(disc);
            System.out.println("The disc has been added!");
        }
    }
    
    public void removeDigitalVideoDisc(DigitalVideoDisc disc){
        if (itemsOrdered.size() == 0) {
            System.out.println("The cart is empty!");
        } else {
            itemsOrdered.remove(disc);
            System.out.println("The disc has been removed!");
        }
    }
    
    public float totalCost(){
        float cost = 0;
        for (int i = 0; i < itemsOrdered.size(); i++) {
            cost += itemsOrdered.get(i).getCost();
        }
        return cost;
    }
    
}
