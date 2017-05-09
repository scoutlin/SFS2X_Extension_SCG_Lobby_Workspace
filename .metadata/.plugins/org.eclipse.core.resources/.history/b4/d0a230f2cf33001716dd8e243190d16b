package sfsEventHandler;

import java.util.List;
import java.util.Map;

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
 *The event is fired after a User logout.
Level: Zone

Parameters:

SFSEventParam.ZONE: the Zone< ( Zone )/li>
SFSEventParam.USER: the User ( User )
SFSEventParam.JOINED_ROOMS: the list of Rooms previously joined by the User ( List )
SFSEventParam.PLAYER_IDS_BY_ROOM: a map of PlayerId by Room, for each Room joined by the User ( Map of Room, Integer)
 */
public class UserLogoutEventHandler  extends BaseServerEventHandler{

	@Override
	public void handleServerEvent(ISFSEvent event) throws SFSException {
		// TODO Auto-generated method stub
		
		Zone zone = (Zone)event.getParameter(SFSEventParam.ZONE);
		User user = (User)event.getParameter(SFSEventParam.USER);
		List<Room> list = (List<Room>)event.getParameter(SFSEventParam.JOINED_ROOMS);
		Map<Integer, Room> map = (Map<Integer, Room>)event.getParameter(SFSEventParam.PLAYER_IDS_BY_ROOM);
		
	}

}
