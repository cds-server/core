/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package edcore.core.util;

import edcore.core.exceptions.NullException;

/**
 *
 * @author ING. GABRIEL CISNEROS LANDEROS
 */
public class Str {
    
    public static String ToFirstUpperCase(String cadena) throws NullException
    {
        char[] stringArray;
        
        if(cadena != null)
        {
            cadena = cadena.toLowerCase();
            stringArray = cadena.toCharArray();
            stringArray[0] = Character.toUpperCase(stringArray[0]);
            cadena = new String(stringArray);
            return cadena;
        }else{
            throw new NullException("NULL EXCEPTION");
        }
    }

}
