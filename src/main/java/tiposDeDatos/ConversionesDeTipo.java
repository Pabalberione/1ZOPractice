package tiposDeDatos;

public class ConversionesDeTipo {
    /**
     * Todos los tipos primitivos son convertibles en otros, SALVO boolean.
     *
     * Las conversiones pueden ser implícitas:
     */
        int x = 45;
        double n = x;//No hay nada mas que hacer, es solo una asignación

    /**
     * O explicitas(En estas hay que hacer un casting, no es solo una asignación y ya...)
      */
        double r = 4.5f;
        int p = (int)r;//casting

    /**
     * Reglas de conversiones implícitas
     * -El tipo de destino tiene que ser igual o mayor tamaño que el de origen.
     * -La regla anterior tiene las siguientes excepciones que no permiten conversiones implícitas:
     *  -El tipo de origen es un numérico(cualquier tipo) y el de destino es char:
     *          byte b = 5;
     *          char n = b;//Error
     *  -El tipo de destino es entero y el de origen es decimal:
     *          float r = 3.4f;
     *          long l = r; //Error
     *  -Cuando no sea posible la conversion implicita, siempre se podra realizar explicitamente.
     *  char n = (char)b;
     *  long l = (long)r;
     *
     *  BOOLEAN NO es convertible implicita ni explicitamente a ningun otro tipo de dato.
     */

    //Conversiones correctas:
    char c = '@';
    int u = c;//OK

    int num = 3450;
    byte s = (byte)num;

    c = (char)34.5;

    //Conversiones incorrectas
    char b = '@';
    byte h = c;

    boolean d = false;
    int j = (int)d;

    /**
     * Tipos Objeto
     *  Son todos los objetos de cualquier clase Java.
     *  Se manejan a través de variables de su tipo(clase)
     *  La variable contiene una referencia al objeto
     *  Mediante la variable se accede a los métodos del objeto
     *  NO se puede hacer conversion ni implicita ni explicita entre tipos primitivos y objetos
     */
}
