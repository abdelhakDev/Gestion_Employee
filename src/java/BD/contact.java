/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BD;

import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author DORRA
 */
public class contact {
    int id;
    String emeteur;
    String text;
    String sujet;
    String date;

    public contact(String emeteur, String text, String sujet) {
        this.emeteur = emeteur;
        this.text = text;
        this.sujet = sujet;
      
    }

    public contact(int id) {
        this.id = id;
    }
    

    public String getEmeteur() {
        return emeteur;
    }

    public void setEmeteur(String emeteur) {
        this.emeteur = emeteur;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getSujet() {
        return sujet;
    }

    public void setSujet(String sujet) {
        this.sujet = sujet;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    
    void ajout_msg(){
    try {

Connexion c= new Connexion();
java.sql.PreparedStatement statement = c.conn.prepareStatement("INSERT INTO `contact`(`emeteur`, `text`, `sujet`) VALUES ('"+this.emeteur+"','"+this.text+"','"+this.sujet+"')");
statement.executeUpdate();
JOptionPane.showMessageDialog(null,"Ajouté avecsuccés","",JOptionPane.INFORMATION_MESSAGE);

} catch (SQLException ex) {
JOptionPane.showMessageDialog(null, ex); }
    }
    void supp_msg(){
    try {
// TODO add your handling code here:
Connexion c= new Connexion();
String sql = "DELETE FROM `contact` WHERE `id`=?";
java.sql.PreparedStatement statement = c.conn.prepareStatement(sql);
statement.setInt(1, this.id);
statement.execute();
JOptionPane.showMessageDialog(null,"Supprimé avecsuccés","",JOptionPane.INFORMATION_MESSAGE);

} catch (SQLException ex) {
JOptionPane.showMessageDialog(null, ex); }
        
    }
    
}
