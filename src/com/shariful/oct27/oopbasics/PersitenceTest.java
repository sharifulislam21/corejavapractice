package com.shariful.oct27.oopbasics;

/*6.	
 * Write an abstract class ‘Persistence’ along with two sub classes ‘FilePersistence’ & ‘DatabasePersistence’. 
 * The base class with have an abstract method persist() which will be overridden by its sub classes. 
 * Write a client who gets the Persistence object at runtime & invokes persist() method on it 
 * without knowing whether data is being saved in File or in Database*/

abstract class Persistence
{
	abstract void persist();
}

class FilePersistence extends Persistence
{
	void persist()
	{
		System.out.println("Data is saved in File...\n");
	}
}

class DatabasePersistence extends Persistence
{
	void persist()
	{
		System.out.println("Data is saved in Database...\n");
	}
}
class PersistenceFactory
{
	public static Persistence getPersistence()
	{
		if(Math.random()%2==0)
			return new FilePersistence();
		else
			return new DatabasePersistence();
		
	}
}
public class PersitenceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persistence p = PersistenceFactory.getPersistence();
		p.persist();
	}

}

