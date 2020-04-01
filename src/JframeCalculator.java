import javax.swing.*;

public class JframeCalculator {
    private JPanel JCalculator;
    private JTextField textField1;
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

    public static void main(String[] args) {
        JFrame frame = new JFrame("JframeCalculator");
        frame.setContentPane(new JframeCalculator().JCalculator);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
