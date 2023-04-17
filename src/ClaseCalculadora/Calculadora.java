package ClaseCalculadora;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Calculadora extends JFrame implements ActionListener {

	 public static void main(String[] args) {
	        new Calculadora();
	    }
	
    private JTextField num1Field, num2Field, resultadoField;
    private JButton sumaButton, restaButton, multButton, divButton;

    public Calculadora() {
        super("Calculadora");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);

        num1Field = new JTextField(10);
        num2Field = new JTextField(10);
        resultadoField = new JTextField(10);
        resultadoField.setEditable(false);

        sumaButton = new JButton("+");
        restaButton = new JButton("-");
        multButton = new JButton("*");
        divButton = new JButton("/");

        JPanel panel = new JPanel(new GridLayout(4, 2));
        panel.add(new JLabel("Número 1:"));
        panel.add(num1Field);
        panel.add(new JLabel("Número 2:"));
        panel.add(num2Field);
        panel.add(new JLabel("Resultado:"));
        panel.add(resultadoField);
        panel.add(sumaButton);
        panel.add(restaButton);
        panel.add(multButton);
        panel.add(divButton);

        sumaButton.addActionListener(this);
        restaButton.addActionListener(this);
        multButton.addActionListener(this);
        divButton.addActionListener(this);

        add(panel);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        double num1 = Double.parseDouble(num1Field.getText());
        double num2 = Double.parseDouble(num2Field.getText());
        double resultado = 0;

        if (e.getSource() == sumaButton) {
            resultado = num1 + num2;
        } else if (e.getSource() == restaButton) {
            resultado = num1 - num2;
        } else if (e.getSource() == multButton) {
            resultado = num1 * num2;
        } else if (e.getSource() == divButton) {
            resultado = num1 / num2;
        }

        resultadoField.setText("" + resultado);
    }

   
}

