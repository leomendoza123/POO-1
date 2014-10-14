/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Logica.TiposGuerrero;
import Logica.Mapa.ElementoDibujable;
import Logica.Mapa.Mapa;
import java.awt.Point;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author dmora
 */
public abstract class ElementoJugable extends Thread implements Cloneable  {
    
    // atributos
    private String Nombre,URLapariencia, URLaparienciaAtaque;
    private int Nivel,  Campos,  NivelAparicion,  Costo, GolpesPorSegundo, vida;
    boolean vivo;
    Mapa refMapa;
    ElementoDibujable dibujante;
    public Point posicion = new Point(0,0);
    static final float velocidadDeJuego = 1; 
    String URLaparienciaMuerto = "/Imagenes/muerto.png"; 
    
    // refJuego
    boolean detener = false;

      public Object clone()
{
    Object clone = null;
    try
    {
        clone = super.clone();
    } 
    catch(Exception e)
    {
        // No deberia suceder
    }
    return clone;
}
      
    public ElementoJugable(String Nombre, String URLapariencia, int Nivel, int Campos, int NivelAparicion, int Costo, int GolpesPorSegundo, int vida, Mapa refMapa, String URLaparienciaAtaque) {
        
        this.Nombre = Nombre;
        this.URLapariencia = URLapariencia;
        this.Nivel = Nivel;
        this.Campos = Campos;
        this.NivelAparicion = NivelAparicion;
        this.Costo = Costo;
        this.GolpesPorSegundo = GolpesPorSegundo;
        this.vida = vida;
        this.refMapa = refMapa;
        this.URLaparienciaAtaque = URLaparienciaAtaque; 
    }
    
    @Override
    public final void run(){
        vivo = true; 
                while (!detener && vivo)
        {
            try {
                // se mueve "velocidad" segundos
                int miliSegundosRestantes = (int)(1000 * velocidadDeJuego); 
                int miliSegundosPorGole = (int)(miliSegundosRestantes / GolpesPorSegundo);
                                
                 for (; miliSegundosRestantes>0; miliSegundosRestantes-=miliSegundosPorGole ){
                     atacar();
                     sleep(miliSegundosPorGole);
                 }
                mover();
                
            } catch (InterruptedException ex) {}
        }
    }
    
    
    public final void atacar(){
        ElementoJugable Objetivo = EnemigoAtacable();
        if (Objetivo!=null && vivo){
            Objetivo.vida--;
            if (Objetivo.vida<=0){
                Objetivo.muerto();
            }
        }
                
    }
      
    public ElementoJugable EnemigoAtacable(){
        ElementoJugable Objetivo = EnemigoMasCercanoVivo(); 
        if (
                Objetivo != null 
                &&
                Objetivo.posicion.distance(posicion)<=1.51 )
            return Objetivo ;
        return   null; 
    }
    
    public void mover(){
        ElementoJugable Objetivo = EnemigoMasCercanoVivo(); ;

        if (Objetivo!=null && vivo){
            if (posicion.x > Objetivo.posicion.x+1)
                posicion.x--;
            else if (posicion.x < Objetivo.posicion.x-1)
                posicion.x++;

          if (posicion.y > Objetivo.posicion.y+1)
                posicion.y--;
            else if (posicion.y < Objetivo.posicion.y-1)
                posicion.y++;
          
           getDibujante().posiciona(posicion); 
        }
    }
    
    public final ElementoJugable EnemigoMasCercanoVivo(){
        ArrayList<ElementoJugable> EnemigosEnMapa = EnemigosObjetivoVivos(); 
        ElementoJugable EnemigoMasCercano = null;
        double DistanciaDeEnemigoMasCercano = 100; 
        double TempDistanciaConEnemigo;
        
        for (ElementoJugable Enemigo : EnemigosEnMapa) {
            TempDistanciaConEnemigo = this.posicion.distance(Enemigo.posicion);
            if (TempDistanciaConEnemigo < DistanciaDeEnemigoMasCercano ){
                DistanciaDeEnemigoMasCercano = TempDistanciaConEnemigo; 
                EnemigoMasCercano = Enemigo; 
            }
        }
        return EnemigoMasCercano; 
    }
    
    public final ArrayList<ElementoJugable> EnemigosObjetivoVivos (){
        ArrayList<ElementoJugable> EnemigosObjetivo = EnemigosObjetivo();
        ArrayList<ElementoJugable> EnemigosObjetivoVivos = new ArrayList<>(); 
        for (ElementoJugable Enemigo : EnemigosObjetivo) {
            if (Enemigo.vivo){
                EnemigosObjetivoVivos.add(Enemigo);
            }
        }
        return EnemigosObjetivoVivos; 
   
    }
    
    public ArrayList<ElementoJugable> EnemigosObjetivo (){
        return refMapa.getElementosGuerreroDefensor(); 
    }
    
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

    public boolean isVivo() {
        return vivo;
    }

    public void muerto() {
        
        this.vivo = false;
        this.dibujante.pintar(URLaparienciaMuerto);
        this.dibujante.disminuirPosicionZ();
        
    }

    

    
    
}

