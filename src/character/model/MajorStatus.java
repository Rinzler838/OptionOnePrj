package character.model;

import java.util.ArrayList;
import character.view.CharacterView;

public class MajorStatus
{
	private ArrayList<String> majorList;
	private ArrayList<String> statusList;
	private CharacterView myDisplay;
	
	public MajorStatus()
	{
		this.majorList = new ArrayList<String>();
		this.statusList = new ArrayList<String>();
		myDisplay = new CharacterView();
		buildMajorList();
		buildStatusList();
	}
	
	private void buildMajorList()
	{
		this.majorList.add("A");
		this.majorList.add("B");
		this.majorList.add("C");
		this.majorList.add("E");
		this.majorList.add("H");
		this.majorList.add("L");
		this.majorList.add("M");
		this.majorList.add("P");
		this.majorList.add("R");
		this.majorList.add("S");
		this.majorList.add("T");
	}
	
	private void buildStatusList()
	{
		this.statusList.add("1");
		this.statusList.add("2");
		this.statusList.add("3");
		this.statusList.add("4");
	}
	
	public String majorChecker(String characterInput)
	{
		String major = "";
		
		if (characterInput != null && characterInput.length() > 1 && characterInput.length() < 3)
		{
			for (String currentMajor : majorList)
			{
				if (characterInput.toLowerCase().contains(currentMajor.toLowerCase()))
				{
					major = currentMajor;
				}
			}
		}
		else
		{
			myDisplay.showMessage("Error 0001: String must be 2 characters long");
		}
		return characterInput;
		
	}
	
	public String statusChecker(String characterInput)
	{
		String status = "";
		
		if (characterInput != null && characterInput.length() > 1 && characterInput.length() < 3)
		{
			for (String currentStatus : statusList)
			{
				if (characterInput.contains(currentStatus))
				{
					status = currentStatus;
				}
			}
		}
		else
		{
			myDisplay.showMessage("Error 0001: String must be 2 characters long");
		}
		return characterInput;
		
	}
	
	public String processCharacters(String characterInput)
	{
		return characterInput;
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
}
