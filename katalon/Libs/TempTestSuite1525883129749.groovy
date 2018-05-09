import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.exception.StepFailedException
import com.kms.katalon.core.reporting.ReportUtil
import com.kms.katalon.core.main.TestCaseMain
import com.kms.katalon.core.testdata.TestDataColumn
import groovy.lang.MissingPropertyException
import com.kms.katalon.core.testcase.TestCaseBinding
import com.kms.katalon.core.driver.internal.DriverCleanerCollector
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.configuration.RunConfiguration
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

Map<String, String> suiteProperties = new HashMap<String, String>();


suiteProperties.put('id', 'Test Suites/test suite9')

suiteProperties.put('name', 'test suite9')

suiteProperties.put('description', 'After selecting the products, if the user moves to the Carts page, all the selected products is shown in the cart page. The user can change the amount of products for each type of product, and the total price will be changed regarding to the input value.')
 

DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())



RunConfiguration.setExecutionSettingFile("C:\\Users\\42916\\Desktop\\Advance Software Development\\project\\234project-backend\\katalon\\Reports\\test suite9\\20180509_232529\\execution.properties")

TestCaseMain.beforeStart()

TestCaseMain.startTestSuite('Test Suites/test suite9', suiteProperties, [new TestCaseBinding('Test Cases/case9 - Iteration 1', 'Test Cases/case9',  [ 'password' : 'user' , 'username' : 'user' ,  ]), new TestCaseBinding('Test Cases/case9 - Iteration 2', 'Test Cases/case9',  [ 'password' : 'hello' , 'username' : 'hello' ,  ])])
