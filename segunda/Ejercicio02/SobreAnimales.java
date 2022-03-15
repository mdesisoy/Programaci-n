package Ejercicio02;

public class SobreAnimales {
    public static void main(String arg[]){
        Perro p1, p2; //declarar objeto
        Canguro c1;
        
        //no se sabe que animal es si usas la clase Animal
        //animal1 = new Animal(11, "14/03/2021", "Cocogoat", false);
        //creamos una restriccion para NO poder usarla -> abstracta
         
        p1 = new Perro(10, "12/08/2021", "Cachopo", true, "Terrier", false);
        p2 = new Perro(12, "07/03/2020", "Jake Park", true, "Caniche", true);
        c1 = new Canguro(11, "02/02/2018", "Pepe", true, 2, 25);
        
        p1.mostrar();
        p2.mostrar();
        c1.mostrar();
        
        p1.setNombre("Xiangjuangjunhue");
        p1.setRaza("Pastor Alemán");
        System.out.println("Los datos del primer perro estaban mal, soy: "
        + "Hola me llamo " + p1.getNombre() + " y soy de la raza " + p1.getRaza());
        
    }
}
