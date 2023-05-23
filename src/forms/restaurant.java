/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forms;

import characters.customer;
import characters.dish;
import java.awt.BorderLayout;
import java.awt.Checkbox;
import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import java.io.File;
import static java.lang.Thread.sleep;
import java.net.URL;
import java.util.Random;
import java.util.TimerTask;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.KeyStroke;

import javax.swing.border.LineBorder;
import static jdk.nashorn.internal.objects.NativeJava.extend;

/**
 *
 * @author miaag
 */
public class restaurant extends javax.swing.JFrame {

    int x_pressed = 0;
    int y_pressed = 0;
    int score = 0;
    int s = 0;
    int clickdish = 0;
    int customertoserve = 0;
    static int milliseconds = 0;
    static int secondss = 0;
    static int minutess = 0;
    static boolean state = true;
    private int mouseX = 200;
    private int mouseY = 200;
    int counter = 180;

    Timer timer;
    JButton but = new JButton("hello");
    dish lasts = new dish();
    JLabel totss = lasts.create();
    dish secondd = new dish();
    JLabel secondish = secondd.create();

    dish thirdd = new dish();
    JLabel thirddish = thirdd.create();

    dish fourthd = new dish();
    JLabel fourthdish = fourthd.create();

    customer customs = new customer();
    JLabel cut = customs.create();

    customer secondc = new customer();
    JLabel secondcut = secondc.create();

    customer thirdc = new customer();
    JLabel thirdcut = thirdc.create();

    customer fourthc = new customer();
    JLabel fourthcut = fourthc.create();

