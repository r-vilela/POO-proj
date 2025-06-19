package view;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

import model.Card;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaMemoria extends JFrame {

    Card[] cartas = new Card[10];
    String[] imgs = {"/img/flower.png", "/img/cactus.png", "/img/rainbow.png",
            "/img/cake.png", "/img/cloud.png", "/img/gloves.png", "/img/leaf.png", "/img/star.png",
            "/img/tree.png", "/img/washing.png"};

    public static void main(String[] args){
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try{
                    TelaMemoria frame = new TelaMemoria();
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

        for(int i = 0; i < imgs.length; i++){

            Card carta = new Card(imgs[i]);

            cartas[i] = carta;
            carta.addImg(cnt);
        }

        setContentPane(cnt);
        setVisible(true);
    }

    public void getTurnedCard(Card selCrd){
        for(Card crd : cartas){
            if(crd.getTurned() == true){
                if(crd == selCrd){
                    System.out.println("Iguais");
                }else{
                    System.out.println("Diferentes");
                }
            }
        }
    }
}
