package Ejercicio05;
//import java.awt.Frame;
//import java.awt.Event;
//import java.awt.Graphics;
import java.awt.*;

public class OvaloApp extends Frame{
    Ovalo ovalo;
    public static void main(String args[]){
        OvaloApp app = new OvaloApp();
    }
    
    //constructor
    public OvaloApp(){
        super("Dibujando óvalos"); //constructor superclase Frame
        ovalo = new Ovalo();
        //la distribución de un Frame por defecto es border layout, con 5 posiciones
        Button boton1 = new Button("Siguiente");
        Button boton2 = new Button("Salir");
        Panel panel = new Panel(); //caja donde meter varios objetos -> linear
        panel.add(boton1);
        panel.add(boton2);
        this.add("South", panel);
        this.pack(); //ajustar los elementos de la ventana
        this.resize(300, 300); //tamaño ventana
        this.show(); //enseña ventana
    }
    
    public void update(Graphics g){ //a este método lo llama repaint
        paint(g);                   //si lo modificamos y ponemos solo esta
    }                               //intruc, no borra los ovalos anteriores
    
    public void paint(Graphics g){ //parte del ciclo de vida del frame
        ovalo.dibuyar(g);
    }
    
    //metodo de tratamiento de eventos
    //todos excepto los listener devuelven valor boolean
    public boolean handleEvent(Event ev){
        if(ev.id == Event.WINDOW_DESTROY){ //si nombre evento es cerrar la ventana
            System.exit(0);
            return true;
        }
        else if(ev.id == Event.ACTION_EVENT){ //si se ha producido evento de accion
            if(ev.target instanceof Button){ 
            //target indica sobre que clase de objeto se ha producido el evento
                if(ev.arg.equals("Salir")){ //arg stributo clase String 
                    System.exit(0);         //puedes poner esta parte solamente
                    return true;            //para ser mas especifico
                }
                else if(ev.arg.equals("Siguiente")){
                    //ovalo = new Ovalo();  //solucion1
                    ovalo.inicializar();    //solucion2
                    repaint();
                    return true;
                }
            }
        }
        return false; 
    }
}
