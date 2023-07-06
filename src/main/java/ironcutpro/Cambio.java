/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ironcutpro;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author luciano
 */
public class Cambio {
    private List<int[]> soluciones=new ArrayList<>();
    private List<int[]> c=new ArrayList<>();
    private List<double[]> v=new ArrayList<>();
    public int [] solucion;
    public void Voraz(int s[], double v[],int c[], double cambio)
    {
        double x;
        int i = 0;
        while (!Solucion(s , v, cambio) && i < s.length)
        {
        //Seleccionar moneda
            x= v[i];
            if (Factible(s, v, c[i], cambio, x)){
            //inserta moneda
                s[i]++;
                c[i]--;
            }else
            //rechaza moneda
                i++;
        }
        this.c.add(c);
        this.v.add(v);
        soluciones.add(s);
    }
    public void VorazCompleto(int s[], double v[],int c[], double cambio)
    {
        int []c2=c.clone();
        Voraz(s,v,c,cambio);
        for(int i=s.length-1;i>0;i--)
        {
            int[] s1=new int[i];
            double[] v1=new double[i];
            int[] c1=new int[i];
            System.arraycopy(v, s.length-i, v1, 0, i);
            System.arraycopy(c2, s.length-i, c1, 0, i);
            Voraz(s1,v1,c1,cambio);
        }
    }
    public int sumaMonedas(int [] sumar)
    {
        int suma=0;
        for(int sumando:sumar)
        {
            suma+=sumando;
        }
        return suma;
    }
    public int indiceSolucion()
    {
        int menor=sumaMonedas(soluciones.get(0));
        int retornar=0;
        for(int []iterar:soluciones)
        {
            if(sumaMonedas(iterar)<menor)
            {
                retornar=soluciones.indexOf(iterar);
                menor=sumaMonedas(iterar);
            }
        }
        return retornar;
    }
    public int[] getSolucion()
    {
        int menor=Integer.MAX_VALUE;
        int []retornar=null;
        for(int []iterar:soluciones)
        {
            if(sumaMonedas(iterar)<menor)
            {
                retornar=iterar;
                menor=sumaMonedas(iterar);
            }
        }
        return retornar;
    }
    public int[] getCambio()
    {
        return c.get(indiceSolucion());
    }
    public double[] getVuelto()
    {
        return v.get(indiceSolucion());
    }
    public boolean Solucion (int s[], double v[], double cambio)
    {
        double suma = 0.0;
        for (int i = 0; i< s.length; i++)
        {
            suma += s[i]*v[i];
        }
        suma = Math.rint(suma*100)/100;
        return suma==cambio;
    }
    public boolean Factible (int s[], double v[], int cantidad,double cambio, double x)
    {
        double suma = 0.0;
        for (int i = 0; i< s.length; i++)
        suma += s[i]*v[i];
        suma += x;
        suma = Math.rint(suma*100)/100;
        return suma<=cambio && cantidad>0;
    }

}