    /**
     * Creates new form restaurant
     */
    public restaurant() {
        initComponents();
        //  starttimer();
        //Graphics k;
        //  Rectangle tot = last.createrect();
        // k.fillRect(tot.x, tot.y, tot.width, tot.height);

        //dito yun crecreate ng label for the dish
        //jPanel1.add(tots);
        countdownTimer tim = new countdownTimer();
        tim.run();
        ImageIcon cokelabel = new ImageIcon("src/image/cute.gif");
        Image img = cokelabel.getImage();
        // Image scale = img.getScaledInstance(lbl_banner.getWidth(),lbl_banner.getHeight(), Image.SCALE_DEFAULT);
        // ImageIcon scaleds = new ImageIcon(scale);
        // lbl_banner.setIcon(scaleds);

        //create dish
        dish last = new dish();
        JLabel tots = last.create();

        //////////////////////decor stuff
        ImageIcon cloud = new ImageIcon("src/image/cloud.gif");
        Image cl = cloud.getImage();
        Image cl7 = cl.getScaledInstance(jLabel4.getWidth(), jLabel4.getHeight(), Image.SCALE_DEFAULT);
        ImageIcon hr = new ImageIcon(cl7);
        jLabel4.setIcon(hr);
        jLabel8.setIcon(hr);
        jLabel6.setIcon(hr);
        jLabel9.setIcon(hr);
        ImageIcon baloon = new ImageIcon("src/image/gift.gif");
        Image bl = baloon.getImage();
        Image bl1 = bl.getScaledInstance(jLabel5.getWidth(), jLabel5.getHeight(), Image.SCALE_DEFAULT);
        ImageIcon you = new ImageIcon(bl1);
        jLabel5.setIcon(you);

        ////////////////////////////////////
        customs.clicklab(5, 5);
        secondc.clicklab(5, 5);
        thirdc.clicklab(5, 5);
        fourthc.clicklab(5, 5);

        lasts.clicklab(5, 5, clickdish);
        secondd.clicklab(5, 5, clickdish);
        thirdd.clicklab(5, 5, clickdish);
        fourthd.clicklab(5, 5, clickdish);

        secondish.setBounds(490, 85, 60, 80);
        thirddish.setBounds(550, 85, 60, 80);
        fourthdish.setBounds(610, 85, 60, 80);
        totss.setBounds(670, 85, 60, 80);
        totss.setVisible(false);

        secondish.setVisible(false);
        thirddish.setVisible(false);
        fourthdish.setVisible(false);

        secondcut.setVisible(false);
        thirdcut.setVisible(false);
        fourthcut.setVisible(false);
        cut.setVisible(false);

        newgame.add(totss);
        newgame.add(secondish);
        newgame.add(thirddish);
        newgame.add(fourthdish);

        secondcut.setBounds(75, 100, 90, 120);
        thirdcut.setBounds(10, 200, 80, 120);
        fourthcut.setBounds(75, 300, 80, 120);
        cut.setBounds(10, 400, 80, 120);

        newgame.add(cut);
        newgame.add(secondcut);
        newgame.add(thirdcut);
        newgame.add(fourthcut);

        but.setBounds(645, 460, 100, 130);
        ImageIcon charac = new ImageIcon("src/image/cute.gif");
        Image img7 = charac.getImage();
        Image scale7 = img7.getScaledInstance(but.getWidth(), but.getHeight(), Image.SCALE_DEFAULT);
        ImageIcon scaled7 = new ImageIcon(scale7);
        but.setIcon(scaled7);
        but.setContentAreaFilled(false);
        but.setBorder(null);
        but.setBorderPainted(false);

        newgame.add(but);
        but.requestFocusInWindow();

        JButton counter = new JButton(" hey");
        counter.setFocusable(false);
        counter.setBounds(350, 110, 500, 170);
        ImageIcon milolabel = new ImageIcon("src/image/counters.png");
        Image img6 = milolabel.getImage();
        Image scale6 = img6.getScaledInstance(counter.getWidth(), counter.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaled6 = new ImageIcon(scale6);

        counter.setIcon(scaled7);
        counter.setContentAreaFilled(false);
        counter.setBorder(null);
        counter.setBorderPainted(false);
        //   counter.setBackground(Color.yellow);

        //  counter.setIcon(scaled6);
        //  jPanel1.add(counter);
        JButton takeoutcounter = new JButton("");
        takeoutcounter.setFocusable(false);
        takeoutcounter.setBounds(70, 100, 350, 470);
        ImageIcon milolabels = new ImageIcon("src/image/takeout.png");
        Image img6s = milolabels.getImage();
        Image scale6s = img6s.getScaledInstance(takeoutcounter.getWidth(), takeoutcounter.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaled6s = new ImageIcon(scale6s);
        takeoutcounter.setIcon(scaled6s);

        //  takeoutcounter.setIcon(scaled7); 
        takeoutcounter.setContentAreaFilled(false);
        takeoutcounter.setBorder(null);
        takeoutcounter.setBorderPainted(false);
        newgame.add(takeoutcounter);

        but.addKeyListener(new KeyListener() {
            @Override
            public void keyPressed(KeyEvent e) {
                int keyCode = e.getKeyCode();
                int x = but.getLocation().x;
                int y = but.getLocation().y;
                int locs = 5;
                switch (keyCode) {
                    case KeyEvent.VK_UP:

                        if (clickdish == 1) {
                            totss.setLocation(x - 20, y - locs + 40);
                        }

                        but.setLocation(x, y - locs);
                        break;

                    case KeyEvent.VK_DOWN:

                        if (clickdish == 1) {
                            totss.setLocation(x - 20, y + locs + 40);
                        } else if (clickdish == 2) {
                            secondish.setLocation(x - 20, y + locs + 40);
                        } else if (clickdish == 3) {
                            thirddish.setLocation(x - 20, y + locs + 40);
                        } else if (clickdish == 4) {
                            fourthdish.setLocation(x - 20, y + locs + 40);
                        }
                        but.setLocation(x, y + locs);
                        break;

                    case KeyEvent.VK_LEFT:

                        if (clickdish == 1) {
                            totss.setLocation(x - locs - 20, y + 40);
                        } else if (clickdish == 2) {
                            secondish.setLocation(x - locs - 20, y + 40);
                        } else if (clickdish == 3) {
                            thirddish.setLocation(x - locs - 20, y + 40);
                        } else if (clickdish == 4) {
                            fourthdish.setLocation(x - locs - 20, y + 40);
                        }
                        but.setLocation(x - locs, y);
                        break;

                    case KeyEvent.VK_RIGHT:
                        if (clickdish == 1) {
                            totss.setLocation(x + locs - 20, y + 40);
                        } else if (clickdish == 2) {
                            secondish.setLocation(x + locs - 20, y + 40);
                        } else if (clickdish == 3) {
                            thirddish.setLocation(x + locs - 20, y + 40);
                        } else if (clickdish == 4) {
                            fourthdish.setLocation(x + locs - 20, y + 40);
                        }
                        but.setLocation(x + locs, y);
                        break;
                }

            }

            @Override
            public void keyTyped(KeyEvent ke) {
                // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void keyReleased(KeyEvent ke) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

        });

        Timer t = new Timer();
        TimerTask task = new TimerTask() {
            int i = 1;

            public void run() {

                totss.setVisible(true);

                // System.out.println("Timer executed at :" + new Date());
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                if (i == 5) //t.cancel();
                {
                    i = i + 1;
                }
            }
        };

        System.out.println("Current time: " + new Date());
        t.schedule(task, 3000, 15000);

        Timer f = new Timer();
        TimerTask taskf = new TimerTask() {
            int i = 1;

            public void run() {
                totss.setVisible(false);
                clickdish = 0;
                totss.setLocation(670, 85);
                // System.out.println("Timer executed at :" + new Date());
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                if (i == 5) // t.cancel();
                {
                    i = i + 1;
                }
            }
        };

        System.out.println("Current time: " + new Date());
        f.schedule(taskf, 15000, 15000);

        //second dish
        Timer t2 = new Timer();
        TimerTask tasks = new TimerTask() {
            int i = 1;

            public void run() {

                secondish.setVisible(true);

                // System.out.println("Timer executed at :" + new Date());
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                if (i == 5) //t.cancel();
                {
                    i = i + 1;
                }
            }
        };

        System.out.println("Current time: " + new Date());
        t2.schedule(tasks, 4000, 17000);

        Timer w = new Timer();
        TimerTask taskw = new TimerTask() {
            int i = 1;

            public void run() {
                secondish.setVisible(false);
                clickdish = 0;
                secondish.setLocation(490, 85);
                // System.out.println("Timer executed at :" + new Date());
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                if (i == 5) // t.cancel();
                {
                    i = i + 1;
                }
            }
        };

        System.out.println("Current time: " + new Date());
        w.schedule(taskw, 17000, 17000);

        ///////////////////////////////////////////////////////////////////////////
        // third dish
        Timer t3 = new Timer();
        TimerTask tasks3 = new TimerTask() {
            int i = 1;

            public void run() {

                thirddish.setVisible(true);

                // System.out.println("Timer executed at :" + new Date());
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                if (i == 5) //t.cancel();
                {
                    i = i + 1;
                }
            }
        };

        System.out.println("Current time: " + new Date());
        t3.schedule(tasks3, 5000, 11000);

        Timer q = new Timer();
        TimerTask taskq = new TimerTask() {
            int i = 1;

            public void run() {
                thirddish.setVisible(false);
                clickdish = 0;
                thirddish.setLocation(550, 85);
                // System.out.println("Timer executed at :" + new Date());
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                if (i == 5) // t.cancel();
                {
                    i = i + 1;
                }
            }
        };

        System.out.println("Current time: " + new Date());
        q.schedule(taskq, 19000, 19000);
        ///////////////////////////////////////

        //4th dishhhhhhhhh
        Timer t4 = new Timer();
        TimerTask tasks4 = new TimerTask() {
            int i = 1;

            public void run() {

                fourthdish.setVisible(true);

                // System.out.println("Timer executed at :" + new Date());
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                if (i == 5) //t.cancel();
                {
                    i = i + 1;
                }
            }
        };

        System.out.println("Current time: " + new Date());
        t4.schedule(tasks4, 2000, 21000);

        Timer y = new Timer();
        TimerTask tasky = new TimerTask() {
            int i = 1;

            public void run() {
                fourthdish.setVisible(false);
                clickdish = 0;
                fourthdish.setLocation(610, 85);
                // System.out.println("Timer executed at :" + new Date());
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                if (i == 5) // t.cancel();
                {
                    i = i + 1;
                }
            }
        };

        System.out.println("Current time: " + new Date());
        y.schedule(tasky, 21000, 21000);
        ///////////////////////////////

        /////////////timer for customers
        //first customer
        Timer tcut = new Timer();
        TimerTask taskscut = new TimerTask() {
            int i = 1;

            public void run() {

                cut.setVisible(true);

                // System.out.println("Timer executed at :" + new Date());
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                if (i == 5) //t.cancel();
                {
                    i = i + 1;
                }
            }
        };

        System.out.println("Current time: " + new Date());
        tcut.schedule(taskscut, 4000, 17000);

        Timer wcut = new Timer();
        TimerTask taskcut = new TimerTask() {
            int i = 1;

            public void run() {
                cut.setVisible(false);
                //   clickdish = 0; 
                cut.setLocation(10, 400);
                // System.out.println("Timer executed at :" + new Date());
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                if (i == 5) // t.cancel();
                {
                    i = i + 1;
                }
            }
        };

        System.out.println("Current time: " + new Date());
        wcut.schedule(taskcut, 17000, 17000);

        ///////////////////////////////////////////////////////////////////////////
        //second customer
        Timer t2cus = new Timer();
        TimerTask taskscus = new TimerTask() {
            int i = 1;

            public void run() {

                secondcut.setVisible(true);

                // System.out.println("Timer executed at :" + new Date());
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                if (i == 5) //t.cancel();
                {
                    i = i + 1;
                }
            }
        };

        System.out.println("Current time: " + new Date());
        t2cus.schedule(taskscus, 4000, 17000);

        Timer w2nd = new Timer();
        TimerTask taskw2nd = new TimerTask() {
            int i = 1;

            public void run() {
                secondcut.setVisible(false);
                //  clickdish = 0; 
                secondcut.setLocation(10, 200);
                // System.out.println("Timer executed at :" + new Date());
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                if (i == 5) // t.cancel();
                {
                    i = i + 1;
                }
            }
        };

        System.out.println("Current time: " + new Date());
        w2nd.schedule(taskw2nd, 17000, 17000);

        ///////////////////////////////////////////////////////////////////////////
        // third customer
        Timer t3rd = new Timer();
        TimerTask tasks3rd = new TimerTask() {
            int i = 1;

            public void run() {

                thirdcut.setVisible(true);

                // System.out.println("Timer executed at :" + new Date());
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                if (i == 5) //t.cancel();
                {
                    i = i + 1;
                }
            }
        };

        System.out.println("Current time: " + new Date());
        t3rd.schedule(tasks3rd, 5000, 11000);

        Timer q3rd = new Timer();
        TimerTask taskq3rd = new TimerTask() {
            int i = 1;

            public void run() {
                thirdcut.setVisible(false);
                //  clickdish = 0; 
                thirdcut.setLocation(75, 300);
                // System.out.println("Timer executed at :" + new Date());
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                if (i == 5) // t.cancel();
                {
                    i = i + 1;
                }
            }
        };

        System.out.println("Current time: " + new Date());
        q3rd.schedule(taskq3rd, 19000, 19000);
        ///////////////////////////////////////

        //4th customer
        Timer t4th = new Timer();
        TimerTask tasks4th = new TimerTask() {
            int i = 1;

            public void run() {

                fourthcut.setVisible(true);

                // System.out.println("Timer executed at :" + new Date());
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                if (i == 5) //t.cancel();
                {
                    i = i + 1;
                }
            }
        };

        System.out.println("Current time: " + new Date());
        t4th.schedule(tasks4th, 2000, 21000);

        Timer yth = new Timer();
        TimerTask taskyth = new TimerTask() {
            int i = 1;

            public void run() {
                fourthcut.setVisible(false);
                //  clickdish = 0; 
                fourthcut.setLocation(10, 400);
                // System.out.println("Timer executed at :" + new Date());
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                if (i == 5) // t.cancel();
                {
                    i = i + 1;
                }
            }
        };

        System.out.println("Current time: " + new Date());
        yth.schedule(taskyth, 21000, 21000);
        ///////////////////////////////

        /////////////////////////////////////////////////////////////////
        totss.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                //  if(clickdish == 0){
                totss.setLocation(e.getXOnScreen() - x_pressed, e.getYOnScreen() - y_pressed);
                //  }
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                Rectangle totsa = totss.getBounds();
                Rectangle totta = cut.getBounds();
                Rectangle seconddi = secondcut.getBounds();
                Rectangle thirddi = thirdcut.getBounds();
                Rectangle fourthdi = fourthcut.getBounds();
                if (totta.intersects(totsa)) {

                    s += 10;
                    jLabel2.setText(Integer.toString(s));
                    System.out.println(s);
                    totss.setVisible(false);
                    cut.setVisible(false);
                    clickdish = 0;
                }

                if (seconddi.intersects(totsa)) {

                    s += 10;
                    jLabel2.setText(Integer.toString(s));
                    System.out.println(s);
                    totss.setVisible(false);
                    secondcut.setVisible(false);
                    clickdish = 0;
                }

                if (thirddi.intersects(totsa)) {

                    s += 10;
                    jLabel2.setText(Integer.toString(s));
                    System.out.println(s);
                    totss.setVisible(false);
                    thirdcut.setVisible(false);
                    clickdish = 0;
                }

                if (fourthdi.intersects(totsa)) {

                    s += 10;
                    jLabel2.setText(Integer.toString(s));
                    System.out.println(s);
                    totss.setVisible(false);
                    fourthcut.setVisible(false);
                    clickdish = 0;
                }
            }

            @Override
            public void mousePressed(MouseEvent e) {
                x_pressed = e.getX();
                y_pressed = e.getY();
                System.out.println("hatdog");
                // jButton1.add(totss);
                Rectangle totsas = but.getBounds();

                Rectangle tottas = counter.getBounds();
                if (totsas.intersects(tottas)) {
                    totss.setLocation(but.getX() - 20, but.getY() + 40);
                    System.out.println("hi hatdog");
                    clickdish = 1;
                }
            }
        });
/////////////////////////////////////////////////////////////////////////////       

        secondish.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                //  if(clickdish == 0){
                secondish.setLocation(e.getXOnScreen() - x_pressed, e.getYOnScreen() - y_pressed);
                //  }
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                Rectangle totsa = secondish.getBounds();
                Rectangle totta = cut.getBounds();
                Rectangle seconddi = secondcut.getBounds();
                Rectangle thirddi = thirdcut.getBounds();
                Rectangle fourthdi = fourthcut.getBounds();
                if (totta.intersects(totsa)) {

                    s += 10;
                    jLabel2.setText(Integer.toString(s));
                    System.out.println(s);
                    secondish.setVisible(false);
                    cut.setVisible(false);
                    clickdish = 0;

                }

                if (seconddi.intersects(totsa)) {

                    s += 10;
                    jLabel2.setText(Integer.toString(s));
                    System.out.println(s);
                    secondish.setVisible(false);
                    secondcut.setVisible(false);
                    clickdish = 0;
                }

                if (thirddi.intersects(totsa)) {

                    s += 10;
                    jLabel2.setText(Integer.toString(s));
                    System.out.println(s);
                    secondish.setVisible(false);
                    thirdcut.setVisible(false);
                    clickdish = 0;
                }

                if (fourthdi.intersects(totsa)) {

                    s += 10;
                    jLabel2.setText(Integer.toString(s));
                    System.out.println(s);
                    secondish.setVisible(false);
                    fourthcut.setVisible(false);
                    clickdish = 0;
                }
            }

