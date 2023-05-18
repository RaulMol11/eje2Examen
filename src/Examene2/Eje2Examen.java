/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Examene2;

import java.util.Scanner;
/**
 *
 * @author raulm
 */
public class Eje2Examen {
    public static void main(String[] args) {
       int dia1,mes1,año1;String nombres1,apellidoss1;Scanner x = new Scanner(System.in);
       System.out.println("Nombre: "); nombres1 =x.next();
       System.out.println("Apellidos: "); apellidoss1 =x.next();
       System.out.println("");
       System.out.println("Fecha de nacimiento: ");
       System.out.println("Dia: "); dia1 =x.nextInt(); 
       System.out.println("Mes: "); mes1 =x.nextInt();
       System.out.println("Año: "); año1 =x.nextInt();
       
       FrecuenciasCardiacas nombreC = new FrecuenciasCardiacas(nombres1,apellidoss1);
       System.out.println("Nombre completo: "+nombreC.getNombre()+" "+nombreC.getApellidos());
       FrecuenciasCardiacas frecuencias = new FrecuenciasCardiacas(dia1,mes1,año1);
       System.out.println("Fecha de nacimiento: "+frecuencias.getDia()+"/"+frecuencias.getMes()+"/"+frecuencias.getAño());
       System.out.println(frecuencias.verEdad());
       
       
    }
    
    
}
