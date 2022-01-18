package views;

import controllers.FireController;
import controllers.MyTask;
import models.FirePalette;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FireControlPanel extends JPanel{

    private FireController fc;
    private Color color;
    private FirePalette fp;
    private FirePalette firePalette;
    private volatile boolean running = true;
    private boolean buttonState = true;
    private boolean pitjat = false;
    //    private int colors[];
    private int fireColorState = 0;



    public FireControlPanel(){

        this.setSize(500,500);
        this.setVisible(true);
        this.setBackground(Color.gray);


        //Creant botons
        JButton pauseButton = new JButton("Pausa");
        pauseButton.setVisible(true);
        this.add(pauseButton);

        JButton backgroundButton = new JButton("Canviar fons de pantalla");
        backgroundButton.setVisible(true);
        this.add(backgroundButton);

        JButton resolutionButton = new JButton("Selecciona resol·lució");
        resolutionButton.setVisible(true);
        this.add(resolutionButton);

        JButton toogleFireLenghtButton = new JButton("Canvia entre foquet i focot");
        toogleFireLenghtButton.setVisible(true);
        this.add(toogleFireLenghtButton);

        JButton flameColorButton = new JButton("Canvia colors des foquet");
        flameColorButton.setVisible(true);
        this.add(flameColorButton);



        pauseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                if(buttonState){
                    System.out.println("Pausat");
                    updateButtonState();
                    System.out.println(buttonState);
                    fc.pauseFire();

                }
                else{
                    System.out.println("Reanudat");
                    updateButtonState();
                    System.out.println(buttonState);
                    fc.pauseFire();
                }

            }
        });

//        backgroundButton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//
//                if(e.getSource()==backgroundButton){
//                    JColorChooser colorChooser = new JColorChooser();
//                    Color color = JColorChooser.showDialog(null,"Tria un color", Color.CYAN);
//
//
//                }
//            }
//        });

        flameColorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fireColorState++;
                switch (fireColorState){
                    case 1:
                        //colors[]
                        System.out.println("a");
                        fp.createColors();
                        break;
                    case 2:
                        System.out.println("b");
                        break;
                    case 3:
                        System.out.println("c");
                        break;
                    case 4:
                        System.out.println("d");
                        fireColorState = 0;
                        break;
                }
            }
        });

        resolutionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        toogleFireLenghtButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if(!pitjat){
                    fc.setFireLength((float) 0.70);
                    System.out.println("foquet");
                    pitjat = true;
                }else{
                    fc.setFireLength((float) 0.88);
                    System.out.println("focot");
                    pitjat = false;
                }
                System.out.println(fc.getFireLength());

            }
        });
    }
    private void updateButtonState(){
        buttonState = !buttonState;
    }

    private Color getColor(){

        return color;
    }
    private void setColor(Color color){
        this.color = color;
    }


    private void openResolutionMenu(){
        JMenuItem resMenu = new JMenuItem("asd");
        resMenu.setBackground(Color.cyan);
        resMenu.setVisible(true);
        this.add(resMenu);



    }

}
