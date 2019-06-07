/**
 * 
 */
package com.paypal.springbootstarter.comp.info;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.paypal.springbootstarter.pojo.OwnerOfCompResponse;

/**
 * @author vrathinavel
 *
 */
@RestController
public class ComponentInfoCtrl {
	
	@Autowired
	ComponentInfoService componentInfoService;

	
	@RequestMapping("/componentname/{compName}")
	public OwnerOfCompResponse getCompOwnerInfo(@PathVariable String compName){
		return componentInfoService.getCompOwnerInfo(compName);
		
	}

}
