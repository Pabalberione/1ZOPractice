package EstructurasControlDeFlujo;

public class BreakYContinue {
    /*
    * Fundamentos
    * -Provocan una salida forzada
    *   break: Abandona el bucle
    *   continue: Pasa a la siguiente iteracion
    *
    * -Ambas instrucciones pueden utilizarse tanto en for como
    *  en while.
    *
    * Instruccion break
    * -Provoca la salida de la instruccion repetitiva, pasando
    *  el control del programa a la siguiente instruccion.
    *
    *   int n = leerNumero();
    *   int s = 0;
    *   for(int i=1; i<n; i++){
    *   s+=i;
    *   if(s>100){
    *       break;
    *       }
    *   }
    *
    * Instruccion continue
    * -Pasa a la siguiente iteracion del bucle. En el caso de un for,
    *  la llamada a continue nos llevaria directamente a la instruccion
    *  de incremento.
    *
    *  //muestra los numeros del 1 al 10.
    *  //menos el 5
    *   for(int i = 1; i < 10; i++){
    *       if(i==5)
    *           continue;
    *       System.out.println(i)
    *
    * Bucles etiquetados
    * -Es posible asignar una etiqueta a una instruccion for o while
    * -En bucles anidados, permite a las instrucciones break o
    *  continue indicar el bucle que se quiere abandonar.
    * -Si no se indica etiqueta despues de break/continue, afectará
    *  al bucle mas interno
    * */

    public static void main(String[] args) {
        String[][] cars = {{"A","B","C"},{"D","E"}};
        ex: for(int i=0; i<cars.length;i++){
            for(int k=0;k<cars[i].length;k++ ){
                System.out.println(cars[i][k]+" ");

                if(cars[i][k].equals("B")){
                    break;
                }
                continue ex;
            }
        }
    }
}
