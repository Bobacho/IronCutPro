/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ironcutpro;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author luciano
 */
public class ControladorUsuarios {
    List<Usuario> usuarios;
    String ruta="Usuarios.txt";
    public ControladorUsuarios() throws IOException, FileNotFoundException, ClassNotFoundException
    {
        usuarios=new ArrayList<>();
        cargarUsuarios();
    }
    public void guardarUsuarios() throws IOException
    {
        Registro<List<Usuario>> r=new Registro(ruta);
        r.guardar(usuarios);
    }
    public void eliminarUsuarios(Usuario usuario)
    {
        usuarios.remove(usuario);
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
    public Usuario[] toArray()
    {
        Usuario[] retornar=new Usuario[usuarios.size()];
        for(int i=0;i<usuarios.size();i++)
        {
            retornar[i]=usuarios.get(i);
        }
        return retornar;
    }
    public Usuario buscarUsuario(String nombre)
    {
        for(Usuario it:toArray())
        {
            if(it.getNombre().equals(nombre))
            {
                return it;
            }
        }
        return null;
    }
    public int buscarUsuario(Usuario usuario)
    {
        Comparator<Usuario> comparator=new Comparator<Usuario>() {
            @Override
            public int compare(Usuario t, Usuario t1) {
                return t.getNombre().compareTo(t1.getNombre());
            }
        };
            
        Operaciones<Usuario> op=new Operaciones();
        Usuario[] u=toArray();
        op.ordenadoPorQuickSort(u,comparator);
        return op.busquedaBinaria(u, usuario,comparator);
    }
    public boolean existeUsuario(Usuario usuario)
    {
        Comparator<Usuario> comparator=new Comparator<Usuario>() {
            @Override
            public int compare(Usuario t, Usuario t1) {
                return t.getNombre().compareTo(t1.getNombre());
            }
        };
            
        Operaciones<Usuario> op=new Operaciones();
        Usuario[] u=toArray();
        op.ordenadoPorQuickSort(u,comparator);
        return op.busquedaBinaria(u, usuario,comparator) != -1;
    }
}
