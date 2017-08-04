/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BD;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author DORRA
 */
public class user {
    int id;
    String nom;
    String prenom;
    String login;
    String mdp;
    int salaire;
    String grade;

    public user(String login, String mdp) {
        this.login = login;
        this.mdp = mdp;
    }

    public user( String nom, String prenom, String login, String mdp, int salaire, String grade) {
     
        this.nom = nom;
        this.prenom = prenom;
        this.login = login;
        this.mdp = mdp;
        this.salaire = salaire;
        this.grade = grade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getMdp() {
        return mdp;
    }

    public void setMdp(String mdp) {
        this.mdp = mdp;
    }

    public int getSalaire() {
        return salaire;
    }

    public void setSalaire(int salaire) {
        this.salaire = salaire;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
    
  // int identifier(){

    public user(int id) {
        this.id = id;
    }

    public user(int id, String login, String mdp) {
        this.id = id;
        this.login = login;
        this.mdp = mdp;
    }
    
        
                
    //}
    void ajout() throws SQLException
    {

Connexion c= new Connexion();
java.sql.PreparedStatement statement = c.conn.prepareStatement("INSERT INTO `user`( `nom`, `prenom`, `login`, `mdp`, `salaire`, `garde`) VALUES ('"+this.nom+"','"+this.prenom+"','"+this.login+"','"+this.mdp+"','"+this.salaire+"','"+this.grade+"')");
statement.executeUpdate();


            
            }
    void supp() throws SQLException{
// TODO add your handling code here:
Connexion c= new Connexion();
String sql = "DELETE FROM `user` WHERE `id`=?";
java.sql.PreparedStatement statement = c.conn.prepareStatement(sql);
statement.setInt(1, this.id);
statement.execute();

    }
    void modification() throws SQLException{
// TODO add your handling code here:
Connexion c= new Connexion();
String sql="UPDATE `user` SET `login`='"+this.login+"',`mdp`='"+this.mdp+"' WHERE `garde`='admin';";
java.sql.PreparedStatement statement = c.conn.prepareStatement(sql);
statement.executeUpdate();

    }
 int ident() throws SQLException {
   
{ 
    Connexion c=new Connexion(); 
   PreparedStatement pst; 
   pst = (PreparedStatement) c.conn.prepareStatement("SELECT * FROM `user` WHERE `login`='"+this.login+"' AND `mdp`='"+this.mdp+"'"); 
   pst.executeQuery(); 
        ResultSet rs = pst.executeQuery(); 
        if (rs.next())
        {return 1; }
        else 
        {return 0 ;}
}
}

    } 
