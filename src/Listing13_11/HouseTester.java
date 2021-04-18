/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Listing13_11;

/**
 *
 * @author Miranda and Warren
 */
public class HouseTester {
    
     public static void main(String[] args) throws CloneNotSupportedException {
        House house1 = new House();
        House house2 = (House) house1.clone();
        House house3 = house1;
         System.out.println(house1);
         System.out.println(house2);
         System.out.println(house3);
    }
    
}
