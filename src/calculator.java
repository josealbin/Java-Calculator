import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;


public class calculator implements ActionListener {

    boolean isOperatorClicked=false;
    String storedValue;
    float result=0;
    boolean isdiv=false;
    boolean ismulti=false;
    boolean isplus=false;
    boolean isminus=false;

    JFrame jf; // declare jf as global
    JLabel displayLabel; // declare displayLabel as global

    JButton sevenButton;
    JButton eightButton;
    JButton nineButton;
    JButton fourButton;
    JButton fiveButton;
    JButton sixButton;
    JButton oneButton;
    JButton twoButton;
    JButton threeButton;
    JButton dotButton;
    JButton zeroButton;
    JButton equalButton;
    JButton divButton;
    JButton multiButton;
    JButton minusButton;
    JButton plusButton;
    JButton clearButton;


    public calculator(){
        jf=new JFrame("Calculator");
        jf.setLayout(null);
        jf.setSize(600, 600);

        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        displayLabel=new JLabel();
        displayLabel.setBounds(30, 50, 540, 60);
        displayLabel.setBackground(Color.GRAY);
        displayLabel.setFont(new Font("serif", Font.BOLD, 22));
        displayLabel.setOpaque(true);
        displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        displayLabel.setForeground(Color.WHITE);
        
        jf.add(displayLabel);



        //7,8,9 buttons
        sevenButton=new JButton("7");
        sevenButton.setBounds(30, 130, 80, 80);
        jf.add(sevenButton);
        sevenButton.addActionListener(this);

        eightButton=new JButton("8");
        eightButton.setBounds(130, 130, 80, 80);
        jf.add(eightButton);
        eightButton.addActionListener(this);

        nineButton=new JButton("9");
        nineButton.setBounds(230, 130, 80, 80);
        jf.add(nineButton);
        nineButton.addActionListener(this);

        //4,5,6 buttons
        fourButton=new JButton("4");
        fourButton.setBounds(30, 230, 80, 80);
        jf.add(fourButton);
        fourButton.addActionListener(this);

        fiveButton=new JButton("5");
        fiveButton.setBounds(130, 230, 80, 80);
        jf.add(fiveButton);
        fiveButton.addActionListener(this);

        sixButton=new JButton("6");
        sixButton.setBounds(230, 230, 80, 80);
        jf.add(sixButton);
        sixButton.addActionListener(this);
        
        //1,2,3 buttons
        oneButton=new JButton("1");
        oneButton.setBounds(30, 330, 80, 80);
        jf.add(oneButton);
        oneButton.addActionListener(this);

        twoButton=new JButton("2");
        twoButton.setBounds(130, 330, 80, 80);
        jf.add(twoButton);
        twoButton.addActionListener(this);

        threeButton=new JButton("3");
        threeButton.setBounds(230, 330, 80, 80);
        jf.add(threeButton);
        threeButton.addActionListener(this);

        //.,0,= buttons
        dotButton=new JButton(".");
        dotButton.setBounds(30, 430, 80, 80);
        jf.add(dotButton);
        dotButton.addActionListener(this);

        zeroButton=new JButton("0");
        zeroButton.setBounds(130, 430, 80, 80);
        jf.add(zeroButton);
        zeroButton.addActionListener(this);

        equalButton=new JButton("=");
        equalButton.setBounds(230, 430, 80, 80);
        jf.add(equalButton);
        equalButton.addActionListener(this);

        //operator buttons
        divButton=new JButton("/");
        divButton.setBounds(330, 130, 80, 80);
        jf.add(divButton);
        divButton.addActionListener(this);
        
        multiButton=new JButton("*");
        multiButton.setBounds(330, 230, 80, 80);
        jf.add(multiButton);
        multiButton.addActionListener(this);

        minusButton=new JButton("-");
        minusButton.setBounds(330, 330, 80, 80);
        jf.add(minusButton);
        minusButton.addActionListener(this);

        plusButton=new JButton("+");
        plusButton.setBounds(330, 430, 80, 80);
        jf.add(plusButton);
        plusButton.addActionListener(this);

        clearButton=new JButton("C");
        clearButton.setBounds(430, 430, 80, 80);
        jf.add(clearButton);
        clearButton.addActionListener(this);
        
        

    }


