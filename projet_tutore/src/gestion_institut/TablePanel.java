package gestion_institut;

import java.awt.BorderLayout;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.TableModel;

import com.sun.glass.events.MouseEvent;


public class TablePanel extends JPanel
{
	 String row;
  public TablePanel( TableModel model )
  {
	   
    table = new JTable( model );
   
    
    setLayout( new BorderLayout() );
    add( new JScrollPane( table ), BorderLayout.CENTER );
    
  }
  
  
  public void mouseClicked(MouseEvent arg0) {}


  private JTable table;
  
}