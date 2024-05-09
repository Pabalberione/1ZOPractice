package tiposDeDatos;

public class CicloDeVidaObjetos {
    /**
     * Un objeto se crea a partir del operador new, seguido del nombre de la clase
     *
     * Se devuelve una referencia al objeto que se guarda en una variable de la clase
     */
    Clase1 c = new Clase1();
    String s = new String("hola");
    Object ob = new Object();

    /**
     * Constructores:
     *  Se ejecutan durante la creación de un objeto
     *  Puede sobrecargarse(Varios constructores)
     *
     *  Destruccion de un objeto:
     *  -Los objetos son eliminados de la memoria por el Garbage Collector
     *  -Un objeto es elegido para recoleccion cuando no hay referencias al mismo
     *  -Cuando un objeto es elegido para recoleccion, la JVM llama al método finalize() del objeto. De cara al examen, saber
     *   que este metodo puede ser llamado una o ninguna vez durante la vida del objeto, nunca mas de una.
     *  -NO se puede destruir un objeto desde código
     */
}
