package scott.scg.sfsEventHandler;

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
 *This event is fired when a User joined in a Game Room as spectator changes turns into a Player. The User will be assigned a new playerId which is passed in the event parameters.
Level: Zone, Room

Parameters:

SFSEventParam.ZONE: the Zone ( Zone )
SFSEventParam.ROOM: the Room ( Room )
SFSEventParam.USER: the User ( User )
SFSEventParam.PLAYER_ID: the new player Id assigned to the User that was switched ( Integer )
 */
public class SpectatorToPlayerEventHandler  extends BaseServerEventHandler{

	public void handleServerEvent(ISFSEvent event) throws SFSException {
		// TODO Auto-generated method stub
		
		Zone zone = (Zone)event.getParameter(SFSEventParam.ZONE);
		Room room = (Room)event.getParameter(SFSEventParam.ROOM);
		User user = (User)event.getParameter(SFSEventParam.USER);
		Integer playerID = (Integer)event.getParameter(SFSEventParam.PLAYER_ID);
		
	}

}
