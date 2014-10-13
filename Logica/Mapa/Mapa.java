/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica.Mapa;

import Logica.TiposGuerrero.Guerrero;
import Logica.TiposGuerrero.GuerreroTerrestre;
import java.awt.Point;
import java.util.ArrayList;
import javax.swing.JPanel;

/**
 *
 * @author leoanardo
 */
public final class Mapa {

    public static final int TAMANO = 30;
    JPanel jPanel1;
    private ArrayList<Guerrero> ElementosGuerrero; 
    private ArrayList<ElementoDibujable> ElementosAmbiente;

    public Mapa(JPanel jPanel1) {
        this.jPanel1 = jPanel1;
        ElementosAmbiente = new ArrayList<>(); 
        ElementosGuerrero = new ArrayList<>(); 
        generarMapaBase();
    }

    public void generarMapaBase() {
        for (int fila = 0; fila < TAMANO; fila++) {
            for (int columna = 0; columna < TAMANO; columna++) {
                DibujanteCampo ElementoCampo = new DibujanteCampo(jPanel1); 
                ElementosAmbiente.add(ElementoCampo);
                ElementoCampo.posiciona(new Point(fila,columna));
            }
        }
    }
    GuerreroTerrestre GA;
    public void AgregaCreatura ()
    {
       ///TODO aqui se agrega las creaturas, pero tienen que ser resividas como parametros
        int x = 0; 
        
        ElementoDibujable dibujante = new DibujanteCreaturas(jPanel1);
        GA = new GuerreroTerrestre(x, x, x, null, jPanel1, this, dibujante);
        ElementosGuerrero.add(GA); 
        
     }
    
    public void RunCreaturas(){
        
        for (Guerrero Guerrero : ElementosGuerrero) {
            Guerrero.start();
        }
    }

}