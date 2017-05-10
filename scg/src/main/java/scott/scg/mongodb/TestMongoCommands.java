package scott.scg.mongodb;

import java.util.Arrays;

import org.bson.Document;

import com.mongodb.BasicDBObject;
import com.mongodb.Block;
import com.mongodb.DBObject;
import com.mongodb.WriteResult;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import com.mongodb.client.result.DeleteResult;


public class TestMongoCommands
{
	private static TestMongoCommands mTestMongoCommands;
	
	public TestMongoCommands TestMongoCommands()
	{
		if(mTestMongoCommands == null)
		{
			mTestMongoCommands = new TestMongoCommands();
			return mTestMongoCommands;
		}
		else
		{
			return mTestMongoCommands;
		}	
	}
	
	public String AddCollecion(String collectionName)
	{
		MongoDatabase database_scg = MongoClientScottAtlas.GetInstance().getDatabase("scg");
		
		database_scg.createCollection("AddCollecion");
		
		MongoCollection<Document> mMongoCollection = database_scg.getCollection(collectionName);
		
		return Long.toString(mMongoCollection.count());
	}
	
	public String DropCollection(String collectionName)
	{
		MongoDatabase database_scg = MongoClientScottAtlas.GetInstance().getDatabase("scg");
		
		MongoCollection<Document> mMongoCollection = database_scg.getCollection(collectionName);
		
		mMongoCollection.drop();
		
		return Long.toString(mMongoCollection.count());
	}
	
	public String AddDocument(String collectionName, Document document)
	{
		MongoDatabase database_scg = MongoClientScottAtlas.GetInstance().getDatabase("scg");
		
		MongoCollection<Document> mMongoCollection = database_scg.getCollection(collectionName);
		
		//JSON
		//{
		//   "name" : "MongoDB",
		//   "type" : "database",
		//   "count" : 1,
		//   "versions": [ "v3.2", "v3.0", "v2.6" ],
		//   "info" : { x : 203, y : 102 }
		//}
		
		Document doc = new Document("name", "MogoDB")
						    .append("type","database")
						    .append("count", "1")
						    .append("versions", Arrays.asList("v3.2", "v3.0", "v2.6"))
						    .append("info", new Document("x", 203)
						    		             .append("y", 102));

		mMongoCollection.insertOne(doc);
		
		
		////Add mutiple Document
		//List<Document> documents = new ArrayList<Document>();
		//for(int i = 0; i < 100; i++)
		//{
		//	documents.add(new Document("i", i));
		//}
		
		//mMongoCollection.insertMany(documents);
		
		
		
		return Long.toString(mMongoCollection.count());
	}
	
	public String SelectDocument(String collectionName)
	{
		MongoDatabase database_scg = MongoClientScottAtlas.GetInstance().getDatabase("scg");
		MongoCollection<Document> mMongoCollection = database_scg.getCollection(collectionName);
		
		
		////Find first doc
		//Document myDoc = mMongoCollection.find().first();
		//System.out.println(myDoc.toJson());
		
		
		////Find all doc
		//for (Document cur : mMongoCollection.find()) {
		//    System.out.println(cur.toJson());
		//}
		
		////Find first match doc
		//Document myDoc = mMongoCollection.find(Filters.eq("i", 71)).first();
		//System.out.println(myDoc.toJson());
		
		////Find all match file
		//Block<Document> printBlock = new Block<Document>()
		//		{
		//			public void apply(final Document document) {
		//				System.out.println(document.toJson());
		//			}
		//		};
		//mMongoCollection.find(Filters.gt("i", 50)).forEach(printBlock);
		//mMongoCollection.find(Filters.and(Filters.gt("i", 50), Filters.lte("i", 100))).forEach(printBlock);
		
		
		
		FindIterable<Document> findIterable = mMongoCollection.find(new Document());
		
		
		//with query
		//FindIterable<Document> findIterable = mMongoCollection.find(Filters.eq("status", "D"));
			
		
		return null;
	}
	
	public String UpdateField(String collectionName, Document document)
	{
		MongoDatabase database_scg = MongoClientScottAtlas.GetInstance().getDatabase("scg");
		
		MongoCollection<Document> mMongoCollection = database_scg.getCollection(collectionName);
		
		
		return null;
	}
	
	public String UpdateDocument(String collectionName, Document document)
	{
		MongoDatabase database_scg = MongoClientScottAtlas.GetInstance().getDatabase("scg");
		
		MongoCollection<Document> mMongoCollection = database_scg.getCollection(collectionName);
		
		
		return null;
	}
	
	public String UpdateField(String collectionName)
	{
		MongoDatabase database_scg = MongoClientScottAtlas.GetInstance().getDatabase("scg");
		
		MongoCollection<Document> mMongoCollection = database_scg.getCollection(collectionName);
		
		mMongoCollection.updateOne(Filters.eq("i", 10), new Document("$set", new Document("i", 110)));

		return null;
	}
	
	public String DeleteField(String collectionName)
	{
		MongoDatabase database_scg = MongoClientScottAtlas.GetInstance().getDatabase("scg");
		
		MongoCollection<Document> mMongoCollection = database_scg.getCollection(collectionName);
			
		mMongoCollection.updateOne(Filters.eq("i", 10), new Document("$unset", new Document("i", "")));
		
	
		return null;
	}
	
	public String DeleteDocument(String collectionName)
	{
		//Set Value of a field
		MongoDatabase database_scg = MongoClientScottAtlas.GetInstance().getDatabase("scg");
		
		MongoCollection<Document> mMongoCollection = database_scg.getCollection(collectionName);
			
		DeleteResult mDeleteResult = mMongoCollection.deleteOne(Filters.eq("i", 110));
		
		mDeleteResult.getDeletedCount();
		mDeleteResult.wasAcknowledged();
		return null;
	}
}
