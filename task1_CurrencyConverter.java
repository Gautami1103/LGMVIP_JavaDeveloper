import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.NumberFormat;

import javax.swing.*;

class CurrencyConverter extends JFrame implements ActionListener {

    private static final long serialVersionUID = 1L;
    private static final int WIDTH = 500;
    private static final int HEIGHT = 600;

    private JLabel amountLabel;
    private JTextField amountTextField;
    private JLabel currencyLabel;
    private JComboBox<String> currencyComboBox;
    private JButton convertButton;
    private JLabel resultLabel;

    private double USDToEUR = 0.83;
    private double USDToJPY = 109.61;
    private double USDToGBP = 0.72;

    public CurrencyConverter() {
        super("Currency Converter");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(WIDTH, HEIGHT);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 2));

        amountLabel = new JLabel("Amount in USD:");
        panel.add(amountLabel);

        amountTextField = new JTextField();
        panel.add(amountTextField);

        currencyLabel = new JLabel("Currency:");
        panel.add(currencyLabel);

        String[] currencies = { "EUR", "JPY", "GBP" };
        currencyComboBox = new JComboBox<String>(currencies);
        panel.add(currencyComboBox);

        convertButton = new JButton("Convert");
        convertButton.addActionListener(this);
        panel.add(convertButton);

        resultLabel = new JLabel("");
        panel.add(resultLabel);

        add(panel);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        String usdAmountString = amountTextField.getText();
        String currency = (String) currencyComboBox.getSelectedItem();

        if (usdAmountString.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter an amount in USD.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        double usdAmount = Double.parseDouble(usdAmountString);
        double convertedAmount = 0.0;

        if (currency.equalsIgnoreCase("EUR")) {
            convertedAmount = usdAmount * USDToEUR;
        } else if (currency.equalsIgnoreCase("JPY")) {
            convertedAmount = usdAmount * USDToJPY;
        } else if (currency.equalsIgnoreCase("GBP")) {
            convertedAmount = usdAmount * USDToGBP;
        } else {
            JOptionPane.showMessageDialog(this, "Invalid currency entered.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String formattedAmount = NumberFormat.getCurrencyInstance().format(convertedAmount);
        resultLabel.setText(formattedAmount);
    }

    public static void main(String[] args) {
        new CurrencyConverter();
    }
}