package com.xworkz.showroomapp.showroom;

import com.xworkz.showroomapp.manager.Manager;

public class ShowRoom {
	
	//has a relationship
		Manager manager[];
		int index;
		
			
        public ShowRoom() {
		
			
		}
		public ShowRoom(int size) {
			System.out.println("Showroom object is created");
			manager=new Manager[size];	
		}
		
		public boolean saveManager(Manager manager) {
			System.out.println("saveManager process is started");
			boolean isSaveManager=false;
			
			if(manager.getManagerName()!=null && !(manager.getManagerName().isEmpty())) {
				this.manager[index++]=manager;
				System.out.println("manager saved sucessfully");
				isSaveManager=true;	
			}
			System.out.println("saveManager process ended");
			return isSaveManager;
		
		}
		public void getAllManager() {
			System.out.println("list of manager details are");
			for(int i=0;i<manager.length;i++) {
				System.out.println(manager[i].getManagerId()+" " + manager[i].getManagerName() + " " + manager[i].getQualification()+" "+manager[i].getContactNo()+ " "+manager[i].getGender());
			}
		}
		public Manager getManagerByQualification(String qualification) {
			System.out.println("Inside getManagerByqualification");
			for(int i=0;i<manager.length;i++) {
				if(manager[i].getQualification()==qualification) {
					System.out.println("Qualification is matching ...proceed the data");
					System.out.println(manager[i].getManagerId()+" " + manager[i].getManagerName() + " " + manager[i].getQualification()+" "+manager[i].getContactNo()+ " "+manager[i].getGender());
					return manager[i];
					
				}
				System.out.println("end of getManagerByqualification");
			}
			return null;
		}
		public Manager getManagerBymanagerId(int  managerId) {
			System.out.println("Inside getManagerBymanagerId");
			for(int i=0;i<manager.length;i++) {
				if(manager[i].getManagerId()==managerId) {
					System.out.println("managerId  is matching ...proceed the data");
					System.out.println(manager[i].getManagerId()+" " + manager[i].getManagerName() + " " + manager[i].getQualification()+" "+manager[i].getContactNo()+ " "+manager[i].getGender());
					return manager[i];
					
				}
				System.out.println("end of getManagerBymanagerId");
			}
			return null;
		}
		public Manager getManagerBymanagerName(String  managerName) {
			System.out.println("Inside getManagerBymanagerName");
			for(int i=0;i<manager.length;i++) {
				if(manager[i].getManagerName()==managerName) {
					System.out.println("managerName  is matching ...proceed the data");
					System.out.println(manager[i].getManagerId()+" " + manager[i].getManagerName() + " " + manager[i].getQualification()+" "+manager[i].getContactNo()+ " "+manager[i].getGender());
					
					return manager[i];
					
				}
				System.out.println("end of getManagerBymanagerName");
			}
			return null;
		}
		
		
		public Manager getManagerBygender(String  gender) {
			System.out.println("Inside getManagerBygender");
			for(int i=0;i<manager.length;i++) {
				if(manager[i].getGender()==gender) {
					System.out.println("managerName  is matching ...proceed the data");
					System.out.println(manager[i].getManagerId()+" " + manager[i].getManagerName() + " " + manager[i].getQualification()+" "+manager[i].getContactNo()+ " "+manager[i].getGender());
					return manager[i];
					
				}
				System.out.println("end of getManagerBygender");
			}
			return null;
		}
		public Manager getManagerBycontactNo(long  contactNo) {
			System.out.println("Inside getManagerBycontactNo");
			for(int i=0;i<manager.length;i++) {
				if(manager[i].getContactNo()==contactNo) {
					System.out.println("managerName  is matching ...proceed the data");
					System.out.println(manager[i].getManagerId()+" " + manager[i].getManagerName() + " " + manager[i].getQualification()+" "+manager[i].getContactNo()+ " "+manager[i].getGender());
					return manager[i];
					
				}
				System.out.println("end of getManagerBycontactNo");
			}
			return null;
		}
		
		public boolean updateManagerIdByUpdateManagerName(int newId,String managerName) {
			boolean isIdUpdated=false;
			for(int i=0;i<manager.length;i++) {
				if(manager[i].getManagerName()==managerName) {
					System.out.println("current name is" +manager[i].getManagerName());
					manager[i].setManagerId(newId);
					System.out.println("current name is "+manager[i].getManagerName());
				}	
			}
			return isIdUpdated;
			
		}	
}
