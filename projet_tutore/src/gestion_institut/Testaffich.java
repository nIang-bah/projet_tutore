package gestion_institut;



import java.awt.BorderLayout;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JFrame;


public class Testaffich
{
  public static void main(String[] args)
  {
    Connection connection = getConnection();
    try
    {
        Statement st = connection.createStatement( ResultSet.TYPE_SCROLL_INSENSITIVE,
                								   ResultSet.CONCUR_READ_ONLY );
        
        ResultSet rs = st.executeQuery( "SELECT * FROM T_COMPOSITEURS_CMP" );
        ResultSetTableModel rtm = new ResultSetTableModel( rs );
        
        TablePanel tablePanel = new TablePanel( rtm );
        
        JFrame mainFrame = new JFrame( "Affiche table " );
        mainFrame.add( tablePanel, BorderLayout.CENTER );
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );
        mainFrame.setSize( 640, 480 );
        mainFrame.setVisible( true );
    } 
    catch ( SQLException e )
    {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
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
         connection = DriverManager.getConnection( URL_DATABASE );
       } 
       catch ( SQLException e )
       {
         System.out.println( "ERREUR de connexion à la base de données: " + 
                                       URL_DATABASE );
         e.printStackTrace();
       }
     }
    
      return connection;
    }
    
    //--- attributs
    private static final String PILOTE = "org.apache.derby.jdbc.EmbeddedDriver";
    private static final String URL_DATABASE =
      			"jdbc:derby:/home/christophe/databases/derby_dbs/" + 
                        "mediatheque/mediathequedb;create=false";
}