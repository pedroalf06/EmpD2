/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projectemp;

/**
 *
 * @author UNPA
 */
public class EmpleadoxH extends Empleado {
    
    int ht;
    double ch,sueldoH;

    public void setHt(int ht) {
        this.ht = ht;
    }

    public void setCh(double ch) {
        this.ch = ch;
    }

    public double getSueldoH() {
        return sueldoH;
    }
    
  public void calcularH(){
      
      sueldoH = ht * ch;
  }  
    
}
