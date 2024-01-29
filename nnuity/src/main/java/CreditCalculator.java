import javax.swing.*;
import java.awt.*;

public class CreditCalculator extends JFrame {
    private JLabel loanAmountLabel;
    private JLabel interestRateLabel;
    private JLabel termLabel;
    private JTextField loanAmountTextField;
    private JTextField interestRateTextField;
    private JTextField termTextField;
    private JButton calculateButton;
    private JLabel monthlyPaymentLabel;
    private JLabel totalPaymentLabel;

    public CreditCalculator() {
        super("Кредитный калькулятор");

        loanAmountLabel = new JLabel("Сумма кредита");
        interestRateLabel = new JLabel("Процентная ставка");
        termLabel = new JLabel("Срок кредитования");
        loanAmountTextField = new JTextField();
        interestRateTextField = new JTextField();
        termTextField = new JTextField();
        calculateButton = new JButton("Рассчитать");
        monthlyPaymentLabel = new JLabel("Ежемесячный платеж: ");
        totalPaymentLabel = new JLabel("Общая сумма, которую необходимо оплатить: ");

        JPanel panel = new JPanel(new GridLayout(4, 2));

        panel.add(loanAmountLabel);
        panel.add(loanAmountTextField);
        panel.add(interestRateLabel);
        panel.add(interestRateTextField);
        panel.add(termLabel);
        panel.add(termTextField);
        panel.add(monthlyPaymentLabel);
        panel.add(totalPaymentLabel);

        add(panel, BorderLayout.CENTER);
        add(calculateButton, BorderLayout.SOUTH);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);

        calculateButton.addActionListener(e -> {
            double loanAmount = Double.parseDouble(loanAmountTextField.getText());
            double interestRate = Double.parseDouble(interestRateTextField.getText());
            double term = Double.parseDouble(termTextField.getText());

            double r = (interestRate / 100) / 12;
            double P = (r * loanAmount) / (1 - Math.pow(1 + r, -term));

            monthlyPaymentLabel.setText("Ежемесячный платеж: " + String.format("%.2f", P));
            totalPaymentLabel.setText("Общая сумма, которую необходимо оплатить: " + String.format("%.2f", P * term));
        });
    }

    public static void main(String[] args) {
        new CreditCalculator();
    }

}
