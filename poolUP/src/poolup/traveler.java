/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package poolup;
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
import java.util.*;
/**
 *
 * @author DELL
 */
public class traveler extends javax.swing.JFrame {

    /**
     * Creates new form traveler
     */
    int id=1;
    String user;
    String tuser;
    
    public traveler() {
        
        initComponents();
    }
    public void setUsername(String username)
    {
    tuser=username;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        test = new javax.swing.JTable();
        route = new javax.swing.JComboBox<>();
        owner = new javax.swing.JTextField();
        confirmride = new javax.swing.JButton();
        km = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        rat = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(100, 100));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("Get Owner");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 64, -1, -1));

        test.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Name", "Rating"
            }
        ));
        jScrollPane2.setViewportView(test);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 93, 375, 184));

        route.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Routes", "K.K.Nagar", "Ambattur", "Porur", "Vandalur", "Triplicane" }));
        route.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                routeActionPerformed(evt);
            }
        });
        getContentPane().add(route, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 30, -1, -1));
        getContentPane().add(owner, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 295, 128, -1));

        confirmride.setText("ConfirmRide");
        confirmride.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmrideActionPerformed(evt);
            }
        });
        getContentPane().add(confirmride, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 360, -1, -1));
        getContentPane().add(km, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 295, 79, -1));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Owner name");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 298, -1, -1));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("No:of Kms");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(217, 298, -1, -1));

        jButton2.setText("My profile");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(225, 30, -1, -1));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Rating");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, -1, -1));
        getContentPane().add(rat, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 330, 100, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/poolup/car2.jpg"))); // NOI18N
        jLabel6.setText("jLabel6");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
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
                    String op="'";
String r=op+route.getSelectedItem()+op;


			connection = DriverManager.getConnection(
					"jdbc:postgresql://localhost:5432/postgres", "postgres",
					"sowmya");
                        Statement stmt = null;
                        
                        stmt = connection.createStatement();
                        
                        String sql="select * from getowners("+r+")";
                        
                        ResultSet rs=stmt.executeQuery(sql);
                        int i=0;
                        while(rs.next())
                        {test.setValueAt(rs.getString(1),i,0);
                        test.setValueAt(rs.getString(2), i,1 );
                        i++;}
                        
                     
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
 
 
    
   
  
// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void routeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_routeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_routeActionPerformed

    private void confirmrideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmrideActionPerformed
        // TODO add your handling code here:
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
                    String op="'";
String own=op+owner.getText()+op;
tuser=op+tuser+op;
int kms=Integer.parseInt(km.getText());
int rides;
int am;
Date d=new Date();
String dates=d.toString();
dates=op+dates+op;
String r=op+route.getSelectedItem()+op;
int rating=Integer.parseInt(rat.getText());
connection = DriverManager.getConnection(
					"jdbc:postgresql://localhost:5432/postgres", "postgres",
					"sowmya");
                        Statement stmt = null;
                        Statement stmt2=null;
                       Statement stmt3=null;
                       Statement stmt4=null;
                       Statement stmt5=null;
                       Statement stmt6=null;
                      Statement stmtr=null;
                        stmt = connection.createStatement();
                        stmt2=connection.createStatement();
                        stmt3=connection.createStatement();
                        stmt4=connection.createStatement();
                        stmt5=connection.createStatement();
                        stmt6=connection.createStatement();
                        stmtr=connection.createStatement();
                        
                        ResultSet rrr=stmtr.executeQuery("select preference from ownerchoice where username="+own);
                        
  rrr.next();
                        if(rrr.getString(1).equals("No"))
                        {
                            String sql="insert into rides (owner,traveller,date_of_ride)values("+own+","+tuser+","+dates+")";
                        stmt.executeUpdate(sql);
                        
                         ResultSet rs =stmt2.executeQuery("select * from getamount("+kms+","+r+")");
                         
                         while(rs.next())
                         {am=Integer.parseInt(rs.getString(1));
                        stmt3.executeUpdate("update traveler set balance=balance-"+am+" where username="+tuser);
                         }
                         stmt4.executeQuery("select * from addrides_pro("+own+","+tuser+")");
                   
                        ResultSet r2=stmt5.executeQuery("select * from traveler where username="+tuser);
                        r2.next();
                        rides=Integer.parseInt(r2.getString(7));
                        if(rides>5)
                            JOptionPane.showMessageDialog(null,"Congratulations!!!You have got a discount!!!");
                        
                   JOptionPane.showMessageDialog(null, "Booking Confirmed");
                   stmt6.executeQuery("select ownerrating("+rating+","+own+")");
                        }
                        else
                        {Statement s=null;
                        s=connection.createStatement();
                       
                        String s1="select chck("+own+","+tuser+")";
                        System.out.println(s1);
                        ResultSet tr=s.executeQuery("select chck("+own+","+tuser+")");
                        tr.next();
                        if(Integer.parseInt(tr.getString(1))==1)
                        {String sql="insert into rides (owner,traveller,date_of_ride)values("+own+","+tuser+","+dates+")";
                        stmt.executeUpdate(sql);
                        
                         ResultSet rs =stmt2.executeQuery("select * from getamount("+kms+","+r+")");
                         
                         while(rs.next())
                         {am=Integer.parseInt(rs.getString(1));
                         stmt3.executeQuery("select * from procedure1("+kms+","+r+","+tuser+")");
                         }
                        stmt4.executeQuery("select * from addrides_pro("+own+","+tuser+")");
                        
                        ResultSet r2=stmt5.executeQuery("select * from traveler where username="+tuser);
                        r2.next();
                        rides=Integer.parseInt(r2.getString(7));
                        if(rides>5)
                            JOptionPane.showMessageDialog(null,"Congratulations!!!You have got a discount!!!");
                        
                   JOptionPane.showMessageDialog(null, "Booking Confirmed");
                   stmt6.executeQuery("select ownerrating("+rating+","+own+")");}
                        else
                        
                            JOptionPane.showMessageDialog(null,"You canot ride with this owner");
        
                        }
                         stmt.close();


		} catch (SQLException e) {

			System.out.println("Connection Failed! Check output console");
                        
			e.printStackTrace();
                        JOptionPane.showMessageDialog(null,e);
			return;

		}
                

		if (connection != null) {
			System.out.println("You made it, take control your database now!");
		} else {
			System.out.println("Failed to make connection!");
		}
 
    
    }//GEN-LAST:event_confirmrideActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
Profile myprofile=new Profile();
myprofile.setVisible(true);
myprofile.setusername(tuser);// TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(traveler.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(traveler.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(traveler.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(traveler.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new traveler().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton confirmride;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField km;
    private javax.swing.JTextField owner;
    private javax.swing.JTextField rat;
    private javax.swing.JComboBox<String> route;
    private javax.swing.JTable test;
    // End of variables declaration//GEN-END:variables
}
