/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Capa_Datos;

import Capa_Grafica.MainPrograma;
import static Capa_Grafica.MainPrograma.administradorPrincipalPrograma;
import static Capa_Grafica.MainPrograma.memoriaDePrograma;
import static Capa_Grafica.MainPrograma.personajesJugables;
import Logica.*;
import Logica.Mapa.Mapa;
import Logica.OrganizacionPrograma.Administrador;
import Logica.OrganizacionPrograma.Credencial;
import Logica.OrganizacionPrograma.MemoriaDePrograma;
import Logica.OrganizacionPrograma.Partida;
import Logica.TiposGuerrero.AtaqueAereo;
import Logica.TiposGuerrero.AtaqueBestia;
import Logica.TiposGuerrero.AtaqueContacto;
import Logica.TiposGuerrero.AtaqueHeroe;
import Logica.TiposGuerrero.AtaqueMedianoAlcance;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jose
 */
public class ManejadorDeArchivos {
    
     public static String pathArchivoMemoriaPrograma = "programfiles/MemoriaPrograma.txt";
     public static String pathCarpetaCreaturasPrograma = "programfiles/creaturas";
     public static String pathArchivoADMAdministrador ="programfiles/ArchivoAdministrador.adm";
     public static String pathArchivosPartidas = "programfiles/Partidas/";
     
