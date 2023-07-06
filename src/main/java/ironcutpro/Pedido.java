/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ironcutpro;

import java.io.Serializable;

/**
 *
 * @author luciano
 */
public class Pedido implements Serializable{
    public Barra barraInicial;
    private Barra[] barrasGeneradas;
    private int cantidad;
    private float costoTotal;

    public float getCostoTotal() {
        return costoTotal;
    }

    public void setCostoTotal(float costoTotal) {
        this.costoTotal = costoTotal;
    }
    
    public void agregarBarraInicial(Barra barra)
    {
        barraInicial=barra;
    }
    public void agregarBarrasGeneradas(Barra []barras)
    {
        barrasGeneradas=barras;
        cantidad=barras.length;
    }
    
    public float[] generarPuntos(boolean esLargo)
    {
        if(!esLargo){
            return barraInicial.generarPuntosCorteAncho(barrasGeneradas);
        }
        else
        {
            return barraInicial.generarPuntosCorteLargo(barrasGeneradas);
        }
    }
    public Barra obtenerBarra(int i)
    {
        return this.barrasGeneradas[i];
    }
    public int obtenerCantidad()
    {
        return cantidad;
    }

    @Override
    public String toString() {
        return "Pedido{"+costoTotal + cantidad+'}';
    }
}
