import javafx.scene.text.Font;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.*;
import java.text.Normalizer;
import javax.swing.border.Border;


public class Main {

    JFrame frame;
    JPanel panel;
    JTextField text;
    JButton[] buttons = new JButton[20];
    char[] signs = new char[10];
    String[] values = new String[10];
    double result = 0;
    //Buttons:  ac, plusMinus, percent, divide, num7, num8, num9,
    // multiply, num4, num5, num6, subtract, num1, num2, num3, add, zero, coma, equal
   /* JButton ac ;  JButton plusMinus; JButton percent; JButton divide;
    JButton num7; JButton num8;      JButton num9;    JButton multiply;
    JButton num4; JButton num5;      JButton num6;    JButton subtract;
    JButton num1; JButton num2;      JButton num3;    JButton add;
    JButton zero;                    JButton coma;    JButton equal;*/
    //

    Main() {
        frame = new JFrame("Calculator");
        panel = new JPanel();
        frame.setSize(300, 450);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        panel.setLayout(null);

        JTextField text = new JTextField(25);
        text.setBounds(0, 0, 300, 35);
        panel.add(text);


        createButtons();
        setBoundsOfButtons();
        changeColorStyleOfButtons();
        addButtonstoPanel();
        buttons[4].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                if (event.getSource() == buttons[4]) {
                    if (text.getText().length() != 0) {
                        if (result == Double.parseDouble(text.getText())) {
                            text.setText("");
                        }
                    }
                    text.setText(text.getText() + "7");
                }
            }
        });
        buttons[5].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                if (event.getSource() == buttons[5]) {
                    if (text.getText().length() != 0) {
                        if (result == Double.parseDouble(text.getText())) {
                            text.setText("");
                        }
                    }
                    text.setText(text.getText() + "8");
                }
            }
        });
        buttons[6].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                if (event.getSource() == buttons[6]) {
                    if (text.getText().length() != 0) {
                        if (result == Double.parseDouble(text.getText())) {
                            text.setText("");
                        }
                    }
                    text.setText(text.getText() + "9");
                }
            }
        });
        buttons[8].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                if (event.getSource() == buttons[8]) {
                    if (text.getText().length() != 0) {
                        if (result == Double.parseDouble(text.getText())) {
                            text.setText("");
                        }
                    }
                    text.setText(text.getText() + "4");
                }
            }
        });
        buttons[9].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                if (event.getSource() == buttons[9]) {
                    if (text.getText().length() != 0) {
                        if (result == Double.parseDouble(text.getText())) {
                            text.setText("");
                        }
                    }
                    text.setText(text.getText() + "5");
                }
            }
        });
        buttons[10].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                if (event.getSource() == buttons[10]) {
                    if (text.getText().length() != 0) {
                        if (result == Double.parseDouble(text.getText())) {
                            text.setText("");
                        }
                    }
                    text.setText(text.getText() + "6");
                }
            }
        });
        buttons[12].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                if (event.getSource() == buttons[12]) {
                    if (text.getText().length() != 0) {
                        if (result == Double.parseDouble(text.getText())) {
                            text.setText("");
                        }
                    }
                    text.setText(text.getText() + "1");
                }
            }
        });
        buttons[13].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                if (event.getSource() == buttons[13]) {
                    if (text.getText().length() != 0) {
                        if (result == Double.parseDouble(text.getText())) {
                            text.setText("");

                        }
                    }
                    text.setText(text.getText() + "2");
                }
            }
        });
            @Override
            public void actionPerformed(ActionEvent event) {
                if (event.getSource() == buttons[14]) {
                    if (text.getText().length() != 0) {
                        if (result == Double.parseDouble(text.getText())) {
                            text.setText("");
                        }
                    }
                    text.setText(text.getText() + "3");
                }
            }
        });
        buttons[16].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                if (event.getSource() == buttons[16]) {
                    if (text.getText().length() != 0) {
                        if (result == Double.parseDouble(text.getText())) {
                            text.setText("");
                        }
                    }
                    double len = text.getText().length();
                    if (len > 0) {
                        text.setText(text.getText() + "0");
                    }

                }
            }
        });
        buttons[18].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                if (event.getSource() == buttons[18]) {
                    if (result == Double.parseDouble(text.getText())) {
                        text.setText("");
                    }
                    double len = text.getText().length();
                    if (len > 0) {
                        text.setText(text.getText() + ".");
                    }

                }
            }
        });
        buttons[0].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                if (event.getSource() == buttons[0]) {
                    text.setText("");
                }
            }
        });
        buttons[1].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                if (event.getSource() == buttons[1]) {
                    String initialtext = text.getText();
                    int numOfLastSymbol = initialtext.length() - 1;
                    String futuretext = initialtext.substring(0, numOfLastSymbol);
                    text.setText(futuretext);
                }
            }
        });
        buttons[2].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                if (event.getSource() == buttons[2]) {
                    text.setText("-" + text.getText());
                }
            }
        });
        buttons[3].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                if (event.getSource() == buttons[3]) {
                    addValue(text.getText());
                    addSign('/');
                    text.setText("");
                }
            }
        });
        buttons[7].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                if (event.getSource() == buttons[7]) {
                    addValue(text.getText());
                    addSign('*');
                    text.setText("");
                }
            }
        });
        buttons[11].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                if (event.getSource() == buttons[11]) {
                    addValue(text.getText());
                    addSign('-');
                    text.setText("");
                }
            }
        });
        buttons[15].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                if (event.getSource() == buttons[15]) {
                    addValue(text.getText());
                    addSign('+');
                    text.setText("");
                }
            }
        });
        buttons[19].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                if (event.getSource() == buttons[19]) {
                    addValue(text.getText());
                    addSign('=');
                    result = calculateResult();
                    System.out.println(result);
                    text.setText(result + "");
                    cleanSigns();
                    cleanValues();

                }
            }
        });
        text.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                if (event.getSource() == text) {


                }
            }

        });
        TheHandler handler = new TheHandler();


        JLabel label = new JLabel();

        frame.setVisible(true);


    }

    public void addSign(char c) {
        int i = 0;
        while (signs[i] != '\u0000') {
            i++;
        }
        signs[i] = c;
    }

    public void addValue(String s) {
        int i = 0;
        while (values[i] != null) {
            i++;
        }
        ;
        values[i] = s;
    }

    public void cleanSigns() {
        int i = 0;
        while (signs[i] != '\u0000') {
            signs[i] = '\u0000';
            i++;
        }

    }

    public void cleanValues() {
        int i = 0;
        while (values[i] != null) {
            values[i] = null;
            i++;
        }
        ;

    }

    public double calculateResult() {
        double result1 = 0;
        boolean numeric = true;
        try {
            result1 = Double.parseDouble(values[0]);
        } catch (NumberFormatException e) {
            numeric = false;
        }
        int i = 0;
        while (signs[i] != '=') {
            if (signs[i] == '+') {
                try {
                    result1 += Double.parseDouble(values[i + 1]);
                } catch (NumberFormatException e) {
                    numeric = false;
                }
            } else if (signs[i] == '-') {
                try {
                    result1 -= Double.parseDouble(values[i + 1]);
                } catch (NumberFormatException e) {
                    numeric = false;
                }
            } else if (signs[i] == '*') {
                try {
                    result1 *= Double.parseDouble(values[i + 1]);
                } catch (NumberFormatException e) {
                    numeric = false;
                }
            } else if (signs[i] == '/') {
                try {
                    result1 /= Double.parseDouble(values[i + 1]);
                } catch (NumberFormatException e) {
                    numeric = false;
                }
            }
            i++;
        }
        if (!numeric)
            result1 = 0;
        return result1;
    }

    void changeColorStyleOfButtons() {
        buttons[0].setBackground(Color.orange);
        buttons[1].setBackground(Color.orange);
        buttons[2].setBackground(Color.orange);
        buttons[3].setBackground(Color.orange);
        buttons[7].setBackground(Color.orange);
        buttons[11].setBackground(Color.orange);
        buttons[15].setBackground(Color.orange);
        buttons[19].setBackground(Color.orange);

    }

    public void addButtonstoPanel() {
        for (int i = 0; i < 20; i++) {

            panel.add(buttons[i]);

        }
    }

    public void setBoundsOfButtons() {
        int row = 75;
        int column = 71;
        int textfield = 35;
        int i = 0;
        for (int x = 0; x < 5; x++) {
            for (int y = 0; y < 4; y++) {
                if (i != 20) {
                    if (x == 4 && y == 0) {
                        buttons[i].setBounds(y * column, x * row + textfield, column * 2, row);
                    } else {
                        buttons[i].setBounds(y * column, x * row + textfield, column, row);
                    }
                    i++;
                }
            }

        }

    }

    public void createButtons() {
        String[] names = {"AC", "C", "+/-", "/", "7", "8", "9", "*", "4", "5", "6", "-", "1", "2", "3", "+", "0", " ", ",", "="};//20 buttons

        for (int i = 0; i < 20; i++) {
            buttons[i] = new JButton(names[i]);
        }

    }

    public static void main(String[] args) {
        Main main = new Main();
    }

    class TheHandler implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent event) {
            if (event.getSource() == buttons[4]) {
                text.setText("7sdfsd");
            }
            if (event.getSource() == buttons[5]) {
                text.setText("8dsfds");
            }
        }
    }

}
