package pkj2;

import java.awt.*;
import javax.swing.JFrame;
  
public class GUI extends Canvas{  
      
    public void paint(Graphics g) {  
  
        Toolkit t=Toolkit.getDefaultToolkit();  
        Image i=t.getImage("p3.gif");  
        g.drawImage(i, 120,100,this);  
          
    }  
        public static void main(String[] args) {  
        MyCanvas m=new MyCanvas();  
        JFrame f=new JFrame();  
        f.add(m);  
        f.setSize(400,400);   
        f.setVisible(true);  
    }  
  
}  