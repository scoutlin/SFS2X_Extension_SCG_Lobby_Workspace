package scott.scg.sfsEventHandler;

import com.smartfoxserver.v2.core.ISFSEvent;
import com.smartfoxserver.v2.core.SFSEventParam;
import com.smartfoxserver.v2.entities.Room;
import com.smartfoxserver.v2.entities.Zone;
import com.smartfoxserver.v2.exceptions.SFSException;
import com.smartfoxserver.v2.extensions.BaseServerEventHandler;

/**
 * 
 * @author UX303
 *This event is fired after a private SFSGame has finished the cycle of invitations. The event signals that not enough players were joined in the Game Room and the game cannot start.
Level: Zone, Room

Parameters:

SFSEventParam.ZONE: the Zone ( Zone )
SFSEventParam.ROOM: the Game Room ( Room )
 */
public class GameInvitationFailureEventHandler  extends BaseServerEventHandler{

	public void handleServerEvent(ISFSEvent event) throws SFSException {
		// TODO Auto-generated method stub
		
		Zone zone = (Zone)event.getParameter(SFSEventParam.ZONE);
		Room room = (Room)event.getParameter(SFSEventParam.ROOM);
	}

}
