package tictactoe;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TicTacToe extends JFrame implements ActionListener {
JLabel label = new JLabel("player O's turn",SwingConstants.CENTER);
JButton b1 = new JButton();
JButton b2 = new JButton();
JButton b3 = new JButton();
JButton b4 = new JButton();
JButton b5 = new JButton();
JButton b6 = new JButton();
JButton b7 = new JButton();
JButton b8 = new JButton();
JButton b9 = new JButton();
JPanel p = new JPanel();
JButton retry = new JButton("Retry");
boolean signal = true;
public TicTacToe() {
super("tic-tac-toe");
setSize(500,500);
setLayout(new BorderLayout());
setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
setResizable(false);
p.setLayout(new GridLayout(3,3));
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
b5.addActionListener(this);
b6.addActionListener(this);
b7.addActionListener(this);
b8.addActionListener(this);
b9.addActionListener(this);
p.add(b1);p.add(b2);p.add(b3);p.add(b4);p.add(b5); p.add(b6);p.add(b7);p.add(b8);p.add(b9);
add(label, BorderLayout.NORTH);
add(p, BorderLayout.CENTER);
retry.addActionListener(this);
add(retry, BorderLayout.SOUTH);
setVisible(true);

}
public void actionPerformed(ActionEvent ae){
if(ae.getSource() == b1){
if(signal){
printO(b1);
}
else {
printX(b1);
}
}
if(ae.getSource() == b2){
if(signal){
printO(b2);
}
else {
printX(b2);
}
}
if(ae.getSource() == b3){
if(signal){
printO(b3);
}
else {
printX(b3);
}
}
if(ae.getSource() == b4){
if(signal){
printO(b4);
}

else {
printX(b4);
}
}
if(ae.getSource() == b5){
if(signal){
printO(b5);
}
else {
printX(b5);
}
}
if(ae.getSource() == b6){
if(signal){
printO(b6);
}
else {
printX(b6);
}
}
if(ae.getSource() == b7){
if(signal){
printO(b7);
}
else {
printX(b7);
}
}
if(ae.getSource() == b8){
if(signal){
printO(b8);
}
else {
printX(b8);
}
}
if(ae.getSource() == b9){
if(signal){
printO(b9);
}
else {
printX(b9);
}
}
if((b1.getText() == "O" && b2.getText() == "O" && b3.getText() == "O") || (b4.getText() == "O" && b5.getText() == "O" && b6.getText() == "O") || (b7.getText() == "O" && b8.getText() == "O" && b9.getText() == "O") || (b1.getText() == "O" && b4.getText() == "O" && b7.getText() == "O") || (b2.getText() == "O" && b5.getText() == "O" && b8.getText() == "O") || (b3.getText() == "O" && b6.getText() == "O" && b9.getText() == "O") || (b1.getText() == "O" && b5.getText() == "O" && b9.getText() == "O") || (b3.getText() == "O" && b5.getText() == "O" && b7.getText() == "O")){
label.setText("Player \"O\" is the winner");
b1.setEnabled(false);
b2.setEnabled(false);
b3.setEnabled(false);
b4.setEnabled(false);
b5.setEnabled(false);
b6.setEnabled(false);
b7.setEnabled(false);
b8.setEnabled(false);
b9.setEnabled(false);
}
if((b1.getText() == "X" && b2.getText() == "X" && b3.getText() == "X") || (b4.getText() == "X" && b5.getText() == "X" && b6.getText() == "X") || (b7.getText() == "X" && b8.getText() == "X" && b9.getText() == "X") || (b1.getText() == "X" && b4.getText() == "X" && b7.getText() == "X") || (b2.getText() == "X" && b5.getText() == "X" && b8.getText() == "X") || (b3.getText() == "X" && b6.getText() == "X" && b9.getText() == "X") || (b1.getText() == "X" && b5.getText() == "X" && b9.getText() == "X") || (b3.getText() == "X" && b5.getText() == "X" && b7.getText() == "X")){
label.setText("Player \"X\" is the winner");
b1.setEnabled(false);
b2.setEnabled(false);
b3.setEnabled(false);
b4.setEnabled(false);
b5.setEnabled(false);
b6.setEnabled(false);
b7.setEnabled(false);
b8.setEnabled(false);
b9.setEnabled(false);
}
if(!b1.isEnabled() && !b2.isEnabled() && !b3.isEnabled() && !b4.isEnabled() && !b5.isEnabled() && !b6.isEnabled() && !b7.isEnabled() && !b8.isEnabled() && !b9.isEnabled() && !(label.getText() == "Player \"X\" is the winner") && !(label.getText() == "Player \"O\" is the winner")){
label.setText("Tie");
}

if(ae.getSource() == retry){
b1.setEnabled(true);
b2.setEnabled(true);
b3.setEnabled(true);
b4.setEnabled(true);
b5.setEnabled(true);
b6.setEnabled(true);
b7.setEnabled(true);
b8.setEnabled(true);
b9.setEnabled(true);
b1.setText(null);
b2.setText(null);
b3.setText(null);
b4.setText(null);
b5.setText(null);
b6.setText(null);
b7.setText(null);
b8.setText(null);
b9.setText(null);
label.setText("player O's turn");
signal = true;
}

}
public void printO(JButton b){
b.setText("O");
signal = !signal;
b.setEnabled(false);
label.setText("player X's turn");
}
public void printX(JButton b){
b.setText("X");
signal = !signal;
b.setEnabled(false);
label.setText("player O's turn");
}
public static void main(String[]args) {
new TicTacToe();

}


}