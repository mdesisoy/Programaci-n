package Ejercicio10;
import java.awt.Canvas;
import java.awt.Event;
import java.awt.Graphics;
import java.util.List;
//si pones java.awt.* como tiene una clase List y nosotros queremos usar la de
//util, habría que declarar java.util.List cada vez que quisieses usar la clase
import java.util.ArrayList;

public class MiCanvas extends Canvas{
    public List<DosPuntos> dps; //lista para guardar los dibujos
    public DosPuntos actual;
    private int tipo = DosPuntos.LINEA; //DEFAULT es Linea
    
    //getters y setters--------------
    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
    //-------------------------------
    
    //constructor
    public MiCanvas(){
        super(); //constructor superclase
        // dp = new DosPuntos(); no se pone aquí, se instancia al hacer click
        dps = new ArrayList<DosPuntos>(); //entre <> especificar el tipo de elementos que tenemos
                                          //la clase List es abstracta y no se puede instanciar, usamos array
        
    }
    
    public void paint(Graphics g){
        if(actual != null)
            actual.dibujar(g);
        for (int i = 0; i < dps.size(); i++) { //size como length pero para List
            dps.get(i).dibujar(g);
        }
    }
    
    /*public void update(Graphics g){
        paint(g);
    }*/
    
     public boolean mouseDown(Event ev, int x, int y){
        actual = new DosPuntos(x, y, tipo);
        return true;
     }
     
     public boolean mouseDrag(Event ev, int x, int y){
        actual.setFinX(x);
        actual.setFinY(y);
        repaint(); //si no solo paint se ejecuta una vez
        return true;
     }
     
     public boolean mouseUp(Event ev, int x, int y){
        dps.add(actual);
        actual = null; //una vez guardado en la lista actual ya apuntara a null
        return true;
     }
}
