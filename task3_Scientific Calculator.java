import javax.swing.*;

import java.awt.*;

import java.awt.event.*;

class Calculator implements ActionListener {

    JFrame frame;

    JTextField textfield;

    JButton[] numberButtons = new JButton[10];

    JButton[] functionButtons = new JButton[20];

    JButton allClear, sinButton, cosButton, tanButton, delButton;

    JButton logButton, lnButton, sqrtButton, cbrtButton, divButton;

    JButton powButton, mulButton;

    JButton piButton, addButton;

    JButton subButton, factButton;

    JButton eButton, dotButton, inverseButton, equalButton;

    JPanel panel;

    Font myFont = new Font("Sans", Font.BOLD, 20);

    double num1 = 0, num2 = 0, result = 0;

    double number = 0, number2 = 0;

    char operator;

    Calculator()

    {
        frame = new JFrame("Scientific Calculator");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setSize(600, 460);

        frame.setResizable(false);

        frame.setLayout(null);

        textfield = new JTextField();

        textfield.setBounds(50, 25, 500, 50);

        textfield.setFont(myFont);

        textfield.setEditable(false);

        allClear = new JButton("AC");

        sinButton = new JButton("sin");

        cosButton = new JButton("cos");

        tanButton = new JButton("tan");

        delButton = new JButton("Del");

        logButton = new JButton("log");

        lnButton = new JButton("ln");

        sqrtButton = new JButton("SQRT");

        cbrtButton = new JButton("CBRT");

        divButton = new JButton("/");

        powButton = new JButton("x^y");

        mulButton = new JButton("x");

        piButton = new JButton("PI");

        addButton = new JButton("+");

        factButton = new JButton("x!");

        subButton = new JButton("-");

        inverseButton = new JButton("1/x");

        eButton = new JButton("e");

        dotButton = new JButton(".");

        equalButton = new JButton("=");

        Color c = new Color(250, 156, 47);

        addButton.setBackground(c);

        subButton.setBackground(c);

        mulButton.setBackground(c);

        divButton.setBackground(c);

        equalButton.setBackground(c);

        Color c1 = new Color(60, 190, 146);

        logButton.setBackground(c1);

        sinButton.setBackground(c1);

        cosButton.setBackground(c1);

        tanButton.setBackground(c1);

        inverseButton.setBackground(c1);

        factButton.setBackground(c1);

        piButton.setBackground(c1);

        tanButton.setBackground(c1);

        powButton.setBackground(c1);

        lnButton.setBackground(c1);

        sqrtButton.setBackground(c1);

        cbrtButton.setBackground(c1);

        eButton.setBackground(c1);

        dotButton.setBackground(Color.CYAN);

        Color c3 = new Color(215, 105, 105);

        delButton.setBackground(c3);

        allClear.setBackground(c3);

        functionButtons[0] = allClear;

        functionButtons[1] = sinButton;

        functionButtons[2] = cosButton;

        functionButtons[3] = tanButton;

        functionButtons[4] = delButton;

        functionButtons[5] = logButton;

        functionButtons[6] = lnButton;

        functionButtons[7] = sqrtButton;

        functionButtons[8] = cbrtButton;

        functionButtons[9] = divButton;

        functionButtons[10] = powButton;

        functionButtons[11] = mulButton;

        functionButtons[12] = piButton;

        functionButtons[13] = addButton;

        functionButtons[14] = factButton;

        functionButtons[15] = subButton;

        functionButtons[16] = inverseButton;

        functionButtons[17] = eButton;

        functionButtons[18] = dotButton;

        functionButtons[19] = equalButton;

        for (int i = 0; i < 20; i++)

        {

            functionButtons[i].addActionListener(this);

            functionButtons[i].setFont(myFont);

            functionButtons[i].setFocusable(false);

        }

        for (int i = 0; i < 10; i++) {

            numberButtons[i] = new JButton(String.valueOf(i));

            numberButtons[i].addActionListener(this);

            numberButtons[i].setFont(myFont);

            numberButtons[i].setFocusable(false);

            numberButtons[i].setBackground(Color.LIGHT_GRAY);

        }

        panel = new JPanel();

        panel.setBounds(50, 100, 500, 300);

        panel.setLayout(new GridLayout(6, 5, 10, 10));

        panel.add(allClear);

        panel.add(sinButton);

        panel.add(cosButton);

        panel.add(tanButton);

        panel.add(delButton);

        panel.add(logButton);

        panel.add(lnButton);

        panel.add(sqrtButton);

        panel.add(cbrtButton);

        panel.add(divButton);

        panel.add(powButton);

        panel.add(numberButtons[7]);

        panel.add(numberButtons[8]);

        panel.add(numberButtons[9]);

        panel.add(mulButton);

        panel.add(piButton);

        panel.add(numberButtons[4]);

        panel.add(numberButtons[5]);

        panel.add(numberButtons[6]);

        panel.add(addButton);

        panel.add(factButton);

        panel.add(numberButtons[1]);

        panel.add(numberButtons[2]);

        panel.add(numberButtons[3]);

        panel.add(subButton);

        panel.add(inverseButton);

        panel.add(eButton);

        panel.add(numberButtons[0]);

        panel.add(dotButton);

        panel.add(equalButton);

        frame.add(panel);

        frame.add(textfield);

        frame.setVisible(true);

    }

