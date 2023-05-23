/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package characters;

import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author miaag
 */
public class customer {
     final JLabel lbls = new JLabel("hatdog");
     
     int x_pressed = 0;
     int y_pressed = 0;

    public JLabel create(){
      
        
        lbls.setBounds(1* 105, 2 * 20, 100, 175);
         ImageIcon cokelabel = new ImageIcon("src/image/lamb.gif");
        Image img = cokelabel.getImage();
        Image scale = img.getScaledInstance(lbls.getWidth(),lbls.getHeight(), Image.SCALE_DEFAULT);
        ImageIcon scaleds = new ImageIcon(scale);
        lbls.setIcon(scaleds);
      
       
        return lbls;
    }
    
    
    
    
        public int clicklab(int eh, int f){
         final MouseAdapter ma;
        ma = new MouseAdapter(){
            /* @Override
            public void mousePressed(final MouseEvent e){
            shape += 1;
            System.out.println(shape);
            }  */
            
            public void mousePressed(MouseEvent e) {
                //catching the current values for x,y coordinates on screen
                x_pressed = e.getX();
                y_pressed = e.getY();
                
                //   final Component pressedComp = lbls.findComponentAt(e.getX(), e.getY());
             //   shape +=1;
             //   System.out.println(shape +" " + x_pressed + " "+ y_pressed);
                
            }
            
            
            @Override
            public void mouseDragged(MouseEvent e){
                //and when the Jlabel is dragged
                
               // r1.setLocation(e.getXOnScreen() - x_pressed, e.getYOnScreen() - y_pressed);
                lbls.setLocation(e.getXOnScreen() - x_pressed, e.getYOnScreen() - y_pressed);
            }
            
            @Override
            public void mouseReleased(MouseEvent e){
                //and when the Jlabel is dragged
                // if (tot.intersects(tott)){
                //    System.out.println("pls");
                //  }
                
               // Rectangle totsa = tot.getBounds();
        
     //   Rectangle totta = tott.getBounds(); 
       //          if (totta.intersects(totsa)){
                   // System.out.println("pls");
                    //lbls.setVisible(false);
                  //   s = 10;
                 // scores += 10;
                 //    System.out.println(scores);
                  //   checkcompa(5,4);
                     //return s;
          //        }
                 
                if(eh == f){
                    // if(e == f){
                    System.out.println("hi he sdkfjsfd");
                    //scoress +=1; 
                   //s = 10;
                  //  scoress +=1;
                }
                System.out.println("helood");
               // return 0;
              //  return 0;
            }
            
            /*  lbls.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent me) {
            shape += 1;
            System.out.println(shape);
            }*/
        };  
      
       lbls.addMouseListener(ma);
       lbls.addMouseMotionListener(ma);
       //return shape;
       
      // if(true){
      //     System.out.println(s);
      //  return 10;
    //   }
         return 0;
    }
}
