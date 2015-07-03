package gestion_institut;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class Insertion2 {
	
	private String mont,mois,modalite,numch;
	int idetud;
	
	Object object,object2;
	//  public Insertion(String string, String string2, String string3, String string4, String string5, Object object){}
	
	
	public Insertion2(int idetud,String mont, String mois,String modalite, String numch){
	    this.mont = mont; //nom
	    this.modalite = modalite; //prenom
	    this.mois = mois; //email
	    this.numch = numch; //ddn
	    this.idetud=idetud;
	  }
	  
	
	
	public void verif2(){
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
	/*
ResultSet res = req.executeQuery ("SELECT * FROM `inscription` WHERE id_inscription= (SELECT max(id_inscription) from inscription)"); 
while (res.next()){
	  r=res.getInt("id_inscription");
	
}
k=r+1;
 req.executeUpdate(" insert into inscription (id_inscription,montant_annuel)"
		+ " values ('"+k+"','1500000')");

 
 
 ResultSet res2 = req.executeQuery ("SELECT * FROM `etudiant` WHERE id_etudiant= (SELECT max(id_etudiant) from etudiant)"); 
 while (res2.next()){
 	  r2=res2.getInt("id_etudiant");
 	
 } k2=r2+1;
 
 */
//recuperation idetudiant

   req.executeUpdate("insert into comptabilite(idetud,montant,mois,modalite,numero_check) values('"+this.idetud+"','"+this.mois+"','"+this.mont+"','"+this.modalite+"','"+this.numch+"')");
   JOptionPane.showMessageDialog(null, "Votre etudiant a été a inscrit!");
	}

	catch (SQLException e) {
		System.out.println("echec pilote : "+e);
	}
	
}
}
