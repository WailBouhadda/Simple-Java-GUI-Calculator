import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JframeCalculator {

    private double totale1 = 0.0;
    private double totale2 = 0.0;

    private char math_operator;

    private JPanel JCalculator;
    private JTextField TextDisplay;
    private JButton BTNfac;
    private JButton BTNDivide;
    private JButton BTNPlus;
    private JButton BTN1;
    private JButton BTN2;
    private JButton BTN4;
    private JButton BTN7;
    private JButton BTN0;
    private JButton BTN3;
    private JButton BTN5;
    private JButton BTN8;
    private JButton BTNPoint;
    private JButton BTNRemove;
    private JButton BTN6;
    private JButton BTN9;
    private JButton BTNClear;
    private JButton BTNEquals;
    private JButton BTNMinus;
    private JButton BTNMultiply;
    private JButton BTNtan;
    private JButton BTNsin;
    private JButton BTNcos;
    private JButton BTNsqrt;
    private JButton BTNpi;
    private JButton BTNpui;
    private JButton BTNabso;
    private JButton BTNlog;
    private JButton BTNcbr;
    private JButton BTNpm;
    private JButton BTNround;


    public void getOperator(String BtnText){
        math_operator = BtnText.charAt(0);
        totale1 = totale1 + Double.parseDouble(TextDisplay.getText());
        TextDisplay.setText("");
    }

    public JframeCalculator() {
        BTN1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String BTN1Text = TextDisplay.getText() + BTN1.getText();
                TextDisplay.setText(BTN1Text);
            }
        });
        BTN2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String BTN2Text = TextDisplay.getText() + BTN2.getText();
                TextDisplay.setText(BTN2Text);
            }
        });
        BTN3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String BTN3Text = TextDisplay.getText() + BTN3.getText();
                TextDisplay.setText(BTN3Text);
            }
        });
        BTN4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String BTN4Text = TextDisplay.getText() + BTN4.getText();
                TextDisplay.setText(BTN4Text);
            }
        });
        BTN5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String BTN5Text = TextDisplay.getText() + BTN5.getText();
                TextDisplay.setText(BTN5Text);
            }
        });
        BTN6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String BTN6Text = TextDisplay.getText() + BTN6.getText();
                TextDisplay.setText(BTN6Text);
            }
        });
        BTN7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String BTN7Text = TextDisplay.getText() + BTN7.getText();
                TextDisplay.setText(BTN7Text);
            }
        });
        BTN8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String BTN8Text = TextDisplay.getText() + BTN8.getText();
                TextDisplay.setText(BTN8Text);
            }
        });
        BTN9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String BTN9Text = TextDisplay.getText() + BTN9.getText();
                TextDisplay.setText(BTN9Text);
            }
        });
        BTN0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String BTN0Text = TextDisplay.getText() + BTN0.getText();
                TextDisplay.setText(BTN0Text);
            }
        });
        BTNPoint.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               if (TextDisplay.getText().equals("")){
                   TextDisplay.setText("0.");
               }
               else if (TextDisplay.getText().contains(".")){
                   BTNPoint.setEnabled(false);
               }
               else {
                   String BTNPointText= TextDisplay.getText() + BTNPoint.getText();
                   TextDisplay.setText(BTNPointText);
               }
               BTNPoint.setEnabled(true);
            }
        });
        BTNPlus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String Button_text = BTNPlus.getText();
                getOperator(Button_text);
            }
        });
        BTNEquals.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                switch (math_operator){
                    case '+':
                        totale2 = totale1 + Double.parseDouble(TextDisplay.getText());
                        break;
                    case '-':
                        totale2 = totale1 - Double.parseDouble(TextDisplay.getText());
                        break;
                    case '/':
                        totale2 = totale1 / Double.parseDouble(TextDisplay.getText());
                        break;
                    case '*':
                        totale2 = totale1 * Double.parseDouble(TextDisplay.getText());
                        break;

                }
                TextDisplay.setText(Double.toString(totale2));
                totale1=0;

            }
        });
        BTNClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                totale2 = 0 ;
                TextDisplay.setText("");
            }
        });
        BTNDivide.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String Button_text = BTNDivide.getText();
                getOperator(Button_text);
            }
        });
        BTNMinus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String Button_text = BTNMinus.getText();
                getOperator(Button_text);
            }
        });
        BTNMultiply.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String Button_text = BTNMultiply.getText();
                getOperator(Button_text);
            }
        });
        BTNRemove.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String BS = null;
                if (TextDisplay.getText().length() > 0){
                    StringBuilder strB = new StringBuilder(TextDisplay.getText());
                    strB.deleteCharAt(TextDisplay.getText().length() - 1);
                    BS = strB.toString();
                    TextDisplay.setText(BS);
                }
            }
        });
        BTNsqrt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double sqr = Double.parseDouble(String.valueOf(TextDisplay.getText()));
                sqr = Math.sqrt(sqr);
                TextDisplay.setText(String.valueOf(sqr));
            }
        });
        BTNabso.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double abso = Double.parseDouble(String.valueOf(TextDisplay.getText()));
                abso = Math.abs(abso);
                TextDisplay.setText(String.valueOf(abso));
            }
        });
        BTNsin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double sn = Double.parseDouble(String.valueOf(TextDisplay.getText()));
                sn = Math.sin(sn);
                TextDisplay.setText(String.valueOf(sn));
            }
        });
        BTNcos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double cs = Double.parseDouble(String.valueOf(TextDisplay.getText()));
                cs = Math.cos(cs);
                TextDisplay.setText(String.valueOf(cs));
            }
        });
        BTNtan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double tn = Double.parseDouble(String.valueOf(TextDisplay.getText()));
                tn = Math.tan(tn);
                TextDisplay.setText(String.valueOf(tn));
            }
        });
        BTNpm.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double pm = Double.parseDouble(String.valueOf(TextDisplay.getText()));
                pm = -pm;
                TextDisplay.setText(String.valueOf(pm));
            }
        });
        BTNpi.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double pi;
                pi = 3.141592653589793238;
                TextDisplay.setText(String.valueOf(pi));
            }
        });
        BTNcbr.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double cbr = Double.parseDouble(String.valueOf(TextDisplay.getText()));
                cbr = Math.cbrt(cbr);
                TextDisplay.setText(String.valueOf(cbr));
            }
        });
        BTNlog.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double lg = Double.parseDouble(String.valueOf(TextDisplay.getText()));
                lg = Math.log(lg);
                TextDisplay.setText(String.valueOf(lg));
            }
        });
        BTNround.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double ro = Double.parseDouble(String.valueOf(TextDisplay.getText()));
                ro = Math.round(ro);
                TextDisplay.setText(String.valueOf(ro));
            }
        });
        BTNfac.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double fac = Double.parseDouble(String.valueOf(TextDisplay.getText()));
                for (double i = (fac-1) ; i > 0 ;i--){

                    fac = fac * i ;
                }
                TextDisplay.setText(String.valueOf(fac));
            }
        });
        BTNpui.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double p = Double.parseDouble(String.valueOf(TextDisplay.getText()));
                p = Math.pow(p,p);
                TextDisplay.setText(String.valueOf(p));
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("JframeCalculator");
        frame.setContentPane(new JframeCalculator().JCalculator);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setResizable(true);
        frame.setSize(500,400);


    }
}
