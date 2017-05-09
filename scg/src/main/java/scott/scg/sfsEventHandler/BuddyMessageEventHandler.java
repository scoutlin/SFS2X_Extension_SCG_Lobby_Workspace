package scott.scg.sfsEventHandler;

import com.smartfoxserver.v2.buddylist.Buddy;
import com.smartfoxserver.v2.core.ISFSEvent;
import com.smartfoxserver.v2.core.SFSEventParam;
import com.smartfoxserver.v2.entities.User;
import com.smartfoxserver.v2.entities.Zone;
import com.smartfoxserver.v2.entities.data.ISFSObject;
import com.smartfoxserver.v2.exceptions.SFSException;
import com.smartfoxserver.v2.extensions.BaseServerEventHandler;

/**
 * 
 * @author UX303
 *This event is fired when a Buddy Message is sent between two Buddies.
Level: Zone

Parameters:

SFSEventParam.ZONE: the Zone ( Zone )
SFSEventParam.USER: the owner of the Buddy List ( User )
SFSEventParam.RECIPIENT: the blocked Buddy ( Buddy )
SFSEventParam.MESSAGE: the blocked Buddy ( String )
SFSEventParam.OBJECT: the message ( ISFSObject )
 */
public class BuddyMessageEventHandler  extends BaseServerEventHandler{

	public void handleServerEvent(ISFSEvent event) throws SFSException {
		// TODO Auto-generated method stub
		Zone zone = (Zone)event.getParameter(SFSEventParam.ZONE);
		User user = (User)event.getParameter(SFSEventParam.USER);
		Buddy buddy = (Buddy)event.getParameter(SFSEventParam.RECIPIENT);
		String Message = (String)event.getParameter(SFSEventParam.MESSAGE);
		ISFSObject mISFSObject = (ISFSObject)event.getParameter(SFSEventParam.OBJECT);
		
		
	}

}
