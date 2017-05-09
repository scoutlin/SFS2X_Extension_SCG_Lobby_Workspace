package scott.scg.sfsEventHandler;

import java.util.List;
import java.util.Map;

import com.smartfoxserver.v2.core.ISFSEvent;
import com.smartfoxserver.v2.core.SFSEventParam;
import com.smartfoxserver.v2.entities.User;
import com.smartfoxserver.v2.entities.Zone;
import com.smartfoxserver.v2.exceptions.SFSException;
import com.smartfoxserver.v2.extensions.BaseServerEventHandler;

/**
 * 
 * @author UX303
 *This event is fired when a Buddy Variables are set by a User.
Level: Zone

Parameters:

SFSEventParam.ZONE: the Zone ( Zone )
SFSEventParam.USER: the User ( User )
SFSEventParam.VARIABLES: the Buddy Variables ( List of BuddyVariable )
SFSEventParam.VARIABLES_MAP: the variables as key-value map ( Map of String, BuddyVariable )
 */
public class BuddyVariablesUpdateEventHandler  extends BaseServerEventHandler{

	public void handleServerEvent(ISFSEvent event) throws SFSException {
		// TODO Auto-generated method stub
		
		Zone zone = (Zone)event.getParameter(SFSEventParam.ZONE);
		User user = (User)event.getParameter(SFSEventParam.USER);
		List<String> list = (List<String>)event.getParameter(SFSEventParam.VARIABLES); 
		Map<String, String> map = (Map<String, String>)event.getParameter(SFSEventParam.VARIABLES_MAP);
		
	}

}
