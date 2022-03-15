package Ejercicio12;
import java.applet.Applet;
import java.awt.*;

//Applet _> ventana que se puede meter dentro de una pagina web
public class Mondrian extends Applet implements Runnable{
    public static final int ARRIBA = 0;
    public static final int ABAJO = 1;
    public static final int DCHA = 2;
    public static final int IZDA = 3;
    Thread animacion;
    Image imagen;
    Graphics noseve;
    int posX, posY;
    int direccion;
    
    /*NO TIENE METODO MAIN TIENE UN CICLO DE VIDA
    1º init() -> inicialmente vacio, se suele instanciar atributos
    2º start() -> instanciar thread y llamar a run
    3º paint(Graphics g)
    4º stop() -> se ejecuta al cerrar el Applet
    */
    
    //INIT
    public void init(){
        posX = 80;
        posY = 100;
        direccion = DCHA;
        imagen = this.createImage(300,300); //metodo abstracto -> instanciamos imagen así
        noseve = imagen.getGraphics();//al crear la imagen ya está creado el objeto Graphics, está dentro de la imagen
    }
    
    //START
    public void start(){
        animacion = new Thread(this);
        animacion.start(); //llama a run
    }
    
    public void update(Graphics g){ //lo llama el metodo repaint
        paint(g); //para no borrar
    }
    
    //PAINT
    public void paint(Graphics g){
        noseve.setColor(Color.black); //para borrar el rastro sobreescribes con un fondo
        noseve.fillRect(0, 0, 300, 310);
        noseve.setColor(Color.yellow); //pintamos en el objeto que no se ve
        noseve.fillRect(0, 0, 90, 90);
        noseve.fillRect(250, 0, 40, 190);
        noseve.fillRect(80, 160, 100, 120);
        noseve.setColor(Color.blue);
        noseve.fillRect(80, 220, 220, 90);
        noseve.fillRect(100, 10, 90, 80);
        noseve.setColor(Color.lightGray);
        noseve.fillRect(posX, posY, 110, 90); //rectangulo con animacion
        noseve.setColor(Color.red);
        noseve.fillRect(200, 0, 45, 45);
        noseve.fillRect(0, 110, 70, 200);
        noseve.setColor(Color.magenta);
        noseve.fillRect(200, 55, 60, 135);
        
        g.drawImage(imagen, 0, 0, this); //ahora en el objeto Graphics que si se ve 
                                         //dibujamos la imagen
                                         //this se refiere al applet
    }
    
    //RUN
    public void run(){
        do{
            actualizar();
            repaint();
            try{
                Thread.sleep(10);
            }catch(InterruptedException e){}
        }while(true);
    }

    public void actualizar() {
        switch(direccion){
            case ARRIBA:
                posY--;
                if(posY <= 100)
                    direccion = DCHA;
                break;
            case ABAJO:
                posY++;
                if(posY >= 120)
                    direccion = IZDA;
                break;
            case DCHA:
                posX++;
                if(posX >= 100)
                    direccion = ABAJO;
                break;
            case IZDA:
                posX--;
                if(posX <= 80)
                    direccion = ARRIBA;
        }
    }
}