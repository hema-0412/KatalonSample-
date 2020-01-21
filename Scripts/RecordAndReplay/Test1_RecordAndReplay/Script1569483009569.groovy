import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://executeautomation.com/demosite/Login.html')

WebUI.setText(findTestObject('Test1_OR/Page_Execute Automation/input_Login_UserName'), 'admin')

WebUI.setEncryptedText(findTestObject('Test1_OR/Page_Execute Automation/input_Login_Password'), 'RAIVpflpDOg=')

WebUI.click(findTestObject('Test1_OR/Page_Execute Automation/input_Login_Login'))

WebUI.selectOptionByValue(findTestObject('Test1_OR/Page_Execute Automation/select_SelectMrMs'), '2', true)

WebUI.setText(findTestObject('Test1_OR/Page_Execute Automation/input_Initial_Initial'), 'N')

WebUI.setText(findTestObject('Test1_OR/Page_Execute Automation/input__FirstName'), 'hema')

WebUI.setText(findTestObject('Test1_OR/Page_Execute Automation/input_Middle Name_MiddleName'), 'vathi')

WebUI.takeScreenshot()

WebUI.click(findTestObject('Test1_OR/Page_Execute Automation/input_MaleFemale_Female'))

WebUI.click(findTestObject('Test2_OR/Page_Execute Automation/input_EnglishHindi_Save'))

