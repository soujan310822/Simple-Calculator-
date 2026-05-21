import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class textField extends Buttons implements ActionListener {
    JTextField display = new JTextField();
    double num1 = 0;
    double num2 = 0;
    double result = 0;
    char operator;

    
    public textField() {
        super.panel1.add(display);
        this.display.setBounds(10, 10, 368, 130);
        this.display.setBackground(new Color(169, 169, 169));
        this.display.setHorizontalAlignment(JTextField.RIGHT);
        this.display.setFont(new Font("Arial",Font.BOLD,43));
        this.addingListenersToButtons();
        this.display.setEditable(false);


        super.setvisible(true);

    }

    public void addingListenersToButtons() {
        for (JButton b : numbers) {
            b.addActionListener(this);
        }
        for (JButton v : operators) {
            v.addActionListener(this);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        for (int i = 0; i < 10; i++) {
            if (e.getSource() == numbers[i]) {
                display.setText(display.getText().concat(String.valueOf(i)));
            }
        }
        if (e.getSource() == decimal)
            display.setText(display.getText().concat("."));
        if (e.getSource() == clearAll)
            display.setText("");
        if (e.getSource() == plus) {
            num1 = Double.parseDouble(display.getText());
            operator = '+';
            display.setText("");
        }
        if (e.getSource() == subtract) {
            num1 = Double.parseDouble(display.getText());
            operator = '-';
            display.setText("");
        }
        if (e.getSource() == multiply) {
            num1 = Double.parseDouble(display.getText());
            operator = '*';
            display.setText("");
        }
        if (e.getSource() == divide) {
            num1 = Double.parseDouble(display.getText());
            operator = '/';
            display.setText("");
        }
        if (e.getSource() == squareroot) {
            display.setText("");
            operator = '√';
        }
        if (e.getSource() == percentage) {
            num1 = Double.parseDouble(display.getText());
            operator = '%';
            display.setText("");
        }
        if(e.getSource()== clear){
            String str=display.getText();
            display.setText("");
            for(int i=0;i<str.length()-1;i++){
                display.setText(display.getText()+str.charAt(i));
            }

        }

        if (e.getSource() == equals) {
            num2 = Double.parseDouble(display.getText());
            switch (operator) {
                case '+' -> result = num1 + num2;
                case '-' -> result = num1 - num2;
                case '*' -> result = num1 * num2;
                case '/' -> result = num1 / num2;
                case '√' -> result = Math.pow(num2, 0.5);
                case '%' -> result = num2 * num1 / 100;
                }
                display.setText(String.valueOf(result));
                num1 = result;

            }


        }
    }
