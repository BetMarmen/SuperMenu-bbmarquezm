/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos;
public class Numero {
    public static void NumPrimo(String numero)
    {   
        try{
            int cont=1;
        int Num= Integer.parseInt(numero);
        if(Num<=1){
            System.out.println("No es un numero primo");
        }
        else{
            for(int i=2;i<Num;i++){
                int x = Num%i;
                if(x==0){
                    System.out.println("No es un numero primo");
                    cont=0;
                    break;
                }
            }
            if(cont==1)System.out.println("Es un numero primo");
        }
        }
        catch(Exception variable){
            System.out.println(variable.getMessage());
        }
    }
    public static void NumAleatorio(){
        int Numramdom= (int) Math.floor(Math.random()*1000000);
        System.out.println("El numero aleatorio es: "+Numramdom);
    }
    
    public static void SumaDosNumeros( String numero1, String numero2){
        try{
        Double suma;
        Double x = Double.parseDouble(numero1);
        Double y = Double.parseDouble(numero2);
        suma= x+y;
            System.out.println("El resultado es:"+suma);   
        }
        catch(Exception variable){
            System.out.println(variable.getMessage());
        }
    }
    public static void NumBinario(String numero){
    try{
        Double Num=Double.parseDouble(numero);
        int parteEntera=(int)Math.floor(Num);
        Double parteDecimal=Num-parteEntera;
        if(parteDecimal==0.0)System.out.println(Integer.toBinaryString(parteEntera));
        else{
        String Binario= Integer.toBinaryString(parteEntera)+".";
        for(int i=0; i<4; i++){
            parteDecimal*=2;
        int Binario_dec=(int)Math.floor(parteDecimal);
        Binario= Binario+Binario_dec;
        if(Binario_dec==1)parteDecimal=parteDecimal-1;
        }
        System.out.println("El numero en binario es:"+Binario);}
    }
    catch(Exception variable){
        System.out.println(variable.getMessage());
    }
    }   
    public static void FactorialDeUnNUmero(String numero){
    try{
      int Num= Integer.parseInt(numero);
      int factorial=1;
      int j=1;
      for(int i=0;i<Num;i++){
      factorial= factorial*j;
      j++;
      }
        System.out.println("El factorial del numero es: "+factorial);
    }catch(Exception variable){
        System.out.println(variable.getMessage());
    }
    }
}