            @Override
            public void mousePressed(MouseEvent e) {
                x_pressed = e.getX();
                y_pressed = e.getY();
                System.out.println("hatdog");
                // jButton1.add(totss);
                Rectangle totsas = but.getBounds();

                Rectangle tottas = counter.getBounds();
                if (totsas.intersects(tottas)) {
                    secondish.setLocation(but.getX() - 20, but.getY() + 40);
                    System.out.println("hi hatdog");
                    clickdish = 2;
                }
            }
        });

/////////////////////////////////////////////////////////////////////////////
        thirddish.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                //  if(clickdish == 0){
                thirddish.setLocation(e.getXOnScreen() - x_pressed, e.getYOnScreen() - y_pressed);
                //  }
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                Rectangle totsa = thirddish.getBounds();
                Rectangle totta = cut.getBounds();
                Rectangle seconddi = secondcut.getBounds();
                Rectangle thirddi = thirdcut.getBounds();
                Rectangle fourthdi = fourthcut.getBounds();
                if (totta.intersects(totsa)) {

                    s += 10;
                    jLabel2.setText(Integer.toString(s));
                    System.out.println(s);
                    thirddish.setVisible(false);
                    cut.setVisible(false);
                    clickdish = 0;
                }

                if (seconddi.intersects(totsa)) {

                    s += 10;
                    jLabel2.setText(Integer.toString(s));
                    System.out.println(s);
                    thirddish.setVisible(false);
                    secondcut.setVisible(false);
                    clickdish = 0;
                }

                if (thirddi.intersects(totsa)) {

                    s += 10;
                    jLabel2.setText(Integer.toString(s));
                    System.out.println(s);
                    thirddish.setVisible(false);
                    thirdcut.setVisible(false);
                    clickdish = 0;
                }

                if (fourthdi.intersects(totsa)) {

                    s += 10;
                    jLabel2.setText(Integer.toString(s));
                    System.out.println(s);
                    thirddish.setVisible(false);
                    fourthcut.setVisible(false);
                    clickdish = 0;
                }
            }

            @Override
            public void mousePressed(MouseEvent e) {
                x_pressed = e.getX();
                y_pressed = e.getY();
                System.out.println("hatdog");
                // jButton1.add(totss);
                Rectangle totsas = but.getBounds();

                Rectangle tottas = counter.getBounds();
                if (totsas.intersects(tottas)) {
                    thirddish.setLocation(but.getX() - 20, but.getY() + 40);
                    System.out.println("hi hatdog");
                    clickdish = 3;
                }
            }
        });