    public static void main(String[] args) {

        new Calculator();

    }

    @Override

    public void actionPerformed(ActionEvent e) {

        for (int i = 0; i < 10; i++)

        {

            if (e.getSource() == numberButtons[i]) {

                textfield.setText(textfield.getText() + String.valueOf(i));

            }

        }

        if (e.getSource() == dotButton)

        {

            textfield.setText(textfield.getText().concat("."));

        }

        if (e.getSource() == addButton) {

            num1 = Double.parseDouble(textfield.getText());

            operator = '+';

            textfield.setText("");

        }

        if (e.getSource() == subButton) {

            num1 = Double.parseDouble(textfield.getText());

            operator = '-';

            textfield.setText("");

        }

        if (e.getSource() == mulButton) {

            num1 = Double.parseDouble(textfield.getText());

            operator = '*';

            textfield.setText("");

        }

        if (e.getSource() == divButton) {

            num1 = Double.parseDouble(textfield.getText());

            operator = '/';

            textfield.setText("");

        }

        if (e.getSource() == eButton) {

            textfield.setText("2.72");

        }

        if (e.getSource() == inverseButton) {

            num1 = Double.parseDouble(textfield.getText());

            num1 = 1 / num1;

            textfield.setText(String.valueOf(num1));

        }

        if (e.getSource() == factButton) {

            int fact = 1;

            num1 = Integer.parseInt(textfield.getText());

            for (int i = 1; i <= num1; i++)

            {

                fact = fact * i;

            }

            textfield.setText(String.valueOf(fact));

        }

        if (e.getSource() == piButton) {

            textfield.setText("3.14");

        }

        if (e.getSource() == sqrtButton) {

            num1 = Double.parseDouble(textfield.getText());

            textfield.setText(String.valueOf(Math.sqrt(num1)));

        }

        if (e.getSource() == cbrtButton) {

            num1 = Double.parseDouble(textfield.getText());

            textfield.setText(String.valueOf(Math.cbrt(num1)));

        }

        if (e.getSource() == sinButton) {

            num1 = Double.parseDouble(textfield.getText());

            num1 = Math.sin(num1);

            textfield.setText(String.valueOf(num1));

        }

        if (e.getSource() == cosButton) {

            num1 = Double.parseDouble(textfield.getText());

            num1 = Math.cos(num1);

            textfield.setText(String.valueOf(num1));

        }

        if (e.getSource() == tanButton) {

            num1 = Double.parseDouble(textfield.getText());

            num1 = Math.tan(num1);

            System.out.println(Math.tan(60));

            textfield.setText(String.valueOf(num1));

        }

        if (e.getSource() == logButton) {

            num1 = Double.parseDouble(textfield.getText());

            textfield.setText(String.valueOf(Math.log10(num1)));

        }

        if (e.getSource() == lnButton) {

            num1 = Double.parseDouble(textfield.getText());

            textfield.setText(String.valueOf(Math.log(num1)));

        }

        if (e.getSource() == lnButton) {

            num1 = Double.parseDouble(textfield.getText());

            textfield.setText(String.valueOf(Math.log(num1)));

        }

        if (e.getSource() == powButton) {

            number = Double.parseDouble(textfield.getText());

            textfield.setText("");

            operator = '^';

        }

        if (e.getSource() == equalButton) {

            num2 = Double.parseDouble(textfield.getText());

            switch (operator) {

                case '+':

                    result = num1 + num2;

                    break;

                case '-':

                    result = num1 - num2;

                    break;

                case '*':

                    result = num1 * num2;

                    break;

                case '^':

                    number2 = Integer.parseInt(textfield.getText());

                    textfield.setText(String.valueOf(Math.pow(number, number2)));

                case '/':

                    result = num1 / num2;

                    break;

            }

            if (operator != '^') {

                textfield.setText(String.valueOf(result));

                num1 = result;
            }

        }

        if (e.getSource() == allClear) {

            textfield.setText("");

        }

        if (e.getSource() == delButton) {

            String string = textfield.getText();

            textfield.setText("");

            for (int i = 0; i < string.length() - 1; i++) {

                textfield.setText(textfield.getText() + string.charAt(i));

            }

        }

    }

}