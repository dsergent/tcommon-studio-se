package com.talend.tac.cases.projects;

import java.awt.Event;
import java.awt.event.KeyEvent;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


import com.talend.tac.cases.Login;
import com.thoughtworks.selenium.Selenium;

public class TestAddPerlproject extends Login{
	TestDeletepro delete = new TestDeletepro();
  @Test
  @Parameters({ "SVNPerlProjecturl","ProjectType", "SVNuserName", "SVNuserPassword","Prolanguage" })
  public void addPerlproject(String perlUrl,String protype,String username,String password,String language) {
	  this.waitForElementPresent("!!!menu.project.element!!!", 30);
	  String namecommon = "TestPro";
	  String svnUrl =perlUrl;
	  selenium.setSpeed("3000");
	  selenium.click("!!!menu.project.element!!!");
	  selenium.click("idSubModuleAddButton");
	  selenium.click("idLabelInput");
	  selenium.setSpeed("0");
	  selenium.type("idLabelInput", namecommon);
	  selenium.fireEvent("idLabelInput", "blur");
	  if ("Java".equals(language) || "".equals(language)) {

		} else {
			selenium.click("idLanguageInput");
			selenium.mouseDownAt("//div[@role='listitem'][2]",""+KeyEvent.VK_ENTER);
		}
	  
	  selenium.type("idDescriptionInput", "adf");
	  selenium.fireEvent("idDescriptionInput", "blur");
	
	  selenium.click("idAdvanceInput");
	  selenium.type("idUrlInput", svnUrl);// svn
	               
	  selenium.fireEvent("idUrlInput", "blur");
	  selenium.type("idLoginInput", username);// svn account
	  selenium.fireEvent("idLoginInput", "blur");
	  selenium.type("idPasswordInput", password);// svn password
	  selenium.fireEvent("idPasswordInput", "blur");
	  selenium.click("idSvnCommitInput");
	  selenium.mouseDownAt("//div[@role='listitem'][2]",""+KeyEvent.VK_ENTER);
	  selenium.click("idSvnLockInput");
	  selenium.mouseDownAt("//div[@role='listitem'][2]",""+KeyEvent.VK_ENTER);
	  selenium.click("idSvnUserLogInput");
	  selenium.click("idDescriptionInput");
	  selenium.fireEvent("idDescriptionInput", "blur");
	  selenium.setSpeed("5000");
	  selenium.focus("idFormSaveButton");
	  selenium.keyDownNative(""+KeyEvent.VK_ENTER);
	  selenium.keyUpNative(""+KeyEvent.VK_ENTER);
	
	  Assert.assertTrue(
	    selenium.isElementPresent("//div[@class='x-grid3-cell-inner x-grid3-col-label' and (text()='"
	      + namecommon + "')]")&&(selenium.isElementPresent("//img[@title='perl']")), "common project added failed");
	 
	  //delete the added perl project
	  deleteProject(selenium,namecommon);
	 }
  
  public void deleteProject(Selenium s,String proname){
	  
	  delete.okDelete(s,proname);
	  
  }
}
