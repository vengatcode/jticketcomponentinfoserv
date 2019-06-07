/**
 * 
 */
package com.paypal.springbootstarter.comp.info;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.paypal.springbootstarter.pojo.OwnerOfCompResponse;
import com.paypal.springbootstarter.pojo.PackageSummaryResponse;

/**
 * @author vrathinavel
 *
 */
@Service
public class ComponentInfoService implements CommandLineRunner{
	
	@Autowired
	ComponentInfoFilter componentInfoFilter;
	
	RestTemplate restTemplate = new RestTemplate();
	
	public OwnerOfCompResponse getCompOwnerInfo(String compName){
		PackageSummaryResponse packageSummaryResponse = restTemplate.getForObject("https://ownership.paypalcorp.com/package-metadata/api/package_summary/?package_name=" + compName, PackageSummaryResponse.class);
		System.out.println(packageSummaryResponse);
		return componentInfoFilter.getCompOwnerDetails(packageSummaryResponse);
	}

	public void run(String... arg0) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
