//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0


package _05_magic_8_ball;

import java.util.Random;

import javax.swing.JOptionPane;

public class Magic8Ball {
public static void main(String[] args) {
	Random randomMaker = new Random();
	
	int randomNumber = randomMaker.nextInt(4);
	String input = JOptionPane.showInputDialog("What is your question, mortal?");
	System.out.println(randomNumber);
	// 3. Print out this variable
	if (randomNumber == 0) {
	JOptionPane.showMessageDialog(null,  "Yes, swine.");
} else if (randomNumber == 1) {
	JOptionPane.showMessageDialog(null, "No, swine.");
} else if (randomNumber == 2) {
	JOptionPane.showMessageDialog(null, "Maybe you should ask Google and Thummum, you incompitent <bleep>?");
} else if (randomNumber == 3) {
	JOptionPane.showMessageDialog(null, "Figure it out, doofus.");
}
}
}
