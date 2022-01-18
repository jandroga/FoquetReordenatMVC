package views;

import controllers.FireController;

import javax.swing.*;

public class PrincipalFrame extends JFrame {

    private ControlPanel cp;

    public PrincipalFrame(FireController fc){

        cp = new ControlPanel(fc);
        this.add(cp);
        setupFrame();
    }

    private void setupFrame(){

        this.setContentPane(cp);
        this.setSize(1366,766);
        this.setVisible(true);
    }
}
