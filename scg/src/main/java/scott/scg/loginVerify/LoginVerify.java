package scott.scg.loginVerify;

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
	
	public  enum Enum_LoginType
	{
		First,
		QuickLogin,
		FBLogin
	}
	
	public class LoginInfo
	{
		
	}
	
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
	
	public Enum_LoginType VerifyWhichTypeLogin(LoginInfo mLoginInfo)
	{
		Enum_LoginType enum_LoginType = Enum_LoginType.First;
	
		return enum_LoginType;
	}
	
	public boolean CreateNewAccount()
	{
		
		return false;
	}
}
