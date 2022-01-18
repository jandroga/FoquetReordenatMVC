package models;

import java.awt.*;

public class Viewer extends Canvas implements Runnable{

    private FireModel fuego;
    private volatile boolean running;

    public Viewer(FireModel fuego) {
        this.fuego = fuego;
        setSize(fuego.getWidth(), fuego.getHeight());
        setVisible(true);
    }



    public void paint(Graphics g) {

        g.drawImage(fuego,0,0,this);
    }


    @Override
    public void run() {

        while (true) {
            if (this.getGraphics() != null){
                paint(this.getGraphics());

                try {
                    Thread.sleep(10);
                } catch (Exception e) {
                    System.out.println(e);
                }
            }

            //System.out.println("Estat actual: " + getThreadState());

        }
    }
}
