/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Logica.OrganizacionPrograma;
import java.io.Serializable;

/**
 *
 * @author Jose
 */
public class Credencial implements Serializable {
    private String nombreUsuario;
    private String passwordUsuario;
    
    public Credencial(){
    }
    
    public Credencial(String nombreUsuario, String passwordUsuario){ 
    this.nombreUsuario = nombreUsuario;
    this.passwordUsuario = passwordUsuario;
    }
    
    public void setNombreUsuario(String nombreUsuario){
    this.nombreUsuario = nombreUsuario;
    }
    
    public void setPasswordUsuario(String passwordUsuario){
    this.passwordUsuario = passwordUsuario;
    }
    
    public String getNombreUsuario(){
    return this.nombreUsuario;
    }
    
    public String getPasswordUsuario(){
    return this.passwordUsuario;
    }
    
}
