/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ohtu.interfaces;

/**
 *
 * @author ville
 */
public interface PankkiInterface {

    boolean tilisiirto(String nimi, int viitenumero, String tililta, String tilille, int summa);
    
}
