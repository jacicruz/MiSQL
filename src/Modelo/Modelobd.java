package Modelo;
import GUI.Principal;
import java.sql.Connection;

import javax.swing.JOptionPane;

import Conector.Conexion;
import Tablas.Tablas;

public class Modelobd {
    Principal pri = Principal.getInstance();
    Conexion con = new Conexion();
    Tablas tab = new Tablas();
    Connection si = con.getConnection();
    public void conectar(String puerto, String host, String usuario, String contraseña) {
        String port = puerto;
        String hust = host;
        String user = usuario;
        String pass = contraseña;
        con.connect(hust, port, user, pass);
        si = con.getConnection(); 
        pri.displayDatabaseList(si);
        si = con.getConnection();
}
    public void crearTabla(String nombretab, int numcolum){  
        String nombre = nombretab;
        int numero = numcolum;
        si = con.getConnection();
        if (si != null) {
            Tablas.crearTabla(si, nombre, numero);
        } else {
            JOptionPane.showMessageDialog(null,"Tu conexion esta vacia");
    }
}
public Connection getConnection() {
    return si;
}
}