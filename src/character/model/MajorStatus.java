package character.model;

import java.util.ArrayList;

/**
 * MajorStatus Model class
 * @author Deigen Villalobos
 * @version 1.7 Added checker methods        
 */

public class MajorStatus
{
	private ArrayList<String> MajorList;
	private ArrayList<String> StatusList;
	private String major = "";
	private String status = "";
	private String twoCharacters;
	public String translation;
	
	
	public MajorStatus(String twoCharacters)
	{
		this.MajorList = new ArrayList<String>();
		this.StatusList = new ArrayList<String>();
		this.twoCharacters = twoCharacters;
		
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
	
	public String majorChecker(String twoCharacters)
	{
		if (twoCharacters != null && twoCharacters.length() == 2)
		{
			for (String currentMajor : MajorList)
			{
				if (twoCharacters.toLowerCase().contains(currentMajor.substring(0, 0).toLowerCase()))
				{
					major = currentMajor;
				}
			}
		}
		return major;
		
	}
	
	public String statusChecker(String twoCharacters)
	{
		if (twoCharacters != null && twoCharacters.length() == 2)
		{
			for (String currentStatus : StatusList)
			{
				if (twoCharacters.contains(currentStatus.substring(0, 0)))
				{
					status = currentStatus.substring(1, currentStatus.length());
				}
			}
		}
		return status;
	}
	
	public String compileCharacters(String twoCharacters)
	{
		majorChecker(twoCharacters);
		statusChecker(twoCharacters);
		if (major != null && status != null)
		{
			translation = major + " " + status;
		}
		return translation;
	}
	
	//Getters and Setters
	
	public ArrayList<String> getMajorList()
	{
		return MajorList;
	}

	public void setMajorList(ArrayList<String> majorList)
	{
		MajorList = majorList;
	}

	public ArrayList<String> getStatusList()
	{
		return StatusList;
	}

	public void setStatusList(ArrayList<String> statusList)
	{
		StatusList = statusList;
	}

	public String getTranslation()
	{
		return translation;
	}

	public void setTranslation(String translation)
	{
		this.translation = translation;
	}

	public String getTwoCharacters()
	{
		return twoCharacters;
	}

	public void setTwoCharacters(String twoCharacters)
	{
		this.twoCharacters = twoCharacters;
	}
}
