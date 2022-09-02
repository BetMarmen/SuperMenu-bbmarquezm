package Datos;
public class Movimiento {
    public static void VelocidadMRU(String distancia, String tiempo){
        Double velocidad;
        try{
            Double Distancia=Double.parseDouble(distancia);
            Double Tiempo=Double.parseDouble(tiempo);
            velocidad= Distancia/Tiempo;
            if(Tiempo==0){
                System.out.println("No hay division entre 0 ");
              
            }
            else{
                System.out.println(" La velocidad es "+velocidad);
            }
        }catch(Exception variable){
            System.out.println(variable.getMessage());
        }
    }
    public static void HmaxMP(String v_inicial, String angulo){
        Double hmax;
        try{
            Double V_inicial = Double.parseDouble(v_inicial);
            Double Angulo = Double.parseDouble(angulo)*0.01745329;
            Double seno= Math.sin(Angulo);
            Double senCuadrado=Math.pow(seno, 2);
            Double V_inicialCuadrada= Math.pow(V_inicial, 2);
            Double gravedad= (9.8)*2;
            hmax= (V_inicialCuadrada*senCuadrado)/ gravedad;
            System.out.println("La altura Máxima del proyectil es : "+hmax);
        }catch(Exception variable){
            System.out.println(variable.getMessage());
        
        }
        
    }
}
