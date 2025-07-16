import java.awt.*;
import java.awt.event.*;

class Calculator extends WindowAdapter implements ActionListener{
    Frame f;
    Label l;
    Button b1,b2,b3,b4,b5,b6,b7,b9,b0;


    Calculator(){
        f = new Frame("Currency Calculator");

        //Creating Base GUI for calculator
        l = new Label();
        l.setBackground(Color.GRAY);
        l.setBounds(50,50,260,60);

        b1 = new Button("1");
            b1.setBounds(50,340,50,50);
        b2 = new Button("2");
            b2.setBounds(120,340,50,50);
        b3 = new Button("3");
            b3.setBounds(190,340,50,50);









        b1.addActionListener(this);

        f.addWindowListener(this);

        //adding components to frame
        f.add(l);
        f.add(b1);f.add(b2);f.add(b3);

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
        if(e.getSource()==b2){
            zt = l.getText();
            z = zt +"2";
            l.setText(z);
        }
        if(e.getSource()==b3){
            zt = l.getText();
            z = zt +"3";
            l.setText(z);
        }

    }
}