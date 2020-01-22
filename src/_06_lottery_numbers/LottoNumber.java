package _06_lottery_numbers;
import java.util.Random;

import javax.swing.JOptionPane;
public class LottoNumber {
public static void main(String[] args) {
	Random ran1 = new Random();
	int num = ran1.nextInt(5);
	System.out.println(ran1);
	Random ran2 = new Random();
	int num2 = ran2.nextInt(5);
	System.out.println(ran2);
	Random ran3 = new Random();
	int num3 = ran3.nextInt(5);
	System.out.println(ran3);
	Random ran4 = new Random();
	int num4 = ran4.nextInt(5);
	System.out.println(ran4);
	Random ran5 = new Random();
	int num5 = ran5.nextInt(5);
	System.out.println(ran5);
	Random cran1 = new Random();
	int cnum = cran1.nextInt(5);
	System.out.println(cran1);
	Random cran2 = new Random();
	int cnum2 = cran2.nextInt(5);
	System.out.println(cran2);
	Random cran3 = new Random();
	int cnum3 = cran3.nextInt(5);
	System.out.println(cran3);
	Random cran4 = new Random();
	int cnum4 = cran4.nextInt(5);
	System.out.println(cran4);
	Random cran5 = new Random();
	int cnum5 = ran5.nextInt(5);
	System.out.println(cran5);
	JOptionPane.showMessageDialog(null, "You got lotto ticket "  + num + num2 + num3 + num4 + num5);
	JOptionPane.showMessageDialog(null, "And the winning numbers are... " + cnum + cnum2 + cnum3 + cnum4 + cnum5);
	if (cnum == num) {
		if (cnum2 == num2) {
			if (cnum3 == num3) {
				if (cnum4 == num4) {
					if (cnum5 == num5) {
					JOptionPane.showMessageDialog(null, "Congrats! You won $1,000,000!");	
					}	
				}	
			}	
		}	
	}
	}
}

