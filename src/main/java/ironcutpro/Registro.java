/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ironcutpro;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author luciano
 * @param <T>
 */
public class Registro<T> {
    
    String ruta;
    public Registro(String ruta)
    {
        this.ruta=ruta;
    }      
    public T cargar() throws FileNotFoundException, IOException, ClassNotFoundException
    {
        FileInputStream fin=new FileInputStream(ruta);
        T retornar;
        try (ObjectInputStream in = new ObjectInputStream(fin)) {
            retornar = (T) in.readObject();
        }
        return retornar;
    }
    
    public void guardar(T obj) throws FileNotFoundException, IOException
    {
        FileOutputStream fos=new FileOutputStream(ruta);
        try (ObjectOutputStream os = new ObjectOutputStream(fos)) {
            os.writeObject(obj);
        }
    }
}
