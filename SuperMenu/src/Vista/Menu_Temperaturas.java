/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import Datos.Temperatura;
import java.util.Scanner;
public class Menu_Temperaturas implements I_Menu {
    public Menu_Temperaturas(){
    
    }

    @Override
    public void opciones() {
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("1.Convertir de Celcius a Fahrenheit");
        System.out.println("2.Convertir de Fahrenheit a Celcius");
        System.out.println("3.Convertir de Celcius a Kelvin");
        System.out.println("4.Convertir de Kelvin a Celcius");
        System.out.println("5.Convertir de Fahrenheit a Kelvin");
        System.out.println("6.Convertir de Kelvin a Fahrenheit");
        System.out.println("7.Regresar al menu principal");
    }

    @Override
    public void seleccion() {
        Scanner scan= new Scanner(System.in);
        String opc= null;
        while (!"7".equals(opc)){
            opciones();
            System.out.println("Ingrese una opción:");
            opc=scan.next();
        if ("7".equals(opc)){
            System.out.println("Devuelta al menu principal");
              break;
        }
        switch (opc){
            case "1" :
                System.out.println("Ingrese la temperatura");
                 String tem1;
                 tem1= scan.next();
                 Temperatura.celciusFahrenheit(tem1);
                 break;
            case "2" :
                System.out.println("Ingrese la temperatura");
                String tem2;
                tem2= scan.next();
                Temperatura.FahrenheitCelsius(tem2);
                break;
            case "3":
                 System.out.println("Ingrese la temperatura");
                  String tem3;
                  tem3= scan.next();
                  Temperatura.CelsiusKelvin(tem3);
                  break;
            case"4" :
                 System.out.println("Ingrese la temperatura");
                 String tem4;
                 tem4= scan.next();
                 Temperatura.KelvinCelsius(tem4);
                 break;
            case"5" :
                 System.out.println("Ingrese la temperatura");
                 String tem5;
                 tem5= scan.next();
                 Temperatura.FahrenheitKelvin(tem5);
                 break;
            case"6" :
                 System.out.println("Ingrese la temperatura");
                  String tem6;
                  tem6= scan.next();
                  Temperatura.KelvinFahrenheit(tem6);
                  break;
           
            default:
                System.out.println("Ingrese una opcion valida");
                break;
        }
        }
        
        
        
    }
    
}
