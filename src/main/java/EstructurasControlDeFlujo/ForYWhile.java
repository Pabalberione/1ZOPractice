package EstructurasControlDeFlujo;

public class ForYWhile {
    /*
    * Instruccion For
    * -Ejecuta un grupo de instrucciones un numero determinado de veces.
    * for(inicializacion;condicion,incremento){
            //Instrucciones
    *}
    *
    *-Desde que la variable toma el valor de inicializacion y hasta que la condición deje de cumplirse, se ejecutará el
    * bloque de instrucciones
    * */
        for(int i=1; i<10;i++){
        System.out.println(i);//Muestra los numeros del 1 al 9
    }

    /*
    * Consideraciones sobre for
    * -Las llaves son obligatorias SI hay mas de una instruccion.
    * -Las tres instrucciones de control son opcionales.
    * */
        int s = 1;
        for(;s<10;){//Los ; se ponen igualmente. Si no se indicase instruccion de control tendriamos bucle infinito.
        System.out.println(s);
        s++;
        }
    /*
    * Las instrucciones de control pueden contener mas de una sentencia, separadas por una coma:
    * */
        for(int a = 0, b = 10; a < b; a++, b--){//La condicion SIEMPRE tiene que ser de tipo boolean

        }

    /*
    * Instrucción enhanced for o FOREACH
    * -Se utiliza para el recorrido, en modo lectura, de arrays y colecciones.
    *   for(tipo variable:array){
    *       //instrucciones
    *   }
    *
    * -La variable de control va pasando por todas las posiciones del array, NO es un indice
    *   int [] nums {4,5,6,7};
    *   for(int n:nums){
    *       System.out.println(n);
    *   }
    *
    * Instrucción while
    * -Ejecuta un grupo de instrucciones mientras se cumpla una condicion(resultado sea true)
    * -La condicion puede evaluarse al principio, o despues de ejecutar el bloque de instrucciones:
    *    while(condicion){
            //instrucciones
            }

    *    do{
    *       //Instrucciones
    *       }while(condicion);
    *
    * -Las acciones dentro del bloque provocaran que en algun momento la condicion deje de cumplirse, sino bucle infinito
    *
    *   int n = 0; s = 0;
    *   while(s < 1000){
    *       s+=n++;
    *       }
    *
    *   int n = 0;
    *   do{
    *       n=leerNumero();
    *       }while(n<0);
    * */


}
