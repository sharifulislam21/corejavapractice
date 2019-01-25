package com.shariful.designpattern.factory;

public class GetPlanFactory {

	public Plan getPlan(String planType) {
		
		if (planType.equalsIgnoreCase("DOMESTICPLAN")) {
			return new DomesticPlan();
		} else if (planType.equalsIgnoreCase("COMMERCIALPLAN")) {
			return new CommercialPlan();
		} else if (planType.equalsIgnoreCase("INSTITUTIONALPLAN")) {
			return new InstitutionalPlan();
		} else {
			return null;
		}
	}
}
