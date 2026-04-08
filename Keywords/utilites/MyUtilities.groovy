package utilites

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class MyUtilities {
	@Keyword
	def generateRandomEmail(int length) {
		// Daftar karakter yang diperbolehkan untuk username email (huruf kecil & angka)
		String chars = "abcdefghijklmnopqrstuvwxyz0123456789"
		Random rand = new Random()
		StringBuilder sb = new StringBuilder()
		
		// Loop untuk membuat string acak sepanjang 'length'
		for (int i = 0; i < length; i++) {
			sb.append(chars.charAt(rand.nextInt(chars.length())))
		}
		
		// Tambahkan domain @gmail.com di akhir
		String fullEmail = sb.toString() + "@gmail.com"
		
		return fullEmail
	}
}

