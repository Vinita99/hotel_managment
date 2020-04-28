
package hotelmanagement;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class HotelManagement extends JFrame implements ActionListener {

    HotelManagement()
    {
        setBounds(50,100,1800,800);
                
                ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("hotelmanagement/icons/hotel1.jpg"));
                JLabel l1=new JLabel(i1);
                l1.setBounds(0,0,2000,800);
                add(l1);
                JLabel l2=new JLabel("HOTEL MANAGEMENT SYSTEM");
                l2.setBounds(200,-200,1200,500);
                l2.setForeground(Color.WHITE);
                l2.setFont(new Font("serif",Font.PLAIN,80));
                l1.add(l2);
                JButton b1=new JButton("LOGIN");
                b1.setBackground(Color.WHITE);
                b1.setForeground(Color.BLACK);
                b1.setFont(new Font("Arial", Font.BOLD, 28));
                b1.setBounds(1500,20,200,50);
                b1.addActionListener(this);
                l1.add(b1);
                setLayout(null);
                setVisible(true);
               while(true)
                {
                    l2.setVisible(false);
                    try
                    {
                        Thread.sleep(500);
                    }
                    catch(Exception e)
                    {
                        
                    }
                    l2.setVisible(true);
                    try
                    {
                        Thread.sleep(500);                       
                    }
                    catch(Exception e)
                    {
                        
                    }
                }
                
                
                
    }
    public void actionPerformed(ActionEvent ae)
    {
        new login().setVisible(true);
        this.setVisible(false);
    }
            
    public static void main(String[] args) {
        new HotelManagement();
    }
    
}
