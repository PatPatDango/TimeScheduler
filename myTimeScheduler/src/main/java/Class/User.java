/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

/**
 *
 * @author patricia
 */

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class User 
{
    private String firstname;
    private String lastname;
    private String username;
    private String email;
    private String passwort;
    
    public String getFirstname() {return firstname;}
    public String getLastname() {return lastname;} 
    public String getUsername() {return username;}
    public String getEmail() {return email;}
    public String getPasswort() {return passwort;}
    
    public void setFirstname(String _firstname) {firstname=_firstname;}
    public void setLastname(String _lastname) {lastname=_lastname;}
    public void setUsername(String _username) {username=_username;}
    public void setEmail(String _email) {email=_email;}
    public void setPasswort(String _passwort) {passwort=_passwort;}
    
    
    public static void main(String args[])
    {
        JButton_Registrate_Reg.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                User user = new User();
                user.setFirstname(JTextField_Firstname.getText());
                user.setLastname(JTextField_Lastname.getText());
                user.setUsetname(JTextField_Username.getText());
                user.setEmail(JTextField_Email.getText());
                user.Passwort(JTextField_Passwort.getText());
            }
        });
    }
}



