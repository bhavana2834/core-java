package com.xworks.distributorapp.distributor;

import java.util.List;

public interface DistributorDto {
	
	
	
          public boolean addSalesPerson(SalesPersonDto dto) throws Exception;
          
          public  List<SalesPersonDto> getAllSalesPerson() throws Exception;
          
}
