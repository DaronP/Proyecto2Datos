
package proyecto2;

/******************************************************************************
 *	Conexion.java
 *	Programa que permite relizar una conexion con neo4j
 *	Por: Oliver Mazariegos
 *           Jorge Perez
 *           Alexander Trujillo
 *   Algoritmos y Estructura de Datos
 *******************************************************************************/

import java.sql.*;
import java.util.ArrayList;
import java.util.Map;


public class Conexion {
    private Connection con;
    private Statement stmt;
    private final String USER="neo4j";
    private final String PASSWORD="123456789";
    static final String URL="jdbc:neo4j:bolt://localhost";

    //constructor
    public Conexion(){
        try{
            con= DriverManager.getConnection(URL,USER,PASSWORD);
            stmt=con.createStatement();
        }
        catch(Exception e){
            System.out.println("Error");
        }
    }


    public void crearRestaurante(Restaurante r){
        try {
            stmt.executeUpdate("CREATE(" +r.getNombre()+ ":Restaurante{restaurante:'" + r.getNombre() + "',comida:'" + r.getComida() +  "',costo:'" +r.getCosto() + "',tipo:'" +r.getTipo()+ "'})");
            con.close();
        } catch (SQLException e1) {
            e1.printStackTrace();
        }
    }
    
 public void crearUsuario(Usuario u){
        try {
            stmt.executeUpdate("CREATE(" +u.getName()+ ":Usuario{nombre:'" +u.getName() + "',interes1:'" + u.getInteres1() +  "',interes2:'" +u.getInteres2()+ "',interes3:'" +u.getInteres3()+ "',interes4:'" +u.getInteres4()+ "'})");
            con.close();
        } catch (SQLException e1) {
            e1.printStackTrace();
        }
    }


    public void delete(){
        try {
            stmt.executeUpdate("MATCH (n) " +
                    "OPTIONAL MATCH (n)-[r]-()"+" delete n,r" );
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }



}
