package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.MedunnaPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US003StepDefs {
    MedunnaPage page=new MedunnaPage();
    Actions actions= new Actions(Driver.getDriver());
    @Given("New Password bolumune uc karakterli bir sifre {string} girilir")
    public void newPasswordBolumuneUcKarakterliBirSifreGirilir(String invalidSifre) {
      actions.sendKeys(Keys.PAGE_DOWN).perform();
      ReusableMethods.jsclick(page.newPasswordBox);
      page.newPasswordBox.sendKeys(invalidSifre);
      actions.sendKeys(Keys.TAB).sendKeys(Keys.TAB).perform();
    }

    @Then("Your password is required to be at least four characters. yazisinin goruldugu test edilir")
    public void yourPasswordIsRequiredToBeAtLeastCharactersYazisininGorulduguTestEdilir() {
        Assert.assertEquals(ConfigReader.getProperty("invalidPasswordFeedback"),page.invalidPasswordFeedback.getText());
    }

    @And("New Password bolumune en az dort karakterli bir sifre {string} girilir")
    public void newPasswordBolumuneEnAzKarakterliBirSifreGirilir(String validSifre) {
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.jsclick(page.newPasswordBox);
        page.newPasswordBox.sendKeys(validSifre);
        actions.sendKeys(Keys.TAB).sendKeys(Keys.TAB).perform();
        ReusableMethods.waitFor(1);
    }

    @And("Your password is required to be at least four characters. yazisinin gorunmedigi test edilir")
    public void yourPasswordIsRequiredToBeAtLeastCharactersYazisininGorunmedigiTestEdilir() {
       Assert.assertTrue(Driver.getDriver().getPageSource().contains(ConfigReader.getProperty("ValidFeedBack")));
    }

    @Given("New Password bolumune yedi karakterden az bir sifre {string} girilir")
    public void newPasswordBolumuneKarakterdenAzBirSifreGirilir(int arg0, String arg1) {

    }

    @Then("Password strength seviyesinin bes olmadigi test edilir")
    public void passwordStrengthSeviyesininOlmadigiTestEdilir(int arg0) {
    }

    @Given("New Password bolumune guclu sifre {string} girilir")
    public void newPasswordBolumuneGucluSifreGirilir(String arg0) {
    }

    @Then("Password strength seviyesinin {int} oldugu dogrulanir")
    public void passwordStrengthSeviyesininOlduguDogrulanir(int arg0) {
    }

    @Given("New Password bolumune {int} rakamli bir sifre {string} girilir")
    public void newPasswordBolumuneRakamliBirSifreGirilir(int arg0, String arg1) {
    }

    @Then("{int}RakamliSifre'nin Password strength seviyesi tespit edilir")
    public void rakamlisifreNinPasswordStrengthSeviyesiTespitEdilir(int arg0) {
    }

    @And("New Password bolumune {int} haneli rakam ve kucuk harfli sifre {string} girilir")
    public void newPasswordBolumuneHaneliRakamVeKucukHarfliSifreGirilir(int arg0, String arg1) {
    }

    @And("En an bir kucuk harf eklenince password strength seviyesinin degistigi dogrulanir")
    public void enAnBirKucukHarfEklenincePasswordStrengthSeviyesininDegistigiDogrulanir() {
    }
}