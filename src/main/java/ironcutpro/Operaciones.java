/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ironcutpro;

import java.util.Comparator;



/**
 *
 * @author luciano
 * @param <T>
 */
public class Operaciones<T>{
    Comparator comparator;
    
    
    private void ordenar(T par1, T par2)
    {
        T temp=par1;
        par1=par2;
        par2=temp;
    }
    
    public T[] ordenadoPorQuickSort(T[] arreglo)
    {
        quickSort(arreglo,0,arreglo.length-1);
        return arreglo;
    }
    private void quickSort(T[] arreglo, int inicio, int fin)
    {
        int izq=inicio;
        int der=fin;
        int pivote = inicio;
        boolean bandera=false;
        while(bandera)
        {
            while(pivote!=der && comparator.compare(arreglo[pivote], arreglo[der])<=0)
            {
                der--;
            }
            if(pivote!=der)
            {
                ordenar(arreglo[pivote],arreglo[der]);
                pivote=der;
            }
            while(pivote!=izq && comparator.compare(arreglo[pivote], arreglo[der])>=0)
            {
                izq++;
            }
            if(pivote!=izq)
            {
                ordenar(arreglo[pivote],arreglo[der]);
                pivote=izq;
                bandera=false;
            }
        }
        if(pivote-1>inicio)
        {
            quickSort(arreglo,0,pivote-1);
        }
        if(fin> pivote+1)
        {
            quickSort(arreglo,pivote+1,fin);
        }
    }
    
    public int busquedaBinaria(T[] arreglo, T elemento)
    {
        int izq=0;
        int der=arreglo.length;
        int medio;
        int retornar=-1;
        boolean bandera=true;
        while(bandera)
        {
            medio=(izq+der)/2;
            if(arreglo[medio].equals(elemento))
            {
                retornar=medio;
                bandera=false;
            }
            else if(comparator.compare(arreglo[medio],elemento)>0)
            {
                der=medio+1;
            }
            else if(comparator.compare(arreglo[medio],elemento)<0)
            {
                izq=medio-1;
            }
            else
            {
                bandera=false;
            }
        }
        return retornar;
    }
    
    
}
