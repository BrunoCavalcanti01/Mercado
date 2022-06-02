/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package login_;

import java.io.Serializable;

/**
 *
 * @author thoma
 */
public class Totalclass implements Serializable{
    private double total;

    public Totalclass(double total) {
        this.total = total;
    }

    public double getTotal() {
        return this.total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    
}
