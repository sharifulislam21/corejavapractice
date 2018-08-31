package com.shariful.nov3.nested_class;

import java.util.ArrayList;

abstract class Hospital
{
	protected Patient patient;
	public abstract void update();
}

class Patient
{
	ArrayList<Hospital> hospitalList=new ArrayList<Hospital>();
	private int bloodPressure;
	
	public int getBloodPressure()
	{
		return bloodPressure;
	}
	
	public void setBloodPressure(int bp)
	{
		this.bloodPressure=bp;
		if(bp>140)
		{
			System.err.println("Blood Pressure:"+bp+" ALERT!!!!.....Blood Pressure Critical");
			notifyAllObservers();
		}
		else
		{
			System.out.println("Blood Pressure:"+bp+" Patient is Healthy...");
		}
	}
	
	public void admit(Hospital hosp)
	{
		hospitalList.add(hosp);
	}
	
	public void notifyAllObservers()
	{
		for(Hospital itr:hospitalList)
		{
			itr.update();
		}
	}
}


class Patient1 extends Hospital
{
	public Patient1(Patient patient )
	{
		this.patient=patient;
		this.patient.admit(this);
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}
}


public class PatientBloodPressureTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Patient patientObj=new Patient();
		new Patient1(patientObj);
		//new Patient2(pat);
		
		System.out.println("-----Blood Pressure Test-----");
		patientObj.setBloodPressure(65);
		patientObj.setBloodPressure(170);
		patientObj.setBloodPressure(141);
	}

}
