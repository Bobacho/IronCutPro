/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ironcutpro;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author luciano
 */
public class ControladorUsuarios {
    List<Usuario> usuarios;
    String ruta="/registros/Usuarios.txt";
    public ControladorUsuarios()
    {
        usuarios=new ArrayList<>();
    }
    public void guardarUsuarios() throws IOException
    {
        Registro<List<Usuario>> r=new Registro(ruta);
        r.guardar(usuarios);
    }
    public void cargarUsuarios() throws IOException, FileNotFoundException, ClassNotFoundException
    {
        Registro<List<Usuario>> r=new Registro(ruta);
        usuarios=r.cargar();
    }
    public void addUsuario(Usuario v)
    {
        usuarios.add(v);
    }
    public Usuario obtenerUsuario(int id)
    {
        return usuarios.get(id);
    }
}
