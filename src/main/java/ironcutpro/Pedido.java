/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ironcutpro;

/**
 *
 * @author luciano
 */
public class Pedido {
    private Barra barraInicial;
    private Barra[] barrasGeneradas;
    private int cantidad;
    
    public Barra obtenerBarra(int i)
    {
        return this.barrasGeneradas[i];
    }
    public int obtenerCantidad()
    {
        return cantidad;
    }
}
