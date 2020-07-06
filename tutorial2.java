import java.awt.Dimension;
import javax.swing.*;
public class tutorial2 {
    JFrame jf=new JFrame();
    JTextField displayField=new JTextField();
    JButton b0=new JButton("0");
    JButton b1=new JButton("1");
    JButton b2=new JButton("2");
    JButton b3=new JButton("3");
    JButton b4=new JButton("4");
    JButton b5=new JButton("5");
    JButton b6=new JButton("6");
    JButton b7=new JButton("7");
    JButton b8=new JButton("8");
    JButton b9=new JButton("9");
    JButton bP=new JButton(".");
    JButton bE=new JButton("=");
    JButton bPlus=new JButton("+");
    JButton bMulti=new JButton("*");
    JButton bDivi=new JButton("/");
    JButton bMin=new JButton("-");
    JButton bC=new JButton("C");
    public static void main(String[] args){ 
        tutorial2 gi=new tutorial2();
        
        
    }
    tutorial2() {
        
        jf.setLayout(null);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setSize(new Dimension(310, 340));
        
        
        
        
        
        
        
        
        
        
        
        displayField.setBounds(20, 10, 270, 20);
        jf.add(displayField);
        bC.setBounds(20, 240, 270, 40);
        jf.add(bC);
        
        b0.setBounds(20,40,60, 40);
        jf.add(b0);
        
        b1.setBounds(90,40,60, 40);
        jf.add(b1);
        
        b2.setBounds(160,40,60, 40);
        jf.add(b2);
        
        b3.setBounds(230,40,60, 40);
        jf.add(b3);
        
        b4.setBounds(20,90,60, 40);
        jf.add(b4);
        
        b5.setBounds(90,90,60, 40);
        jf.add(b5);
        
        b6.setBounds(160,90,60, 40);
        jf.add(b6);
        
        b7.setBounds(230,90,60, 40);
        jf.add(b7);
        
        b8.setBounds(20,140,60, 40);
        jf.add(b8);
        
        b9.setBounds(90,140,60, 40);
        jf.add(b9);
        
        bP.setBounds(160,140,60, 40);
        jf.add(bP);
        
        bE.setBounds(230,140,60, 40);
        jf.add(bE);
        
        bMin.setBounds(20,190,60, 40);
        jf.add(bMin);
        
        bPlus.setBounds(90,190,60, 40);
        jf.add(bPlus);
        
        bDivi.setBounds(160,190,60, 40);
        jf.add(bDivi);
        
        bMulti.setBounds(230,190,60, 40);
        jf.add(bMulti);
        CalcLogic cl=new CalcLogic(this);
        b0.addActionListener(cl);
        b1.addActionListener(cl);
        b2.addActionListener(cl);
        b3.addActionListener(cl);
        b4.addActionListener(cl);
        b5.addActionListener(cl);
        b6.addActionListener(cl);
        b7.addActionListener(cl);
        b8.addActionListener(cl);
        b9.addActionListener(cl);
        bE.addActionListener(cl);
        bMin.addActionListener(cl);
        bPlus.addActionListener(cl);
        bDivi.addActionListener(cl);
        bMulti.addActionListener(cl);
        bP.addActionListener(cl);
        bC.addActionListener(cl);
        displayField.setText("0");
        jf.setVisible(true);      
    }

    
}


