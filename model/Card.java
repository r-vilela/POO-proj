package model;

import javax.swing.*;
import java.awt.*;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import view.TelaMemoria;

public class Card {
    String path;
    String cover = "/img/card.png";
    JButton iconLbl = new JButton("");
    Boolean turned = false;

    public Card(String path){
        this.path = path;

        ImageIcon rszIcon = this.getImageIcon(this.cover);

        this.iconLbl.setHorizontalAlignment(SwingConstants.CENTER);
        this.iconLbl.setIcon(rszIcon);
        this.iconLbl.setBounds(180, 40, 438, 66);

        this.iconLbl.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0){
                setTurned(turned ? false : true);

            }
        });
    }

    public JPanel addImg(JPanel cnt){

        ImageIcon rszIcon = this.getImageIcon("/img/card.png");
        cnt.add(this.iconLbl);

        return cnt;
    }

    public void setTurned(Boolean value){
        ImageIcon rszIcon = this.getImageIcon(turned ? cover : path);

        iconLbl.setIcon(rszIcon);

        //TelaMemoria.getTurnedCard(this);

        this.turned = value;
    }

    public ImageIcon getImageIcon(String path){
        ImageIcon icon = new ImageIcon(Card.class.getResource(path));

        Image iconImg = icon.getImage();
        Image rszImg = iconImg.getScaledInstance(70, 64, Image.SCALE_SMOOTH);
        ImageIcon rszIcon = new ImageIcon(rszImg);

        return rszIcon;
    }

    public Boolean getTurned(){
        return this.turned;

    }

}
