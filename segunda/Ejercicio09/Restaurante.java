package Ejercicio09;
import java.awt.*;

public class Restaurante extends Frame{
    String comidas[] = {"Desayuno", "Comida", "Cena"};
    String[][] platos = {{"Zumo", "Café", "Colacao", "Tostaditas", "Mermelada", "Cereales"},
                        {"Paella", "Macarrones con tomatico y extra de queso", "Sopa", "Ensalada","Filete",
                        "Pescado", "Albóndigas", "Pechuga de pollo con patatas"},
                        {"Tortilla", "Hamburguesa", "Sandwich", "Bocadillo", "Pizza", "Fajita"}};
    Choice chComidas;
    List listasPlatos[];
    List presentar;
    TextField texto;
    
    public static void main(String args[]){
        Restaurante app = new Restaurante();
    } 
    
    //constructor
    public Restaurante(){
        super("Restaurante Aplicación");
        setup();
        pack();
        resize(390,375);
        show();
    }
    
    public void setup(){
        this.add("North", new Label("Elige la comanda", Label.CENTER));
        chComidas = new Choice();
        for (int i = 0; i < comidas.length; i++) {
            chComidas.add(comidas[i]); //cargar comidas en el selector
        }
        this.add("West",chComidas);
        
        //Poner las listas del menu
        listasPlatos = new List[comidas.length]; //dimension del vector
        for (int i = 0; i < platos.length; i++) {
            listasPlatos[i] = new List(5,true); //instanciar listas
            for (int j = 0; j < platos[i].length; j++) {
                //metemos los datos en cada lista
                listasPlatos[i].add(platos[i][j]); 
            }
        }
        
        //Mostrar lo elegido
        presentar = listasPlatos[0];
        this.add("East", presentar);
        
        //Mostrar lo elegido en el menu
        texto = new TextField("", 40);
        this.add("South", texto);
        
    }
    
    public boolean handleEvent(Event ev){
        if(ev.id == Event.WINDOW_DESTROY){ 
            System.exit(0);
            return true;
        }
        else if(ev.id == Event.ACTION_EVENT){
            if(ev.target instanceof Choice){
                this.remove(presentar);
                //seleccionar el indice de las comidas
                presentar = listasPlatos[chComidas.getSelectedIndex()];
                this.add("East", presentar);
                this.show(); //actualizar lo que muestra
                texto.setText(chComidas.getSelectedItem() + " : ");
                return true;
            }
        }
        else if((ev.id == Event.LIST_SELECT) || (ev.id == Event.LIST_DESELECT)){
            //necesario para poder concatenar
            String peticion = chComidas.getSelectedItem() + " : "; 
            String seleccionados[] = presentar.getSelectedItems();
            for (int i = 0; i < seleccionados.length; i++) {
                if(seleccionados[i] != seleccionados[seleccionados.length-1]){
                    peticion += seleccionados[i] + " , ";
                }
                else{ //para quitar la coma
                    peticion += seleccionados[i];
                }
            }
            texto.setText(peticion);
            return true;
        }
        return false;
    }
}
