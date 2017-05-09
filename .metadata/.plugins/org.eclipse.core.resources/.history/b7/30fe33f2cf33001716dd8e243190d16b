package sfsEventHandler;

import com.smartfoxserver.v2.core.ISFSEvent;
import com.smartfoxserver.v2.core.SFSEventParam;
import com.smartfoxserver.v2.entities.Room;
import com.smartfoxserver.v2.entities.User;
import com.smartfoxserver.v2.entities.Zone;
import com.smartfoxserver.v2.exceptions.SFSException;
import com.smartfoxserver.v2.extensions.BaseServerEventHandler;

/**
 * 
 * @author UX303
 *The event is fired after a User has left a Room.
Level: Zone, Room

Parameters:

SFSEventParam.ZONE: the Zone ( Zone )
SFSEventParam.ROOM: the Room that was left ( Room )
SFSEventParam.USER: the User ( User )
SFSEventParam.PLAYER_ID: the previous playerId of the User in that Room ( Integer )
 */
public class UserLeaveRoomEventHandler  extends BaseServerEventHandler{

	@Override
	public void handleServerEvent(ISFSEvent event) throws SFSException {
		// TODO Auto-generated method stub
		
		Zone zone = (Zone)event.getParameter(SFSEventParam.ZONE);
		Room room = (Room)event.getParameter(SFSEventParam.ROOM);
		User user = (User)event.getParameter(SFSEventParam.USER);
		Integer player_ID = (Integer)event.getParameter(SFSEventParam.PLAYER_ID);
		
	}

}
