package it.unibo.mvc;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 * A very simple program using a graphical interface.
 * 
 */
public final class SimpleGUI {

    
    

    
    public SimpleGUI() {
     JFrame frame = new JFrame("My first Java user Interface");
     frame.setSize(400, 400);
        JPanel panel =new JPanel();
       frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        panel.setLayout(new BorderLayout());
        JButton btn=new JButton("save");
        btn.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent arg0) {
               try (// Controller ctr=new Controller();
                                //ctr.setFile();
                PrintStream ps = new PrintStream("defolt.txt", StandardCharsets.UTF_8)) {
                    ps.print("cacca");
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                    //File ile=new File("ciaoo.txt");
               
            }

        });
        panel.add(btn, BorderLayout.SOUTH );
        JTextArea areat=new JTextArea();
        panel.add(areat, BorderLayout.CENTER );
        frame.add(panel);
        frame.setVisible(true);


    }


    public static void main(String[] arg){
       SimpleGUI gui=new SimpleGUI();
       

    }
}
