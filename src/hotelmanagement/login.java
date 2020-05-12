
package hotelmanagement;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public class login extends JFrame implements ActionListener{
    JLabel l1,l2;
    JTextField f1;
    JPasswordField p1;
    JButton b1,b2;
    login()
    {
      l1=new JLabel("Username");
      l1.setBounds(100,20,200,50);
      l1.setFont(new Font("serif",Font.PLAIN,30));
      add(l1);
      //-------------
      l2=new JLabel("Password");
      l2.setBounds(100,80,200,50);
      l2.setFont(new Font("serif",Font.PLAIN,30));
      add(l2);
      //-------------
      f1=new JTextField();
      f1.setBounds(350,20,200,50);
      f1.setFont(new Font("serif",Font.PLAIN,30));
      add(f1);
      //------------
      p1=new JPasswordField();
      p1.setBounds(350,80,200,50);
      p1.setFont(new Font("serif",Font.PLAIN,30));
      add(p1);
      //-----------
      b1=new JButton("Login");
      b1.setBackground(Color.BLACK);
      b1.setForeground(Color.WHITE);
      b1.setBounds(100,150,200,50);
      b1.setFont(new Font("serif",Font.PLAIN,30));
      b1.addActionListener(this);
      add(b1);
      //--------------
      b2=new JButton("Cancel");
      b2.setBackground(Color.BLACK);
      b2.setForeground(Color.WHITE);
      b2.setBounds(350,150,200,50);
      b2.setFont(new Font("serif",Font.PLAIN,30));
      b2.addActionListener(this);
      add(b2);
      //---------------
      ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("hotelmanagement/icons/login.png"));
      JLabel l3=new JLabel(i1);
      l3.setBounds(750,10,200,200);
      add(l3);
      //-------------------
      setLayout(null);        
      setBounds(600,300,1000,400);
      setVisible(true);
    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==b2)
        {
        System.exit(0);
        }
        else if(ae.getSource()==b1)
        {
            PreparedStatement st;
        ResultSet rs;
        
        String username=f1.getText();
        String password=String.valueOf(p1.getPassword());
        String query="select * from users where username=? and password=?";
        
        
        
        try
            {st=mysqlconn.getConnection().prepareStatement(query);
            
            st.setString(1,username);
            st.setString(2,password);
            
            
            
            rs=st.executeQuery();
            
            
            
            if(rs.next())
                {
                    
                    new dashboard().setVisible(true);
                    this.setVisible(false);
                    
                }
            else
                {
                    JOptionPane.showMessageDialog(null,"INVALID USERNAME/PASSWORD","LOGIN ERROR",2);
                }
            }
        catch(Exception ex)
            {
            Logger.getLogger("get connection-->"+mysqlconn.class.getName()).log(Level.SEVERE,null,ex);
            }
        }
    }
    public static void main(String args[])
    {
        new login();
    }
          
    
}
