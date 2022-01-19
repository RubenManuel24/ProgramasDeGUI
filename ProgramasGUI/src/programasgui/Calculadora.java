
package programasgui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author RubenManuel
 */
public class Calculadora extends JFrame{
    
    public Calculadora(){
    super("Calculadora");
    
    JTextField f = new JTextField();
    Container c2 = getContentPane();
    c2.setLayout(new BorderLayout());
    c2.add(BorderLayout.NORTH, f);
    
   
     
      f.setFont(new Font("ruben", Font.PLAIN, 20));
      Container c = new JPanel();
      c.setLayout(new GridLayout(4,4,5,5));
      c.add(new JButton("7"));
      c.add(new JButton("8"));
      c.add(new JButton("9"));
      c.add(new JButton("/"));
      c.add(new JButton("4"));
      c.add(new JButton("5"));
      c.add(new JButton("6"));
      c.add(new JButton("*"));
      c.add(new JButton("1"));
      c.add(new JButton("2"));
      c.add(new JButton("3"));
      c.add(new JButton("-"));
      c.add(new JButton("0"));
      c.add(new JButton("."));
      c.add(new JButton("="));
      c.add(new JButton("+"));
           
      
      
      c2.add(BorderLayout.CENTER, c);
    
    
    setSize(400,500);
    setVisible(true);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    
    }
    
    public static void main(String[] args) {
        
        new Calculadora();
        
    }
    
}
