
package cleancode_carolinadranicerdranicer;

import java.lang.Math;

public class CleanCode_CarolinaDranicerDranicer {

    public static void main(String[] args) {
        class Punto {
            float coordenadaX;
            float coordenadaY;
   
            public Punto (float CoordenadaX, float CoordenadaY){
                this.coordenadaX = CoordenadaX;
                this.coordenadaY = CoordenadaY;
            }
            public String toString(){
                String retorno = "(" + coordenadaX + " , " + coordenadaY + ")";
                return retorno;
            }
            public double distancia(Punto Param){
                double distancia_calculada = Math.sqrt (Math.pow(Param.coordenadaX-coordenadaX, 2)+Math.pow(Param.coordenadaY-coordenadaY, 2));
                return distancia_calculada;
            //Formula matematica que calcula distancia entre puntos 2D
            }
    } 
        //Declaracion de puntos
        Punto P = new Punto(1.1f , 2.2f);
        Punto Q = new Punto(4.7f , 7.4f);
        Punto R = new Punto(0.5f , 3.5f);
        //Muestra por pantalla las coordenadas de los distintos puntos
            System.out.println("Las coordenadas de los puntos son:\nP:" + P.toString()+ " Q:" + Q.toString() + " R:" + R.toString());
        //Muestra por pantalla de las distancias 
            System.out.printf("La distancia del punto P a Q : %.2f \n" , P.distancia(Q));
            System.out.printf("La distancia del punto P a R : %.2f \n" , P.distancia(R));
            System.out.printf("La distancia del punto R a Q : %.2f \n" , R.distancia(Q));
    }  
}
