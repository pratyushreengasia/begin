package pratyush;


import java.awt.*;
import java.awt.event.*;
import java.util.Arrays;
import javax.swing.*;
import javax.swing.border.LineBorder;

public class calculator {
    int boardWidth = 360;
    int boardHeight = 540;

    Color customLightGray = new Color(212, 212,210);
    Color customDarkGray = new Color(80,80,80);
    Color customBlack = new Color(28,28,28);
    Color customOrange = new Color(255,149,0);

    String[] buttonValues = {
            "AC", "+/-", "%", "÷",
            "7", "8", "9", "×",
            "4", "5", "6", "-",
            "1", "2", "3", "+",
            "0", ".", "√", "="
    };
    String[] rightSymbols = {"÷", "×", "-", "+", "="};
    String[] topSymbols = {"AC", "+/-", "%"};

    JFrame frame = new JFrame("calculator");
    JLabel displayLabel = new JLabel();
    JPanel displayPanel = new JPanel();
    JPanel buttonsPanel = new JPanel();

    calculator() {
         frame.setVisible(true);
         frame.setSize(boardWidth, boardHeight);
         frame.setLocationRelativeTo(null);
         frame.setResizable(true);
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.setLayout(new BorderLayout());

         displayLabel.setBackground(customBlack);
         displayLabel.setForeground(Color.white);
         displayLabel.setFont(new Font("Arial", Font.PLAIN, 80));
         displayLabel.setHorizontalAlignment(JLabel.RIGHT);
         displayLabel.setText("0");
         displayLabel.setOpaque(true);

         displayPanel.setLayout(new BorderLayout());
         displayPanel.add(displayLabel);
         frame.add(displayPanel, BorderLayout.NORTH);

         buttonsPanel.setLayout(new GridLayout(5, 4));
         buttonsPanel.setBackground(customBlack);
         frame.add(buttonsPanel);

        for (String value : buttonValues) {
            JButton button = new JButton();
            button.setFont(new Font("Arial", Font.PLAIN, 30));
            button.setText(value);
            button.setFocusable(false);
            buttonsPanel.add(button);
        }
    }
}
