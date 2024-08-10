package com.cognizant.pagefactory;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cognizant.basepackage.BaseClass;


public class HomePage extends BaseClass {
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(id="twotabsearchtextbox")
	public WebElement searchBox;
	
	@FindAll({
		@FindBy(xpath="//input[@value='Go']"),
		@FindBy(xpath="//input[@type='note']")
	})	
	public WebElement searchBtn;
	
	@FindBy(tagName="a")
	public List<WebElement> links;
	

}
