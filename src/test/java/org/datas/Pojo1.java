package org.datas;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pojo1 extends BaseClass {

	public Pojo1() {
		PageFactory.initElements(driver, this);
	}

	@CacheLookup
	@FindAll({

			@FindBy(xpath = "//input[@id='email']"), 
			@FindBy(xpath = "//input[@name='email']")

	})

	private WebElement txtUser;

	@CacheLookup
	@FindAll({

			@FindBy(xpath = "//input[@id='pass']"), 
			@FindBy(xpath = "//input[@name='pass']")

	})

	private WebElement txtPass;

	@CacheLookup
	@FindAll({

			@FindBy(xpath = "//button[@name='login']"), 
			@FindBy(xpath = "//input[@name='login']")

	})

	private WebElement btnClick;

	public WebElement getTxtUser() {
		return txtUser;
	}

	public WebElement getTxtPass() {
		return txtPass;
	}

	public WebElement getBtnClick() {
		return btnClick;
	}

}
