/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poolup;

import java.awt.Color;
import java.awt.Container;
import java.sql.Array;
import java.sql.Blob;
import java.sql.CallableStatement;
import java.sql.Clob;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.NClob;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLClientInfoException;
import java.sql.SQLException;
import java.sql.SQLWarning;
import java.sql.SQLXML;
import java.sql.Savepoint;
import java.sql.Statement;
import java.sql.Struct;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.Executor;
import javax.swing.JOptionPane;
import sun.applet.Main;

/**
 *
 * @author DELL
 */
public class signup extends javax.swing.JFrame {

    /**
     * Creates new form signup
     */
    

    
    int sign;
String s1;
String s2;
String s3;
String s6;
int s4;
String s5;
int r=0;
    public signup() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup6 = new javax.swing.ButtonGroup();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        submit = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        routes = new javax.swing.JComboBox<>();
        name = new javax.swing.JTextField();
        username = new javax.swing.JTextField();
        password = new javax.swing.JTextField();
        r1 = new javax.swing.JRadioButton();
        r2 = new javax.swing.JRadioButton();
        vehicle_no = new javax.swing.JTextField();
        signin = new javax.swing.JRadioButton();
        signup = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        susername = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        spassword = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PoolUP");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Name");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 87, -1, -1));

        jLabel2.setText("Username");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        submit.setText("SUBMIT");
        submit.setEnabled(false);
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });
        getContentPane().add(submit, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 290, -1, -1));

        jLabel3.setText("Password");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        jLabel4.setText("Route");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 189, -1, -1));

        routes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Routes", "Ambattur", "K.K.Nagar", "Porur", "Vandalur", "Triplicane" }));
        routes.setEnabled(false);
        routes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                routesActionPerformed(evt);
            }
        });
        getContentPane().add(routes, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 186, -1, -1));

        name.setEnabled(false);
        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });
        getContentPane().add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 84, 150, -1));

        username.setAutoscrolls(false);
        username.setEnabled(false);
        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });
        getContentPane().add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 122, 150, -1));

        password.setEnabled(false);
        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });
        getContentPane().add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 148, 152, -1));

        buttonGroup6.add(r1);
        r1.setText("Traveller");
        r1.setEnabled(false);
        r1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r1ActionPerformed(evt);
            }
        });
        getContentPane().add(r1, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 221, -1, -1));

        buttonGroup6.add(r2);
        r2.setText("Owner");
        r2.setEnabled(false);
        r2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r2ActionPerformed(evt);
            }
        });
        getContentPane().add(r2, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 250, -1, -1));

        vehicle_no.setEnabled(false);
        vehicle_no.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vehicle_noActionPerformed(evt);
            }
        });
        getContentPane().add(vehicle_no, new org.netbeans.lib.awtextra.AbsoluteConstraints(97, 251, 96, -1));

        buttonGroup1.add(signin);
        signin.setText("SIGN IN");
        signin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signinActionPerformed(evt);
            }
        });
        getContentPane().add(signin, new org.netbeans.lib.awtextra.AbsoluteConstraints(316, 43, -1, -1));

        buttonGroup1.add(signup);
        signup.setText("SIGN UP");
        signup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupActionPerformed(evt);
            }
        });
        getContentPane().add(signup, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 43, -1, -1));

        jLabel5.setText("WELCOME TO POOLUP");
        jLabel5.setMaximumSize(new java.awt.Dimension(200, 14));
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, 170, 40));
        getContentPane().add(susername, new org.netbeans.lib.awtextra.AbsoluteConstraints(384, 84, 98, -1));

        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("Username");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(316, 87, -1, -1));

        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("Password");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(316, 125, -1, -1));

        spassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                spasswordActionPerformed(evt);
            }
        });
        getContentPane().add(spassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(384, 122, 98, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\DELL\\Desktop\\car.jpg")); // NOI18N
        jLabel8.setText("jLabel8");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 340));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void routesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_routesActionPerformed
    s6=routes.getSelectedItem().toString();
            System.out.println(s6);    // TODO add your handling code here:
    }//GEN-LAST:event_routesActionPerformed

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameActionPerformed

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordActionPerformed

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        // TODO add your handling code here:
 
 
 
        
        
        
        
        
        String op="'";
        
        boolean t;boolean o;
            s1=op+name.getText()+op;
         s2=op+username.getText()+op;
         s3=op+password.getText()+op;
         //s4=Integer.parseInt(jTextField1.getText());
         //s5=op+jTextField2.getText()+op;
            s6=op+routes.getSelectedItem().toString()+op;
            int vn=0;
            if(vehicle_no.getText().equals(""))
                    {
                    }
            else
                vn=Integer.parseInt(vehicle_no.getText());
                    
            System.out.println(s6); 
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        if(susername.getText().length()==0&&username.getText().length()==0)  // Checking for empty field
      JOptionPane.showMessageDialog(null, "Empty fields detected ! Please fill up all fields");
   else if(spassword.getText().length()==0&&password.getText().length()==0)  // Checking for empty field
      JOptionPane.showMessageDialog(null, "Empty fields detected ! Please fill up all fields");
   
  
   else{
       if(signin.isSelected()){
       String user = susername.getText();   // Collecting the input
       String pass = spassword.getText(); // Collecting the input
        // converting from array to string
       
      
           o=validate_logino(user,pass);
               t=validate_logint(user,pass);
          
   if(o==false&&t==false)
          JOptionPane.showMessageDialog(null, "Incorrect Login Credentials");        
       else
          JOptionPane.showMessageDialog(null, "Correct Login Credentials");
   if(o)     
   {owner frame = new owner();
    
    frame.setVisible(true);
    frame.setUsername(user);
   }   
          if(t)
          {traveler frames = new traveler();
    frames.setVisible(true);
    frames.setUsername(user);
          }
       
       
       }if(signup.isSelected())
       {
       db1(s1,s2,s3,s6,vn);
       }
       
 this.setVisible(false);
   }
    }//GEN-LAST:event_submitActionPerformed

    private boolean validate_logino(String username,String password) {
   try{           
       Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres","sowmya");     
       PreparedStatement pst = connection.prepareStatement("Select * from owner where username=? and password=?");     
       
       pst.setString(1, username); 
       pst.setString(2, password);
       
       ResultSet rs = pst.executeQuery();                        
       if(rs.next())            
           return true;    
       else
           return false;            
   }
   catch(Exception e){
       e.printStackTrace();
       return false;
   }       
}
    private boolean validate_logint(String username,String password) {
   try{           
       Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres","sowmya");     
       PreparedStatement pst = connection.prepareStatement("Select * from traveler where username=? and password=?");     
       
       pst.setString(1, username); 
       pst.setString(2, password);
       
       ResultSet rs = pst.executeQuery();                        
       if(rs.next())            
           return true;    
       else
           return false;            
   }
   catch(Exception e){
       e.printStackTrace();
       return false;
   }       
}
    
    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed

    
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed

    private void r1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r1ActionPerformed
