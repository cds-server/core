package edcore.core.util;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */



import edcore.core.exceptions.IntException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author ING. GABRIEL CISNEROS LANDEROS
 */
public class Int {
    
    private static Pattern patron;
    private static Matcher encaja;
    private static final String expNumero = "[0-9]";    
    
    /** Convierte una cadena a un numero
     * @param numero 0 en caso de recibir una cadena vacia
     * @return numero de control validado
     * @throws IntException
     * @throws NullException
     */
    public static int parse(String numero) throws IntException
    {
        int num = 0;
        if(numero != null)
        {
            if(!numero.equals(""))
            {
                patron = Pattern.compile(expNumero);
                encaja = patron.matcher(numero);
                if(encaja.find()) {
                    num = Integer.parseInt(numero);
                    return num;
                }
                else {
                    throw new IntException("[00]");
                }
            }
        }
        return num;
    }

}
