package scott.scg.login;

import scott.scg.SFS2X_DataStruct.CommonDataStruct.LoginDataSruct;

/**
 * 
 * @author UX303
 * 1. Check if first time Login? Yes => I, No => II
 * I-1. Create new ID for user and send back to user. then move user to LoginRoom.
 * II. Check the user ID, and verify its password, if OK move user to LoginRoom.
 * 
 */
public class LoginVerify
{
	public static LoginVerify mLoginVerify;
	private static long testCount = 0;
	
	public LoginVerify()
	{
		
	}
	
	public static LoginVerify GetInstance()
	{
		if(mLoginVerify == null)
		{
			mLoginVerify = new LoginVerify();
			return mLoginVerify;
		}
		else
		{
			return mLoginVerify;
		}
	}
	
	public void StartVerifyLogin(LoginDataSruct mLoginDataSruct)
	{
		if(mLoginDataSruct.serverToken == "")
		{
			//First Login or Data be Delete
			//Retrieve data from DataBase 
			
			//Test
			
		}
		else
		{
			//Login with token
			//Retrieve data from DataBase and compare
		}
	}
	
	public boolean CreateNewAccount()
	{
		
		return false;
	}
}
