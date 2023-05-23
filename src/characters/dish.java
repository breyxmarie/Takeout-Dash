/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package characters;

import java.awt.Component;
import java.awt.Image;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionAdapter;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author miaag
 */
public class dish {
    
    final JLabel lbls = new JLabel();
    static int shapes = 0;
    static int numberofdish = 0;
    int shape = 0;
            int hey = 1;
    int x_pressed = 0;
int y_pressed = 0;
int scores = 0;
String hands = "src/image/hand.png";
  //  public dish(){
        
   // }
    
    /**
     *
     * @return 
     */
    public JLabel create(){
        numberofdish +=1;
        
        //System.out.println(numberofdish);
        lbls.setBounds(1* 55, 2 * 20, 75, 80);
         ImageIcon cokelabel = new ImageIcon("src/image/drink.gif");
        Image img = cokelabel.getImage();
        Image scale = img.getScaledInstance(lbls.getWidth(),lbls.getHeight(), Image.SCALE_DEFAULT);
        ImageIcon scaleds = new ImageIcon(scale);
        lbls.setIcon(scaleds);
        return lbls;
    }
    
    
    public Rectangle createrect(){
        
        Rectangle r1 = lbls.getBounds();
        return r1;
    }
    
    
    public int clicklab(int eh, int f,int dish){
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
              //  System.out.println(dish);
               // r1.setLocation(e.getXOnScreen() - x_pressed, e.getYOnScreen() - y_pressed);
              // if(dish == 0){
               lbls.setLocation(e.getXOnScreen() - x_pressed, e.getYOnScreen() - y_pressed);
              // }
            }
            
            @Override
            public void mouseReleased(MouseEvent e){
                //and when the Jlabel is dragged
                // if (tot.intersects(tott)){
                //    System.out.println("pls");
                //  }
                
              //  Rectangle totsa = tot.getBounds();
        
      //  Rectangle totta = tott.getBounds(); 
           //      if (totta.intersects(totsa)){
                   // System.out.println("pls");
                    //lbls.setVisible(false);
                  //   s = 10;
                  //scores += 10;
               //      System.out.println(scores);
                  //   checkcompa(5,4);
                     //return s;
                  }
                 
               // if(eh == f){
                    // if(e == f){
               //     System.out.println("hi he sdkfjsfd");
                    //scoress +=1; 
                   //s = 10;
                  //  scoress +=1;
               // }
            //    System.out.println("helood");
               // return 0;
              //  return 0;
         //   }
            
            /*  lbls.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent me) {
            shape += 1;
            System.out.println(shape);
            }*/
            
              public void mouseEntered(MouseEvent me){
                lbls.setCursor(Toolkit.getDefaultToolkit().createCustomCursor(new ImageIcon(hands).getImage(), new Point(0,0),"custom cursor"));   
            }
            public void mouseExited(MouseEvent me){
               // lbls.setCursor(Toolkit.getDefaultToolkit().createCustomCursor(new ImageIcon(racket).getImage(), new Point(0,0),"custom cursor"));
            }
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
    
    public int checkcompa(int e, int f){
        
        
 /*       final MouseAdapter ma = new MouseAdapter(){
            @Override
    public void mouseMoved(MouseEvent e){   
         shape +=1;
         hey+=1;
        System.out.println("hi"+ hey);
        
    }
    
        };  */
        
        if(e == f){
        //    System.out.println(10);
            return 10;
        }
       // lbls.addMouseListener(ma);
       // lbls.addMouseMotionListener(ma);
        return 10;
    }
}
