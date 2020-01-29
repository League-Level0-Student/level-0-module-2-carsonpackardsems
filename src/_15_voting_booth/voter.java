package _15_voting_booth;
import javax.swing.JOptionPane;

public class voter {
public static void main(String[] args) {
String height = JOptionPane.showInputDialog("How old are you?");
Integer.parseInt(height);
int heightonum = Integer.parseInt(height);
String prez = "";
if(heightonum >= 18) {
prez = JOptionPane.showInputDialog(null, "Who should be the next president?");	
}
else {
JOptionPane.showMessageDialog(null, "No one cares what you think, you little chicken nugget!");	
}
if(prez.equals("Trump")) {
	JOptionPane.showMessageDialog(null, "You're joking, right?");
}
}
}


