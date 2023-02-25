import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VendingMachine {
    private JTextField textInsertMoney;
    private JTextField textChangeMoney;
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

    public static void purchase() {

    }

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
            int money = Integer.parseInt(textInsertMoney.getText());
            double price = 0;
            int sprite = 80;
            int coke = 70;
            int redBull = 120;
            int slice = 40;
            int fanta = 50;
            int mountainDew = 70;

            if (spriteNRP8000RadioButton.isSelected()){
                if (money>sprite) {
                    price = money-sprite;
                }else {
                    JOptionPane.showMessageDialog(null,"Your Balance is not enough");
                }
            }
            if(cokeNRP7000RadioButton.isSelected()){
                if(money>coke){
                    price =money-coke;
                }else {
                    JOptionPane.showMessageDialog(null,"Your Balance is not enough");
                }
            }
            if(redBullNRP120RadioButton.isSelected()){
                if(money>redBull){
                    price=money-redBull;
                }else {
                    JOptionPane.showMessageDialog(null,"Your Balance is not enough");
                }
            }
            if(sliceNRP4000RadioButton.isSelected()){
                if(money>slice){
                    price = money-slice;
                }else {
                    JOptionPane.showMessageDialog(null,"Your Balance is not enough");
                }
            }
            if(fantaNRP5000RadioButton.isSelected()){
                if(money>fanta){
                    price = money-fanta;
                }else {
                    JOptionPane.showMessageDialog(null,"Your Balance is not enough");
                }
            }
            if(mountainDewNRP70RadioButton.isSelected()){
                if(money>mountainDew){
                    price = money-mountainDew;
                }else {
                    JOptionPane.showMessageDialog(null,"Your Balance is not enough");
                }
            }

            
            textChangeMoney.setText(String.valueOf(price));

            
        }

    });
        spriteNRP8000RadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(spriteNRP8000RadioButton.isSelected()){
                    cokeNRP7000RadioButton.setSelected(false);
                    redBullNRP120RadioButton.setSelected(false);
                    sliceNRP4000RadioButton.setSelected(false);
                    fantaNRP5000RadioButton.setSelected(false);
                    mountainDewNRP70RadioButton.setSelected(false);
                    textChangeMoney.setText("");
                }
            }
        });
        cokeNRP7000RadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(cokeNRP7000RadioButton.isSelected()){
                    spriteNRP8000RadioButton.setSelected(false);
                    redBullNRP120RadioButton.setSelected(false);
                    sliceNRP4000RadioButton.setSelected(false);
                    fantaNRP5000RadioButton.setSelected(false);
                    mountainDewNRP70RadioButton.setSelected(false);
                    textChangeMoney.setText("");
                }
            }
        });
        redBullNRP120RadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(redBullNRP120RadioButton.isSelected()){
                    cokeNRP7000RadioButton.setSelected(false);
                    spriteNRP8000RadioButton.setSelected(false);
                    sliceNRP4000RadioButton.setSelected(false);
                    fantaNRP5000RadioButton.setSelected(false);
                    mountainDewNRP70RadioButton.setSelected(false);
                    textChangeMoney.setText("");
                }
            }
        });
        sliceNRP4000RadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(sliceNRP4000RadioButton.isSelected()){
                    cokeNRP7000RadioButton.setSelected(false);
                    spriteNRP8000RadioButton.setSelected(false);
                    redBullNRP120RadioButton.setSelected(false);
                    fantaNRP5000RadioButton.setSelected(false);
                    mountainDewNRP70RadioButton.setSelected(false);
                    textChangeMoney.setText("");
                }
            }
        });
        fantaNRP5000RadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(fantaNRP5000RadioButton.isSelected()){
                    cokeNRP7000RadioButton.setSelected(false);
                    spriteNRP8000RadioButton.setSelected(false);
                    sliceNRP4000RadioButton.setSelected(false);
                    mountainDewNRP70RadioButton.setSelected(false);
                    redBullNRP120RadioButton.setSelected(false);
                    textChangeMoney.setText("");
                }
            }
        });
        mountainDewNRP70RadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(mountainDewNRP70RadioButton.isSelected()){
                    cokeNRP7000RadioButton.setSelected(false);
                    spriteNRP8000RadioButton.setSelected(false);
                    sliceNRP4000RadioButton.setSelected(false);
                    fantaNRP5000RadioButton.setSelected(false);
                    redBullNRP120RadioButton.setSelected(false);
                    textChangeMoney.setText("");
                }
            }
        });
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mountainDewNRP70RadioButton.setSelected(false);
                cokeNRP7000RadioButton.setSelected(false);
                spriteNRP8000RadioButton.setSelected(false);
                sliceNRP4000RadioButton.setSelected(false);
                fantaNRP5000RadioButton.setSelected(false);
                redBullNRP120RadioButton.setSelected(false);
                textChangeMoney.setText("");
                textInsertMoney.setText("");
            }
        });
        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }
}
