/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package awtcounter;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Ochieng_Derrick
 */
public class AWTcounter extends Frame implements ActionListener {
    private final Label lblCount;    // Declare a Label component     
    private final TextField tfCount; // Declare a TextField component     
    private final Button btnCount;   // Declare a Button component    
    private int count = 0;     // Counter's value 
    
public AWTcounter(){
    setLayout(new FlowLayout());
    
     lblCount = new Label("Counter");
     add(lblCount); 
     
     tfCount = new TextField("0", 10);
     
      tfCount.setEditable(false);       // set to read-only 
      add(tfCount); 
      
       btnCount = new Button("Count");   // construct the Button component 
       add(btnCount); 
       
        btnCount.addActionListener(this); 
        
         setTitle("AWT Counter");  // "super" Frame sets its title
         setSize(250, 100);        // "super" Frame sets its initial window size
         
          setVisible(true);         // "super" Frame shows 
}
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         AWTcounter app = new AWTcounter(); 
    }

    @Override
    public void actionPerformed(ActionEvent e) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
         ++count;
          tfCount.setText(count + ""); 
    }
    
}
