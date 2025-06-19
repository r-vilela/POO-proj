package view;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

import model.Card;
import java.util.ArrayList;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaMemoria extends JFrame {

    ArrayList<String> imgs = new ArrayList("/img/flower.png", "/img/cactus.png", "/img/rainbow.png",
            "/img/cake.png", "/img/cloud.png", "/img/gloves.png", "/img/leaf.png", "/img/star.png",
            "/img/tree.png", "/img/washing.png");

    public static void main(String[] args){
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try{
                    TelaTest frame = new TelaTest();
                    frame.setVisible(true);
                } catch (Exception e){
                    e.printStackTrace();
                }
            }
        });
    };

    public TelaMemoria(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(200, 200, 400, 400);
        setResizable(false);

        JPanel cnt = new JPanel();
        cnt.setBackground(new Color(50,50,50));
        cnt.setBorder(new EmptyBorder(5,5,5,5));
        cnt.setBounds(0,0,400,400);

        setContentPane(cnt);
        setVisible(true);

        for(String path : imgs){
            Card crd = new Card(path);
            crd.addImg(cnt);
        }

        //this.iconLbl.addActionListener(new ActionListener() {
            //@Override
            //public void actionPerformed(ActionEvent arg0){

                //this.turnCard();

            //}
        //});

    }
}
