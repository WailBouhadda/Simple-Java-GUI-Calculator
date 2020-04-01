import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JframeCalculator {

    

    private JPanel JCalculator;
    private JTextField TextDisplay;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton BTN1;
    private JButton BTN2;
    private JButton BTN4;
    private JButton BTN7;
    private JButton BTN0;
    private JButton BTN3;
    private JButton BTN5;
    private JButton BTN8;
    private JButton BTNPoint;
    private JButton BTNPlus;
    private JButton BTN6;
    private JButton BTN9;
    private JButton BTNClear;
    private JButton BTNEquals;
    private JButton BTNMinus;
    private JButton BTNMultiply;
    private JButton BTNDivide;

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
                String BTNPointText = TextDisplay.getText() + BTNPoint.getText();
                TextDisplay.setText(BTNPointText);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("JframeCalculator");
        frame.setContentPane(new JframeCalculator().JCalculator);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
