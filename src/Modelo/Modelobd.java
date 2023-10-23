package Modelo;

import GUI.Principal;

import java.sql.Connection;
import java.sql.SQLException;

import Conector.Conexion;

public class Modelobd {
    Conexion con = new Conexion();
    Principal pri = new Principal();
    public void conectar(String puerto, String host, String usuario, String contraseña) {
        String port = puerto;
        String hust = host;
        String user = usuario;
        String pass = contraseña;
        con.connect(hust, port, user, pass);
        try (Connection si = con.getConnection()) {
            pri.displayDatabaseList(si);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}