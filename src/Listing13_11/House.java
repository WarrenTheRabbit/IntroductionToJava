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
public class House implements Cloneable, Comparable {

    private int id;
    private double area;

    @Override
    /**
     * Override the protected native clone method defined in the Object class
     * and strengthen its accessibility
     */
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public int compareTo(Object object) {
        int result = 0;
        try {
            House otherHouse = (House) object;
            if (area > otherHouse.area) {
                result = 1;
            } else if (area < otherHouse.area) {
                result = -1;
            } else {
                result = 0;
            }
        } catch (ClassCastException ex) {
            System.out.println("Cannot be compared.");
            System.exit(0);
        }
        return result;
    }
}
