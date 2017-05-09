package scott.scg.sfsEventHandler;

import java.util.List;
import java.util.Map;

import com.smartfoxserver.v2.core.ISFSEvent;
import com.smartfoxserver.v2.core.SFSEventParam;
import com.smartfoxserver.v2.entities.User;
import com.smartfoxserver.v2.entities.Zone;
import com.smartfoxserver.v2.exceptions.SFSException;
import com.smartfoxserver.v2.extensions.BaseServerEventHandler;

/**
 * 
 * @author UX303
 *This event is fired when one or more files have been uploaded by a User connected in the current Zone.
Level: Zone

Parameters:

SFSEventParam.ZONE: the Zone ( Zone )
SFSEventParam.USER: the Game Room ( User )
SFSEventParam.UPLOAD_FILE_LIST: a List of UploadedFile elements
SFSEventParam.UPLOAD_HTTP_PARAMS: a Map of custom parameters. Each entry in the map provides the name (String) and the relative value (String) of the parameter.
 */
public class FileUploadEventHandler  extends BaseServerEventHandler{

	public void handleServerEvent(ISFSEvent event) throws SFSException {
		// TODO Auto-generated method stub
		
		Zone zone = (Zone)event.getParameter(SFSEventParam.ZONE);
		User user = (User)event.getParameter(SFSEventParam.USER);
		List<String> list = (List<String>)event.getParameter(SFSEventParam.UPLOAD_FILE_LIST);
		Map<String, String> map = (Map<String, String>)event.getParameter(SFSEventParam.UPLOAD_HTTP_PARAMS);
	}

}
