/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import Datos.Numero;
import java.util.Scanner;
public class Menu_Numeros implements I_Menu {
    public Menu_Numeros(){
        
    }
    @Override
    public void opciones(){
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("1.Generar un número aleatorio");
        System.out.println("2.Sumar dos números");
        System.out.println("3.Regresar al menu principal");
    }
    @Override
    public void seleccion(){
        Scanner scan= new Scanner(System.in);
        String opc= null;
        while(!"3".equals(opc)){
            opciones();
            System.out.println("Ingrese una opción");
            opc=scan.next();
            if("3".equals(opc))
            {System.out.println("Devuelta al menu principal");
                    break;}
            switch(opc){
                case "1" :
                    Numero.NumAleatorio();
                    break;
                
                case "2" :
                    System.out.println("Ingrese el primer número");
                    String Num1;
                    Num1= scan.next();
                    System.out.println("Ingrese el segundo número");
                    String Num2;
                    Num2= scan.next();
                    Numero.SumaDosNumeros(Num1, Num2);
                    break;
                
                default:
                    System.out.println("Ingrese una opcion valida");
                    break;
            }
            
        }
    }
}
