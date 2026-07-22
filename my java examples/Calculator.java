import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Calculator extends JFrame implements ActionListener {
    private JTextField textField;
    private String num1 = "", num2 = "", operator = "";

    public Calculator() {
        setTitle("Ashwanthkumar");
        setSize(300, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Text field to display input/output
        textField = new JTextField();
        textField.setEditable(false);
        add(textField, BorderLayout.NORTH);

        // Creating button panel
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 4));

        // Button labels
        String buttons[] = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "0", "C", "=", "+"
        };

        // Adding buttons
        for (String text : buttons) {
            JButton button = new JButton(text);
            button.addActionListener(this);
            panel.add(button);
        }

        add(panel, BorderLayout.CENTER);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

        if (command.charAt(0) >= '0' && command.charAt(0) <= '9') {
            if (operator.isEmpty()) {
                num1 += command;
            } else {
                num2 += command;
            }
            textField.setText(num1 + operator + num2);
        } else if (command.equals("C")) {
            num1 = num2 = operator = "";
            textField.setText("");
        } else if (command.equals("=")) {
            if (!num1.isEmpty() && !num2.isEmpty()) {
                double result = calculate(Double.parseDouble(num1), Double.parseDouble(num2), operator);
                textField.setText(num1 + operator + num2 + " = " + result);
                num1 = Double.toString(result);
                num2 = "";
                operator = "";
            }
        } else {
            if (!num1.isEmpty() && num2.isEmpty()) {
                operator = command;
                textField.setText(num1 + operator);
            }
        }
    }

    private double calculate(double num1, double num2, String operator) {
        switch (operator) {
            case "+": return num1 + num2;
            case "-": return num1 - num2;
            case "*": return num1 * num2;
            case "/": return num2 != 0 ? num1 / num2 : 0;
            default: return 0;
        }
    }

    public static void main(String[] args) {
        new Calculator();
    }
}