//////////////////////////////////////////////////
        fourthdish.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                //  if(clickdish == 0){
                fourthdish.setLocation(e.getXOnScreen() - x_pressed, e.getYOnScreen() - y_pressed);
                //  }
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                Rectangle totsa = fourthdish.getBounds();
                Rectangle totta = cut.getBounds();
                Rectangle seconddi = secondcut.getBounds();
                Rectangle thirddi = thirdcut.getBounds();
                Rectangle fourthdi = fourthcut.getBounds();
                if (totta.intersects(totsa)) {

                    s += 10;
                    jLabel2.setText(Integer.toString(s));
                    System.out.println(s);
                    fourthdish.setVisible(false);
                    cut.setVisible(false);
                    clickdish = 0;
                }

                if (seconddi.intersects(totsa)) {

                    s += 10;
                    jLabel2.setText(Integer.toString(s));
                    System.out.println(s);
                    fourthdish.setVisible(false);
                    secondcut.setVisible(false);
                    clickdish = 0;
                }

                if (thirddi.intersects(totsa)) {

                    s += 10;
                    jLabel2.setText(Integer.toString(s));
                    System.out.println(s);
                    fourthdish.setVisible(false);
                    thirdcut.setVisible(false);
                    clickdish = 0;
                }

                if (fourthdi.intersects(totsa)) {

                    s += 10;
                    jLabel2.setText(Integer.toString(s));
                    System.out.println(s);
                    fourthdish.setVisible(false);
                    fourthcut.setVisible(false);
                    clickdish = 0;
                }
            }

            @Override
            public void mousePressed(MouseEvent e) {
                x_pressed = e.getX();
                y_pressed = e.getY();
                System.out.println("hatdog");
                // jButton1.add(totss);
                Rectangle totsas = but.getBounds();

                Rectangle tottas = counter.getBounds();
                if (totsas.intersects(tottas)) {
                    fourthdish.setLocation(but.getX() - 20, but.getY() + 40);
                    System.out.println("hi hatdog");
                    clickdish = 4;
                }
            }
        });

//////////////////////////////////////////////////////////////////////////////
        cut.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {

            }

        });

        totss.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                //int nones = last.clicklab(5,5,tots,lbl_banner);
                //  last.clicklab(5,5,tots,lbl_banner);
                // System.out.println(nones);

                Rectangle totsa = tots.getBounds();

                Rectangle totta = cut.getBounds();
                if (totta.intersects(totsa)) {
                    //  System.out.println("pls");
                    //lbls.setVisible(false);
                    //    s = 10;
                    //    checkcompa(5,4);
                    //return s;
                }
            }

        });
        last.clicklab(5, 5, clickdish);

