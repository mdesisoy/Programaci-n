/*
1º)Mostrar por pantalla el trimestre con mas nacimientos.
2º)Mes en el que más bajas se han producido. Defunciones y traslados fuera.
3º)Mostrar por pantalla cuantas personas nuevas han venido al pueblo y cuantas
   han desaparecido (venir = nacer y asentar).
 */
package primera;


public class Ejercicio097 {
    public static void main(String[] args){
        String movimientos[] = {"Nacimientos", "Defunciones", "Traslados fuera", "Nuevos asentamientos"};
        String meses[] = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", 
                          "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        int movPob[][] = {{3,2,0,0},{1,5,0,1},{9,4,0,0},{3,8,0,0},{6,1,0,0},{3,2,1,0},
                          {3,12,1,0},{2,3,0,1},{1,7,1,1},{9,2,0,1},{1,5,3,0},{5,8,2,1}};
        int nac [] = {0, 0, 0, 0};
        int pos = 0;
        int baja = 0;
        int nuevas = 0;
        int desaparecer = 0;
        //Primera parte
        System.out.println("PRIMERA PARTE");
        for (int i = 0; i < movPob.length; i++){
                nac[i/3] += movPob[i][0];
        }
        for (int i = 1; i < nac.length; i++)
            if(nac[pos] < nac[i])
                pos = i;
        System.out.printf("El trimestre con mas nacimientos es el %dº con %d\n", (pos+1),nac[pos]);
        
        //Segunda parte
        System.out.println("SEGUNDA PARTE");
        for (int i = 1; i < movPob.length; i++){
            baja = movPob[pos][1] + movPob[pos][2];
            if(baja < (movPob[i][1] + movPob[i][2])){ 
                baja = movPob[i][1] + movPob[i][2];
                pos = i;
            }
        }
        System.out.printf("El mes en que mas bajas se han producido es %s con %d\n", meses[pos],baja);
        
        //Tercera parte
        System.out.println("TERCERA PARTE");
        for (int i = 1; i < movPob.length; i++)
            nuevas += movPob[pos][0] + movPob[pos][3];
        System.out.printf("Han venido %d personas nuevas\n", nuevas);  
        for (int i = 1; i < movPob.length; i++)
            desaparecer += movPob[pos][1] + movPob[pos][2];
        System.out.printf("Han desaparecido %d personas nuevas\n", desaparecer);
        
    }
}
