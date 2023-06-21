package com.xworkz.showroomapp.manager;
     //encapsulated class
public class Manager {
	
	
	public Manager() {
		// TODO Auto-generated constructor stub
	}
	           
	
	private int managerId;
	private String managerName;
	private String qualification;
    private long contactNo;
    private String gender;


		public void setManagerId(int managerId) {
			this.managerId=managerId;	
		}
		public int getManagerId() {
			return managerId;
		}
		public void setManagerName(String managerName) {
			this.managerName=managerName;
		}
		public String getManagerName() {
			return managerName;
		}
		
		public void setQualification(String qualification) {
			this.qualification=qualification;
		}
		public String getQualification() {
			return qualification;
			
		}
		public void setContactNo(long contactNo) {
			this.contactNo=contactNo;
			
		}
		public long getContactNo() {
			return contactNo;
		}
		public void setGender(String gender) {
			this.gender=gender;
		}
		public String getGender() {
			return gender;
		}
		
}
