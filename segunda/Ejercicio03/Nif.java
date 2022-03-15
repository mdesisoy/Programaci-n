package Ejercicio03;

public class Nif {
    public int dni;
    public char letra;
    //static en los atributos sirve para constantes
    public static char letras[] = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 
                                   'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 
                                   'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
    
    //constructor
    public Nif(int dni, char le) throws Exception{ //para indicar que vamos a 
        this.dni = dni;                            //lanzar excepciones, no util
        letra = le;
        if(le != letras[dni%23])
            throw new Exception("NIF incorrecto"); //lanzar una excepcion
        letra = letras[dni%23];
    }
    
    public Nif(int dni) throws Exception{
        //this.dni = dni;
        //letra = letras[dni&23];
        //EN VEZ DE ESAS INSTRUCCIONES PUEDES LLAMAR AL CONSTRUCTOR ANTERIOR
        this(dni, letras[dni%23]); //llamar al propio metodo, referenciar
    }
    
    public void mostrar(){
        System.out.println(dni + " - " + letra);
    }
}
