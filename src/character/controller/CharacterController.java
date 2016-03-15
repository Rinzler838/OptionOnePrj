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
		myMS = new MajorStatus();
	}
	
	public void start()
	{
		myDisplay.characterInput("Please enter your 2 characters (A letter & number) to continue...");
	}
	
	public String userToCheckers(String characterText)
	{
		String response = "";
		if (myMS.quitChecker(characterText))
		{
			shutDown();
		}
		response = myMS.processCharacters(characterText);
		return response;
	}
	
	private void shutDown()
	{
		myDisplay.showMessage("Now shutting down...");
		System.exit(0);
	}
}