     public static void inicializarMemoriaPrograma(){
     try {
            Object memoria = ManejadorDeArchivos.leerObjeto(pathArchivoMemoriaPrograma);
            if(memoria == null){
            memoriaDePrograma = new MemoriaDePrograma(); 
            System.out.println("Se parte con el programa en blanco");
            grabarObjeto(pathArchivoMemoriaPrograma,memoriaDePrograma);
            }
            else{
            memoriaDePrograma = (MemoriaDePrograma) memoria;
            }
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MainPrograma.class.getName()).log(Level.SEVERE, null, ex);
        }
     }
     
     public static void inicializarCredencialesAdministrador(){
     String[] datos;
     datos = obtenerContenidoArchivoADM(pathArchivoADMAdministrador);
     String nombreUsuarioAdmin = datos[0];
     String passwordUsuarioAdmin = datos[1];
     Credencial credencial = new Credencial(nombreUsuarioAdmin,passwordUsuarioAdmin);
     administradorPrincipalPrograma = new Administrador(credencial);
     }
    
     
     public static void inicializarCreaturasPrograma(){
       File dir = new File(pathCarpetaCreaturasPrograma);
        if(!dir.exists()){
        System.out.println("El directorio No Existe");
        }
        
        else{
        String[] ficheros = dir.list();
        String[] datos;
        if (ficheros == null){
            System.out.println("No hay ficheros en el directorio especificado");
        }
        else { 
             //int Alcance, String Nombre, String URLapariencia, int Nivel, int Campos, int NivelAparicion, int Costo, int GolpesPorSegundo, int vida, Mapa refMapa, String URLaparienciaAtaque
              //int tipoDeGuerrero;
              //String nombre;
              //int nivelDePoder;
              //int nivelDeAparicion;
              //double costo;
              //int campoEnElEjercito;
              //double cantidadDeGolpesPorUnidadDeTiempo;
              //double vida;
            int tipoDeGuerrero;
            int Alcance;
            String Nombre;
            String URLapariencia;
            int Nivel;
            int Campos;
            int NivelAparicion;
            int Costo;
            int GolpesPorSegundo;
            int vida;
            Mapa refMapa;
            String URLaparienciaAtaque;
            int velocidad;
            String URLruido;

              
               for (int x=0;x<ficheros.length;x++){
                   System.out.println(pathCarpetaCreaturasPrograma+"/"+ficheros[x]);
                    datos = obtenerContenidoArchivoGRO(pathCarpetaCreaturasPrograma+"/"+ficheros[x]);
                    if(datos != null){
                  System.out.print("Entre a ver archivos creatura");
                //    nombre = datos[1];
                //    nivelDePoder =Integer.parseInt(datos[2]);
                //    nivelDeAparicion = Integer.parseInt(datos[3]);
                //    costo = Double.parseDouble(datos[4]);
                //    campoEnElEjercito = Integer.parseInt(datos[5]);
                //    cantidadDeGolpesPorUnidadDeTiempo = Double.parseDouble(datos[6]);
                //    vida = Double.parseDouble(datos[7]); 
                        tipoDeGuerrero = Integer.parseInt(datos[0]);
                  switch(tipoDeGuerrero){
                    case 0: //Guerrero de contacto 1
                    {
                        //AtaqueContacto(int velocidad, String URLruido, String Nombre, String URLapariencia, int Nivel, int Campos, int NivelAparicion, int Costo, int GolpesPorSegundo, int vida, Mapa refMapa, String URLaparienciaAtaque)
                       velocidad = Integer.parseInt(datos[1]);
                       URLruido = datos[2];
                       Nombre = datos[3];
                       URLapariencia = datos[4];
                       Nivel = Integer.parseInt(datos[5]);
                       Campos = Integer.parseInt(datos[6]);
                       NivelAparicion = Integer.parseInt(datos[7]);
                       Costo = Integer.parseInt(datos[8]);
                       GolpesPorSegundo = Integer.parseInt(datos[9]);
                       vida = Integer.parseInt(datos[10]);
                       refMapa = new Mapa();
                       URLaparienciaAtaque = datos[12];
                        personajesJugables.add(new AtaqueContacto(velocidad,URLruido,Nombre,URLapariencia,Nivel,Campos,NivelAparicion,Costo,GolpesPorSegundo,vida,refMapa,URLaparienciaAtaque));
                        break;                                                      
                    }
                    case 1: //Guerrero de mediano alcance
                    {
                        velocidad = Integer.parseInt(datos[1]);
                        Alcance = Integer.parseInt(datos[2]);
                        Nombre = datos[3];
                        URLapariencia = datos[4];
                        Nivel = Integer.parseInt(datos[5]);
                        Campos = Integer.parseInt(datos[6]);
                        NivelAparicion = Integer.parseInt(datos[7]);
                        Costo = Integer.parseInt(datos[8]);
                        GolpesPorSegundo = Integer.parseInt(datos[9]);
                        vida = Integer.parseInt(datos[10]);
                        refMapa = new Mapa();
                        URLaparienciaAtaque = datos[12];
                        personajesJugables.add(new AtaqueMedianoAlcance(velocidad,Alcance,Nombre,URLapariencia,Nivel,Campos,NivelAparicion,Costo,GolpesPorSegundo,vida,refMapa,URLaparienciaAtaque));
                         break;
                    }
                    case 2: //Guerrero Aereo 1
                    {
                   
                   Alcance = Integer.parseInt(datos[1]);
                   Nombre = datos[2];
                   URLapariencia = datos[3];
                   Nivel = Integer.parseInt(datos[4]);
                   Campos = Integer.parseInt(datos[5]);
                   NivelAparicion = Integer.parseInt(datos[6]);
                   Costo = Integer.parseInt(datos[7]);
                   GolpesPorSegundo = Integer.parseInt(datos[8]);
                   vida = Integer.parseInt(datos[9]);
                   refMapa = new Mapa();
                   URLaparienciaAtaque = datos[11];
                       personajesJugables.add(new AtaqueAereo(Alcance,Nombre,URLapariencia,Nivel,Campos,NivelAparicion,Costo,GolpesPorSegundo,vida,refMapa,URLaparienciaAtaque));
                         break;
                    }
                    case 3: //GranBestia
                    {
                        velocidad = Integer.parseInt(datos[1]);
                        Alcance = Integer.parseInt(datos[2]);
                        Nombre = datos[3];
                        URLapariencia = datos[4];
                        Nivel = Integer.parseInt(datos[5]);
                        Campos = Integer.parseInt(datos[6]);
                        NivelAparicion = Integer.parseInt(datos[7]);
                        Costo = Integer.parseInt(datos[8]);
                        GolpesPorSegundo = Integer.parseInt(datos[9]);
                        vida = Integer.parseInt(datos[10]);
                        refMapa = new Mapa();
                        URLaparienciaAtaque = datos[12];
                        //AtaqueBestia(int velocidad, int Alcance, String Nombre, String URLapariencia, int Nivel, int Campos, int NivelAparicion, int Costo, int GolpesPorSegundo, int vida, Mapa refMapa, String URLaparienciaAtaque)
                        personajesJugables.add(new AtaqueBestia(velocidad,Alcance,Nombre,URLapariencia,Nivel,Campos,NivelAparicion,Costo,GolpesPorSegundo,vida,refMapa,URLaparienciaAtaque));
                      
                         break;
                    }
                    case 4: //Heroe
                    {
                        velocidad = Integer.parseInt(datos[1]);
                        URLruido = datos[2];
                        Nombre = datos[3];
                        URLapariencia = datos[4];
                        Nivel = Integer.parseInt(datos[5]);
                        Campos = Integer.parseInt(datos[6]);
                        NivelAparicion = Integer.parseInt(datos[7]);
                        Costo = Integer.parseInt(datos[8]);
                        GolpesPorSegundo = Integer.parseInt(datos[9]);
                        vida = Integer.parseInt(datos[10]);
                        refMapa = new Mapa();
                        URLaparienciaAtaque = datos[12];
                        
                        
                        personajesJugables.add(new AtaqueHeroe(velocidad,URLruido,Nombre,URLapariencia,Nivel,Campos,NivelAparicion,Costo,GolpesPorSegundo,vida,refMapa,URLaparienciaAtaque));
                         break;
                    }
            }
                   
                                     }
                                                  }
             }
        
        }
     }
     
     //Archivo ADM es el cual contendra la contraseña y password del 
     private static String[] obtenerContenidoArchivoADM(String pathArchivoADM){
     
                          try{
        String linea = "";
        String resultado = ""; 
        FileReader archivo;
        archivo = new FileReader(pathArchivoADM);
        BufferedReader lector = new BufferedReader(archivo);
        
        while ((linea = lector.readLine()) != null) {            
	StringTokenizer tokens=new StringTokenizer(linea, "/");
        int nDatos=tokens.countTokens();
        String[] datos=new String[nDatos];
        int i=0;
        while(tokens.hasMoreTokens()){
            String str=tokens.nextToken();
            datos[i]=str;
            i++;
        }
        return datos;
            }
               }
 
    catch (FileNotFoundException ex) {
           return null;
        } catch (IOException ex) {
            return null;
        }
            return null;
     }
     private static String[] obtenerContenidoArchivoGRO(String pathArchivo){
                 try{
        String linea = "";
        String resultado = ""; 
        FileReader archivo;
        archivo = new FileReader(pathArchivo);
        BufferedReader lector = new BufferedReader(archivo);
        while ((linea = lector.readLine()) != null) {            
             //resultado += linea+"\n"; 
            
	StringTokenizer tokens=new StringTokenizer(linea, "*");
        int nDatos=tokens.countTokens();
        String[] datos=new String[nDatos];
        int i=0;
        while(tokens.hasMoreTokens()){
            String str=tokens.nextToken();
            datos[i]=str;
            i++;
        }
        return datos;
       // agenda.agregarContactos(datos[0], datos[1], datos[2], datos[3], datos[4], datos[5], Integer.parseInt(datos[6]));
            }
               }
 
    catch (FileNotFoundException ex) {
           return null;
        } catch (IOException ex) {
            return null;
        }
            return null;
     }
     
     public static void inicializarArchivos(){
         inicializarMemoriaPrograma();
         inicializarCreaturasPrograma();
         inicializarCredencialesAdministrador();
     /*
     File archivo=new File(path);
    
     if (archivo.exists()){
         System.out.println("El archivo " + path + "ya  existe, se respeta su integridad");
     }
     else{
        try {
            if (archivo.createNewFile())
                System.out.println("El archivo usuarios.txt se ha creado correctamente");
            else
                System.out.println("No ha podido ser creado El archivo usuarios.txt");
        } 
        catch (IOException ioe) {
            ioe.printStackTrace();
           }
     }
             */
    }
     
      public static boolean guardarPartida(String fileName,Partida partida){
      return grabarObjeto(pathArchivosPartidas+fileName,partida);
      }
      
      public static boolean guardarMemoriaDePrograma(MemoriaDePrograma memoria){
      return grabarObjeto(pathArchivoMemoriaPrograma,memoria);
      }
      
      public static boolean grabarObjeto (String file, Object obj)
    {
        ObjectOutputStream salida;
        try {
            salida = new ObjectOutputStream(new FileOutputStream(file));
            //salida.writeObject("guardar un objeto compuesto\n");
            salida.writeObject(obj);
            salida.close();
            return true;
        } catch (IOException ex) { return false; }
    }
    
    // escribir objeto
    public static Object leerObjeto (String file) throws ClassNotFoundException
    {
        Object obj;
        ObjectInputStream entrada;
        try {
            entrada = new ObjectInputStream(new FileInputStream(file));
            obj = entrada.readObject();
            entrada.close();
            return obj;
        } catch (IOException ex) { return null; }
    }
     
    //miscelaneas para averiguar si un string es numero
    public static boolean esNumero(String string){
    
        try{
            Integer.parseInt(string);
        }catch (Exception e){
        return false;
        }
    
        return true;
    }
}
