package utilities;
import browserfactory.BaseTest;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

import browserfactory.BaseTest;

public class Utility extends BaseTest {

    public void clickOnElement(By by) {
        driver.findElement(by).click();
    }

    public void verifyTextFromElement(By by, String expectedText) {
        WebElement actualText = driver.findElement(by);
        String actual = actualText.getText();
        Assert.assertEquals(expectedText, actual);
    }

    public void mouseHoverToElement(By by) {
        Actions actions = new Actions(driver);
        WebElement mouseHoover = driver.findElement(by);


        actions.moveToElement(mouseHoover).build().perform();
    }


    /**
     * This method will select the option visible text from dropdown menu
     */

    public void selectByVisibleTextFromDropdown(By by, String text) {
        WebElement dropDown = driver.findElement(by);
        Select select = new Select(dropDown);
        select.selectByVisibleText(text);
    }

    /**
     * This method will get Text from element
     */

    public String getTextFromElement(By by) {

        return driver.findElement(by).getText();
    }

    /**
     * This method will find an element
     */

    public WebElement findElementFromWebPage(By by) {
        return driver.findElement(by);
    }

    /**
     * This method will send text to element
     */
    public void sendTextToElement(By by, String text) {

        driver.findElement(by).sendKeys(text);
    }

    /**
     * This method will find the list of elements
     */
    public List<WebElement> findElementsFromWebPage(By by) {
        return driver.findElements(by);
    }

    /**
     * This method will verify the element
     */
    public void verifyElements(String displayMessage, String expectedMessage, By by) {
        String actualMessage = getTextFromElement(by);
        Assert.assertEquals(displayMessage, expectedMessage, actualMessage);
    }
}
