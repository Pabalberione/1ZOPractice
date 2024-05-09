package tiposDeDatos;

public class Literales {
    /**
     * Los literales enteros se pueden representar en:
     * Decimal: 289
     * Octal: 0453 Que es cuando un numero comienza por un cero
     * Exadecimal: 0xAF7
     * Binario: 0b100011
     *
     * Se puede usar el simbolo _ para representar un literal numérico:
     */
        int n = 2_345;
        double d = 45.6_9;

    /**
     * NO se puede utilizar el simbolo _ al principio, al final o junto al punto decimal. Los siguientes son errores de compilacion
     */
        int n = _345;
        double d = 45._9;
        long ln = 234_;

    /**
     * Los literales enteros son int, si queremos que sea long:
      */
        345l;

    /**
     * Los literales decimales son double, si queremos que sea float:
      */
        4.7f
        float g = 6.7;//Error
}
