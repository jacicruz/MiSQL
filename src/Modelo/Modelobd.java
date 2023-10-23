package Modelo;
import GUI.Principal;
import java.sql.Connection;
import Conector.Conexion;

public class Modelobd {
    Principal pri = Principal.getInstance();
    Conexion con = new Conexion();
    public void conectar(String puerto, String host, String usuario, String contraseña) {
        String port = puerto;
        String hust = host;
        String user = usuario;
        String pass = contraseña;
        con.connect(hust, port, user, pass);
        Connection si = con.getConnection(); {
        pri.displayDatabaseList(si);
    }
}
}