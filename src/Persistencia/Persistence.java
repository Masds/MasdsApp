/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Masds
 */
public class Persistence {
    private String servidor, db, usuario, senha;
    private int porta;
    private Connection conexao;
    public Statement stat; //cria caminho até o banco
    public ResultSet result; // armazena os comandos para serem executados no SQL
    
    public void setDados(String servidor, int porta, String db, String usuario, String senha){
        this.servidor = servidor;
        this.porta = porta;
        this.db = db;
        this.usuario = usuario;
        this.senha = senha;
    }
    
    public void conecta(){
        setDados("127.0.0.1", 3306,"db_masdsapp", "root", "");
        String driver = "org.gjt.mm.mysql.Driver";
        try{
        Class.forName(driver);
        conexao = DriverManager.getConnection("jdbc:MySql://"+servidor+":"+porta+"/"+db, usuario, senha);
        } catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Problema na conexão: "+ex.getMessage());
        }catch(ClassNotFoundException ex){
            JOptionPane.showMessageDialog(null, "Erro no Driver: "+ex);
        }
    }
    
    public void fechaConecxao(){
        try{
        conexao.close();
        }catch (SQLException ex)
        {JOptionPane.showMessageDialog(null, "Erro ao encerrar conexao: "+ex.getMessage());    }
}
    
    public void executeSql(String sql){
        try{
            stat = conexao.createStatement();
            result = stat.executeQuery(sql);
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Problema ao executar Query: "+ex.getMessage());
        }
    }
}