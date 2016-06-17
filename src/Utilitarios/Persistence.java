/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilitarios;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Masds
 */
public class Persistence {
    private String servidor, db, usuario, senha;
    private int porta;
    private Connection conexao;
    
    public void setDados(String servidor, int porta, String db, String usuario, String senha){
        this.servidor = servidor;
        this.porta = porta;
        this.db = db;
        this.usuario = usuario;
        this.senha = senha;
    }
    
    public void conecta(){
        setDados("127.0.0.1", 3306, "db_livraria", "root", "");
        String driver = "org.gjt.mm.mysql.Driver";
        try{
        Class.forName(driver);
        conexao = DriverManager.getConnection("jdbc:MySql://"+servidor+":"+porta+"/"+db, usuario, senha);
        JOptionPane.showMessageDialog(null, "Conectado!");
        } catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Problema na conexão: "+ex.getMessage());
        }catch(ClassNotFoundException ex){
            JOptionPane.showMessageDialog(null, "Erro no Driver: "+ex);
        }
    }
}
