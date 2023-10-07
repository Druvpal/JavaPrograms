package com.practice;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.text.SimpleDateFormat;
import java.util.Date;

public class myWindow extends JFrame{
    private JLabel heading;

    private JLabel clockLable;

    private Font font = new Font(" ",Font.BOLD,35);
    myWindow(){
        super.setTitle("My Clock");
        super.setSize(600, 300);
        super.setLocation(300 ,50);
        this.CreateGUI();
        this.startClock();
        super.setVisible(true);

    }
    public void CreateGUI(){
        heading = new JLabel("My Clock");
        clockLable = new JLabel("Clock");
        heading.setFont(font);
        clockLable.setFont(font);
        this.setLayout(new GridLayout(2,1));
        this.add(heading);
        this.add(clockLable);

    }
    public void startClock(){
        Timer timer = new Timer(1000, new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
               String datetime = new Date().toString();

                clockLable.setText(datetime);
            }
        });
        timer.start();
    }
}
