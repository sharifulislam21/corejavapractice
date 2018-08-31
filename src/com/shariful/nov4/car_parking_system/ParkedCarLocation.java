

package com.shariful.nov4.car_parking_system;

public class ParkedCarLocation {

	int floorId;
	int sectionId;
	int blockId;
	boolean isOccupied;
	ParkedCarOwnerDetails parkedCarOwnerDetails;

	public ParkedCarLocation() {
		this.isOccupied = false;
	}

	

	public ParkedCarLocation(int floorId, int sectionId, int blockId,
			boolean isOccupied, ParkedCarOwnerDetails parkedCarOwnerDetails) {
		super();
		this.floorId = floorId;
		this.sectionId = sectionId;
		this.blockId = blockId;
		this.isOccupied = isOccupied;
		this.parkedCarOwnerDetails = parkedCarOwnerDetails;
	}



	public String toString() {
		
		return "(" + floorId + "," + sectionId +","+ blockId+") IsOccupied : "+isOccupied+" ,"  + parkedCarOwnerDetails;
	}

	@Override
	public int hashCode() {
		return floorId * 9 + sectionId * 3;
	}

	@Override
	public boolean equals(Object obj) {
		ParkedCarLocation temp = (ParkedCarLocation) obj;
		if (floorId == temp.floorId && sectionId == temp.sectionId)
			return true;
		return false;
	}
}
