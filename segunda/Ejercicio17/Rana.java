package Ejercicio17;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Rana extends Rectangle{
    Color color;
    public static final int MOV = 12;
    File path = new File("D:/NetBeansProjects/Img/");
    BufferedImage image;
    
    //constructor
    public Rana(){
        super(225, 260, 22, 22);
        //color = Color.green;
        try{
            image = ImageIO.read(new File(path, "corre.png"));   
        }catch(IOException e){System.out.println(e);}
    }
    
    public void dibujar(Graphics j){
        //j.setColor(color);
        j.drawImage(image, x, y, null);
        //j.fillOval(x, y, width, height);
    }
    
    public void actualizar(int direccion){
        switch(direccion){
            case Event.UP:
                y -= MOV;
                break;
            case Event.DOWN:
                y += MOV;
                break;
            case Event.LEFT:
                x -= MOV;
                break;
            case Event.RIGHT:
                x += MOV;
        }
        //y -= MOV; si haces que la rana solo vaya hacia arriba no hace falta dire
    }
}
