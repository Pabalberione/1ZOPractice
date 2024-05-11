package EstructurasControlDeFlujo;

public class IfYTernario {
    /*
    * Instruccion IF
    * -Comprueba una condicion de tipo boolean y ejecuta un bloque de sentencias si se cumple. Opcionalmente, se puede indicar
    *  bloque else
    * */
        if(condicion){}

        if(a>5){
            a++;
        }

        if(condicion){
            //sentencias
        }else{
            //sentencias
        }

        if(a%2==0){
        System.out.println("par");
        }else{
        System.out.println("impar");
        }

        /*
        * -Las llaves solo son obligatorias si el bloque contiene mas de una instruccion
        * -Si la condicion no es booleana se produce un error de compilacion
        * */
            int p=10;
            if(p){}//Error de compilacion

    /*
    * Operador Ternario
    * -Forma abreviada de la instruccion if
    * -variable = expresion ? valor_si : valor_no
    * -Evalua una expresion de tipo boolean, si el resultado es verdadero, se devuelve el valor indicado despues de la interrogacion
    *  si no, devolvera el valor a continuacion de los dos puntos.
    * */
        int a = 3, b = 5, c;
        c = (a > b) ? a * a : b--;
        System.out.println(c);//c vale 5, pues primero se asigna ba c y luego se decrementa la variable b
}
