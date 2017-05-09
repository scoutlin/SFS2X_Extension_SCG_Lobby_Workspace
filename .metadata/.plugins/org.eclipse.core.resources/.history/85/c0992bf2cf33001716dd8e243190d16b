package sfsEventHandler;

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
 *This event is fired when a one or more User Variables are set.
Level: Zone, Room (Room Level added since version 2.8.x)

Parameters:

SFSEventParam.ZONE: the Zone ( Zone )
SFSEventParam.USER: the user setting the variables ( User )
SFSEventParam.VARIABLES: the variables ( List of UserVariable )
SFSEventParam.VARIABLES_MAP: the variables as key-value map ( Map of String, UserVariable )
 */
public class UserVariablesUpdateEventHandler  extends BaseServerEventHandler{

	@Override
	public void handleServerEvent(ISFSEvent event) throws SFSException {
		// TODO Auto-generated method stub
		
		Zone zone = (Zone)event.getParameter(SFSEventParam.ZONE);
		User user = (User)event.getParameter(SFSEventParam.USER);
		List<String> list = (List<String>)event.getParameter(SFSEventParam.VARIABLES);
		Map<String, String> map = (Map<String, String>)event.getParameter(SFSEventParam.VARIABLES_MAP);	
	}

}
