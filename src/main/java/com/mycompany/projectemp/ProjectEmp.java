/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projectemp;

import java.util.Scanner;

/**
 *
 * @author UNPA
 */
public class ProjectEmp {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String nombre, puesto,dpto;
       int opc;
       
       do{
       
        System.out.println("Ingrese opcion:");
        System.out.println("1 - asalariado; 2 - trabajador por hora; 3 para salir");
       opc = sc.nextInt();
       
       switch(opc){
       
       
           case 1:
       EmpleadoAsal asal = new EmpleadoAsal();
       sc.nextLine();
       System.out.println("Ingrese nombre: ");
       nombre = sc.nextLine();
       
       System.out.println("Ingrese departamento: ");
       dpto = sc.nextLine();
       
       System.out.println("Ingrese puesto: ");
       puesto = sc.nextLine();
       
       System.out.println("Ingrese sueldo mensual: ");
       double sueldom = sc.nextDouble();
       
       asal.setNombre(nombre);
       asal.setDpto(dpto);
       asal.setPuesto(puesto);
       asal.setSueldom(sueldom);
       asal.calcularsueldom();
       
        System.out.println("Nombre: "+asal.getNombre());
        System.out.println("sueldo quincenal: "+asal.getSueldoqnal());
        
        break;
        
           case 2:
               EmpleadoxH h = new EmpleadoxH();
        sc.nextLine();
       System.out.println("Ingrese nombre: ");
       nombre = sc.nextLine();
       
       System.out.println("Ingrese departamento: ");
       dpto = sc.nextLine();
       
       System.out.println("Ingrese puesto: ");
       puesto = sc.nextLine();
       
        System.out.println("Ingrese horas trabajadas: ");
        int ht = sc.nextInt();
        
        System.out.println("Ingrese cuota por hora");
        double hc = sc.nextDouble();
        
        h.setNombre(nombre);
        h.setDpto(dpto);
        h.setPuesto(puesto);
        h.setHt(ht);
        h.setCh(hc);
        h.calcularH();
        
        System.out.println("Nombre: "+ h.getNombre());
        System.out.println("sueldo quincenal: "+ h.getSueldoH());
        break;
        
           case 3:
               System.out.println("Gracias por tu visita");
               break;
               
           default: System.out.println("Opcion invalida");
        
        
        
       }
       }while(opc != 3);
    }
}
