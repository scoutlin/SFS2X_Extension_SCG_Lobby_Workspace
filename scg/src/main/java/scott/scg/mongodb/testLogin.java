package scott.scg.mongodb;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.ServerAddress;

import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoCollection;

import org.bson.Document;
import java.util.Arrays;

import com.mongodb.BasicDBObject;
import com.mongodb.Block;
import com.mongodb.DBObject;
import com.mongodb.client.MongoCursor;
import static com.mongodb.client.model.Filters.*;
import com.mongodb.client.result.DeleteResult;
import static com.mongodb.client.model.Updates.*;
import com.mongodb.client.result.UpdateResult;
import java.util.ArrayList;
import java.util.List;

public class testLogin {
	
	public testLogin()
	{



	
	}
	
	public String CreateMongoClient()
	{
		String rtString = "";
		
		MongoClientURI uri = new MongoClientURI(
				"mongodb://scott:jumbo@cluster0-shard-00-00-eywdw.mongodb.net:27017,cluster0-shard-00-01-eywdw.mongodb.net:27017,cluster0-shard-00-02-eywdw.mongodb.net:27017/scg?ssl=true&replicaSet=Cluster0-shard-0&authSource=admin");

		MongoClient mMongoClient = new MongoClient(uri);


		MongoDatabase database_scg = mMongoClient.getDatabase("scg");
		rtString += "database.getName(): " + database_scg.getName();
		
		MongoCollection<Document> mMongoCollection_user_account = database_scg.getCollection("user_account");
		//rtString += "getCollection.getName(): " + mMongoCollection.get
		
		//DBObject user = new BasicDBObject("_id_quickLogin", "QL0000000000000000")
		//		                  .append("_password", "guest")
		//		                  .append("_id_fbLogin",    "FB0000000000000000")
		//		                  .append("_FB_token_long", "")
		//						  .append("_SHA_key", "");
								  
		Document doc = new Document("_id_quickLogin", "QL0000000000000000")
                .append("_password", "guest")
                .append("_id_fbLogin",    "FB0000000000000000")
                .append("_FB_token_long", "")
				.append("_SHA_key", "");
		
		
		//mMongoCollection_user_account.insertOne((Document) user);
		mMongoCollection_user_account.insertOne(doc);
		
		mMongoClient.close();
		
		return rtString;
	}
}
