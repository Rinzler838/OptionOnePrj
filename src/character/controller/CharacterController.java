package character.controller;

import character.model.*;
import character.view.*;

/**
 * Application controller for the OptionOne project.
 * @author Deigen Villalobos
 * @version 1.4 3/14/16 Deleted unnecessary code
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
}
