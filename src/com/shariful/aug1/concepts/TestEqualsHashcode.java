package com.shariful.aug1.concepts;

import java.util.HashMap;
import java.util.Map;

class EmployeeKey {
	String empId;
	String dob;
	
	public EmployeeKey(String empId, String dob) {
		super();
		this.empId = empId;
		this.dob = dob;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dob == null) ? 0 : dob.hashCode());
		result = prime * result + ((empId == null) ? 0 : empId.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || getClass() != obj.getClass())
			return false;
		
		EmployeeKey other = (EmployeeKey) obj;
		
		if (dob == null) {
			if (other.dob != null)
				return false;
		} else if (!dob.equals(other.dob))
			return false;
		if (empId == null) {
			if (other.empId != null)
				return false;
		} else if (!empId.equals(other.empId))
			return false;
		return true;
	}
	
	
	
}
public class TestEqualsHashcode {

	static Map<EmployeeKey, String> loadEmp() {
		EmployeeKey emp1 = new EmployeeKey("101", "21051993");
		EmployeeKey emp2 = new EmployeeKey("102", "28021994");
		EmployeeKey emp3 = new EmployeeKey("103", "09011993");
		EmployeeKey emp4 = new EmployeeKey("104", "26011993");
		
		Map<EmployeeKey, String> cache = new HashMap<EmployeeKey, String>();
		cache.put(emp1, "Shariful");
		cache.put(emp2, "Pooja");
		cache.put(emp3, "Juned");
		cache.put(emp4, "Harsh");
		
		return cache;
	}
	
	public static void main(String[] args) {
		Map<EmployeeKey, String> cache = loadEmp();
		
		EmployeeKey lookUpKey = new EmployeeKey("101", "21051993");
		
		String empName = cache.get(lookUpKey);
		System.out.println(empName);
	}
}
