package com.xworks.distributorapp.distributor;

import java.io.Serializable;
import java.util.Iterator;

import com.xworks.distributorapp.BloodGroup.BloodGroup;
import com.xworks.gender.Gender;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Data
@ToString
@Setter
@Getter
public class SalesPersonDto  implements Serializable,Comparable< SalesPersonDto >{
	
                private Integer id;
                private String salesPersonName;
                private String address;
                private Gender gender;
                private Long PhoneNumber;
                private Integer age;
                private BloodGroup bloodGroup;
				@Override
				public int compareTo(SalesPersonDto o) {
					// TODO Auto-generated method stub
					return this.id-o.id;
				}
				
                
                
}
