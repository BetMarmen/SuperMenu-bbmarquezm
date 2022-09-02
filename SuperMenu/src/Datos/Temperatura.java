/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos;

public class Temperatura {
    public static void celciusFahrenheit(String temperatura){
        try{
            Double tem=Double.parseDouble(temperatura);
            Double Fahrenheit=(tem*1.8)+32;
            System.out.println("Su temperatura en Fahrenheit es "+Fahrenheit + "°F");
        }
        catch(Exception variable){
            System.out.println(variable.getMessage());
        }
    }
    public static void FahrenheitCelsius(String temperatura){
        try{
            Double tem= Double.parseDouble(temperatura);
            Double Celsius = (tem-32)/1.8;
            System.out.println("Su temperatura en Celsius es: "+Celsius + "°C");
        }
        catch(Exception variable){
            System.out.println(variable.getMessage());
        }
    
    }
    public static void CelsiusKelvin(String temperatura){
    try{
         Double tem = Double.parseDouble(temperatura);
         Double Kelvin= tem+273.15;
         System.out.println("Su temperatura en Kelvin es:"+Kelvin + "°K");
    }
    catch(Exception variable){
        System.out.println(variable.getMessage());
    }
    }
    public static void KelvinCelsius(String temperatura){
    try{
         Double tem= Double.parseDouble(temperatura);
         Double Celsius= tem-273.15;
         System.out.println("Su temperatura en Celsius es"+Celsius+ "°C");
    }
    catch(Exception variable){
        System.out.println(variable.getMessage());
    }
    }
    public static void FahrenheitKelvin(String temperatura){
    try{
         Double tem= Double.parseDouble(temperatura);
         Double Kelvin= (tem+459.67)/1.8;
         System.out.println("Su temperatura en Kelvin es "+Kelvin+ "°K");
    }
    catch(Exception variable){
        System.out.println(variable.getMessage());
    }
        
    }
    public static void KelvinFahrenheit(String temperatura){
    try{
    Double tem= Double.parseDouble(temperatura);
    Double Fahrenheit= (1.8*tem)-459.67;
        System.out.println("Su temperatura en Fahrenheit es:" +Fahrenheit+ "°F");
    }catch(Exception variable){
        System.out.println(variable.getMessage());
    }
    }
}
