
package com.shariful.nov4.car_parking_system;

import java.util.ArrayList;
import java.util.Iterator;


public class ParkedCarOwnerList {

	ArrayList<ParkedCarLocation> locationList = new ArrayList<ParkedCarLocation>();

	ParkedCarOwnerList() 
	{
		for (int i = 1; i < 4; i++) {// Inserting floor and section details
			for (int j = 1; j < 5; j++) {
				for(int k=1; k<2; k++)
				{
					locationList.add(new ParkedCarLocation(i, j, k,
							false, null));
				}
			}
		}
	}

	public int add_new_car(ParkedCarOwnerDetails obj) {
		int loc = 0;
		ParkedCarLocation temp = null;
		Iterator<ParkedCarLocation> locIterator = locationList.iterator();
		while (locIterator.hasNext()) {
			temp = locIterator.next();
			if (!temp.isOccupied) {
				loc = locationList.indexOf(temp);
				break;
			}
		}
		//System.out.println("LOCATION : "+loc);
		locationList.remove(temp);
		temp.isOccupied = true;
		temp.parkedCarOwnerDetails = obj;
		locationList.add(loc, temp);
		System.out.println("/********************************CAR PARKED*****************/");
		return loc;
	}

	public void remove_car(long mobileNumber){
		int loc = 0;
		ParkedCarLocation temp = null;
		Iterator<ParkedCarLocation> locIterator = locationList.iterator();
		while (locIterator.hasNext()) {
			temp = locIterator.next();
			if(temp.parkedCarOwnerDetails.mobNum == mobileNumber)
			{
				loc = locationList.indexOf(temp);
				break;
				
			}
		}
		locationList.remove(temp);
		temp.isOccupied = false;
		temp.parkedCarOwnerDetails = null;
		locationList.add(loc, temp);
		System.out.println("/********************************CAR REMOVED*****************/");
		
	}

	public void view_All_car() {
		System.out.println(locationList.size());
		Iterator<ParkedCarLocation> locIterator = locationList.iterator();
System.out.println("/********************************LIST STARTS*****************/");
		while (locIterator.hasNext()) {
			ParkedCarLocation temp = locIterator.next();
			if(temp.isOccupied)
			{
				System.out.println(temp);
			}
		}		
		System.out.println("/********************************LIST ENDS*****************/");
	}
	
	public ParkedCarLocation get_parked_car_location(long mobileNumber) {
		int loc = 0;
		ParkedCarLocation temp = null;
		System.out.println("/********************************GETTOING LOCATIOn*****************/");
		Iterator<ParkedCarLocation> locIterator = locationList.iterator();
		while (locIterator.hasNext()) {
			temp = locIterator.next();
			if(temp.parkedCarOwnerDetails.mobNum == mobileNumber)
			{break;}
		}
		return temp;
	}
	
}
