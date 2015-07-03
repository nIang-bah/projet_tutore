package gestion_institut;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import javax.swing.JOptionPane;
public class Connecter  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private   String log;
	private  String pwd;
	public Connecter(){}
	  public Connecter(String log, String pwd){
		  super();
	   this.log = log;
	   this.pwd = pwd;
	    //this.log = "niang_bah";
	    //this.mdp = "admin1";
	    }
	    
	    public void verif(){
			
			Connecter connect= new Connecter();
			java.sql.Connection con = null;
			
			try {
				try {
					Class.forName("com.mysql.jdbc.Driver");
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} 
				

	con = DriverManager.getConnection( "jdbc:mysql://localhost/institut","root","");


				
				java.sql.Statement req = con.createStatement();

	ResultSet res = req.executeQuery("select * from user where login= '"+this.log+"' && password= '"+this.pwd+"'");
	if(res.next())  {
					System.out.println ("UTILISATEUR AUTHENTIFIE");
					Page1 page1=new Page1();
					page1.setVisible(false);
					Page2 page2= new Page2();
					page2.setVisible(true);
					
					}
			
	else{ 
		System.out.println ("UTILISATEUR  NON AUTHENTIFIE");
		JOptionPane.showMessageDialog (null,"Login ou mot de passe incorrecte","erreur!",
				JOptionPane.INFORMATION_MESSAGE, null);
	}
			
			req.close();
			
			} 
			
			catch (SQLException e) {
				System.out.println("echec pilote : "+e);
			}
			 

		}
	  

}
