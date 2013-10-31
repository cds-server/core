package edcore.core.exceptions;



/**
* Excepcion lanzada al fallo de la seguridad
* @author Gabriel Cisneros
* @version 1.0 (20/09/11)
*/

public class IntException extends Exception {

    /**
     * Constructor para captar el mensaje de error
     * @param mensaje
     */
    public IntException(String mensaje)
    {
        super("["+mensaje+"]");
    }
}
