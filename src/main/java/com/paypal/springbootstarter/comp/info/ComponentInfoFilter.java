/**
 * 
 */
package com.paypal.springbootstarter.comp.info;

import org.springframework.stereotype.Component;

import com.paypal.springbootstarter.pojo.OwnerOfCompResponse;
import com.paypal.springbootstarter.pojo.PackageSummaryResponse;

/**
 * @author vrathinavel
 *
 */
@Component
public class ComponentInfoFilter {
	
	public OwnerOfCompResponse getCompOwnerDetails(PackageSummaryResponse packageSummaryResponse){
		OwnerOfCompResponse ownerOfCompResponse = new OwnerOfCompResponse();
		ownerOfCompResponse.setPackage_name(packageSummaryResponse.getPackageName());
		ownerOfCompResponse.setOwner_dl_name(packageSummaryResponse.getOwnerDl().getOwnerDlDlName());
		ownerOfCompResponse.setOwner_dl_email(packageSummaryResponse.getOwnerDl().getOwnerDlEmail());
		ownerOfCompResponse.setOwner_support_dl_name(packageSummaryResponse.getOwnerSupportDl().getOwnerSupportDlDlName());
		ownerOfCompResponse.setOwner_support_dl_email(packageSummaryResponse.getOwnerSupportDl().getOwnerSupportDlEmail());
		ownerOfCompResponse.setTeam_lead_name(packageSummaryResponse.getTeamLead().getTeamLeadName());		
		ownerOfCompResponse.setTeam_lead_email(packageSummaryResponse.getTeamLead().getTeamLeadEmail());		
		ownerOfCompResponse.setTeam_manager_name(packageSummaryResponse.getTeamManager().getTeamManagerName());
		ownerOfCompResponse.setTeam_manager_email(packageSummaryResponse.getTeamManager().getTeamManagerEmail());
		ownerOfCompResponse.setGit_org(packageSummaryResponse.getGitRepo().getGitOrg());
		ownerOfCompResponse.setGit_url(packageSummaryResponse.getGitRepo().getGitUrl());
		return ownerOfCompResponse;
		
	}

}
