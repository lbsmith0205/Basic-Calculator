import java.awt.*;
import java.awt.event.*;

class Calculator extends WindowAdapter implements ActionListener{
    Frame f;
    Label l;
    Button b1;


    Calculator(){
        f = new Frame("Currency Calculator");

        //Creating Base GUI for calculator
        l = new Label();
        l.setBackground(Color.GRAY);
        l.setBounds(50,50,260,60);

        b1 = new Button("1");
            b1.setBounds(50,340,50,50);

        b1.addActionListener(this);

        f.addWindowListener(this);

        //adding components to frame
        f.add(l);
        f.add(b1);

        f.setSize(360,500);
        f.setLayout(null);
        f.setVisible(true);

    }

    // To close window
    public void windowClosing(WindowEvent e) {
        f.dispose();
    }

    public void actionPerformed(ActionEvent e) {
        String z,zt;


        if(e.getSource()==b1){
            zt = l.getText();
            z = zt +"1";
            l.setText(z);
        }

    }
}