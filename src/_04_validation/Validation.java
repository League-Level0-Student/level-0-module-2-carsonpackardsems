//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

package _04_validation;

import java.util.Random;

import javax.swing.JOptionPane;

public class Validation {
	public static void main(String[] args) {
		for(int i = 0; i < 20; i++) {
		Random randomMaker = new Random();
		
		int randomNumber = randomMaker.nextInt(6);
		
		System.out.println(randomNumber);

		if (randomNumber == 1) {
			JOptionPane.showMessageDialog(null, "You are a fun person.");
		} else if (randomNumber == 2) {
			JOptionPane.showMessageDialog(null, "You are a good person to be around.");
		} else if (randomNumber == 3) {
			JOptionPane.showMessageDialog(null, "You are a stud.");
		} else if (randomNumber == 4) {
			JOptionPane.showMessageDialog(null, "You are a bubbly person.");
		} else if (randomNumber == 5) {
			JOptionPane.showMessageDialog(null, "You are a quokka.");

		// 2. Repeat all the code above 10 times
		
		// 3. Find someone to test out your program. They will like it :)
	}
}
	}
}
