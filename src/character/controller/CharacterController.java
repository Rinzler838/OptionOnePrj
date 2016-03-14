package character.controller;

import character.model.*;
import character.view.*;

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
		myDisplay.showMessage("Please enter your 2 characters (A letter & number) to continue...");
	}
	
	private void shutDown()
	{
		myDisplay.showMessage("Now shutting down...");
		System.exit(0);
	}
	
	public void handleErrors(String errorMessage)
	{
		myDisplay.showMessage(errorMessage);
	}
}
