package gestion_institut;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.*;
import javax.swing.border.Border;



public class Afichage1 extends JFrame
{ 
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
    private JMenuBar menuBar = new JMenuBar();
	 JButton sauvegarder, annuler;
	  JButton inscription, modification,affichage,aPropos,acceuil,quitter,comptabilite;
	  JPanel panhaut,panbas;
	 
	 
	public Afichage1() throws SQLException{
		
		//Boutons pour le menu
		
		 acceuil = new JButton("   Menu || Acceuil    ");
		  inscription = new JButton("    Inscription    ");
		  comptabilite = new JButton("    comptabilité    ");
		  modification = new JButton("    Modifier    ");
		  affichage= new JButton("     Affichage    ");
		  quitter = new JButton("    Quitter     ");
		  aPropos = new JButton("    À propos     ");
		  
		  panhaut = new JPanel();
		  panbas = new JPanel();
		  
		  //Ajout des menus dans la barre de menus
		  menuBar.add(acceuil);
	    menuBar.add(inscription);
	    menuBar.add(comptabilite);
	    menuBar.add(affichage);
	    menuBar.add(modification);
	    menuBar.add(quitter);
	    menuBar.add(aPropos);
	    
	    
	    
	    menuBar.setBackground(Color.lightGray);
		  menuBar.setBounds(3,5, 8, 15);
		  menuBar.setBorderPainted(true);
		  Border b = BorderFactory.createLineBorder (Color.red .darker ( ) ,1) ;
		  Border c = BorderFactory.createLineBorder (Color.black .darker ( ) ,3) ;
			 
		  acceuil.setBorder(b);
		  comptabilite.setBackground(Color.LIGHT_GRAY);
		  inscription.setBorder(b);
		  comptabilite.setBorder(b);
		  modification.setBorder(b);
		  affichage.setBorder(b);
		  quitter.setBorder(b);
		  aPropos.setBorder(b);
		  
		
		Connection connection = getConnection();
		connection = DriverManager.getConnection(  "jdbc:mysql://localhost/institut","root","" );
       // java.sql.Statement req = connection.createStatement();
        //System.out.println( "connecter à la base de données: ");
	    try
	    {
	        Statement st = connection.createStatement( ResultSet.TYPE_SCROLL_INSENSITIVE,
	                								   ResultSet.CONCUR_READ_ONLY );
	        
	        ResultSet rs = st.executeQuery( "SELECT idetud as Id_etudiant,prenometu as Prenom_Etudiant,nometu as Nom_Etudiant,dept as Departement,niveau as Niveau,montant,mois,modalite FROM etudiant natural join comptabilite" );
	        ResultSetTableModel rtm = new ResultSetTableModel( rs );
	        
	        
	        
	        TablePanel tablePanel = new TablePanel( rtm );
	        
	        
	        final JFrame mainFrame = new JFrame( "Comptabilite " );
	        
	        mainFrame.add( tablePanel, BorderLayout.CENTER );
	        mainFrame.setDefaultCloseOperation(EXIT_ON_CLOSE );
	        mainFrame.setSize( 800, 500 );
	        mainFrame.setVisible( true );
	        
	        panhaut.add(menuBar);
	        mainFrame.add(panhaut,BorderLayout.PAGE_START);
	        
	        JButton cancelBouton = new JButton("Retourner a l'acceuil");
	        JButton payer = new JButton("Enregistrer un paiement");
	        cancelBouton.setPreferredSize(new Dimension(160,27));
	        panbas.add(cancelBouton);
	        panbas.add(payer);
	        mainFrame.add(panbas, BorderLayout.SOUTH);
	        cancelBouton.addActionListener(new ActionListener(){
	          public void actionPerformed(ActionEvent arg0) {
	        	  
	        	  mainFrame.setVisible(false);
	        	  Page2 zd=new Page2 ();
	        	  
	         
	          }      
	        });
	        
	        payer.addActionListener(new ActionListener(){
		          public void actionPerformed(ActionEvent arg0) {
		        	  
		        	  mainFrame.setVisible(false);
		        	  Page5 zd=new Page5 ();
		        	  zd.setVisible(true);
		        	  
		         
		          }      
		        });
	        
	        acceuil.addActionListener(new ActionListener(){
		          public void actionPerformed(ActionEvent arg0) {
		        	  
		        	  mainFrame.setVisible(false);
		        	  Page2 pag= new Page2();
		      		pag.setVisible(true);
		        	  
		          }      
		        });
	        
	        quitter.addActionListener(new ActionListener(){
		          public void actionPerformed(ActionEvent arg0) {
		        	  
		        	  mainFrame.setVisible(false);
		        	  Page1 page1= new Page1();
		      		page1.setVisible(true);
		        	  
		          }      
		        });
	        
	        inscription.addActionListener(new ActionListener(){
		          public void actionPerformed(ActionEvent arg0) {
		        	  
		        	  mainFrame.setVisible(false);
		        	  Enre_etudiant page3= new Enre_etudiant();
		      		  page3.setVisible(true);
		        	  
		          }      
		        });
	        
	        aPropos.addActionListener(new ActionListener(){
		          public void actionPerformed(ActionEvent arg0) {
		        	  
		        	  mainFrame.setVisible(false);
		        	  Apropos propo= new Apropos();
		      		propo.setVisible(true);
		        	  
		          }      
		        });
	        
	        affichage.addActionListener(new ActionListener(){
		          public void actionPerformed(ActionEvent arg0) {
		        	  
		        	  mainFrame.setVisible(false);
		        	  Afichage2 afich;
		      		try {
		      			afich = new Afichage2();
		      			afich.setVisible(true);
		      		} catch (SQLException e1) {
		      			// TODO Auto-generated catch block
		      			e1.printStackTrace();
		      		}
		        	  
		          }      
		        });
	        
	        
	    } 
	    catch ( SQLException e )
	    {
	      // TODO Auto-generated catch block
	      e.printStackTrace();
	    }
		
	}
		
	
  public static void main(String[] args) throws SQLException
  {
	  Afichage1 zf= new Afichage1();
      zf.setVisible(false);
      
      //zf.setVisible(true);
      
  } 
  
  public static Connection getConnection()
    {
      Connection connection = null;
      boolean ok = false;
    
      //--- chargement en mémoire du pilote
      try
     {
       Class.forName( PILOTE );
       ok = true;
     } 
     catch ( ClassNotFoundException e )
     {
       System.out.println( "ERREUR chargement du pilote: pilote non trouvé" );
       e.printStackTrace();
     }
    
     //--- connexion à la base de données
     if ( ok )
     {
       try
       {
         connection = DriverManager.getConnection(  "jdbc:mysql://localhost/institut","root","" );
         java.sql.Statement req = connection.createStatement();
         System.out.println( "Succes!! vous etes connecter à la base de données: ");
       } 
       catch ( SQLException e )
       {
         System.out.println( "ERREUR de connexion à la base de données: " 
                                        );
         e.printStackTrace();
       }
     }
    
      return connection;
    }
    
    //--- attributs
    private static final String PILOTE = "com.mysql.jdbc.Driver";
   // private static final String URL_DATABASE = "jdbc:mysql://localhost/institut","root","" ;

	}
