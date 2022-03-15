package Ejercicio10;
import java.awt.*;

public class DibujarApp extends Frame{
    MiCanvas canvas;
    
    public static void main(String args[]){
        DibujarApp app = new DibujarApp();
    } 
    
    //constructor
    public DibujarApp(){
        super("Dibujando en el Frame");
        setup();
        pack();
        resize(400,400);
        show();
    }
    
    public void setup(){
        setupMenuBar();
        canvas = new MiCanvas();
        this.add("Center", canvas);
    }

    public void setupMenuBar() throws HeadlessException {
        MenuBar menubar = new MenuBar(); //crear barra de menu
        Menu menu1 = new Menu("Fichero"); //meter cosas en el menu irá dentro de menubar
        menu1.add(new MenuItem("Nuevo"));
        menu1.addSeparator();
        menu1.add(new MenuItem("Salir"));
        menubar.add(menu1); //meter ya el menu en menubar
        
        Menu menu2 = new Menu("Dibujar");
        menu2.add(new MenuItem("Linea"));
        menu2.add(new MenuItem("Óvalo"));
        menu2.add(new MenuItem("Rectángulo"));
        menubar.add(menu2);
        
        this.setMenuBar(menubar); //meter menubar en el Frame
    }
    
    public boolean handleEvent(Event ev){
        if(ev.id == Event.WINDOW_DESTROY){ 
            System.exit(0);
            return true;
        }else if(ev.id == Event.ACTION_EVENT){
            if(ev.target instanceof MenuItem){ //objeto de la clase menu item
                if(ev.arg.equals("Salir")){ 
                    System.exit(0);         
                    return true;            
                }
                else if(ev.arg.equals("Linea")){
                    canvas.setTipo(DosPuntos.LINEA);
                    return true;
                }
                else if(ev.arg.equals("Óvalo")){
                    canvas.setTipo(DosPuntos.OVALO);
                    return true;
                }
                else if(ev.arg.equals("Rectángulo")){
                    canvas.setTipo(DosPuntos.RECTANGULO);
                    return true;
                }
            }
        }
        return false;
    }
}
