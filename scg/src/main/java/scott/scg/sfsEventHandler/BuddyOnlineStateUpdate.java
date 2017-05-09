package scott.scg.sfsEventHandler;

import com.smartfoxserver.v2.buddylist.SFSBuddyEventParam;
import com.smartfoxserver.v2.core.ISFSEvent;
import com.smartfoxserver.v2.core.SFSEventParam;
import com.smartfoxserver.v2.entities.User;
import com.smartfoxserver.v2.entities.Zone;
import com.smartfoxserver.v2.exceptions.SFSException;
import com.smartfoxserver.v2.extensions.BaseServerEventHandler;

/**
 * 
 * @author UX303
 *This event is fired when a Buddy changes his online state.
Level: Zone

Parameters:

SFSEventParam.ZONE: the Zone ( Zone )
SFSEventParam.USER: the User( User )
SFSBuddyEventParam.BUDDY_IS_ONLINE: the new state: true == online, false == offline. ( Boolean )
 */
public class BuddyOnlineStateUpdate  extends BaseServerEventHandler{

	public void handleServerEvent(ISFSEvent event) throws SFSException {
		// TODO Auto-generated method stub
		
		Zone zone = (Zone)event.getParameter(SFSEventParam.ZONE);
		User user = (User)event.getParameter(SFSEventParam.USER);
		Boolean buddyIsOnline = (Boolean)event.getParameter(SFSBuddyEventParam.BUDDY_IS_ONLINE);
	}

}
