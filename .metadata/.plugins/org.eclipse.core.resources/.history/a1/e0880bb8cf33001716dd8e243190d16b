package sfsEventHandler;

import com.smartfoxserver.v2.core.ISFSEvent;
import com.smartfoxserver.v2.core.SFSEventParam;
import com.smartfoxserver.v2.entities.Room;
import com.smartfoxserver.v2.entities.Zone;
import com.smartfoxserver.v2.exceptions.SFSException;
import com.smartfoxserver.v2.extensions.BaseServerEventHandler;

/**
 * 
 * @author UX303
 *This event is fired after a new Room was created in the current Zone
Level: Zone

Parameters:

SFSEventParam.ZONE: the Zone ( Zone )
SFSEventParam.ROOM: the Room ( Room )
 */
public class RoomAddedEventHandler  extends BaseServerEventHandler{

	@Override
	public void handleServerEvent(ISFSEvent event) throws SFSException {
		// TODO Auto-generated method stub
		
		Zone zone = (Zone)event.getParameter(SFSEventParam.ZONE);
		Room room  = (Room)event.getParameter(SFSEventParam.ROOM);
	}

}