//ito yun para madrag si label
        final MouseAdapter ma = new MouseAdapter() {
            private JLabel selectedLabel = null; //Clicked label.
            private Point selectedLabelLocation = null; //Location of label in panel when it was clicked.
            private Point panelClickPoint = null; //Panel's click point.

            //Selection of label occurs upon pressing on the panel:
            @Override
            public void mousePressed(final MouseEvent e) {

                //Find which label is at the press point:
                final Component pressedComp = newgame.findComponentAt(e.getX(), e.getY());

                //If a label is pressed, store it as selected:
                if (pressedComp != null && pressedComp instanceof JLabel) {
                    selectedLabel = (JLabel) pressedComp;
                    selectedLabelLocation = selectedLabel.getLocation();
                    panelClickPoint = e.getPoint();
                    //Added the following 2 lines in order to make selectedLabel
                    //paint over all others while it is pressed and dragged:
                    newgame.setComponentZOrder(selectedLabel, 0);
                    selectedLabel.repaint();
                } else {
                    selectedLabel = null;
                    selectedLabelLocation = null;
                    panelClickPoint = null;
                }
            }

            //Moving of selected label occurs upon dragging in the panel:
            @Override
            public void mouseDragged(final MouseEvent e) {
                if (selectedLabel != null
                        && selectedLabelLocation != null
                        && panelClickPoint != null) {

                    final Point newPanelClickPoint = e.getPoint();

                    //The new location is the press-location plus the length of the drag for each axis:
                    final int newX = selectedLabelLocation.x + (newPanelClickPoint.x - panelClickPoint.x),
                            newY = selectedLabelLocation.y + (newPanelClickPoint.y - panelClickPoint.y);

                    selectedLabel.setLocation(newX, newY);

                }
            }
        };
        newgame.addMouseMotionListener(ma); //For mouseDragged().
        newgame.addMouseListener(ma);

        // final JLabel lblss = dishes.create();
        //lblss.setBounds(1* 55, 2 * 20, 55, 20);
        // dish dishes = new dish();
        // jPanel1.add(dishes.create());
        //  final JLabel lbls = new JLabel("Label" );
        dish dishess = new dish();
        // 
        //  jPanel1.add(dishess.create());
        //  dishess.clicklab();

        // to create labels toh kay amay for
        final int labelRows = 5, //How many rows of labels.
                labelColumns = 5, //How many columns of labels.
                labelWidth = 55, //Width for each label.
                labelHeight = 20; //Height for each label.
        //   lbls.setBounds(1* labelWidth, 2 * labelHeight, labelWidth, labelHeight);
        //   jPanel1.add(lbls);
        final Color[] colors = new Color[]{Color.BLUE, Color.GREEN, Color.BLACK, Color.GRAY};
        final Random prng = new Random(); //For selecting border color for each label.
        for (int row = 0; row < labelRows; ++row) {
            for (int col = 0; col < labelColumns; ++col) {

                //Create label for (row, col):
                final JLabel lbl = new JLabel("Label" + (row * labelColumns + col));
                lbl.setHorizontalAlignment(JLabel.CENTER);
                //lbl.setVerticalAlignment(JLabel.CENTER);
                lbl.setBounds(col * labelWidth, row * labelHeight, labelWidth, labelHeight); //Grid-like positioning.
                lbl.setBorder(new LineBorder(colors[prng.nextInt(colors.length)], 2)); //Set a border for clarity.
                dish dishes = new dish();
                // 
                //     jPanel1.add(dishes.create());
                // dishes.clicklab();
                //Add label to panel:
                // jPanel1.add(lbl);
            }
        }

        counter.setIcon(scaled6);
        newgame.add(counter);

        JButton tile = new JButton(" ");
        tile.setFocusable(false);
        tile.setBounds(270, 60, 630, 690);
        ImageIcon tiles = new ImageIcon("src/image/tiles.jpg");
        Image imgtile = tiles.getImage();
        Image scaletile = imgtile.getScaledInstance(tile.getWidth(), tile.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledtile = new ImageIcon(scaletile);

        tile.setIcon(scaledtile);
        tile.setContentAreaFilled(false);
        tile.setBorder(null);
        tile.setBorderPainted(false);

        JButton sky = new JButton(" ");
        sky.setFocusable(false);
        sky.setBounds(0, 0, 280, 790);
        ImageIcon skys = new ImageIcon("src/image/sky_1.jpg");
        Image imgsky = skys.getImage();
        Image scalesky = imgsky.getScaledInstance(tile.getWidth(), tile.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledsky = new ImageIcon(scalesky);

        sky.setIcon(scaledsky);
        sky.setContentAreaFilled(false);
        sky.setBorder(null);
        sky.setBorderPainted(false);

        newgame.add(sky);
        newgame.add(tile);
        //   Game game = new Game();

        ////////////////timer
        //////start
        /////////////////////////timer
    }

    public void starttimer() {
        Thread time = new Thread() {

            @Override
            public void run() {

                for (;;) {
                    if (state == true) {
                        try {
                            sleep(1);

                            if (milliseconds > 1000) {
                                milliseconds = 0;
                                secondss++;
                            }

                            if (secondss > 60) {
                                milliseconds = 0;
                                secondss = 0;
                                minutess++;
                            }

                            milesecond.setText(String.valueOf(milliseconds));
                            seconds.setText(String.valueOf(secondss));
                            //    minutes.setText(String.valueOf(minutess));

                        } catch (Exception e) {

                        }
                    } else {
                        break;
                    }
                }
            }
        };
        time.start();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        newgame = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        seconds = new javax.swing.JLabel();
        milesecond = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        newg = new javax.swing.JMenuItem();
        exitgame = new javax.swing.JMenuItem();
        customize = new javax.swing.JMenu();
        player = new javax.swing.JMenuItem();
        customer = new javax.swing.JMenuItem();
        dish = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(1, 186, 189));

        jLabel3.setFont(new java.awt.Font("Modern No. 20", 1, 48)); // NOI18N
        jLabel3.setText("TAKEOUT DASH");

        jLabel5.setText("jLabel5");

        jLabel4.setText("jLabel4");

        jLabel8.setText("jLabel4");

        jLabel6.setText("jLabel4");

        jLabel9.setText("jLabel4");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addGap(57, 57, 57)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(148, 148, 148)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout newgameLayout = new javax.swing.GroupLayout(newgame);
        newgame.setLayout(newgameLayout);
        newgameLayout.setHorizontalGroup(
            newgameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(newgameLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        newgameLayout.setVerticalGroup(
            newgameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(newgameLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(570, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(247, 161, 126));

        jLabel1.setFont(new java.awt.Font("Sylfaen", 1, 36)); // NOI18N
        jLabel1.setText("Score: ");

        jLabel2.setFont(new java.awt.Font("Sylfaen", 0, 36)); // NOI18N
        jLabel2.setText("0");

        jLabel7.setFont(new java.awt.Font("Sylfaen", 1, 36)); // NOI18N
        jLabel7.setText("Timer:");

        seconds.setFont(new java.awt.Font("Sylfaen", 1, 36)); // NOI18N
        seconds.setText("00");

        milesecond.setFont(new java.awt.Font("Sylfaen", 1, 20)); // NOI18N
        milesecond.setText("seconds left");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(45, 45, 45)
                .addComponent(seconds)
                .addGap(38, 38, 38)
                .addComponent(milesecond)
                .addGap(53, 53, 53))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel7)
                    .addComponent(seconds)
                    .addComponent(milesecond, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jMenu1.setText("Game");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        newg.setText("New Game");
        newg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });
        jMenu1.add(newg);

        exitgame.setText("Exit");
        exitgame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });
        jMenu1.add(exitgame);

        jMenuBar1.add(jMenu1);

        customize.setText("Customize");

        player.setText("Player");
        player.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playerActionPerformed(evt);
            }
        });
        customize.add(player);

        customer.setText("Customer");
        customer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playerActionPerformed(evt);
            }
        });
        customize.add(customer);

        dish.setText("Dish");
        dish.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playerActionPerformed(evt);
            }
        });
        customize.add(dish);

        jMenuBar1.add(customize);

        jMenu3.setText("About");
        jMenu3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu3ActionPerformed(evt);
            }
        });

        jMenuItem1.setText("About Us");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem1);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(newgame, javax.swing.GroupLayout.PREFERRED_SIZE, 891, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(newgame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        // TODO add your handling code here:
        Object source = evt.getSource();

        if (source == newg) {

            JOptionPane.showMessageDialog(null, "The game has been resetted \n Your previous score was " + s);
            // this.setVisible(false);
            this.dispose();
            count.cancel();
            //  timer.purge();
            JOptionPane.showMessageDialog(null, "Welcome to Takeout Dash!");
            new restaurant().setVisible(true);
//   s = 0;
            // jLabel2.setText(Integer.toString(s)); 
            // System.out.println("score");
        } else if (source == exitgame) {
            System.exit(0);
        }

    }//GEN-LAST:event_jMenu1ActionPerformed

    private void playerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playerActionPerformed
        // TODO add your handling code here:

        Object source = evt.getSource();

        if (source == player) {

            playerselect sel = new playerselect();

        } else if (source == customer) {
            customercustom c = new customercustom();
//   ComboBoxExample obj = new ComboBoxExample(); 

        } else if (source == dish) {
            ComboBoxExample n = new ComboBoxExample();
            // n.createnew();

        }
    }//GEN-LAST:event_playerActionPerformed

    private void jMenu3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu3ActionPerformed
        // TODO add your handling code here:


    }//GEN-LAST:event_jMenu3ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Takeout Dash \n Quiatchon, 2022");
        //    this.setVisible(false);
        //   JOptionPane.showMessageDialog(null, "Welcome to Takeout Dash!");
        //         new restaurant().setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    ///////////////////////// dish select
    class ComboBoxExample extends Frame implements ItemListener {

        int selectdish = 0;
        Checkbox cb1, cb2;

        TextField tf;
        JButton okay = new JButton("okay");
        // array of strings containing languages
        String s1[] = {"Select a Dish", "Cooler", "Ramen", "Bento"};

        // create a checkbox
        JComboBox combobox = new JComboBox(s1);
        JLabel icon = new JLabel("");

        ComboBoxExample() {

            setTitle("Choose a Dish");

            setSize(300, 300);

            setLayout(null);

            cb1 = new Checkbox("c++");

            cb2 = new Checkbox("java");

            tf = new TextField(20);

            cb1.addItemListener(this);

            cb2.addItemListener(this);

            combobox.addItemListener(this);
            // add(cb1);
            JPanel u = new JPanel();
            u.setLayout(null);
            u.setSize(400, 400);
            combobox.setBounds(130, 70, 150, 30);
            u.add(combobox);

            u.add(icon);
            icon.setBounds(130, 120, 120, 150);

            u.add(okay);
            okay.setBounds(150, 300, 80, 30);

            add(u);
            setSize(400, 400);

            setVisible(true);
            okay.addMouseListener(new MouseAdapter() {

                @Override
                public void mouseClicked(MouseEvent me) {
                    System.out.println("detect");

                    if (selectdish == 1) {
                        ImageIcon cute = new ImageIcon("src/image/drink.gif");
                        Image img6 = cute.getImage();
                        Image scale6 = img6.getScaledInstance(totss.getWidth(), totss.getHeight(), Image.SCALE_DEFAULT);
                        ImageIcon scaled6 = new ImageIcon(scale6);
                        totss.setIcon(scaled6);
                        secondish.setIcon(scaled6);
                        thirddish.setIcon(scaled6);
                        fourthdish.setIcon(scaled6);
                    } else if (selectdish == 2) {
                        ImageIcon frog = new ImageIcon("src/image/ramen.gif");
                        Image img7 = frog.getImage();
                        Image scale7 = img7.getScaledInstance(totss.getWidth(), totss.getHeight(), Image.SCALE_DEFAULT);
                        ImageIcon scaled7 = new ImageIcon(scale7);
                        totss.setIcon(scaled7);
                        secondish.setIcon(scaled7);
                        thirddish.setIcon(scaled7);
                        fourthdish.setIcon(scaled7);
                    } else if (selectdish == 3) {
                        ImageIcon frog = new ImageIcon("src/image/egg.gif");
                        Image img7 = frog.getImage();
                        Image scale7 = img7.getScaledInstance(totss.getWidth(), totss.getHeight(), Image.SCALE_DEFAULT);
                        ImageIcon scaled7 = new ImageIcon(scale7);
                        totss.setIcon(scaled7);
                        secondish.setIcon(scaled7);
                        thirddish.setIcon(scaled7);
                        fourthdish.setIcon(scaled7);
                    }

                    setVisible(false);

                }
            });
        }

        public void itemStateChanged(ItemEvent e) {
//if(e.getSource()== okay){

//}
            if (e.getSource() == combobox) {
                // System.out.println("detect");

                if (combobox.getSelectedIndex() == 0) {
                    icon.setIcon(null);
                } else if (combobox.getSelectedIndex() == 1) {
                    ImageIcon cute = new ImageIcon("src/image/drink.gif");
                    Image img6 = cute.getImage();
                    Image scale6 = img6.getScaledInstance(icon.getWidth(), icon.getHeight(), Image.SCALE_DEFAULT);
                    ImageIcon scaled6 = new ImageIcon(scale6);
                    icon.setIcon(scaled6);
                    selectdish = 1;
                } else if (combobox.getSelectedIndex() == 2) {
                    ImageIcon frog = new ImageIcon("src/image/ramen.gif");
                    Image img7 = frog.getImage();
                    Image scale7 = img7.getScaledInstance(icon.getWidth(), icon.getHeight(), Image.SCALE_DEFAULT);
                    ImageIcon scaled7 = new ImageIcon(scale7);
                    icon.setIcon(scaled7);
                    selectdish = 2;
                } else if (combobox.getSelectedIndex() == 3) {
                    ImageIcon brew = new ImageIcon("src/image/egg.gif");
                    Image img8 = brew.getImage();
                    Image scale8 = img8.getScaledInstance(icon.getWidth(), icon.getHeight(), Image.SCALE_DEFAULT);
                    ImageIcon scaled8 = new ImageIcon(scale8);
                    icon.setIcon(scaled8);
                    selectdish = 3;
                }
            }

        }
    }

