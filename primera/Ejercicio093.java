/*
Implementar una función que devuelva un entero con el número de campanadas que
han sonado en el reloj, contando la hora actual (número de 1 a 24), a lo largo
del día.
 */
package primera;


public class Ejercicio093 {
    public static void main(String arg[]){
        int n = 13;
        int resultado = campanadas(n);
        System.out.printf("Resultado normal: %d\n",resultado);
        int resultadoR = campanadasR(n);
        System.out.printf("Resultado en recursiva: %d\n",resultadoR);
    }
    
    public static int campanadas(int horas){
        int resul = 0;
        for(int i = 1; i <=horas; i++)
            if(i <= 12)
                resul += i;
            else
                resul += (i-12);
        return resul;
    }
    
    public static int campanadasR(int horas){
        if(horas == 1)
            return 1;
        else
            if(horas > 12)
                return (horas-12) + campanadasR(horas-1);
            else
                return horas + campanadasR(horas-1);
    }
}
