/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexion;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Jean_K
 */
public class conexionMysql {
    
    // para la conexión a la base de datos
    
    Connection cn;
    
    public Connection conectar (){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            cn = (Connection) DriverManager.getConnection ("jdbc:mysql://localhost/login_java_mysql","root","");
            System.out.println("Conexión exitosa.");
        } catch (Exception e) {
            System.out.println ("Error de conexión con la BD" +e);
        }
        return cn;
    }
}
