package sfsEventHandler;

import com.smartfoxserver.v2.core.ISFSEvent;
import com.smartfoxserver.v2.core.SFSEventParam;
import com.smartfoxserver.v2.entities.Room;
import com.smartfoxserver.v2.entities.User;
import com.smartfoxserver.v2.entities.Zone;
import com.smartfoxserver.v2.entities.data.ISFSObject;
import com.smartfoxserver.v2.exceptions.SFSException;
import com.smartfoxserver.v2.extensions.BaseServerEventHandler;

/**
 * 
 * @author UX303
 *This event is fired when a private message is sent by a client.
Level: Zone

Parameters:

SFSEventParam.ZONE: the Zone ( Zone )
SFSEventParam.ROOM: the Room ( Room )
SFSEventParam.USER: the sender of the message ( User )
SFSEventParam.RECIPIENT: the recipient of the message ( User )
SFSEventParam.MESSAGE: the message ( String )
SFSEventParam.OBJECT: the message ( ISFSObject )
 */
public class PrivateMessageEventHandler  extends BaseServerEventHandler{

	@Override
	public void handleServerEvent(ISFSEvent event) throws SFSException {
		// TODO Auto-generated method stub
		
		Zone zone = (Zone)event.getParameter(SFSEventParam.ZONE);
		Room room = (Room)event.getParameter(SFSEventParam.ROOM);
		User user = (User)event.getParameter(SFSEventParam.USER);
		User usetRECIPIENT = (User)event.getParameter(SFSEventParam.RECIPIENT);
		String message = (String)event.getParameter(SFSEventParam.MESSAGE);
		ISFSObject object = (ISFSObject)event.getParameter(SFSEventParam.OBJECT);
	}

}
