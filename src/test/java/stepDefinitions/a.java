/*
package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.MedunnaPage;
import utilities.Driver;
import utilities.ReusableMethods;

public class a {
    MedunnaPage medunnaPageObje=new MedunnaPage();
    Select select;
    Actions actions=new Actions(Driver.getDriver());
    Faker faker=new Faker();
    @Given("Kullanici belirtilen URL' e gider")
    public void kullaniciBelirtilenURLEGider() {
        Driver.getDriver().get("https://www.medunna.com");

    }

    @Then("Kullanici anasayfanin gorundugunu dogrular")
    public void kullaniciAnasayfaninGorundugunuDogrular() {
        String expectedUrl="https://www.medunna.com/";
        String actualUrl=Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);
    }

    @And("Kullanici login  butonuna tiklar")
    public void kullaniciLoginButonunaTiklar() {
        ReusableMethods.waitForVisibility(medunnaPageObje.ilkPageGirisButton,3);
        medunnaPageObje.ilkPageGirisButton.click();

 } @And("Kullanici register  butonuna tiklar")
    public void kullaniciRegisterButonunaTiklar() {
        ReusableMethods.waitForVisibility(medunnaPageObje.dropDownRegister,5);
        medunnaPageObje.dropDownRegister.click();
    }

    @And("Kullanici gecerli SSN numarasini girer ve formu doldurur")
    public void kullaniciGecerliSSNNumarasiniGirerVeFormuDoldurur() {
        ReusableMethods.waitForVisibility(medunnaPageObje.ssn,3);
        medunnaPageObje.ssn.click();

        actions.sendKeys(faker.number().digits(3)).sendKeys("-")
                .sendKeys(faker.number().digits(2)).sendKeys("-")
                .sendKeys(faker.number().digits(4)).sendKeys(Keys.TAB)
                .sendKeys(faker.name().firstName()).sendKeys(Keys.TAB)
                .sendKeys(faker.name().lastName()).sendKeys(Keys.TAB)
                .sendKeys(faker.name().username()).sendKeys(Keys.TAB)
                .sendKeys(faker.internet().emailAddress()).sendKeys(Keys.TAB)
                .sendKeys("Abc123+").sendKeys(Keys.TAB).sendKeys("Abc123+").sendKeys(Keys.TAB,Keys.ENTER).perform();
        ReusableMethods.waitFor(1);

    }
    @Then("Kullanici gecerli SSN numarasini girildigini dogrular")
    public void kullaniciGecerliSSNNumarasiniGirildiginiDogrular() throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertTrue(medunnaPageObje.registrationSavedMessage.isDisplayed());
    }

    @Then("Kullanici Registration sayfasina girdigini dogrular")
    public void kullaniciRegistrationSayfasinaGirdiginiDogrular() {
        String expectedUrl="https://www.medunna.com/account/register";
        String actualUrl=Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);

    }@And("Kullanici gecerli firstname girer")
    public void kullaniciGecerliFirstnameGirer() {
        medunnaPageObje.firstname.sendKeys("Habibe",Keys.ENTER);
    }

    @Then("Kullanici acilan sayfada SSN bolumune {string} girmeden kayit olamadigini dogrular")
    public void kullaniciAcilanSayfadaSSNBolumuneGirmedenKayitOlamadiginiDogrular(String arg0) {
        Assert.assertTrue(medunnaPageObje.yourSsnRequired.isDisplayed());

    }



}
*/