    public static void main(String[] args) {
        System.out.println("Calculator");
        new calculator();
    }



    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==sevenButton){
            if(isOperatorClicked){
                displayLabel.setText("7");
                isOperatorClicked=false;
            }else{
                displayLabel.setText(displayLabel.getText()+"7");
            }
            
        }else if(e.getSource()==eightButton){
            if(isOperatorClicked){
                displayLabel.setText("8");
                isOperatorClicked=false;
            }else{
                displayLabel.setText(displayLabel.getText()+"8");
            }
            
        }else if(e.getSource()==nineButton){
            if(isOperatorClicked){
                displayLabel.setText("9");
                isOperatorClicked=false;
            }else{
                displayLabel.setText(displayLabel.getText()+"9");
            }
            
        }else if(e.getSource()==fourButton){
            if(isOperatorClicked){
                displayLabel.setText("4");
                isOperatorClicked=false;
            }else{
                displayLabel.setText(displayLabel.getText()+"4");
            }
            
        }else if(e.getSource()==fiveButton){
            if(isOperatorClicked){
                displayLabel.setText("5");
                isOperatorClicked=false;
            }else{
                displayLabel.setText(displayLabel.getText()+"5");
            }
            
        }else if(e.getSource()==sixButton){
            if(isOperatorClicked){
                displayLabel.setText("6");
                isOperatorClicked=false;
            }else{
                displayLabel.setText(displayLabel.getText()+"6");
            }
            
        }else if(e.getSource()==oneButton){
            if(isOperatorClicked){
                displayLabel.setText("1");
                isOperatorClicked=false;
            }else{
                displayLabel.setText(displayLabel.getText()+"1");
            }
            
        }else if(e.getSource()==twoButton){
            if(isOperatorClicked){
                displayLabel.setText("2");
                isOperatorClicked=false;
            }else{
                displayLabel.setText(displayLabel.getText()+"2");
            }
            
        }else if(e.getSource()==threeButton){
            if(isOperatorClicked){
                displayLabel.setText("3");
                isOperatorClicked=false;
            }else{
                displayLabel.setText(displayLabel.getText()+"3");
            }
            
        }else if(e.getSource()==dotButton){
            if(isOperatorClicked){
                displayLabel.setText(".");
                isOperatorClicked=false;
            }else{
                displayLabel.setText(displayLabel.getText()+".");
            }
            
        }else if(e.getSource()==zeroButton){
            if(isOperatorClicked){
                displayLabel.setText("0");
                isOperatorClicked=false;
            }else{
                displayLabel.setText(displayLabel.getText()+"0");
            }
            
        }else if(e.getSource()==equalButton){
            String newValue=displayLabel.getText();
            float storedValueF=Float.parseFloat(storedValue);
            float newValueF=Float.parseFloat(newValue);
            if(isdiv==true){
                result=storedValueF/newValueF;
            }else if(ismulti==true){
                result=storedValueF*newValueF;
            }else if(isminus==true){
                result=storedValueF-newValueF;
            }else if(isplus==true){
                result=storedValueF+newValueF;
            }
            displayLabel.setText(result+"");
            

        }else if(e.getSource()==divButton){
            isOperatorClicked=true;
            isdiv=true;
            storedValue=displayLabel.getText();
            
        }else if(e.getSource()==multiButton){
            isOperatorClicked=true;
            ismulti=true;
            storedValue=displayLabel.getText();
            
        }else if(e.getSource()==minusButton){
            isOperatorClicked=true;
            isminus=true;
            storedValue=displayLabel.getText();
            
        }else if(e.getSource()==plusButton){
            isOperatorClicked=true;
            isplus=true;
            storedValue=displayLabel.getText();

        }else if(e.getSource()==clearButton){
            displayLabel.setText("");;
        }
       
        
    }
}


