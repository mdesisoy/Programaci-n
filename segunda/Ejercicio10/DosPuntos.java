package Ejercicio10;
import java.awt.*;


public class DosPuntos {
    //el modificador "final" indica que es una constante
    //al poner "public static" podemos usar este atributo desde cualquier clase
    public static final int LINEA = 0;      //para facilitar entendimiento del programa
    public static final int OVALO = 1;      //y poder usar el nombre para identificar
    public static final int RECTANGULO = 2; //la variable
    private int inicioX, inicioY, finX, finY; //atributos encapsulados
    private int tipo;
    
    //construcctor
    public DosPuntos(int iniX, int iniY, int finX, int finY, int t){
        inicioX = iniX;
        inicioY = iniY;
        this.finX = finX;
        this.finY = finY;
        tipo = t;
    }
    
    public DosPuntos(int iniX, int iniY, int t){ //propiedad polimorfismo
        this(iniX, iniY, iniX, iniY, t); //lamada a primer constructor
        
        //inicialmente la posicion de inicio y fin es igual
    }
    
    public DosPuntos(){
        this(0, 0, LINEA); //llamada al segundo constructor que llamara al primero
    }

    //getters y setters -----------------------------
    public int getInicioX() {
        return inicioX;
    }

    public void setInicioX(int inicioX) {
        this.inicioX = inicioX;
    }

    public int getInicioY() {
        return inicioY;
    }

    public void setInicioY(int inicioY) {
        this.inicioY = inicioY;
    }

    public int getFinX() {
        return finX;
    }

    public void setFinX(int finX) {
        this.finX = finX;
    }

    public int getFinY() {
        return finY;
    }

    public void setFinY(int finY) {
        this.finY = finY;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
    //-----------------------------------------------
    
    public void dibujar(Graphics g){
        int anchura = Math.abs(finX - inicioX);
        int altura = Math.abs(finY - inicioY);
        switch(tipo){
            case LINEA:
                g.drawLine(inicioX, inicioY, finX, finY);
                break;
            case OVALO:
                g.drawOval(inicioX, inicioY, anchura, altura);
                break;
            case RECTANGULO:
                g.drawRect(inicioX, inicioY, anchura, altura);
        }
    }
    
}

