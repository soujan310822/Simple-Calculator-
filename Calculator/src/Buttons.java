import javax.swing.*;
import java.awt.*;

public class Buttons extends Frame {
    Font font = new Font("Arial", Font.BOLD, 25);

    public JButton plus = new JButton("+");
    public JButton subtract = new JButton("-");
    public JButton multiply = new JButton("*");
    public JButton divide = new JButton("/");
    public JButton equals = new JButton("=");
    public JButton clear = new JButton("c");
    public JButton one = new JButton("1");
    public JButton two = new JButton("2");
    public JButton three = new JButton("3");
    public JButton four = new JButton("4");
    public JButton five = new JButton("5");
    public JButton six = new JButton("6");
    public JButton seven = new JButton("7");
    public JButton eight = new JButton("8");
    public JButton nine = new JButton("9");
    public JButton zero = new JButton("0");
    public JButton clearAll = new JButton("AC");
    public JButton decimal = new JButton(".");
    public JButton percentage = new JButton("%");
    public JButton squareroot = new JButton("√");
    JButton[] operators = {plus, subtract, decimal, divide, multiply, squareroot, clear, clearAll,equals,percentage};
    JButton[] numbers = {zero, one, two, three, four, five, six, seven, eight, nine};


    // i will define a method to add buttons into panel2 and call it using constructor
    public Buttons() {
        super();
        this.addButtons();
        this.setfont(font);
        this.positionButtons();
        this.Buttonsborder();
    }

    //mehtod to add buttons to panel2.
    public void addButtons() {
        super.panel2.add(plus);
        super.panel2.add(subtract);
        super.panel2.add(multiply);
        super.panel2.add(divide);
        super.panel2.add(equals);
        super.panel2.add(clear);
        super.panel2.add(one);
        super.panel2.add(two);
        super.panel2.add(three);
        super.panel2.add(four);
        super.panel2.add(five);
        super.panel2.add(six);
        super.panel2.add(seven);
        super.panel2.add(eight);
        super.panel2.add(nine);
        super.panel2.add(zero);
        super.panel2.add(clearAll);
        super.panel2.add(decimal);
        super.panel2.add(percentage);
        super.panel2.add(squareroot);

    }

    // method to set font for my buttons.
    public void setfont(Font font) {
        this.plus.setFont(font);
        this.subtract.setFont(font);
        this.multiply.setFont(font);
        this.divide.setFont(font);
        this.equals.setFont(font);
        this.clear.setFont(font);
        this.one.setFont(font);
        this.two.setFont(font);
        this.three.setFont(font);
        this.four.setFont(font);
        this.five.setFont(font);
        this.six.setFont(font);
        this.seven.setFont(font);
        this.eight.setFont(font);
        this.nine.setFont(font);
        this.zero.setFont(font);
        this.clearAll.setFont(font);
        this.percentage.setFont(font);
        this.squareroot.setFont(font);
        this.decimal.setFont(font);
    }

    //method to position my button in panel2,
    // ik gridlayout would have made my work easier but hey, this still works
    public void positionButtons() {
        clearAll.setBounds(20, 20, 80, 50);
        clear.setBounds(110, 20, 80, 50);
        squareroot.setBounds(200, 20, 80, 50);
        divide.setBounds(290, 20, 80, 50);
        seven.setBounds(20, 80, 80, 50);
        eight.setBounds(110, 80, 80, 50);
        nine.setBounds(200, 80, 80, 50);
        multiply.setBounds(290, 80, 80, 50);
        four.setBounds(20, 140, 80, 50);
        five.setBounds(110, 140, 80, 50);
        six.setBounds(200, 140, 80, 50);
        subtract.setBounds(290, 140, 80, 50);
        one.setBounds(20, 200, 80, 50);
        two.setBounds(110, 200, 80, 50);
        three.setBounds(200, 200, 80, 50);
        plus.setBounds(290, 200, 80, 50);
        percentage.setBounds(20, 260, 80, 50);
        zero.setBounds(110, 260, 80, 50);
        decimal.setBounds(200, 260, 80, 50);
        equals.setBounds(290, 260, 80, 50);

    }

    //method to style my buttons and remove that focusable
    public void Buttonsborder() {
        for (JButton b:operators) {
            b.setBorder(BorderFactory.createEtchedBorder());
            b.setFocusable(false);
        }
        for (JButton b:numbers) {
            b.setBorder(BorderFactory.createEtchedBorder(Color.black,Color.black));
            b.setFocusable(false);
        }



    }
}
