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
public class Barra implements Serializable{
    private float longitud;
    private float ancho;
    private String material;
    public void setLongitud(float longitud) {
        this.longitud = longitud;
    }

    public void setAncho(float ancho) {
        this.ancho = ancho;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
    public float obtenerLongitud()
    {
        return this.longitud;
    }
    public float obtenerAncho()
    {
        return this.ancho;
    }
    public String obtenerMaterial()
    {
        return this.material;
    }
    public float[] generarPuntosCorteLargo(Barra [] barras)
    {
        float[] retornar=new float[barras.length];
        float cursor=0;
        int i=0;
        for(Barra barra:barras)
        {
            if(cursor<this.longitud)
            {
                cursor+=barra.longitud;
                retornar[i]=cursor;
                i++;
            }
        }
        
        return retornar;
    }
    public float[] generarPuntosCorteAncho(Barra [] barras)
    {
        //TODO
        float[] retornar=new float[barras.length];
        float cursor=0;
        int i=0;
        for(Barra barra:barras)
        {
            if(cursor<this.ancho)
            {
                cursor+=barra.ancho;
                retornar[i]=cursor;
                i++;
            }
        }
        
        return retornar;
    }
}
