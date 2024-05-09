package tiposDeDatos;

public class InferenciaDeTipos {
    /**
     * Incorporada en Java 10, consiste en declarar variables locales sin indicar explicitamente
     * el tipo
     *
     * Se emplea la palabra var:
     * var num = 100;
     * var datos = new ArrayList<Integer>();//ArrayList de enteros
     *
     * El tipo es inferido por el compilador a partir del valor asignnado a la variable
     *
     * Simplifica la escritura de codigo, ni mejora ni empeora el rendimiento de la aplicacion
     *
     * Consideraciones:
     * -Unicamente puede utilizarse con variables locales
     */
    class Test{
        var prueba = 100;//Error de compilacion
        void print(){
            var res = "success";//Correcto
        }
    }
    /**
     * Es obligatorio asignar explicitamente un valor a la variable, valor que no puede ser null
     */
    class Test2{
        void print(){
            var data; //Error de compilacion
            var n = null; //Error de compilacion
        }
    }

    /**
     * Consideraciones II
     * -No es posible utilizar inferencia de tipos en declaraciones múltiples
     */
        var a,c a= 10;//Incorrecto
        var b = 5, x = 30;//Incorrecto

    /**
     * -Se puede utulizar inferencia de tipos en bucles tipo for
     *
     * -En arrays, no puede utilizarse con inicializacion abreviada
     */
        class Test3{
            void print(){
                var s = {5,9,10};//Error
                var d = new int[]{5,3,5};//Correcto
            }
    }

}
