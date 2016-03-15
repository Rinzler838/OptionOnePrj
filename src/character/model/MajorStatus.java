package character.model;

import java.util.ArrayList;

import character.view.CharacterView;

/**
 * MajorStatus Model class
 * @author Deigen Villalobos
 * @version 1.7 Added checker methods        
 */

public class MajorStatus
{
	private ArrayList<String> MajorList;
	private ArrayList<String> StatusList;
	private CharacterView myDisplay;
	private String major = "";
	private String status = "";
	
	public MajorStatus()
	{
		this.MajorList = new ArrayList<String>();
		this.StatusList = new ArrayList<String>();
		myDisplay = new CharacterView();
		buildMajorList();
		buildStatusList();
	}
	
	private void buildMajorList()
	{
		this.MajorList.add("Administration of IT");
		this.MajorList.add("Network Secutiry");
		this.MajorList.add("Multimedia Management");
		this.MajorList.add("Telecommunications");
		this.MajorList.add("Computer Graphics");
		this.MajorList.add("Artificial Intelligence");
		this.MajorList.add("Web Page Design");
		this.MajorList.add("Software Engineer");
		this.MajorList.add("Desktop Publishing");
		this.MajorList.add("Information Technology");
	}
	
	private void buildStatusList()
	{
		this.StatusList.add("1Freshman");
		this.StatusList.add("2Sophmore");
		this.StatusList.add("3Junior");
		this.StatusList.add("4Senior");
	}	
	
	public String majorChecker(String characterInput)
	{
		if (characterInput != null && characterInput.length() == 2)
		{
			for (String currentMajor : MajorList)
			{
				if (characterInput.toLowerCase().contains(currentMajor.substring(0, 0).toLowerCase()))
				{
					major = currentMajor;
				}
			}
		}
		else
		{
			myDisplay.showMessage("Error 0001: String must be 2 characters long");
		}
		return major;
		
	}
	
	public String statusChecker(String characterInput)
	{
		if (characterInput != null && characterInput.length() == 2)
		{
			for (String currentStatus : StatusList)
			{
				if (characterInput.contains(currentStatus.substring(0, 0)))
				{
					status = currentStatus.substring(1, currentStatus.length());
				}
			}
		}
		else
		{
			myDisplay.showMessage("Error 0001: String must be 2 characters long");
		}
		return status;
		
	}
	
	public String processCharacters(String characterInput)
	{
		String output = "";
		if (major != null && status != null)
		{
			output = major + " " + status;
		}
		return output;
	}
	
	public boolean quitChecker(String characterInput)
	{
		boolean hasQuit = false;
		
		if (characterInput.toLowerCase().equals("quit"))
		{
			hasQuit = true;
		}
		
		return hasQuit;
	}
	
	public ArrayList<String> getMajorList()
	{
		return MajorList;
	}
	
	public ArrayList<String> getStatusList()
	{		
		return StatusList;
	}
}
