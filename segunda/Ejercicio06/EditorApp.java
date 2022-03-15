package Ejercicio06;
import java.awt.*;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
//import java.awt.Frame;
//import java.awt.Event;
//import java.awt.TextArea;
//import java.awt.MenuBar;
//import java.awt.Menu;
//import java.awt.MenuItem;
//import java.awt.FileDialog;

public class EditorApp extends Frame{
    TextArea texto;
    MenuBar menubar;
    MenuItem item;
    FileDialog abrirFichero;
    FileDialog guardarFichero;
    
    public static void main(String args[]){
        EditorApp app = new EditorApp();
    }
    
    //constructor
    public EditorApp(){
        super("Editor de textos");
        setup();
        pack();
        resize(texto.getMinimumSize());
        show();
    }

    public void setup() throws HeadlessException {
        texto = new TextArea(30,70); //medida en caracteres
        add("Center", texto);
        setMenuBar(); 
        abrirFichero = new FileDialog(this, "Abrir Fichero", FileDialog.LOAD);
        guardarFichero = new FileDialog(this, "Guardar Fichero", FileDialog.SAVE);
    }

    public void setMenuBar() throws HeadlessException {
        menubar = new MenuBar(); //crear barra de menu
        Menu menu = new Menu("Archivo"); //meter cosas en el menu irá dentro de menubar
        menu.add(new MenuItem("Nuevo")); //instanciar sin darle un nombre al objeto
        menu.add(new MenuItem("Abrir"));
        menu.addSeparator();
        menu.add(new MenuItem("Guardar como..."));
        menu.addSeparator();
        menu.add(new MenuItem("Salir"));
        menubar.add(menu); //meter ya el menu en menubar
        this.setMenuBar(menubar); //meter menubar en el Frame
    }
    
    public boolean handleEvent(Event ev){
        if(ev.id == Event.WINDOW_DESTROY){ //si nombre evento es cerrar la ventana
            System.exit(0);
            return true;
        }
        else if(ev.id == Event.ACTION_EVENT){
            if(ev.target instanceof MenuItem){ //objeto de la clase menu item
                if(ev.arg.equals("Salir")){ 
                    System.exit(0);         
                    return true;            
                }
                else if(ev.arg.equals("Nuevo")){
                    texto.setText(" ");
                    return true;
                }
                else if(ev.arg.equals("Abrir")){
                    abrirFichero.show();
                    leerFichero();
                    return true;
                }                
                else if(ev.arg.equals("Guardar como...")){
                    guardarFichero.show();
                    grabarFichero();
                    return true;
                }                
            }
        }
        return false;
    }

    public void grabarFichero() {
        String outFile = abrirFichero.getDirectory()
                         + abrirFichero.getFile();
        DataOutputStream outStream;//escritura
        try{
            outStream = new DataOutputStream(new FileOutputStream(outFile));
            outStream.writeBytes(texto.getText());
        }catch(FileNotFoundException e){System.out.println(e);}
        catch(IOException e){System.out.println(e);}
    }

    public void leerFichero() {
        String inFile = abrirFichero.getDirectory();
        inFile += abrirFichero.getFile();
        //OTRA FORMA
        //String inFile = abrirFichero.getDirectory()
        // + "/" + abrirFichero.getFile();
        DataInputStream inStream;
        //cargar contenido del fichero en la app
        //requiere excepcion
        try{
            inStream = new DataInputStream(new FileInputStream(inFile));
            String nuevo_texto = "";
            String linea;
            //para poder usar esta instruccion necesitas el DataInputStream
            while((linea = inStream.readLine()) != null){
                nuevo_texto += linea + "\n"; //meter lineas de texto
            }
            texto.setText(nuevo_texto);
        }catch(FileNotFoundException e){System.out.println(e);}
        catch(IOException e){System.out.println(e);}
    }
}
