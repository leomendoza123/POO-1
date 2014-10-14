/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica.Mapa;

import Logica.TiposGuerrero.Defensor;
import Logica.TiposGuerrero.ElementoJugable;
import Logica.TiposGuerrero.AtaqueContacto;
import java.awt.Point;
import java.util.ArrayList;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;

/**
 *
 * @author leoanardo
 */
public final class Mapa {

    public static final int cuadriculaAlto = 18;
    public static final int cuadriculaAncho = 40;
    JLayeredPane jPanel1;
    private ArrayList<ElementoJugable> ElementosGuerreroAtacante; 
    private ArrayList<ElementoJugable> ElementosGuerreroDefensor; 
    private ArrayList<ElementoDibujable> ElementosAmbiente;

    //Constructor falso para MAPA solo para construir los bichos cuando son cargados desde archivos
    //luego cuando ya se van a usar se les pasa el verdadero Mapa que ocuparan
    public Mapa(){
    }
    
    public Mapa(JLayeredPane jPanel1) {
        this.jPanel1 = jPanel1;
        ElementosAmbiente = new ArrayList<>(); 
        ElementosGuerreroAtacante = new ArrayList<>(); 
        ElementosGuerreroDefensor = new ArrayList<>();
        generarMapaBase();
    }

    public void generarMapaBase() {
        for (int fila = 0; fila < cuadriculaAncho; fila++) {
            for (int columna = 0; columna < cuadriculaAlto; columna++) {
                DibujanteCampo ElementoCampo = new DibujanteCampo(jPanel1); 
                ElementosAmbiente.add(ElementoCampo);
                ElementoCampo.posiciona(new Point(fila,columna));
                ElementoCampo.pintar("/Imagenes/Grass.gif");
            }
        }
    }
    
    public void AgregaElementoAtacante (ElementoJugable GA)
    { 
        ElementoDibujable dibujante = new DibujanteCreaturas(jPanel1);
        GA.setDibujante(dibujante); 
        ElementosGuerreroAtacante.add(GA); 
        
        
     }
    public void AgregaElementoDefensor (Defensor GD)
    {
        ElementoDibujable dibujante = new DibujanteCreaturas(jPanel1);
        GD.setDibujante(dibujante); 
        ElementosGuerreroDefensor.add(GD); 
        
    }
    
    public void RunCreaturas(){
        
        for (ElementoJugable Ataque : ElementosGuerreroAtacante) {
            Ataque.start();
        }
        for (ElementoJugable Defensa : ElementosGuerreroDefensor) {
            Defensa.start();
        }
    }

    public ArrayList<ElementoJugable> getElementosGuerreroAtacante() {
        return ElementosGuerreroAtacante;
    }

    public void setElementosGuerreroAtacante(ArrayList<ElementoJugable> ElementosGuerreroAtacante) {
        this.ElementosGuerreroAtacante = ElementosGuerreroAtacante;
    }

    public ArrayList<ElementoJugable> getElementosGuerreroDefensor() {
        return ElementosGuerreroDefensor;
    }

    public void setElementosGuerreroDefensor(ArrayList<ElementoJugable> ElementosGuerreroDefensor) {
        this.ElementosGuerreroDefensor = ElementosGuerreroDefensor;
    }

    
    
    

}