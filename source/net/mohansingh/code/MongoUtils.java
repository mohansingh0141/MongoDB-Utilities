package source.net.mohansingh.code;

import com.mongodb.BasicDBObject;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;


public class MongoUtils {
	
	/**
	 * Returns Documents having parameter values less than the passed value
	 * @param Collection Object
	 * @param Document Field Name
	 * @param Value to be compared against attribute value
	 * @return DBCursor object 
	 */
	
	public static DBCursor getLessThan(DBCollection collection,String field , Object value){
		
		 return collection.find(new BasicDBObject(field, new BasicDBObject("$lt",value)));	
			
	}
	
	/**
	 * Returns Documents having parameter values less than or equal to the passed value
	 * @param Collection Object
	 * @param Document Field Name
	 * @param Value to be compared against attribute value
	 * @return DBCursor object 
	 */	
	
	public static DBCursor getLessThanEqualTo(DBCollection collection,String field , Object value){
		
		 return collection.find(new BasicDBObject(field, new BasicDBObject("$lte",value)));	
			
	}
	
	/**
	 * Returns Documents having parameter values greater than the passed value
	 * @param Collection Object
	 * @param Document Field Name
	 * @param Value to be compared against attribute value
	 * @return DBCursor object 
	 */
	
	public static DBCursor getGreaterThan(DBCollection collection,String field , Object value){
		
		 return collection.find(new BasicDBObject(field, new BasicDBObject("$gt",value)));	
			
	}
	
	/**
	 * Returns Documents having parameter values greater than or Equal to the passed value
	 * @param Collection Object
	 * @param Document Field Name
	 * @param Value to be compared against attribute value
	 * @return DBCursor Object 
	 */
	
	public static DBCursor getGreaterThanEqualTo(DBCollection collection,String field , Object value){
		
		 return collection.find(new BasicDBObject(field, new BasicDBObject("$gte",value)));	
			
	}
	
	/**
	 * Returns Documents having parameter values greater than value X and less than value Y 
	 * @param Collection Object
	 * @param Document Field Name
	 * @param value X
	 * @param value Y
	 * @return DBCursor Object
	 */
	
	public static DBCursor getGreaterThanXLessThanY(DBCollection collection,String field,Object valX,Object valY ){
		
		return collection.find(new BasicDBObject(field,new BasicDBObject("$gt",valX).append("$lt",valY)),new BasicDBObject());
				
	}
	
	/**
	 * Returns Documents having parameter values greater than or equal to value X and less than or equal to value Y 
	 * @param Collection Object
	 * @param Document Field Name
	 * @param value X
	 * @param value Y
	 * @return DBCursor Object
	 */
	
	public static DBCursor getGreaterEqualXLessEqualY(DBCollection collection,String field,Object valX,Object valY ){
		
		return collection.find(new BasicDBObject(field,new BasicDBObject("$gte",valX).append("$lte",valY)),new BasicDBObject());
				
	}
	

	/**
	 * 
	 * @param Collection Object
	 * @param Document Field
	 * @param values
	 * @return DBCursor Object
	 */
	
	public static DBCursor getNotEqual(DBCollection collection, String field,Object value){
		return collection.find(new BasicDBObject(field,new BasicDBObject("$ne",value)));
		
	}
	

	/**
	 * 
	 * @param Collection Object
	 * @param Document Field
	 * @param values
	 * @return DBCursor Object
	 */
	
	public static DBCursor getValueInInt(DBCollection collection,String field, int[] values){
		
		return collection.find(new BasicDBObject(field,new BasicDBObject("$in",values)));
		
	}
	

	/**
	 * 
	 * @param Collection Object
	 * @param Document Field
	 * @param values
	 * @return DBCursor Object
	 */
	
	public static DBCursor getValueInFloat(DBCollection collection, String field, float[] values){
		
		return collection.find(new BasicDBObject(field,new BasicDBObject("$in",values)));
		
	}
	

	/**
	 * 
	 * @param Collection Object
	 * @param Document Field
	 * @param values
	 * @return DBCursor Object
	 */
	
