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
public class Restaurante {

    private String name;
    private String food;
    private String cost;
    private String kind;
    
    public Restaurante(String nombre, String tipoComida, String costo, String tipo) {
        name = nombre;
        food = tipoComida;
        cost = costo;
        kind = tipo;
    }
    
    public String getNombre(){
        return name;
    }
    public String getComida(){
        return food;
    }
    public String getCosto(){
        return cost;
    }
    public String getTipo(){
        return kind;
    }
    
    
}
