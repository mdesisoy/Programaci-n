package Ejercicio03;

public class EjecutableNif {
    public static void main (String arg[]) throws Exception{
        Nif persona1, persona2, persona5;
        
        //PARA TRATAMIENTO DE EXCEPCIONES-------------------------
        try{
            int a = 7/0; //si se produce una excepcion no se ejecutan mas 
                         //instrucciones hasta que no se trata la excepcion
            System.out.println("No llega a esta instruccion");
        }catch(ArithmeticException ex){ //tratamiento excepcion
            System.out.println("Excepcion: Has divido entre cero");
        }
        System.out.println("Continua la ejecución"); //continua programa
        //--------------------------------------------------------
        
        persona1 = new Nif(73026258, 'Q');
        persona5 = new Nif(15421548);
        persona1.mostrar();
        persona5.mostrar();
        //persona2 = new Nif(58471412, 'S'); //NIF QUE SALTA LA EXCEPCION DEL CONSTRUCTOR
    }
}
