import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://34.215.218.253:9998/')

WebUI.setText(findTestObject('Page_ProjectBackend/input_username'), username)

WebUI.setText(findTestObject('Page_ProjectBackend/input_password'), password)

WebUI.click(findTestObject('Page_ProjectBackend/button_Login'))

WebUI.click(findTestObject('Page_ProjectBackend/a_Total Transaction'))

WebUI.verifyElementText(findTestObject('Page_ProjectBackend/td_1'), orderid)

WebUI.verifyElementText(findTestObject('Page_ProjectBackend/td_Garden Papaya'), transcation)

WebUI.verifyElementText(findTestObject('Page_ProjectBackend/td_2'), orderid2)

WebUI.verifyElementText(findTestObject('Page_ProjectBackend/td_Banana Garden Banana Rambut'), transcation2)

WebUI.closeBrowser()

