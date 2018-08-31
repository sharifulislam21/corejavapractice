/*NESTED CLASSES: 
 * Write an application that maintains the cache of data & helps us to retrieve inserted data using its key. 
 * The cache should also maintain private data about the timestamp when the data was added into cache. 
Note: refer class HashMap& add a nested class to maintain details of the cache data.
*/

package com.shariful.nov3.nested_class;

import java.util.HashMap;

class Cache
{
	String Key;
	HashMap<String,CacheDetails> cache=new HashMap<String,CacheDetails>();
	private static Cache c=null;
	private Cache()
	{
		
	}
	public static Cache getInstance()
	{
		if(c==null)
		{
			c=new Cache();
		}
		return c;
	}
	public void put(String key,String value)
	{
		cache.put(key,new CacheDetails(value,System.currentTimeMillis()));
	}
	public String getValue(String key)
	{
		return cache.get(key).value;
	}

	public long getTimeStamp(String key)
	{
		return cache.get(key).timestamp;
	}
	private class CacheDetails
	{
		String value;
		long timestamp;
		
		public CacheDetails(String value,long timestamp)
		{
			this.value=value;
			this.timestamp=System.currentTimeMillis();
		}
	}
}

public class NestedClassCache {

	public static void main(String[] args) {
		Cache c1=Cache.getInstance();
		String userName="shariful";
		c1.put(userName,"shari12345");
		System.out.println("Username : "+userName);
		System.out.println("Password :"+ c1.getValue(userName));
		System.out.println("TimeStamp  "+c1.getTimeStamp(userName));

	}

}
