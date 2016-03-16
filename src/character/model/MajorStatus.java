package character.model;

import java.util.ArrayList;

/**
 * MajorStatus Model class
 * @author Deigen Villalobos
 * @version 1.9 3/15/16 Fixed code in for loops.
 */

public class MajorStatus
{
	private ArrayList<String> majorList;
	private ArrayList<String> statusList;
	private String major;
	private String status;
	private String twoCharacters;
	public String translation;
	
	
	public MajorStatus(String twoCharacters)
	{
		this.majorList = new ArrayList<String>();
		this.statusList = new ArrayList<String>();
		this.twoCharacters = twoCharacters;

		buildMajorList();
		buildStatusList();
	}
	
	private void buildMajorList()
	{
		this.majorList.add("Administration of IT-");
		this.majorList.add("Network Secutiry-");
		this.majorList.add("Multimedia Management-");
		this.majorList.add("Telecommunications-");
		this.majorList.add("Computer Graphics-");
		this.majorList.add("Artificial Intelligence-");
		this.majorList.add("Web Page Design-");
		this.majorList.add("Software Engineer-");
		this.majorList.add("Desktop Publishing-");
		this.majorList.add("Information Technology-");
	}
	
	private void buildStatusList()
	{
		this.statusList.add("1Freshman");
		this.statusList.add("2Sophmore");
		this.statusList.add("3Junior");
		this.statusList.add("4Senior");
	}	
	
	public String majorChecker(String twoCharacters)
	{
		if (twoCharacters.length() == 2)
		{
			for (int currentMajor = 0; currentMajor < majorList.size(); currentMajor++)
			{
				if (twoCharacters.contains(majorList.get(currentMajor).substring(0, 0)))
				{
					major = majorList.get(currentMajor);
				}
				else
				{
					major = "(Non-real Character";
				}
			}
		}
		else
		{
			major = "(Non-real Entry";
		}
		return major;
	}
	
	public String statusChecker(String twoCharacters)
	{
		if (twoCharacters.length() == 2)
		{
			for (int currentStatus = 0; currentStatus < statusList.size(); currentStatus++)
			{
				if (twoCharacters.contains(statusList.get(currentStatus).substring(0, 0)))
				{
					status = statusList.get(currentStatus).substring(1, statusList.get(currentStatus).length());
				}
				else
				{
					status = " - Please Try Again)";
				}
			}
		}
		else
		{
			status = " - Please Try Again)";
		}
		return status;
	}
	
	public String compileCharacters(String twoCharacters)
	{
		majorChecker(twoCharacters);
		statusChecker(twoCharacters);
		
		if (major != null && status != null)
		{
			translation = major + status;
		}
		return translation;
	}

	public String getTranslation()
	{
		majorChecker(twoCharacters);
		statusChecker(twoCharacters);
		compileCharacters(twoCharacters);
		return translation;
	}
}	

