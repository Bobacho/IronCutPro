/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ironcutpro;

/**
 *
 * @author luciano
 */
public class Inventario {
    Barra[] barras;
    private int barraActual=0;
    public void agregarBarra(Barra barra)
    {
        //TODO
        barras[barraActual]=barra;
    }
    public void actualizarInventario()
    {
        //TODO
    }
    public Barra[] obtenerExistencias()
    {
        //TODO
        return barras;
    }
}
