package tiposDeDatos;

public class OperadoresANivelDeBits {
    /*
    Fundamentos
    * Realizan operaciones a nivel de bits(Operaciones logicas y desplazamiento de bits)
    * Los que realizan operaciones logicas pueden aplicarse tanto con valores enteros como boolean.
    * A diferencia de los logicos, los operadores a nivel de bits no operan en modo cortocircuito(evaluan todos los operandos de la expresion)
    * */

    /*
    * Operador &
    * -Realiza la operacion AND a nivel de bits, es decir, aplica la operacion AND a cada pareja de bits.
    * */
        int a = 7;
        int b = 10;
        System.out.println(a&b); //2

    /*
    * Se puede utilizar tambien con boolean
    * */
        boolean x = true;
        boolean y = false;
        System.out.println(x&y);//false

    /*
    * Operador |
    * -Realiza la operacion OR a nivel de bits, aplicando la operacion a cada pareja de bits:
    * */
        int a = 8;
        int b = 10;
        System.out.println(a|b); //10 (En cada comparacion de bits donde haya un 1 el resultado tendra un uno

    /*
     * Se puede utilizar tambien con boolean
     * */
        boolean x = true;
        boolean y = false;
        System.out.println(x|y);//true

    /*
    * Revision conceptos
    * */
    int a = 12;
    int b = 9;
    int c = 4;
    System.out.println((a|b^c)<10&c<5)
    //                     1001
    //                     0100
    //                     1101
    //                     1100
    //                     1101 = 13 < 10 = false
    //                              c < 5 = true
    //                              false & true = FALSE
}
