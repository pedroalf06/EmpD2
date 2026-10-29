/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projectemp;

/**
 *
 * @author UNPA
 */
public class EmpleadoAsal extends Empleado {
   private double sueldom, sueldoqnal;

    public void setSueldom(double sueldom) {
        this.sueldom = sueldom;
    }

    public double getSueldoqnal() {
        return sueldoqnal;
    }
   
   public void calcularsueldom(){
       sueldoqnal = sueldom/2;
   } 
}