////////////////////////customize player
    class playerselect extends Frame implements ItemListener {

        int selectdish = 0;
        Checkbox cb1, cb2;

        TextField tf;
        JButton okay = new JButton("okay");
        // array of strings containing languages
        String s1[] = {"Select a Player", "Jiggly Puff", "Frog", "Brewster"};

        // create a checkbox
        JComboBox combobox = new JComboBox(s1);
        JLabel icon = new JLabel("");

        playerselect() {

            setTitle("Choose Your Character");

            setSize(300, 300);

            setLayout(null);

            cb1 = new Checkbox("c++");

            cb2 = new Checkbox("java");

            tf = new TextField(20);

            cb1.addItemListener(this);

            cb2.addItemListener(this);

            combobox.addItemListener(this);
            // add(cb1);
            JPanel u = new JPanel();
            u.setLayout(null);
            u.setSize(400, 400);
            combobox.setBounds(130, 70, 150, 30);
            u.add(combobox);

            u.add(icon);
            icon.setBounds(130, 120, 120, 150);

            u.add(okay);
            okay.setBounds(150, 300, 80, 30);

            add(u);
            setSize(400, 400);

            setVisible(true);
            okay.addMouseListener(new MouseAdapter() {

                @Override
                public void mouseClicked(MouseEvent me) {
                    System.out.println("detect");

                    if (selectdish == 1) {
                        ImageIcon cute = new ImageIcon("src/image/cute.gif");
                        Image img6 = cute.getImage();
                        Image scale6 = img6.getScaledInstance(but.getWidth(), but.getHeight(), Image.SCALE_DEFAULT);
                        ImageIcon scaled6 = new ImageIcon(scale6);
                        but.setIcon(scaled6);

                    } else if (selectdish == 2) {
                        ImageIcon frog = new ImageIcon("src/image/frog.gif");
                        Image img7 = frog.getImage();
                        Image scale7 = img7.getScaledInstance(but.getWidth(), but.getHeight(), Image.SCALE_DEFAULT);
                        ImageIcon scaled7 = new ImageIcon(scale7);
                        but.setIcon(scaled7);

                    } else if (selectdish == 3) {
                        ImageIcon frog = new ImageIcon("src/image/brewster.gif");
                        Image img7 = frog.getImage();
                        Image scale7 = img7.getScaledInstance(but.getWidth(), but.getHeight(), Image.SCALE_DEFAULT);
                        ImageIcon scaled7 = new ImageIcon(scale7);
                        but.setIcon(scaled7);

                    }

                    setVisible(false);

                }
            });
        }

        public void itemStateChanged(ItemEvent e) {
//if(e.getSource()== okay){

//}
            if (e.getSource() == combobox) {
                // System.out.println("detect");

                if (combobox.getSelectedIndex() == 0) {
                    icon.setIcon(null);
                } else if (combobox.getSelectedIndex() == 1) {
                    ImageIcon cute = new ImageIcon("src/image/cute.gif");
                    Image img6 = cute.getImage();
                    Image scale6 = img6.getScaledInstance(icon.getWidth(), icon.getHeight(), Image.SCALE_DEFAULT);
                    ImageIcon scaled6 = new ImageIcon(scale6);
                    icon.setIcon(scaled6);
                    selectdish = 1;
                } else if (combobox.getSelectedIndex() == 2) {
                    ImageIcon frog = new ImageIcon("src/image/frog.gif");
                    Image img7 = frog.getImage();
                    Image scale7 = img7.getScaledInstance(icon.getWidth(), icon.getHeight(), Image.SCALE_DEFAULT);
                    ImageIcon scaled7 = new ImageIcon(scale7);
                    icon.setIcon(scaled7);
                    selectdish = 2;
                } else if (combobox.getSelectedIndex() == 3) {
                    ImageIcon brew = new ImageIcon("src/image/brewster.gif");
                    Image img8 = brew.getImage();
                    Image scale8 = img8.getScaledInstance(icon.getWidth(), icon.getHeight(), Image.SCALE_DEFAULT);
                    ImageIcon scaled8 = new ImageIcon(scale8);
                    icon.setIcon(scaled8);
                    selectdish = 3;
                }
            }

        }
    }

