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


suiteProperties.put('id', 'Test Suites/test suite12')

suiteProperties.put('name', 'test suite12')

suiteProperties.put('description', '')
 

DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())



RunConfiguration.setExecutionSettingFile("C:\\Users\\42916\\Desktop\\Advance Software Development\\project\\234project-backend\\katalon\\Reports\\test suite12\\20180510_003722\\execution.properties")

TestCaseMain.beforeStart()

TestCaseMain.startTestSuite('Test Suites/test suite12', suiteProperties, [new TestCaseBinding('Test Cases/case12', 'Test Cases/case12',  [ 'orderid2' : '2' , 'transcation' : 'Garden, Papaya' , 'password' : 'admin' , 'orderid' : '1' , 'username' : 'admin' , 'transcation2' : 'Banana, Garden, Banana, Rambutan' ,  ])])
