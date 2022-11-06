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

'clicks on the Login Menu button at the upper right of the Demoblaze Store'
WebUI.click(findTestObject('Object Repository/Main Page/Login Menu Button'))

'enters an invalid username text in the username field'
WebUI.setText(findTestObject('Object Repository/Login Inputs/Invalid Username Input'), 'thiswillnotbeallowedtologin!@#')

'enters an invalid password in the password field'
WebUI.setEncryptedText(findTestObject('Object Repository/Login Inputs/Invalid Password Input'), 'NdCnveT7l+kIjg5UqwCrshkufgYN59pndluDmGBf7/g=')

'Clicks on the login button in the login window'
WebUI.click(findTestObject('Object Repository/Login Window/Login Button'))

'closes the login window\r\n'
WebUI.click(findTestObject('Object Repository/Login Window/Close Button'))

'Verifies that there is still a Login Menu Button. This is to make sure that the previous login did not push'
WebUI.verifyElementPresent(findTestObject('Main Page/Login Menu Button'), 1)

'Verifies that there is sill a Sign Up Menu Button. This is to make sure that the previous login did not push'
WebUI.verifyElementPresent(findTestObject('Main Page/Sign Up Menu Button'), 1)

'Closes the browser'
WebUI.closeBrowser()