/////////////////////////////////////////////////////
//////////////////customize customer
    class customercustom extends Frame implements ItemListener {

        int selectdish = 0;
        Checkbox cb1, cb2;

        TextField tf;
        JButton okay = new JButton("okay");
        // array of strings containing languages
        String s1[] = {"Select a Customer", "Cinnamon Roll", "Penguin", "Lamb"};

        // create a checkbox
        JComboBox combobox = new JComboBox(s1);
        JLabel icon = new JLabel("");

        customercustom() {

            setTitle("Choose a Customer");

            setSize(300, 300);

            setLayout(null);

            cb1 = new Checkbox("c++");

            cb2 = new Checkbox("java");

            tf = new TextField(20);

            cb1.addItemListener(this);

            cb2.addItemListener(this);

            combobox.addItemListener(this);
            // add(cb1);
            JPanel u = new JPanel();
            u.setLayout(null);
            u.setSize(400, 400);
            combobox.setBounds(130, 70, 150, 30);
            u.add(combobox);

            u.add(icon);
            icon.setBounds(130, 120, 120, 150);

            u.add(okay);
            okay.setBounds(150, 300, 80, 30);

            add(u);
            setSize(400, 400);

            setVisible(true);
            okay.addMouseListener(new MouseAdapter() {

                @Override
                public void mouseClicked(MouseEvent me) {
                    System.out.println("detect");

                    if (selectdish == 1) {
                        ImageIcon cute = new ImageIcon("src/image/roll.gif");
                        Image img6 = cute.getImage();
                        Image scale6 = img6.getScaledInstance(cut.getWidth(), cut.getHeight(), Image.SCALE_DEFAULT);
                        ImageIcon scaled6 = new ImageIcon(scale6);
                        cut.setIcon(scaled6);
                        secondcut.setIcon(scaled6);
                        thirdcut.setIcon(scaled6);
                        fourthcut.setIcon(scaled6);
                    } else if (selectdish == 2) {
                        ImageIcon frog = new ImageIcon("src/image/penguin.gif");
                        Image img7 = frog.getImage();
                        Image scale7 = img7.getScaledInstance(cut.getWidth(), cut.getHeight(), Image.SCALE_DEFAULT);
                        ImageIcon scaled7 = new ImageIcon(scale7);
                        cut.setIcon(scaled7);
                        secondcut.setIcon(scaled7);
                        thirdcut.setIcon(scaled7);
                        fourthcut.setIcon(scaled7);
                    } else if (selectdish == 3) {
                        ImageIcon frog = new ImageIcon("src/image/lamb.gif");
                        Image img7 = frog.getImage();
                        Image scale7 = img7.getScaledInstance(cut.getWidth(), cut.getHeight(), Image.SCALE_DEFAULT);
                        ImageIcon scaled7 = new ImageIcon(scale7);
                        cut.setIcon(scaled7);
                        secondcut.setIcon(scaled7);
                        thirdcut.setIcon(scaled7);
                        fourthcut.setIcon(scaled7);
                    }

                    setVisible(false);

                }
            });
        }

        public void itemStateChanged(ItemEvent e) {
//if(e.getSource()== okay){

//}
            if (e.getSource() == combobox) {
                // System.out.println("detect");

                if (combobox.getSelectedIndex() == 0) {
                    icon.setIcon(null);
                } else if (combobox.getSelectedIndex() == 1) {
                    ImageIcon cute = new ImageIcon("src/image/roll.gif");
                    Image img6 = cute.getImage();
                    Image scale6 = img6.getScaledInstance(icon.getWidth(), icon.getHeight(), Image.SCALE_DEFAULT);
                    ImageIcon scaled6 = new ImageIcon(scale6);
                    icon.setIcon(scaled6);
                    selectdish = 1;
                } else if (combobox.getSelectedIndex() == 2) {
                    ImageIcon frog = new ImageIcon("src/image/penguin.gif");
                    Image img7 = frog.getImage();
                    Image scale7 = img7.getScaledInstance(icon.getWidth(), icon.getHeight(), Image.SCALE_DEFAULT);
                    ImageIcon scaled7 = new ImageIcon(scale7);
                    icon.setIcon(scaled7);
                    selectdish = 2;
                } else if (combobox.getSelectedIndex() == 3) {
                    ImageIcon brew = new ImageIcon("src/image/lamb.gif");
                    Image img8 = brew.getImage();
                    Image scale8 = img8.getScaledInstance(icon.getWidth(), icon.getHeight(), Image.SCALE_DEFAULT);
                    ImageIcon scaled8 = new ImageIcon(scale8);
                    icon.setIcon(scaled8);
                    selectdish = 3;
                }
            }

        }
    }

///////////////////////////////////////////////////
    Timer count = new Timer();

    class countdownTimer extends TimerTask {

        @Override
        public void run() {
            counter--;
            seconds.setText(Integer.toString(counter));
            if (counter == 0) {
                //JOptionPane.showMessageDialog(null, "Game Over");
                count.cancel();
                setVisible(false);
                main_menu news = new main_menu(s);
                news.setVisible(true);

            }
            count.schedule(new countdownTimer(), 1000);
        }

    }

    public void counttime() {
        Timer timers;
        // timers = new Timer(1000, new ActionListener(){
        //    @Override
        //    public void actionPerformed(ActionEvent ae) {

        //    }
        //  });
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(restaurant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(restaurant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(restaurant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(restaurant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JOptionPane.showMessageDialog(null, "Welcome to Takeout Dash!");
                new restaurant().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem customer;
    private javax.swing.JMenu customize;
    private javax.swing.JMenuItem dish;
    private javax.swing.JMenuItem exitgame;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel milesecond;
    private javax.swing.JMenuItem newg;
    private javax.swing.JPanel newgame;
    private javax.swing.JMenuItem player;
    private javax.swing.JLabel seconds;
    // End of variables declaration//GEN-END:variables
}
