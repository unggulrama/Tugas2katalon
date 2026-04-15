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

WebUI.click(findTestObject('Object Repository/Page_Checkout/btn_a_Shop'))

WebUI.click(findTestObject('Page_Checkout/a_Add to basket'))

WebUI.click(findTestObject('Page_Checkout/a_View Basket'))

WebUI.click(findTestObject('Object Repository/Page_Checkout/btn_a_Proceed to Checkout'))

WebUI.setText(findTestObject('Object Repository/Page_Checkout/input__billing_first_name'), Firstname)

WebUI.setText(findTestObject('Page_Checkout/input__billing_last_name'), Lastname)

WebUI.setText(findTestObject('Object Repository/Page_Checkout/input_Company Name_billing_company'), Companyname)

WebUI.setText(findTestObject('Object Repository/Page_Checkout/input__billing_email'), Emailaddress)

WebUI.setText(findTestObject('Object Repository/Page_Checkout/input__billing_phone'), Phone)

WebUI.setText(findTestObject('Object Repository/Page_Checkout/input__billing_address_1'), Address)

WebUI.setText(findTestObject('Object Repository/Page_Checkout/input__billing_city'), Towncity)

WebUI.setText(findTestObject('Object Repository/Page_Checkout/input__billing_postcode'), Postcodezip)

select_radio = Paymentmethod

switch (select_radio) {
    case 'Direct Bank Transfer':
        WebUI.click(findTestObject('Object Repository/Page_Checkout/input__payment_method_bacs'))

        break
    case 'Check Payments':
        WebUI.click(findTestObject('Object Repository/Page_Checkout/input_Direct Bank Transfer_payment_method_cheque'))

        break
    case 'Cash on Delivery':
        WebUI.click(findTestObject('Object Repository/Page_Checkout/input_Check Payments_payment_method_cod'))

        break
    case 'PayPal Express Checkout':
        WebUI.click(findTestObject('Object Repository/Page_Checkout/input_Cash on Delivery_payment_method_ppec_paypal'))

        break
    default:
        break
}

WebUI.click(findTestObject('Object Repository/Page_Checkout/input_PayPal Express Checkout_place_order'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Checkout/p_Thank you. Your order has been received'), 
    0)

