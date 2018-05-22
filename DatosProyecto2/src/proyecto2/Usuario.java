/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2;

/**
 *
 * @author Oliversinn
 */
public class Usuario {
    
    private String name;
    private String interes1;
    private String interes2;
    private String interes3;
    private String interes4;
    
    public Usuario(String nombre, String interes1,String interes2,String interes3,String interes4){
        this.name = nombre;
        this.interes1 = interes1;
        this.interes2 = interes2;
        this.interes3 = interes3;
        this.interes4 = interes4;
        
    }
    
    public String getName(){
        return name;
    }
    
    public String getInteres1(){
        return interes1;
    }
    
    public String getInteres2(){
        return interes2;
    }
    
    public String getInteres3(){
        return interes3;
    }
    
    public String getInteres4(){
        return interes4;
    }
    
    
}
