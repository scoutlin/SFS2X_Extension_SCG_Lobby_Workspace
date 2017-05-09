package scott.scg.sfsEventHandler;

import com.smartfoxserver.v2.buddylist.BuddyList;
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
 *	This event is fired when a User initializes his Buddy List. The initialization is necessary in order to populate the Buddy List with the data saved in the last session (list of buddies, state, variables etc...)
	Level: Zone

	Parameters:

	SFSEventParam.ZONE: the Zone ( Zone )
	SFSEventParam.USER: the owner of the Buddy List ( User )
	SFSBuddyEventParam.BUDDY_LIST: the User's BuddyList ( BuddyList )
 */
public class BuddyListInitEventHandler  extends BaseServerEventHandler{

	public void handleServerEvent(ISFSEvent event) throws SFSException {
		// TODO Auto-generated method stub
		Zone zone = (Zone)event.getParameter(SFSEventParam.ZONE);
		User user = (User)event.getParameter(SFSEventParam.USER);
		BuddyList buddyList = (BuddyList)event.getParameter(SFSBuddyEventParam.BUDDY_LIST);
				
	}

}
