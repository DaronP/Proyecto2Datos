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

import java.io.*;
import java.util.*;

public class Main {
    
    public static void main(String [] args){
        
        Scanner sc = new Scanner(System.in);
        HashMap<String, ArrayList> map = new HashMap<String, ArrayList>();
        ArrayList<String> parametros;
        Boolean  x = true;
        System.out.println("holis");
        
        while(x = true){
            
            String nombre = sc.next();
            String tipoCo = sc.next();
            String costo = sc.next();
            String tipo = sc.next();
            
            parametros = new ArrayList<String>();
            parametros.add(tipoCo);
            parametros.add(costo);
            parametros.add(tipo);
            
            //se anade al mapa
            map.put(nombre, parametros);
            
            //debuggeando
            System.out.println("Si o no?");
            String val = sc.next();
            if(val.equals("si")){
                break;
            }
            
        }
        map.remove("Mc", "d");
        System.out.println(map);
        
        
    }
    
}
