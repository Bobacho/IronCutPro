/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ironcutpro;
import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author luciano
 */
public class Usuario implements Serializable{
    @Getter @Setter
    private String nombre;
    @Getter @Setter
    private String password;
    @Getter @Setter
    private boolean Admin;
    
    public Usuario(String nombre,String password,boolean Admin)
    {
        this.nombre=nombre;
        this.password=password;
        this.Admin=Admin;
    }
    
}
