package views;

import controllers.FireController;

import javax.swing.*;
import java.awt.*;

public class ControlPanel extends JPanel {

    private FireController fc;
    private FireControlPanel fcp;

    public ControlPanel(FireController fc){
        super(new GridBagLayout());
        this.fc = fc;
        this.setSize(500,500);
        this.add(fcp);
        this.setVisible(true);

    }
}