if(r1.isSelected()==true) // if check box is checked
       {r=1;
            vehicle_no.setEnabled(false);  
           
       }
       // TODO add your handling code here:
    }//GEN-LAST:event_r1ActionPerformed

    private void vehicle_noActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vehicle_noActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vehicle_noActionPerformed

    private void r2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r2ActionPerformed
if(r2.isSelected()==true) // if check box is checked
       {r=2;
            vehicle_no.setEnabled(true); 
          
       }
        // TODO add your handling code here:
    }//GEN-LAST:event_r2ActionPerformed

    private void signinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signinActionPerformed
if(signin.isSelected()==true)
{ 
    sign=1;
    susername.setEnabled(true);
  spassword.setEnabled(true);
    username.setEnabled(false);
  password.setEnabled(false);
  name.setEnabled(false);
    routes.setEnabled(false);
    r1.setEnabled(false);
    r2.setEnabled(false);
    vehicle_no.setEnabled(false);
    submit.setEnabled(true);
    
}   
    // TODO add your handling code here:
    }//GEN-LAST:event_signinActionPerformed

    private void signupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signupActionPerformed
if(signup.isSelected()==true)
{   sign=2;
username.setEnabled(true);
    password.setEnabled(true);
    name.setEnabled(true);
    routes.setEnabled(true);
    r1.setEnabled(true);
    r2.setEnabled(true);
    vehicle_no.setEnabled(true);
     submit.setEnabled(true);
    
}   // TODO add your handling code here:
    }//GEN-LAST:event_signupActionPerformed

    private void spasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_spasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_spasswordActionPerformed

        // TODO add your handling code here:
    
    /**
     * @param args the command line arguments
     */
    public void db1(String s1,String s2,String s3,String s4,int vn)
    {
    	System.out.println("-------- PostgreSQL "
				+ "JDBC Connection Testing ------------");
System.out.println(s1);
System.out.println(s2);
		try {

			Class.forName("org.postgresql.Driver");

		} catch (ClassNotFoundException e) {

			System.out.println("Where is your PostgreSQL JDBC Driver? "
					+ "Include in your library path!");
			e.printStackTrace();
			return;

		}

		System.out.println("PostgreSQL JDBC Driver Registered!");

		Connection connection = null;

		try {

			connection = DriverManager.getConnection(
					"jdbc:postgresql://localhost:5432/postgres", "postgres",
					"sowmya");
                        Statement stmt = null;
                        stmt = connection.createStatement();
                        
                        if(r2.isSelected())
                        {String sql="insert into owner(name,username,password,route,vehicle_number)values("+ s1+ ","+s2+","+s3+","+s4+","+vn+")";
                       stmt.executeUpdate(sql); }
                        else
                            if(r1.isSelected())
                            {
                                String sql="insert into traveler(username,password,name,route)values(" + s1+ ","+s2+","+s3+","+s4+")";
                            stmt.executeUpdate(sql);
                            } 
                        
         stmt.close();


		} catch (SQLException e) {

			System.out.println("Connection Failed! Check output console");
			e.printStackTrace();
			return;

		}

		if (connection != null) {
			System.out.println("You made it, take control your database now!");
		} else {
			System.out.println("Failed to make connection!");
		}
 
 
    }
    public void db2(String s2,String s3)
    {
        System.out.println("-------- PostgreSQL "
				+ "JDBC Connection Testing ------------");

		try {

			Class.forName("org.postgresql.Driver");

		} catch (ClassNotFoundException e) {

			System.out.println("Where is your PostgreSQL JDBC Driver? "
					+ "Include in your library path!");
			e.printStackTrace();
			return;

		}

		System.out.println("PostgreSQL JDBC Driver Registered!");

		Connection connection = null;

		try {

			connection = DriverManager.getConnection(
					"jdbc:postgresql://localhost:5432/postgres", "postgres",
					"sowmya");
                        Statement stmt = null;
                       
         stmt.close();


		} catch (SQLException e) {

			System.out.println("Connection Failed! Check output console");
			e.printStackTrace();
			return;

		}

		if (connection != null) {
			System.out.println("You made it, take control your database now!");
		} else {
			System.out.println("Failed to make connection!");
		}
 
    }
    
    
    public static void main(String args[]) throws SQLException 
    {   

        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new signup().setVisible(true);
            }
        });
    
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField name;
    private javax.swing.JTextField password;
    private javax.swing.JRadioButton r1;
    private javax.swing.JRadioButton r2;
    private javax.swing.JComboBox<String> routes;
    private javax.swing.JRadioButton signin;
    private javax.swing.JRadioButton signup;
    private javax.swing.JTextField spassword;
    private javax.swing.JButton submit;
    private javax.swing.JTextField susername;
    private javax.swing.JTextField username;
    private javax.swing.JTextField vehicle_no;
    // End of variables declaration//GEN-END:variables
}


