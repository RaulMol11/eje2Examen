/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Examene2;

/**
 *
 * @author raulm
 */
public class FrecuenciasCardiacas {
     public String nombre;
    public String apellidos;
    public int dia;
    public int mes;
    public int año;

    public FrecuenciasCardiacas(String nombre, String apellidos, int dia, int mes, int año) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dia = dia;
        this.mes = mes;
        this.año = año;
    }

  

    public FrecuenciasCardiacas(String nombre, String apellidos) {
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    public FrecuenciasCardiacas(int dia, int mes, int año) {
        this.dia = dia;
        this.mes = mes;
        this.año = año;
    }
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }
    
    public int verEdad (){
    int edad,frecCa,f1,f2;
    
    edad= 2023-año;
    frecCa=220-edad;
    f1=(int)(frecCa*.50);
    f2=(int)(frecCa*.85);
    System.out.println("Su edad es: "+edad+" años");
    System.out.println("Su frecuencia cardica maxima es: "+frecCa);
    System.out.println("Su frecuencia cardica esperada debe de estar de entre: "+f1+" y "+f2);
    
        return 0;

    }
  
    
    
    
}
