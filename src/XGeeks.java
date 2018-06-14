//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0




import javax.swing.JOptionPane;

/*
* Everyone has a superpower. Mine is writing recipes. This program will store
* the superpowers of all the people in the classroom. E.g. When I type "June",
* your program should say "June's superpower is writing recipes".
*/
public class XGeeks {
public static void main(String[] args) {

		// 1. Save the superpower for each person in a variable.
String John = "Super strength";
String Emilse = "Super smart";
String Kassndra = "Create gold";
String Robert = "Super speed";

String name = JOptionPane.showInputDialog("Enter a name of someone at your table");
if(name.equals("John")) {
	JOptionPane.showMessageDialog(null,"Super strength");
}
	if(name.equals("Emilse")) {
		JOptionPane.showMessageDialog(null,"Super smart");
	}
		if(name.equals("Kassandra")) {
			JOptionPane.showMessageDialog(null, "Create gold");
		}
			if(name.equals("Robert")) {
				JOptionPane.showMessageDialog(null, "Super speed");
			}
		
		
	

		// 2. Ask the user to enter a name. Store their answer in a variable.

		// 3. Show the superpower in a pop-up, depending on the name entered. 

	}
}

