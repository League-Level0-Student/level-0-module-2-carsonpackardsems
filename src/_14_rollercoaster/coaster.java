package _14_rollercoaster;

import javax.swing.JOptionPane;

public class coaster {
public static void main(String[] args) {
String height = JOptionPane.showInputDialog("How tall are you?");
Integer.parseInt(height);
int heightonum = Integer.parseInt(height);
if(heightonum >= 49) {
JOptionPane.showMessageDialog(null, "You can now ride this ride.");	
}
else {
JOptionPane.showMessageDialog(null, "You can't fool me you little chicken nugget!");	
}
}
}
