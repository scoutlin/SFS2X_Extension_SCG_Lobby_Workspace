/**
 * 
 */
package scott.scg.lobby;

import com.smartfoxserver.v2.core.SFSEventType;
import com.smartfoxserver.v2.extensions.SFSExtension;

import scott.scg.requestHandler.UserMsgRequestHandler;
import scott.scg.sfsEventHandler.BuddyAddEventHandler;
import scott.scg.sfsEventHandler.BuddyBlockEventHandler;
import scott.scg.sfsEventHandler.BuddyListInitEventHandler;
import scott.scg.sfsEventHandler.BuddyMessageEventHandler;
import scott.scg.sfsEventHandler.BuddyOnlineStateUpdate;
import scott.scg.sfsEventHandler.BuddyRemoveEventHandler;
import scott.scg.sfsEventHandler.BuddyVariablesUpdateEventHandler;
import scott.scg.sfsEventHandler.FileUploadEventHandler;
import scott.scg.sfsEventHandler.GameInvitationFailureEventHandler;
import scott.scg.sfsEventHandler.GameInvitationSuccessEventHandler;
import scott.scg.sfsEventHandler.PlayerToSpectatorEventHandler;
import scott.scg.sfsEventHandler.PrivateMessageEventHandler;
import scott.scg.sfsEventHandler.PublicMessageEventHandler;
import scott.scg.sfsEventHandler.RoomAddedEventHandler;
import scott.scg.sfsEventHandler.RoomRemovedEventHandler;
import scott.scg.sfsEventHandler.RoomVariablesUpdateEventHandler;
import scott.scg.sfsEventHandler.ServerReadyEventHandler;
import scott.scg.sfsEventHandler.SpectatorToPlayerEventHandler;
import scott.scg.sfsEventHandler.UserDisconnectEventHandler;
import scott.scg.sfsEventHandler.UserJoinRoomEventHandler;
import scott.scg.sfsEventHandler.UserJoinZoneEventHandler;
import scott.scg.sfsEventHandler.UserLeaveRoomEventHandler;
import scott.scg.sfsEventHandler.UserLoginEventHandler;
import scott.scg.sfsEventHandler.UserLogoutEventHandler;
import scott.scg.sfsEventHandler.UserReconnectionSuccessEventHandler;
import scott.scg.sfsEventHandler.UserReconnectionTryEventHandler;
import scott.scg.sfsEventHandler.UserVariablesUpdateEventHandler;




import scott.scg.mongodb.testLogin;


/**
 * @author UX303
 *
 */
public class MyExtension extends SFSExtension
{
	/**
	 *  {@inheritDoc}  
	 */
	public void init()
	{
		//TODO Auto-generated method stub
		trace("!!FUCK!!");
		
		testLogin mtestLogin = new testLogin();
		trace("!!Test DB Resulte Start!!");
		trace(mtestLogin.CreateMongoClient());
		trace("!!Test DB Resulte End!!");
		
		//EventHandler
		this.addEventHandler(SFSEventType.BUDDY_ADD, BuddyAddEventHandler.class);
		this.addEventHandler(SFSEventType.BUDDY_BLOCK, BuddyBlockEventHandler.class);
		this.addEventHandler(SFSEventType.BUDDY_LIST_INIT, BuddyListInitEventHandler.class);
		this.addEventHandler(SFSEventType.BUDDY_MESSAGE, BuddyMessageEventHandler.class);
		this.addEventHandler(SFSEventType.BUDDY_ONLINE_STATE_UPDATE, BuddyOnlineStateUpdate.class);
		this.addEventHandler(SFSEventType.BUDDY_REMOVE, BuddyRemoveEventHandler.class);
		this.addEventHandler(SFSEventType.BUDDY_VARIABLES_UPDATE, BuddyVariablesUpdateEventHandler.class);
		
		this.addEventHandler(SFSEventType.FILE_UPLOAD, FileUploadEventHandler.class);
		
		this.addEventHandler(SFSEventType.GAME_INVITATION_FAILURE, GameInvitationFailureEventHandler.class);
		this.addEventHandler(SFSEventType.GAME_INVITATION_SUCCESS, GameInvitationSuccessEventHandler.class);
		
		this.addEventHandler(SFSEventType.PLAYER_TO_SPECTATOR, PlayerToSpectatorEventHandler.class);
		
		this.addEventHandler(SFSEventType.PRIVATE_MESSAGE, PrivateMessageEventHandler.class);
		this.addEventHandler(SFSEventType.PUBLIC_MESSAGE, PublicMessageEventHandler.class);
		
		this.addEventHandler(SFSEventType.ROOM_ADDED, RoomAddedEventHandler.class);
		this.addEventHandler(SFSEventType.ROOM_REMOVED, RoomRemovedEventHandler.class);
		this.addEventHandler(SFSEventType.ROOM_VARIABLES_UPDATE, RoomVariablesUpdateEventHandler.class);
		
		this.addEventHandler(SFSEventType.SERVER_READY, ServerReadyEventHandler.class);
		this.addEventHandler(SFSEventType.SPECTATOR_TO_PLAYER, SpectatorToPlayerEventHandler.class);
		
		this.addEventHandler(SFSEventType.USER_DISCONNECT, UserDisconnectEventHandler.class);
		this.addEventHandler(SFSEventType.USER_JOIN_ROOM, UserJoinRoomEventHandler.class);
		this.addEventHandler(SFSEventType.USER_JOIN_ZONE, UserJoinZoneEventHandler.class);
		this.addEventHandler(SFSEventType.USER_LEAVE_ROOM, UserLeaveRoomEventHandler.class);	
		this.addEventHandler(SFSEventType.USER_LOGIN, UserLoginEventHandler.class);
		this.addEventHandler(SFSEventType.USER_LOGOUT, UserLogoutEventHandler.class);
		this.addEventHandler(SFSEventType.USER_RECONNECTION_SUCCESS, UserReconnectionSuccessEventHandler.class);
		this.addEventHandler(SFSEventType.USER_RECONNECTION_TRY, UserReconnectionTryEventHandler.class);
		this.addEventHandler(SFSEventType.USER_VARIABLES_UPDATE, UserVariablesUpdateEventHandler.class);

		
		
		
		
		
		
		//RequestHandler
		this.addRequestHandler("UserMsg", UserMsgRequestHandler.class);
		
		
		
	}
	
	/**
	 *  {@inheritDoc}
	 */
	public void destroy()
	{
		//TODO Auto-generated method stub
		super.destroy();
	}
}
