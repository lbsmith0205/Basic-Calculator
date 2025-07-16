import java.awt.*;
import java.awt.event.*;

class Calculator extends WindowAdapter implements ActionListener{
    Frame f;
    Label l;


    Calculator(){
        f = new Frame("Lukes Calculator");

        //Creating Base GUI for calculator
        l = new Label();
        l.setBackground(Color.GRAY);
        l.setBounds(100,100,100,100);

        f.addWindowListener(this);

        f.setSize(400,500);
        f.setLayout(null);
        f.setVisible(true);
    }

    // To close window
    public void windowClosing(WindowEvent e) {
        f.dispose();
    }

    public void actionPerformed(ActionEvent e) {

    }
}