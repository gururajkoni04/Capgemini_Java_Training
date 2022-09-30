package com.cg;

import java.sql.Date;

public class HRM {
	
	class Employee{
		String name,email,address;
		Date Birthday;
		public void work() {
		}
	}
	
	class Programmer extends Employee{
		String programmingLanguages;
		public void code() {
		}
		public void fixBugs() {
		}
	}
	
	class Tester extends Employee{
		String testing,methodologies;
		public void test() {
		}
		public void verify() {
		}
	}
	
	class Designer extends Employee{
		String designPhiosophy, designTools;
		public void design() {
		}
	}
	
	class BusinessDev extends Employee{
		String specializedDomains;
		public void collectRequirements() {
		}
		public void analyzeRequirements() {
		}
		public void writeDocuments() {
		}
	}
	
	class TeamLeader extends Programmer{
		String teamCollaborationTools, developmentMethods;
		public void schedule() {
		}
		public void organize() {
		}
		public void manageProgrammers() {
		}
		public void manageDesigners() {
		}
		public void manageTesters() {
		}
	}
	
	class Architect extends Programmer{
		String designMethodology;
		public void designSystem() {
		}
	}
	
	class CTO extends Architect{
		String technologyDomains;
		public void adviseTechnologies() {
		}
	}
	
	class CEO extends Employee{
		String vision, mission;
		public void executiveManagement() {
		}
	}
	
	class CFO extends Employee{
		String financeManagementSkills;
		public void manageFinance() {
		}
	}
	
}
