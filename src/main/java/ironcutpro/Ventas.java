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
public class Ventas {
    private List<Pedido> pedidos;
    
    public Ventas()
    {
        pedidos=new ArrayList<>();
    }
    
    public void agregarPedido(Pedido pedido)
    {
        //TODO
        pedidos.add(pedido);
    }
    
    public void procesarPedidos()
    {
        //TODO
    }
    
    public List<Pedido> obtenerPedidos()
    {
        return this.pedidos;
    }
}
