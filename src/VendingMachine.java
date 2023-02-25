import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VendingMachine {
    private JTextField textField1;
    private JTextField textField2;
    private JRadioButton spriteNRP8000RadioButton;
    private JRadioButton fantaNRP5000RadioButton;
    private JRadioButton mountainDewNRP70RadioButton;
    private JRadioButton sliceNRP4000RadioButton;
    private JRadioButton redBullNRP120RadioButton;
    private JRadioButton cokeNRP7000RadioButton;
    private JButton purchaseButton;
    private JButton clearButton;
    private JButton exitButton;
    private JPanel main;

    public static void main(String[] args) {
        JFrame frame = new JFrame("VendingMachine");
        frame.setContentPane(new VendingMachine().main);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public VendingMachine() {
    purchaseButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {

        }
    });
}
}
