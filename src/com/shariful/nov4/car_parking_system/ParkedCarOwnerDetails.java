

package com.shariful.nov4.car_parking_system;

public class ParkedCarOwnerDetails {
	
	String ownerName;
	String ownerAddress;
	String carModel;
	String carNum;
	long mobNum;
	
	public ParkedCarOwnerDetails()
	{
		
	}
	
	public ParkedCarOwnerDetails(String ownerName, String ownerAddress,
			String carModel, String carNum, long mobNum) {
		super();
		this.ownerName = ownerName;
		this.ownerAddress = ownerAddress;
		this.carModel = carModel;
		this.carNum = carNum;
		this.mobNum = mobNum;
	}
	
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public String getOwnerAddress() {
		return ownerAddress;
	}
	public void setOwnerAddress(String ownerAddress) {
		this.ownerAddress = ownerAddress;
	}
	public String getCarModel() {
		return carModel;
	}
	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}
	public String getCarNum() {
		return carNum;
	}
	public void setCarNum(String carNum) {
		this.carNum = carNum;
	}
	public long getMobNum() {
		return mobNum;
	}
	public void setMobNum(long mobNum) {
		this.mobNum = mobNum;
	}
	
	@Override
	public String toString() {
		return "ParkedCarOwnerDetails [Name=" + ownerName
				+ ", Address=" + ownerAddress + ", Car Model=" + carModel
				+ ", Car Num=" + carNum + ", Moile Num=" + mobNum + "]";
	}

//	public void printDetails()
//	{
//		System.out.println("Name:"+this.ownerName);
//		System.out.println("Address:"+this.ownerAddress);
//		System.out.println("Car:"+this.carModel);
//		System.out.println("Car Number:"+this.carNum);
//		System.out.println("Mobile:" +this.mobNum);
//	}

}
