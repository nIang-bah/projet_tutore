package gestion_institut;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Insertion {
	
	private String txtpr,txtnm,txtmail,txtadr,txtddn,txtldn,txttel,sex,txtprenomtute,txtnomtute,txtteltute,dept,nivo,annee,heure;
	int idetud; int k=0;int r2=0; int k2=0;
	private String k3;
	Object object,object2;
	//  public Insertion(String string, String string2, String string3, String string4, String string5, Object object){}
	  public Insertion(String txtprenom, String txtnom,String txtemail, String txtddn, String txtldn, String txtadr,String txttel,
			  String sex, String txtprenomtute,String txtnomtute,String txtteltute,String dept,String nivo,String heure,String annee){
	    this.txtpr = txtprenom; //nom
	    this.txtnm = txtnom; //prenom
	    this.txtmail = txtemail; //email
	    this.txtddn = txtddn; //ddn
	    this.txtldn = txtldn; //ldn
	    this.txtadr = txtadr; //adr
	    this.txttel = txttel; //telephone
	    this.sex = sex; //sexe
	    this.txtprenomtute = txtprenomtute; //prenomtut
	    this.txtnomtute = txtnomtute; //nomtute
	    this.txtteltute = txtteltute; //telephone tute
	    this.dept = dept; //dept
	    this.nivo = nivo; //nivo
	    this.heure = heure; //heure de cours
	    this.annee = annee; //annee
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

   req.executeUpdate("insert into etudiant(prenometu,nometu,date_naiss,email,lieu_naiss,tel,adress,sexe,prenomtute,nomtute,teltute,dept,niveau,heure,annee)"
		+"values('"+this.txtpr+"','"+this.txtnm+"','"+this.txtddn+"','"+this.txtmail+"','"+this.txtldn+"','"+this.txttel+"','"+this.txtadr+"','"+this.sex+"','"+this.txtprenomtute+"','"+this.txtnomtute+"','"+this.txtteltute+"','"+this.dept+"','"+this.nivo+"','"+this.heure+"','"+this.annee+"')");
  //recuperation idetudiant
   ResultSet res = req.executeQuery ("SELECT idetud FROM etudiant WHERE prenometu ='"+this.txtpr+"' and nometu = '"+this.txtnm+"' and date_naiss='"+this.txtddn+"'"); 
   while (res.next()){
   	  idetud=res.getInt("idetud");
   }
   System.out.println(idetud);
   Page4 zg= new Page4(idetud);
  	zg.setVisible(false);
   
	}

	catch (SQLException e) {
		System.out.println("echec pilote : "+e);
	}
	
}
}
