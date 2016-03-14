package character.view;

import javax.swing.JOptionPane;

public class CharacterView
{
	private String windowTitle;
	
	public CharacterView()
	{
		windowTitle = "Major & Status \"Differentiator\" 3000";
	}
	
	/**
	 * Displays a GUI popup for collecting user text with the supplied String.
	 * @param myDisplay The text to show in the popup window. 
	 *  @return The text supplied by the user.
	 */	
	public String characterInput(String displayText)
	{
		String userInput = "";
		userInput = JOptionPane.showInputDialog(null, displayText, windowTitle, JOptionPane.PLAIN_MESSAGE, null, null, "Enter text here...") + "";
		return userInput;
	}
	
	/**
	 * Displays a String to the user with a standard popup.
	 * @param myDisplay The supplied text to be displayed.
	 */	
	public void showMessage(String myDisplay)
	{
		JOptionPane.showMessageDialog(null, myDisplay, windowTitle, JOptionPane.INFORMATION_MESSAGE);
	}
}