	public static DBCursor getValueInDouble(DBCollection collection, String field , double[] values ){
		
		return collection.find(new BasicDBObject(field,new BasicDBObject("$in",values)));
		
	}
	

	/**
	 * 
	 * @param Collection Object
	 * @param Document Field
	 * @param values
	 * @return DBCursor Object
	 */
	
	public static DBCursor getValInChar(DBCollection collection, String field , char[] values){
		
		return collection.find(new BasicDBObject(field,new BasicDBObject("$in",values)));
		
	}
	

	/**
	 * 
	 * @param Collection Object
	 * @param Document Field
	 * @param values
	 * @return DBCursor Object
	 */
	
	public static DBCursor getValueInString(DBCollection collection, String field, String[] values){
		
		return collection.find(new BasicDBObject(field,new BasicDBObject("$in",values)));
		
	}
	

	/**
	 * 
	 * @param Collection Object
	 * @param Document Field
	 * @param values
	 * @return DBCursor Object
	 */
	
	public static DBCursor getValueNotInInt(DBCollection collection,String field, int[] values){
		
		return collection.find(new BasicDBObject(field,new BasicDBObject("$nin",values)));
		
	}


	/**
	 * 
	 * @param Collection Object
	 * @param Document Field
	 * @param values
	 * @return DBCursor Object
	 */
	
	public static DBCursor getValueNotInFloat(DBCollection collection,String field, float[] values){
		
		return collection.find(new BasicDBObject(field,new BasicDBObject("$nin",values)));
		
	}
	

	/**
	 * 
	 * @param Collection Object
	 * @param Document Field
	 * @param values
	 * @return DBCursor Object
	 */
	
	public static DBCursor getValueNotInDouble(DBCollection collection,String field, double[] values){
		
		return collection.find(new BasicDBObject(field,new BasicDBObject("$nin",values)));
		
	}
	

	/**
	 * 
	 * @param Collection Object
	 * @param Document Field
	 * @param values
	 * @return DBCursor Object
	 */
	
	public static DBCursor getValueNotInString(DBCollection collection,String field, String[] values){
		
		return collection.find(new BasicDBObject(field,new BasicDBObject("$nin",values)));
		
	}

	/**
	 * 
	 * @param Collection Object
	 * @param Document Field
	 * @param values
	 * @return DBCursor Object
	 */
	
	public static DBCursor getValueNotInChar(DBCollection collection,String field, char[] values){
	
	return collection.find(new BasicDBObject(field,new BasicDBObject("$nin",values)));
	
	}

	/**
	 * 
	 * @param Collection Object
	 * @param Document Field
	 * @param values
	 * @return DBCursor Object
	 */
	
	public static DBCursor getMatchAllInt(DBCollection collection , String field, int[] values){
		
		return collection.find(new BasicDBObject(field,new BasicDBObject("$all",values)));
		
	}
	

	/**
	 * 
	 * @param Collection Object
	 * @param Document Field
	 * @param values
	 * @return DBCursor Object
	 */
	
	public static DBCursor getMatchAllChar(DBCollection collection , String field, char[] values){
		
		return collection.find(new BasicDBObject(field,new BasicDBObject("$all",values)));
		
	}
	

	/**
	 * 
	 * @param Collection Object
	 * @param Document Field
	 * @param values
	 * @return DBCursor Object
	 */
	
	public static DBCursor getMatchAllfloat(DBCollection collection , String field, float[] values){
		
		return collection.find(new BasicDBObject(field,new BasicDBObject("$all",values)));
		
	}
	

	/**
	 * 
	 * @param Collection Object
	 * @param Document Field
	 * @param values
	 * @return DBCursor Object
	 */

	public static DBCursor getMatchAllDouble(DBCollection collection , String field, double[] values){
	
	return collection.find(new BasicDBObject(field,new BasicDBObject("$all",values)));
	
	}
	
	/**
	 * 
	 * @param Collection Object
	 * @param Document Field
	 * @param values
	 * @return DBCursor Object
	 */
	
	public static DBCursor getMatchAllString(DBCollection collection , String field, String[] values){
	
	return collection.find(new BasicDBObject(field,new BasicDBObject("$all",values)));
	
	}	
	
	
	

}
