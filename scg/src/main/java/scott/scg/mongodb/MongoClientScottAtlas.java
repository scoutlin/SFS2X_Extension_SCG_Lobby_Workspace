package scott.scg.mongodb;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;

public class MongoClientScottAtlas
{
	private static MongoClient mMongoClient = null;
	
	public static MongoClient GetInstance()
	{
		if(mMongoClient == null)
		{
			MongoClientURI uri = new MongoClientURI(
					"mongodb://scott:jumbo@cluster0-shard-00-00-eywdw.mongodb.net:27017,cluster0-shard-00-01-eywdw.mongodb.net:27017,cluster0-shard-00-02-eywdw.mongodb.net:27017/scg?ssl=true&replicaSet=Cluster0-shard-0&authSource=admin");

			mMongoClient = new MongoClient(uri);
			return mMongoClient; 
		}
		else
		{
			return mMongoClient;
		}
	}
}
