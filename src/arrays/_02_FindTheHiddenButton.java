/*****
 * 
 * Run the FndHdnBtn.jar to play the finished game
 * 
 *****/

package arrays;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
	
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class _02_FindTheHiddenButton implements ActionListener{
	JFrame window;
	JPanel panel;
	
	//1. create an array of JButtons. Don't initialize it yet.
	JButton[] but;
	//2 create an int variable called hiddenButton
	int hiddenButton;
	public static void main(String[] args) {
		new _02_FindTheHiddenButton().start();
	}
	
	public void start() {
		window = new JFrame("Find the Button");
		panel = new JPanel();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//3.  Ask the user to enter a positive number and convert it to an int
		int butCount = Integer.parseInt(JOptionPane.showInputDialog("Enter a positive number"));
		//4. Initialize the array of JButtons to be the size of the int created in step 3
		but = new JButton[butCount];
		//5. Make a for loop to iterate through the JButton array
		for(int i = 0; i<butCount;i++) {
			but[i] = new JButton();
			but[i].addActionListener(this);
			panel.add(but[i]);
		}
			//6. initialize each JButton in the array
			//7. add the ActionListener to each JButton
			//8. add each JButton to the panel
		window.add(panel);
		//9 add the panel to the window
		window.setExtendedState(JFrame.MAXIMIZED_BOTH);
		//10. call setExtendedState(JFrame.MAXIMIZED_BOTH) on your JFrame object.
		window.setVisible(true);
		//11. set the JFrame to visible.
		JOptionPane.showMessageDialog(null, "Welcome to Hidden Buttons! The rules are simple: \n Click the button that is hidden!");
		//12. Give the user the instructions for the game.
		Random ran = new Random();
		hiddenButton = ran.nextInt(butCount);
		//13. initialize the hiddenButton variable to a random number less than the int created in step 3
		but[hiddenButton].setText("ME");
		//14. Set the text of the JButton located at hiddenButton to  "ME"
try {
	Thread.sleep(1000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
		//15. Use Thread.sleep(1000); to pause the program.
		//    Surround it with a try/catch - use Eclipse helper for this
but[hiddenButton].setText("");
		//16. Set the text of the JButton located at hiddenButton to be blank.
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton buttonClicked = (JButton)e.getSource();
		if(buttonClicked==but[hiddenButton]) {
			JOptionPane.showMessageDialog(null, "YOU WINS!");
			System.exit(0);
		}
		else {
			JOptionPane.showMessageDialog(null, "YOU DONT WINS");
			System.exit(0);
		}
		//17. if the hiddenButton is clicked, tell the user that they win.
		
		//18. else tell them to try again
	}
}
