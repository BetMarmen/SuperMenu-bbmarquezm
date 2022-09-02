/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import Datos.Movimiento;
import Datos.Numero;
import java.util.Scanner;
public class Menu_principal implements I_Menu{
    @Override
    public void opciones(){
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("1.Calcular la velocidad de un MRU");
        System.out.println("2.Calcular la altura máxima de un proyectil con trayectoria parabolica");
        System.out.println("3.Identificar si un número es primo");
        System.out.println("4.Calcular el factorial ");
        System.out.println("5.A continuación se mostrara el siguiente menu");
        System.out.println("6.A continuacion se mostrara el menu para convertir temperaturas");
        System.out.println("7.Convertir de decimal a Binario");
        System.out.println("8.Salir");
    }
    @Override
    public void seleccion(){
        System.out.println("Bienvenido a este super menu");
    Scanner scan= new Scanner(System.in);
    String opc=null;
    while(!"8".equals(opc)){
    opciones();
        System.out.println("Ingrese la opción deseada: ");
        opc=scan.next();
        if("8".equals(opc)){
                System.out.println("Has abandonado el programa,hasta pronto!");
                break;
        }
        switch(opc){
            case "1":
                System.out.println("Ingrese su distancia");
                 String distancia;       
                distancia= scan.next();
                System.out.println("Ingrese el tiempo");
                String tiempo;
                tiempo = scan.next();
                Movimiento.VelocidadMRU(distancia, tiempo);
                break;
            case "2":
                System.out.println("Ingrese la velocidad inicial");
               String V_inicial;
               V_inicial = scan.next();
                System.out.println("Ingrese el ángulo de inclinación:");
                String angulo;
                angulo=scan.next();
                Movimiento.HmaxMP(V_inicial, angulo);
                break;
                
            case "3":
                System.out.println("Ingrese el número para saber si es primo ");
                String Num;
                Num= scan.next();
                Numero.NumPrimo(Num);
                break;
                
            case"4":
                System.out.println("Ingrese el número");
                String Nume;
                Nume= scan.next();
                Numero.FactorialDeUnNUmero(Nume);
                break;
                
            case "5":
                Menu_Numeros a=new Menu_Numeros();
                a.seleccion();
                break;
            case "6" :
                Menu_Temperaturas b = new Menu_Temperaturas();
                b.seleccion();
                break;
            case "7":
                System.out.println("Ingrese el numero");
                String numer;
                numer= scan.next();
                Numero.NumBinario(numer);
                break;
            default:
                System.out.println("Ingrese una opcion valida");
                break;
        } 
    }
    }
    
}
