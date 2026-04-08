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

WebUI.setText(findTestObject('Page_My Account/text_input__reg_email'), CustomKeywords.'utilites.MyUtilities.generateRandomEmail'(
        12))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_My Account/text_input__reg_password'), 
    'v5C/TllZAXyByKx33ijfmg==')

WebUI.click(findTestObject('Object Repository/Page_My Account/btn_Anti-spam_register'))

WebUI.verifyElementVisible(findTestObject('Page_My Account/text_Hello unggulramadhan99999 (not unggulramadhan99999 Sign out)'), 
    FailureHandling.STOP_ON_FAILURE)

