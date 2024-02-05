package Pages;

import Utilities.GWD;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Elements extends Parent{
    public Elements() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(css = "[placeholder='Kullanıcı Adı']")
    private WebElement userName;
    @FindBy(css = "[placeholder='Parola']")
    private WebElement password;
    @FindBy(css = "[class='mdc-button__label']")
    private WebElement loginBtn;
    @FindBy(xpath = "//*[@id=\"container-2\"]/toolbar/mat-toolbar/div/div[1]/div[2]/div[3]/span")
    public WebElement loginSuccess;
    @FindBy(xpath = "//*[@id=\"container-1\"]/fuse-sidebar/navbar/navbar-vertical-style-1/mat-toolbar/div/div/div/div/fuse-navigation/div/fuse-nav-vertical-group/div/fuse-nav-vertical-collapsable[6]/a/span")
    private WebElement humanResources;
    @FindBy(xpath = "//*[@id=\"container-1\"]/fuse-sidebar/navbar/navbar-vertical-style-1/mat-toolbar/div/div/div/div/fuse-navigation/div/fuse-nav-vertical-group/div/fuse-nav-vertical-collapsable[6]/div/fuse-nav-vertical-collapsable[1]/a/span")
    private WebElement setup;
    @FindBy(xpath = "//*[@id=\"container-1\"]/fuse-sidebar/navbar/navbar-vertical-style-1/mat-toolbar/div/div/div/div/fuse-navigation/div/fuse-nav-vertical-group/div/fuse-nav-vertical-collapsable[6]/div/fuse-nav-vertical-collapsable[1]/div/fuse-nav-vertical-item[1]/a/span")
    private WebElement position;
    @FindBy(xpath = "/html/body/app/vertical-layout-1/div/div/div/div/content/employee-position/ms-browse/div/ms-browse-table/div/ms-table/div/cdk-virtual-scroll-viewport/div[1]/table/thead/tr/th[5]/ms-table-toolbar/div/ms-add-button/div/button/span[2]")
    private WebElement addPosition;
    @FindBy(xpath = "/html/body/div[2]/div[2]/div/mat-dialog-container/div/div/employee-position-dialog/ms-dialog/ms-dialog-content/div/div/mat-form-field/div/div[1]/div/ms-text-field/input")
    private WebElement positionName;
    @FindBy(xpath = "/html/body/div[2]/div[2]/div/mat-dialog-container/div/div/employee-position-dialog/ms-dialog/ms-dialog-content/div/mat-form-field/div/div[1]/div/ms-text-field/input")
    private WebElement shortName;
    @FindBy(xpath = "/html/body/div[2]/div[2]/div/mat-dialog-container/div/div/employee-position-dialog/ms-dialog/ms-dialog-buttons/mat-dialog-actions/ms-save-button")
    private WebElement positionAdd;
    @FindBy(css = "//mat-form-field//input[@data-placeholder='Name']")
    public WebElement positionSearch;
        @FindBy(css = "ms-delete-button[class='ng-star-inserted']")
    public WebElement positionDeleteImg;
    @FindBy(css = "[class='mdc-button mat-mdc-button mdc-button--raised mat-mdc-raised-button mat-accent mat-mdc-button-base']")
    public WebElement positionDeleteComplete;
    @FindBy(xpath = "/html/body/app/vertical-layout-1/div/div/fuse-sidebar/navbar/navbar-vertical-style-1/mat-toolbar/div/div/div/div/fuse-navigation/div/fuse-nav-vertical-group/div/fuse-nav-vertical-collapsable[6]/div/fuse-nav-vertical-collapsable[1]/div/fuse-nav-vertical-item[3]/a/span")
    private WebElement attesta;
    @FindBy(xpath = "/html/body/app/vertical-layout-1/div/div/div/div/content/app-attestation/ms-browse/div/ms-browse-table/div/ms-table/div/cdk-virtual-scroll-viewport/div[1]/table/thead/tr/th[3]/ms-table-toolbar/div/ms-add-button/div/button")
    private WebElement Addattesta;
    @FindBy(xpath = "/html/body/div[2]/div[2]/div/mat-dialog-container/div/div/attestation-dialog/ms-dialog/ms-dialog-content/div/div/mat-form-field/div/div[1]/div/ms-text-field/input")
    private WebElement attestaName;
    @FindBy(xpath = "/html/body/div[2]/div[2]/div/mat-dialog-container/div/div/attestation-dialog/ms-dialog/ms-dialog-buttons/mat-dialog-actions/ms-save-button")
    private WebElement attestaAdd;
    @FindBy(xpath = "/html/body/app/vertical-layout-1/div/div/div/div/content/app-attestation/ms-browse/div/ms-browse-search/div/mat-form-field/div/div[1]/div/ms-text-field/input")
    public WebElement attestaSearch;
    @FindBy(xpath = "//*[@id=\"ms-table-1\"]/div/cdk-virtual-scroll-viewport/div[1]/table/tbody/tr/td[3]/div[1]/ms-delete-button/button")
    public WebElement attestaDeleteImg;

    @FindBy(css = "[class='ng-tns-c2719486145-6 nav-collapsable nav-item ng-star-inserted']")
    private WebElement leftSetup;
    @FindBy(css = "[class='nav-link-title ng-tns-c2719486145-7 ng-star-inserted']")
    private WebElement Parameters;
    @FindBy(css = "div > fuse-nav-vertical-item:nth-child(10) > a > span")
    private WebElement documentTypes;
    @FindBy(css = "ms-add-button >div > button > span.mat-mdc-focus-indicator")
    private WebElement addDocument;
    @FindBy(xpath = "/html/body/div[2]/div[2]/div/mat-dialog-container/div/div/attestation-dialog/ms-dialog/ms-dialog-content/div/div/mat-form-field/div/div[1]/div/ms-text-field/input")
    private WebElement documentName;
    @FindBy(xpath = "/html/body/div[2]/div[2]/div/mat-dialog-container/div/div/ng-component/ms-dialog/ms-dialog-content/div/mat-form-field[2]/div/div[1]/div/mat-select/div/div[1]")
    public WebElement documentStage;

    @FindBy(css = "ms-dialog-buttons > mat-dialog-actions > ms-save-button")
    private WebElement documentAdd;
    @FindBy(xpath = "/html/body/div[2]/div[4]/div/div/div/mat-option[1]")
    private WebElement documentSelectStage;

    @FindBy(css = "div > fuse-nav-vertical-item:nth-child(12) > a > span")
    private WebElement customFields;
    @FindBy(xpath = "/html/body/div[2]/div[2]/div/mat-dialog-container/div/div/entity-field-dialog/ms-dialog/ms-dialog-content/div/div[1]/mat-form-field[1]/div/div[1]/div/ms-text-field")
    private WebElement fieldName;
    @FindBy(xpath = "/html/body/div[2]/div[2]/div/mat-dialog-container/div/div/entity-field-dialog/ms-dialog/ms-dialog-content/div/div[2]/mat-form-field[1]/div/div[1]/div/ms-text-field/input")
    private WebElement fieldCode;


    @FindBy(css = "div > fuse-nav-vertical-group > div > fuse-nav-vertical-collapsable.ng-tns-c2719486145-21.nav-collapsable.nav-item.ng-star-inserted > a > span")
    private WebElement Education;
    @FindBy(css = "div > fuse-nav-vertical-collapsable.ng-tns-c2719486145-22.ng-tns-c2719486145-21.nav-collapsable.nav-item.ng-star-inserted > a > span")
    private WebElement educationSetup;
    @FindBy(css = "div > fuse-nav-vertical-collapsable.ng-tns-c2719486145-22.ng-tns-c2719486145-21.nav-collapsable.nav-item.ng-star-inserted.open > div > fuse-nav-vertical-item:nth-child(1) > a > span")
    private WebElement subjectCategories;
    @FindBy(xpath = "/html/body/div[2]/div[2]/div/mat-dialog-container/div/div/subject-category-dialog/ms-dialog/ms-dialog-content/div/div/mat-form-field/div/div[1]/div/ms-text-field/input")
    private WebElement subjectName;
    @FindBy(xpath = "/html/body/div[2]/div[2]/div/mat-dialog-container/div/div/subject-category-dialog/ms-dialog/ms-dialog-content/div/mat-form-field/div/div[1]/div/ms-text-field/input")
    private WebElement subjectCode;
















    @FindBy(css = "div > fuse-nav-vertical-collapsable.ng-tns-c2719486145-8.ng-tns-c2719486145-6.nav-collapsable.nav-item.ng-star-inserted > a > span")
    private WebElement schoolSetup;










    public WebElement getWebElement(String strElement){
        switch (strElement){
            case "userName": return this.userName;
            case "password": return this.password;
            case "loginBtn": return this.loginBtn;
            case "humanResources": return this.humanResources;
            case "setup": return this.setup;
            case "position": return this.position;
            case "addPosition": return this.addPosition;
            case "positionName": return this.positionName;
            case "shortName": return this.shortName;
            case "positionAdd": return this.positionAdd ;
            case "positionSearch": return this.positionSearch ;
            case "positionDeleteImg": return this.positionDeleteImg ;
            case "positionDeleteComplete": return this.positionDeleteComplete ;
            case "attesta": return this.attesta ;
            case "Addattesta": return this.Addattesta ;
            case "attestaName": return this.attestaName ;
            case "attestaAdd": return this.attestaAdd ;
            case "attestaSearch": return this.attestaSearch ;
            case "attestaDeleteImg": return this.attestaDeleteImg ;
            case "leftSetup": return this.leftSetup ;
            case "Parameters": return this.Parameters ;
            case "documentTypes": return this.documentTypes ;
            case "addDocument": return this.addDocument ;
            case "documentName": return this.documentName ;
            case "documentStage": return this.documentStage ;
            case "documentAdd": return this.documentAdd ;
            case "documentSelectStage": return this.documentSelectStage ;
            case "customFields": return this.customFields ;
            case "fieldName": return this.fieldName ;
            case "fieldCode": return this.fieldCode ;
            case "Education": return this.Education ;
            case "educationSetup": return this.educationSetup ;
            case "subjectCategories": return this.subjectCategories ;
            case "subjectName": return this.subjectName ;
            case "subjectCode": return this.subjectCode ;

        }

        return null;
    }
    public void deleteItem(String searchText){

        mySendKeys(positionSearch, searchText);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        myClick(positionDeleteImg);
        myClick(positionDeleteComplete);


    }
}
