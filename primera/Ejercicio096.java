/*
Algoritmo que cuente los votos con la ley de D'hont
 */
package primera;


public class Ejercicio096 {
    public static void main(String[] args){
        String nombrePartidos[] = {"PartidoA", "PartidoB", "PartidoC", "PartidoD", "PartidoE"};
        int votos[] = {340000, 280000, 160000, 60000, 15000};
        int cocientes [] = {0, 0, 0, 0, 0};
        int escanyos = 5;
        //final int ESCANYOS = 5 ES UNA CONSTANTE, su valor no puede modificarse
        int pos;
        
        while(escanyos > 0){
            //para buscar el mayor votos[i] / cocientes[i];
            pos = 0;
            for(int i = 1; i < votos.length; i++){
                if((votos[pos] / (cocientes[pos]+1)) < (votos[i] / (cocientes[i]+1))){ 
                    pos = i;
                }
            }
            cocientes[pos] ++;
            escanyos--;
        }
        for (int i = 0; i < cocientes.length; i++) {
            System.out.printf("El partido %s tiene %d escaños\n",nombrePartidos[i],cocientes[i]);
        }
    }
}


/*MANERA AGUSTIN
final int ESCANYOS = 5;
int pos;
for(int i=0; i < ESCANYOS; i++)
    pos = 0;
    for(int j = 1; j < votos.length; j++)
        if(votos[j]/cocientes[j]>votos[pos]/cocientes[pos])
            pos = j;
    cocientes[pos]++;
}





*/