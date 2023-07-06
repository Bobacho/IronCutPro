/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ironcutpro;

/**
 *
 * @author luciano
 */




import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author LAB 08
 */
public class DarCambio {

    /**
     * @param entrada
     * @param args the command line arguments
     */
    public static List<String> generarCambio(double entrada) {
        // TODO code application logic here
        int s[]={0,0,0,0,0,0,0,0,0,0,0,0};
        int c[]={1000,1000,1000,10000,10000,20000,15000,1200,1200,1000,1000,1000,1000};
        double v[]={200,100,50,20,10,5,2,1,0.5,0.2,0.1,0.05,0.01};
        Cambio moneda = new Cambio();
        double vuelto;
        vuelto = entrada;
        List<String> resultados=new ArrayList<>();
        moneda.VorazCompleto(s, v, c, vuelto);
        if (moneda.Solucion(moneda.getSolucion(), moneda.getVuelto(), vuelto))
        {
            for (int i=0; i <moneda.getSolucion().length; i++)
                if (moneda.getSolucion()[i]>0){
                   resultados.add(String.format("%d monedas de %.2f soles\n", moneda.getSolucion()[i],moneda.getVuelto()[i]));
                }
        }
        else
            resultados.add("No hay solucion");
        return resultados;
        }
    
}
