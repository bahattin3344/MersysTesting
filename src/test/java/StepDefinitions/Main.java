package StepDefinitions;

import Pages.Elements;
import Pages.Parent;
import Utilities.GWD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import javax.xml.crypto.Data;
import java.util.List;

public class Main extends Parent {
    Elements el=new Elements();
    @Given("Navigate to mersys.io")
    public void navigateToMersysIo() {
        GWD.getDriver().get("https://test.mersys.io");
    }

    @And("User sending the keys in Elements")
    public void userSendingTheKeysInElements(DataTable dt) {
        List<List<String>>   items=  dt.asLists(String.class);

        for (int i = 0; i < items.size(); i++) {
            WebElement e=el.getWebElement(items.get(i).get(0)); // 0. webelement
            String string = items.get(i).get(1);//1. yazısı

            el.mySendKeys(e, string);

        }
    }

    @And("Click on the element in Elements")
    public void clickOnTheElementInElements(DataTable dt) {
        List<String> strButtonsList = dt.asList(String.class);

        for (int i = 0; i < strButtonsList.size(); i++) {
            WebElement linkWebElement = el.getWebElement(strButtonsList.get(i));
            el.myClick(linkWebElement);
        }
    }


    @Then("Success message should be displayed")
    public void successMessageShouldBeDisplayed() {
        el.verifyContainsText(el.loginSuccess,"Ana Sayfa ");
    }





    @And("User Delete")
    public void userDelete(DataTable dt) {
        List<String> delete = dt.asList(String.class);

        for (int i = 0; i < delete.size(); i++) {
            el.deleteItem(delete.get(i));
        }
    }

    @And("User Search And Delete name as {string}")
    public void userSearchAndDelete(String name) {
        mySendKeys(el.attestaSearch,name);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        myClick(el.positionDeleteImg);
        myClick(el.positionDeleteComplete);


    }


    @And("User Search And Delete name as {string} webelement as {string}")
    public void userSearchAndDeleteNameAsWebelementAs(WebElement element, String name) {
        mySendKeys(element,name);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        myClick(el.positionDeleteImg);
        myClick(el.positionDeleteComplete);
    }



}



