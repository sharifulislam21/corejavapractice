/*7.	COLLECTION FRAMEWORK: There is parking slot available in R-Mall with 3 floors; 
 * each floor has 4 sections and each section can maximum park 20 cars.
 *  You need to design one application which will maintain all car details in such way when a car owner arrives to collect his 
 *  car your application should provide details including where it is located.
a.	Create class Parked_CarOwner_Details which will have 
	field’s owerName, carModel, carNO, owerMobileNo, owerAddress with setter and getter 2.
b.	Create class Parked_CarOwenerList which will have 
	method’s int add_new_car(Parked_CarOwner_Details obj), remove_car(), get_parked_car_location(token)
 */

package com.shariful.nov4.car_parking_system;

import java.util.Scanner;

public class CarParkingManage {
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		ParkedCarOwnerList objectParkedCarOwnerList = new ParkedCarOwnerList();
		do {
			System.out.println("Enter Your Choice... \n1.Add Car  \n2.Remove Car \n3.Get Car Location \n4.View All Cars");
			choice = sc.nextInt();
			
			switch (choice) {
			case 1:
				System.out.println("Enter Car Details-\n");
				System.out.println("Enter owner name...");
				String ownerName = sc.next();
				System.out.println("Enter car model...");
				String carModel = sc.next();
				System.out.println("Enter car num...");
				String carNum = sc.next();
				System.out.println("enter mobile Number...");
				long mobNum = sc.nextLong();
				System.out.println("enter owner address...");
				String ownerAddress = sc.next();

				objectParkedCarOwnerList.add_new_car(new ParkedCarOwnerDetails(ownerName, ownerAddress,
						carModel,carNum,mobNum));

				break;
				
			case 2:
				System.out.println("ENTER Leaving CAR DETAILS...");
				System.out.println("enter Number...");
				long owerMobileNo1 = sc.nextLong();
				objectParkedCarOwnerList.remove_car(owerMobileNo1);
				break;
				
			case 3:
				System.out.println("ENTER Leaving CAR DETAILS...");
				System.out.println("enter Number...");
				long owerMobileNo2 = sc.nextLong();
				ParkedCarLocation location = objectParkedCarOwnerList.get_parked_car_location(owerMobileNo2);
				System.out.println("Loaction is :- Floor is- "+location.floorId+"Section is : "+location.sectionId + " 1"
						+ "Block is:"+location.blockId);
				System.out.println("/*************************************************/");
				break;
				
			case 4:
				objectParkedCarOwnerList.view_All_car();
				break;
			default:
				break;
			}
		} while (true);
	}

}
