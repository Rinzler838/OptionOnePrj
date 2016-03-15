package character.controller;

import character.model.*;
import character.view.*;

/**
 * Application controller for the OptionOne project.
 * @author Deigen Villalobos
 * @version 1.3 3/7/16 Added code to start() method
 */

public class CharacterController
{
	private MajorStatus myMS;
	private CharacterView myDisplay;
	
	public CharacterController()
	{
		myDisplay = new CharacterView();
		String twoCharacters = myDisplay.characterInput("Please enter your 2 characters (A letter & a number) to continue...");
		myMS = new MajorStatus(twoCharacters);
	}
	
	public void start()
	{
		myDisplay.showMessage("Translation: " + myMS.getTranslation());
	}
	
	public String processCharacters(String characterText)
	{
		String response = "";
		response = myMS.compileCharacters(characterText);
		return response;
	}
	
	public void handleErrors(String errorMessage)
	{
		myDisplay.showMessage(errorMessage);
	}
}
