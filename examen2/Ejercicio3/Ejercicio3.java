/*
Crear un Frame en el que se muestren dos objetos Choice, en el de la izquierda 
se verán los nombres de las Comunidades Autónomas (poner dos o tres).
Cuando selecciones una Comunidad, en el Choice de la derecha se mostrarán 
las Provincias de la Comunidad elegida.
Se sugiere crear la clase MyChoice.
 */
package Ejercicio3;

import java.awt.*;

public class Ejercicio3 extends Frame{
    TextArea textArea;
    
    public static void main(String args[]){
        Ejercicio3 app = new Ejercicio3();
    } 
    
    //constructor
    public Ejercicio3(){
        super("Ejercicio3 del examen");
        setup();
        pack();
        resize(400,400);
        show();
    }
    
    public void setup(){
        Panel principal = new Panel();
        /*principal.setLayout(new GridLayout(1,2)); //2 celdas
        Panel paneles[][] = new Panel[1][2];
        for(int i = 0; i < paneles.length; i++)
            for (int j = 0; j < paneles[i].length; j++)
                paneles[i][j] = new Panel();*/
       
        //Primera parte
        //llamada a nuestra clase en vez de a la propia de java (Choice)
        String opciones[] = {"Aragón","Andalucia","Madrid"};
        MiChoice eleccion = new MiChoice(opciones);
        principal.add(eleccion);
        
        
        this.add("West", principal);
    }
    
    public boolean handleEvent(Event ev){
        if(ev.id == Event.WINDOW_DESTROY){ 
            System.exit(0);
            return true;
        }
        return false;
    }
}

//nueva clase propia nuestra para mejorar Choice
class MiChoice extends Choice {
    boolean ara = false;
    boolean mad = false;
    boolean and = false;
    Choice provincia = new Choice();
    Panel segundo = new Panel();
    public MiChoice(String v[]){
        super(); //constructor de superclase
        for (int i = 0; i < v.length; i++) {
            this.add(v[i]); //añadirlo a la lista
        }
        if(this.getSelectedItem()== "Aragón"){
            ara = true;
        }
        else if(this.getSelectedItem()== "Andalucia"){
            mad = true;
        }
        else if(this.getSelectedItem()== "Madrid"){
            and = true;
        }
    }
    public boolean action(Event ev, Object ob){
        if(ara){
            provincia.add("Zaragoza");
            provincia.add("Huesca");
            provincia.add("Teruel");
            segundo.add(provincia);
            //añadir segundo al frame, no se como pasarlo
        }
        else if(mad){
            provincia.add("Madrid");
            segundo.add(provincia);
            //añadir segundo al frame, no se como pasarlo
        }
        else if(and){
            provincia.add("Huelva");
            provincia.add("Sevilla");
            provincia.add("Córdoba");
            provincia.add("Jaen");
            provincia.add("Almeria");
            provincia.add("Granada");
            provincia.add("Malaga");
            provincia.add("Cadiz");
            segundo.add(provincia);
            //añadir segundo al frame, no se como pasarlo
        }
        return true;
    }
}
