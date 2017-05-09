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
 *The event is fired when the HRC (highly resilient connection) feature is turned on and a User was successfully reconnected.
When a User looses connection for an unknown reason the client will attempt to re-connect immediately. If the operation is done within the expected time the User connection will be resumed transparently. The User does not loose its current state and it's not removed from the server so, for example, the game can continue from the point it was stopped (if turn-based).

This event notifies the developer that the User was reconnected. The event can be used to re-start the game if necessary or simply notify the other players.

The reconnection time is specified in the Zone configuration using the

setting. In case the User is not able to reconnect a regular USER_DISCONNECT event will be fired.
Level: Zone, Room

Parameters:

SFSEventParam.ZONE: the Zone ( Zone )
SFSEventParam.USER: the User ( User )
 */
public class UserReconnectionSuccessEventHandler  extends BaseServerEventHandler{

	@Override
	public void handleServerEvent(ISFSEvent event) throws SFSException {
		// TODO Auto-generated method stub
		
		Zone zone = (Zone)event.getParameter(SFSEventParam.ZONE);
		Room room = (Room)event.getParameter(SFSEventParam.ROOM);
		
	}

}
