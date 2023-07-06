import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

class TicTacToeGame implements ActionListener {
    int label = 1;
    int flag = 0;
    int btn;
    JButton[] board;
    JFrame frame;
    JButton b;

    public TicTacToeGame() {
        frame = new JFrame("Tic Tac Toe Game");
        board = new JButton[9];
        Font myFont = new Font("Sans", Font.BOLD, 30);

        JPanel panel = new JPanel();
        panel.setBounds(10, 10, 200, 200);
        panel.setLayout(new GridLayout(3, 3, 4, 4));

        b = new JButton("New Game");
        b.setBounds(60, 230, 100, 30);
        b.setFocusable(false);
        b.addActionListener(this);
        for (int i = 0; i < 9; i++) {
            board[i] = new JButton();
            panel.add(board[i]);
            board[i].addActionListener(this);
            board[i].setFont(myFont);
            ;
            board[i].setFocusable(false);

        }

        frame.add(panel);
        frame.add(b);
        frame.setDefaultCloseOperation(3);
        frame.setSize(250, 310);
        frame.setLayout(null);
        frame.setResizable(false);
        frame.setVisible(true);

    }

    public static void main(String[] args) {
        new TicTacToeGame();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == b) {
            btn = 100;
            for (int i = 0; i <= 8; i++) {
                board[i].setText("");
            }
            flag = 0;
            label = 1;
        }
        if (e.getSource() == board[0]) {
            btn = 0;
        } else if (e.getSource() == board[1]) {
            btn = 1;
        } else if (e.getSource() == board[2]) {
            btn = 2;
        } else if (e.getSource() == board[3]) {
            btn = 3;
        } else if (e.getSource() == board[4]) {
            btn = 4;
        } else if (e.getSource() == board[5]) {
            btn = 5;
        } else if (e.getSource() == board[6]) {
            btn = 6;
        } else if (e.getSource() == board[7]) {
            btn = 7;
        } else if (e.getSource() == board[8]) {
            btn = 8;
        }

        if (flag == 0 && label <= 9 && btn <= 8) {
            if (label % 2 == 1) {
                if (board[btn].getText().equals("")) {
                    board[btn].setText("X");
                    label++;
                }
            } else {
                if (board[btn].getText().equals("")) {
                    board[btn].setText("O");
                    board[btn].setForeground(Color.RED);
                    label++;
                }

            }

            checkWinMethod();
        }

        if (label == 10)
            JOptionPane.showMessageDialog(frame, "Match Drawn");

    }

    public void checkWinMethod() {

        // Checking X Rows
        if (board[0].getText().equals("X") && board[1].getText().equals("X") && board[2].getText().equals("X")) {
            JOptionPane.showMessageDialog(frame, "X is the winner");
            flag = 1;

        }

        if (board[3].getText().equals("X") && board[4].getText().equals("X") && board[5].getText().equals("X")) {
            JOptionPane.showMessageDialog(frame, "X is the winner");
            flag = 1;
        }

        if (board[6].getText().equals("X") && board[7].getText().equals("X") && board[8].getText().equals("X")) {
            JOptionPane.showMessageDialog(frame, "X is the winner");
            flag = 1;
        }

        // Checking X Columns
        if (board[0].getText().equals("X") && board[3].getText().equals("X") && board[6].getText().equals("X")) {
            JOptionPane.showMessageDialog(frame, "X is the winner");
            flag = 1;

        }

        if (board[1].getText().equals("X") && board[4].getText().equals("X") && board[7].getText().equals("X")) {
            JOptionPane.showMessageDialog(frame, "X is the winner");
            flag = 1;

        }

        if (board[2].getText().equals("X") && board[5].getText().equals("X") && board[8].getText().equals("X")) {
            JOptionPane.showMessageDialog(frame, "X is the winner");
            flag = 1;

        }

        // Checking X Diagonals
        if (board[0].getText().equals("X") && board[4].getText().equals("X") && board[8].getText().equals("X")) {
            JOptionPane.showMessageDialog(frame, "X is the winner");
            flag = 1;
        }

        if (board[2].getText().equals("X") && board[4].getText().equals("X") && board[6].getText().equals("X")) {
            JOptionPane.showMessageDialog(frame, "X is the winner");
            flag = 1;
        }

        // Checking O Rows
        if (board[0].getText().equals("O") && board[1].getText().equals("O") && board[2].getText().equals("O")) {
            JOptionPane.showMessageDialog(frame, "O is the winner");
            flag = 1;
        }

        if (board[3].getText().equals("O") && board[4].getText().equals("O") && board[5].getText().equals("O")) {
            JOptionPane.showMessageDialog(frame, "O is the winner");
            flag = 1;
        }

        if (board[6].getText().equals("O") && board[7].getText().equals("O") && board[8].getText().equals("O")) {
            JOptionPane.showMessageDialog(frame, "O is the winner");
            flag = 1;
        }

        // Checking O Columns
        if (board[0].getText().equals("O") && board[3].getText().equals("O") && board[6].getText().equals("O")) {
            JOptionPane.showMessageDialog(frame, "O is the winner");
            flag = 1;

        }

        if (board[1].getText().equals("O") && board[4].getText().equals("O") && board[7].getText().equals("O")) {
            JOptionPane.showMessageDialog(frame, "O is the winner");
            flag = 1;

        }

        if (board[2].getText().equals("O") && board[5].getText().equals("O") && board[8].getText().equals("O")) {
            JOptionPane.showMessageDialog(frame, "X is the winner");
            flag = 1;

        }

        // Checking O Diagonals
        if (board[0].getText().equals("O") && board[4].getText().equals("O") && board[8].getText().equals("O")) {
            JOptionPane.showMessageDialog(frame, "O is the winner");
            flag = 1;
        }

        if (board[2].getText().equals("O") && board[4].getText().equals("O") && board[6].getText().equals("O")) {
            JOptionPane.showMessageDialog(frame, "O is the winner");
            flag = 1;
        }

    }

}