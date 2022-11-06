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

'opens the web browser and inputs the URL of Demoblaze'
WebUI.openBrowser('https://www.demoblaze.com/index.html')

'maximizes the window of the web browser'
WebUI.maximizeWindow()

'clicks on the Login Menu Button at the upper right of the Demoblaze Store'
WebUI.click(findTestObject('Object Repository/Main Page/Login Menu Button'))

'enters a Valid Username text in the Username field'
WebUI.setText(findTestObject('Object Repository/Login Inputs/Valid Username Input'), 'test')

'enters the Valid Username\'s password in the Password Field'
WebUI.setEncryptedText(findTestObject('Object Repository/Login Inputs/Valid Password Input'), 'P9ET2sDE0SE=')

'clicks the login button in the login window'
WebUI.click(findTestObject('Object Repository/Login Window/Login Button'))

'verifies that the upper right corner of the page shows the "Welcome <Username>" UI Element'
WebUI.verifyElementPresent(findTestObject('Main Page/Welcome Username'), 5)

'clicks on the Logout Menu Button at the upper right of the Demoblaze Store'
WebUI.click(findTestObject('Object Repository/Main Page/Logout Menu Button'))

'closes the browser'
WebUI.closeBrowser()

