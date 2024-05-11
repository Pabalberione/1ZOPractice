package EstructurasControlDeFlujo;

public class Switch {
    /*
    * Evalua una expresion cuyo resultado debe ser un entero(int). Se ejecutarán diferentes bloques de sentencias
    * en funcion de los posibles resultados
    * */
        switch(expresion){
        case valor1:
            //sentencias
            break;
        case valor2:
            //sentencias
            break;
        default:
            //sentencias
        }

        switch(a*2){
        case 0:
            System.out.println("nada");
            break;
        case 4:
            System.out.println("cerca");
            break;
        case 8:
            System.out.println("acierto");
            break;
        default:
            System.out.println("error");
        }

   /*
   * Funcionamiento de switch
   * -Si el resultado de la expresion coincide con uno de los valores indicados en los case, ejecutara el bloque
   *  correspondiente de sentencias, sino, entrará en el bloque default(opcional).
   * -La instruccion break al final de cada bloque case es opcional.
   *  Si no se indica, el programa entrará en el siguiente bloque:
   * */
        int a = 10;
        switch(a){
        case 10:;
            System.out.println("Es 10");
        default:
            System.out.println("Sin valor");
    }

    /*
    * Valores de los case
    * -Los valores de los case deben ser literales o constantes enteras int, o convertibles implicitamente en int.
    * */
        int p = 5;
        final int k = 30;
        int n = 3;
        switch(p){
        case 10: //OK, es un literal int
        case k: //OK, es una constante
        case p: //Error de compilacion, no es una constante
        case '@': //OK, char convertible implicitamente a int
        }

    /*
    * Bloque default
    * -El bloque default es opcional y no tiene que aparecer necesariamente al final:
    * */
        int p = 5;
        switch(p){
        case 10:
            System.out.println("Es 10");
        default:
            System.out.println("Default");//En este caso p no coincide con ninguno de los valores por lo  que entra en default
        case 2:                           //Pero como no tiene break despues muestra lo del case 2.
            System.out.println("Es 2");
    }

    /*
    * switch con valores String
    * -Desde java 7 es posible evaluar en un switch expresiones cuyo resultado sea una cadena de caracteres:
    * */
        String data = "prueba";
        final String s = "hello";
        switch(data){
        case "uno": //OK
        case s: //OK, es una constante
        case 10: // Error de compilacion. Si la expresion es evaluada como String, no se admiten valores enteros en los case y viceversa

    }
}
