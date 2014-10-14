/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Logica.TiposGuerrero;
import Logica.Mapa.ElementoDibujable;
import Logica.Mapa.Mapa;
import java.awt.Point;

/**
 *
 * @author dmora
 */
public abstract class ElementoJugable extends Thread  {
    
    // atributos
    private String Nombre,URLapariencia;
    private int Nivel,  Campos,  NivelAparicion,  Costo, GolpesPorSegundo, vida;
    private Mapa refMapa;
    private ElementoDibujable dibujante;
    public Point posicion = new Point(0,0); 
    
    // refJuego
    boolean detener = false;

    public ElementoJugable(String Nombre, String URLapariencia, int Nivel, int Campos, int NivelAparicion, int Costo, int GolpesPorSegundo, int vida, Mapa refMapa) {
        this.Nombre = Nombre;
        this.URLapariencia = URLapariencia;
        this.Nivel = Nivel;
        this.Campos = Campos;
        this.NivelAparicion = NivelAparicion;
        this.Costo = Costo;
        this.GolpesPorSegundo = GolpesPorSegundo;
        this.vida = vida;
        this.refMapa = refMapa;
    }
    
    @Override
    public abstract void run();
    public abstract void atacar();
    public abstract void mover();
    public abstract void pegar();
    
    public void detener()
    {
        this.detener = true;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getURLapariencia() {
        return URLapariencia;
    }

    public void setURLapariencia(String URLapariencia) {
        this.URLapariencia = URLapariencia;
    }

    public int getNivel() {
        return Nivel;
    }

    public void setNivel(int Nivel) {
        this.Nivel = Nivel;
    }

    public int getCampos() {
        return Campos;
    }

    public void setCampos(int Campos) {
        this.Campos = Campos;
    }

    public int getNivelAparicion() {
        return NivelAparicion;
    }

    public void setNivelAparicion(int NivelAparicion) {
        this.NivelAparicion = NivelAparicion;
    }

    public int getCosto() {
        return Costo;
    }

    public void setCosto(int Costo) {
        this.Costo = Costo;
    }

    public int getGolpesPorSegundo() {
        return GolpesPorSegundo;
    }

    public void setGolpesPorSegundo(int GolpesPorSegundo) {
        this.GolpesPorSegundo = GolpesPorSegundo;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public Mapa getRefMapa() {
        return refMapa;
    }

    public void setRefMapa(Mapa refMapa) {
        this.refMapa = refMapa;
    }

    public Point getPosicion() {
        return posicion;
    }

    public void setPosicion(Point posicion) {
        this.posicion = posicion;
    }

    public ElementoDibujable getDibujante() {
        return dibujante;
    }

    public void setDibujante(ElementoDibujable dibujante) {
        this.dibujante = dibujante;
    }

    public boolean isDetener() {
        return detener;
    }

    public void setDetener(boolean detener) {
        this.detener = detener;
    }


    
    
}

