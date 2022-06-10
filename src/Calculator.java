import javax.swing.*;
import java.util.Objects;

public class Calculator extends javax.swing.JFrame {
    private JPanel Calculator;
    private JTextField resultText;
    private JButton divButton;
    private JButton a2Button;
    private JButton a3Button;
    private JButton a5Button;
    private JButton a8Button;
    private JButton a0Button;
    private JButton plusButton;
    private JButton a6Button;
    private JButton a9Button;
    private JButton minusButton;
    private JButton mulButton;
    private JButton equalsButton;
    private JButton clearButton;
    private JButton a1Button;
    private JButton a4Button;
    private JButton a7Button;
    private JButton pointButton;

    private double total1 = 0.0;
    private double total2 = 0.0;
    private char math_operator;

    public Calculator() {
        a1Button.addActionListener(e -> {
            String a1ButtonText = resultText.getText() + a1Button.getText();
            resultText.setText(a1ButtonText);
        });


        a2Button.addActionListener(e -> {
            String a2ButtonText = resultText.getText() + a2Button.getText();
            resultText.setText(a2ButtonText);
        });


        a3Button.addActionListener(e -> {
            String a3buttonText = resultText.getText() + a3Button.getText();
            resultText.setText(a3buttonText);
        });


        a4Button.addActionListener(e -> {
            String a4ButtonText = resultText.getText() + a4Button.getText();
            resultText.setText(a4ButtonText);
        });


        a5Button.addActionListener(e -> {
            String a5buttonText = resultText.getText() + a5Button.getText();
            resultText.setText(a5buttonText);
        });


        a6Button.addActionListener(e -> {
            String a6buttonText = resultText.getText() + a6Button.getText();
            resultText.setText(a6buttonText);
        });


        a7Button.addActionListener(e -> {
            String a7buttonText = resultText.getText() + a7Button.getText();
            resultText.setText(a7buttonText);
        });


        a8Button.addActionListener(e -> {
            String a8buttonText = resultText.getText() + a8Button.getText();
            resultText.setText(a8buttonText);
        });


        a9Button.addActionListener(e -> {
            String a9buttonText = resultText.getText() + a9Button.getText();
            resultText.setText(a9buttonText);
        });


        a0Button.addActionListener(e -> {
            String a0buttonText = resultText.getText() + a0Button.getText();
            resultText.setText(a0buttonText);
        });


        plusButton.addActionListener(e -> {
            String txtButton = plusButton.getText();
            getOperator(txtButton);
        });


        minusButton.addActionListener(e -> {
            String txtButton = minusButton.getText();
            getOperator(txtButton);
        });


        mulButton.addActionListener(e -> {
            String txtButton = mulButton.getText();
            getOperator(txtButton);
        });


        divButton.addActionListener(e -> {
            String txtButton = divButton.getText();
            getOperator(txtButton);
        });


        pointButton.addActionListener(e -> {
            if(resultText.getText().equals("")) {
                resultText.setText("0.");
            }
            else if(resultText.getText().contains(".")){
                pointButton.setEnabled(false);
            }
            else {
                String pointButtonText = resultText.getText() + pointButton.getText();
                resultText.setText(pointButtonText);
            }
            pointButton.setEnabled(true);
        });


        equalsButton.addActionListener(e -> {
            switch (math_operator) {
                case '+' -> {
                    total2 = total1 + Double.parseDouble(resultText.getText());

                    resultText.setText(Double.toString(total2));
                }
                case '-' -> {
                    total2 = total1 - Double.parseDouble(resultText.getText());

                    resultText.setText(Double.toString(total2));
                }
                case '*' -> {
                    total2 = total1 * Double.parseDouble(resultText.getText());

                    resultText.setText(Double.toString(total2));
                }
                case '/' -> {
                    if (Objects.equals(resultText.getText(), "0")) {
                        resultText.setText("Math ERROR");
                    } else {
                        total2 = total1 / Double.parseDouble(resultText.getText());
                        resultText.setText(Double.toString(total2));
                    }
                }
            }

            total2 = 0;
        });


        clearButton.addActionListener(e -> {
            resultText.setText("");
            total2 = 0;
            total1 = 0;
        });
    }


    private void getOperator(String txtButton) {
        math_operator = txtButton.charAt(0);
        total1 = total1 + Double.parseDouble(resultText.getText());
        resultText.setText("");
    }


    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");
        frame.setContentPane(new Calculator().Calculator);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
