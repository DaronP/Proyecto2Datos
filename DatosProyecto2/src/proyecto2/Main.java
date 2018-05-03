/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2;

/**
 *
 * @author Andres
 */

import java.util.*;

public class Main {
    
    public static void main(String [] args){
        
        
        HashMap<Integer, Restaurantes> HMap = new HashMap<Integer, Restaurantes>();
        
        Restaurantes mc = new Restaurantes("McDonalds", "Hamburguesas", "Medio", "Rapida");
        
        HMap.put(1, mc);
        
        System.out.println(HMap.get("Medio"));
    }
    
}
