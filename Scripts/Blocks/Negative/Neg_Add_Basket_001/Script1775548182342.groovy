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

WebUI.click(findTestObject('Object Repository/Page_Automation Practice Site/btn_a_My Account'))

WebUI.setText(findTestObject('Object Repository/Page_My Account/text_input__username'), 'unggulramadhan9@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_My Account/text_input__password'), 'v5C/TllZAXyByKx33ijfmg==')

WebUI.click(findTestObject('Object Repository/Page_My Account/btn_Remember me_rememberme'))

WebUI.click(findTestObject('Object Repository/Page_My Account/btn_input__login'))

WebUI.click(findTestObject('Object Repository/Page_My Account/btn_a_Shop'))

WebUI.click(findTestObject('Object Repository/Page_Products/img_Sale_attachment-shop_catalog size-shop__dbdc79'))

WebUI.setText(findTestObject('Page_Android Quick Start Guide  Automation Practice Site/input_Android OS_quantity'), '0')

WebUI.click(findTestObject('Page_Android Quick Start Guide  Automation Practice Site/btn_Add to basket'))

WebUI.waitForElementNotVisible(findTestObject('Page_Android Quick Start Guide  Automation Practice Site/text_View Basket Android Quick Start Guide'), 
    0)

