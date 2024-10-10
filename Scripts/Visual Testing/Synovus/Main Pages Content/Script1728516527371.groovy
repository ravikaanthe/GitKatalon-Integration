import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.synovus.com/')

WebUI.waitForPageLoad(5)

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Synovus Main Pages/Page_Welcome to Synovus - Synovus/a_Personal'))

WebUI.waitForPageLoad(5)

WebUI.takeFullPageScreenshotAsCheckpoint('Synovus_Personal')

WebUI.click(findTestObject('Object Repository/Synovus Main Pages/Page_Personal - Synovus/a_Small Business'))

WebUI.waitForPageLoad(5)

WebUI.takeFullPageScreenshotAsCheckpoint('Synovus_SmallBusiness')

WebUI.click(findTestObject('Object Repository/Synovus Main Pages/Page_Small Business - Synovus/a_Corporate  Commercial'))

WebUI.waitForPageLoad(5)

WebUI.takeFullPageScreenshotAsCheckpoint('Synovus_CorporateCommercial')

WebUI.click(findTestObject('Object Repository/Synovus Main Pages/Page_Corporate  Commercial - Synovus/a_Wealth'))

WebUI.waitForPageLoad(5)

WebUI.takeFullPageScreenshotAsCheckpoint('Synovus_Wealth')

WebUI.click(findTestObject('Object Repository/Synovus Main Pages/Page_Wealth Services - Synovus/a_About us'))

WebUI.waitForPageLoad(5)

WebUI.takeFullPageScreenshotAsCheckpoint('Synovus_AboutUs')

WebUI.mouseOver(findTestObject('Synovus Main Pages/Page_Welcome to Synovus - Synovus/a_Personal'))

WebUI.click(findTestObject('Object Repository/Synovus Main Pages/Page_About Us - Synovus/a_Bank'))

WebUI.click(findTestObject('Object Repository/Synovus Main Pages/Page_Personal Checking Accounts - Synovus/div_Personal Debit Cards'))

WebUI.waitForPageLoad(5)

WebUI.takeFullPageScreenshotAsCheckpoint('Synovus_Personal_Bank_DebitCards')

WebUI.mouseOver(findTestObject('Synovus Main Pages/Page_Welcome to Synovus - Synovus/a_Personal'))

WebUI.click(findTestObject('Object Repository/Synovus Main Pages/Page_About Us - Synovus/a_Bank'))

WebUI.click(findTestObject('Object Repository/Synovus Main Pages/Page_Personal Debit Cards from Synovus - Synovus/div_Savings'))

WebUI.waitForPageLoad(5)

WebUI.takeFullPageScreenshotAsCheckpoint('Synovus_Personal_Bank_Savings')

WebUI.mouseOver(findTestObject('Synovus Main Pages/Page_Welcome to Synovus - Synovus/a_Personal'))

WebUI.click(findTestObject('Object Repository/Synovus Main Pages/Page_About Us - Synovus/a_Bank'))

WebUI.click(findTestObject('Object Repository/Synovus Main Pages/Page_Compare your savings options - Synovus/div_Money Market Accounts'))

WebUI.waitForPageLoad(5)

WebUI.takeFullPageScreenshotAsCheckpoint('Synovus_Personal_Bank_MMAAccounts')

WebUI.mouseOver(findTestObject('Synovus Main Pages/Page_Welcome to Synovus - Synovus/a_Personal'))

WebUI.click(findTestObject('Object Repository/Synovus Main Pages/Page_About Us - Synovus/a_Bank'))

WebUI.click(findTestObject('Object Repository/Synovus Main Pages/Page_Personal Money Market Accounts - Synovus/div_Certificates of Deposit'))

WebUI.waitForPageLoad(5)

WebUI.takeFullPageScreenshotAsCheckpoint('Synovus_Personal_Bank_CDs')

WebUI.mouseOver(findTestObject('Synovus Main Pages/Page_Welcome to Synovus - Synovus/a_Personal'))

WebUI.click(findTestObject('Object Repository/Synovus Main Pages/Page_About Us - Synovus/a_Bank'))

WebUI.click(findTestObject('Object Repository/Synovus Main Pages/Page_Personal CDs - Synovus/div_Health Savings Account'))

WebUI.waitForPageLoad(5)

WebUI.takeFullPageScreenshotAsCheckpoint('Synovus_Personal_Bank_HealthSavings')

WebUI.closeBrowser()

