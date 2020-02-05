import javax.swing.JOptionPane;
//complete
public class checkpoint2 {
public static void main(String[] args) {
String Q2 = "";
String Q3 = "";
String Q1 = JOptionPane.showInputDialog("How many bags of flour did you get for the cookies?");
Integer.parseInt(Q1);
int Q1Num = Integer.parseInt(Q1);
if(Q1Num >= 2) {
Q2 = JOptionPane.showInputDialog("How many people are coming over for cookies?");
Integer.parseInt(Q2);
int Q2Num = Integer.parseInt(Q2);
if(Q2Num >= 30) {
Q3 = JOptionPane.showInputDialog("How many batches of cookies did you make?");
Integer.parseInt(Q3);
int Q3Num = Integer.parseInt(Q3);
if(Q3Num == 2) {
JOptionPane.showMessageDialog(null, "You are lucky to have so many friends.");
}
}
else {
JOptionPane.showMessageDialog(null, "You're goind to need more flour.");	
}
}
else {
JOptionPane.showMessageDialog(null, "You're goind to need more cookies.");	
}
}
}