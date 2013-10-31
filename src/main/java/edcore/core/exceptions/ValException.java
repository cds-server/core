package edcore.core.exceptions;



/**
* Excepcion lanzada al fallo de la seguridad
* @author Gabriel Cisneros
* @version 1.0 (20/09/11)
*/

public class ValException extends Exception {

    /**
     * Constructor para captar el mensaje de error
     * @param mensaje
     */
    public ValException(String mensaje)
    {
        super("["+mensaje+"]");
    }
}
