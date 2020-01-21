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
import org.openqa.selenium.By as By
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.espn.in/mlb/team/depth/_/name/bos')

WebUI.waitForPageLoad(10)

WebUI.maximizeWindow()

WebDriver driver = DriverFactory.getWebDriver()

'Expected value from Table'
String ExpectedValue = 'Heath Hembree'

'To locate table'
WebElement Table = driver.findElement(By.xpath('/html/body/div[1]/div/div/div/div/div[5]/div[2]/div[5]/div[1]/div[1]/section/div/section/div[2]/div[1]/section/div[2]/div'))

'To locate rows of table it will Capture all the rows available in the table'
List<WebElement> rows_table = Table.findElements(By.tagName('tr'))

'To calculate no of rows In table'
int rows_count = rows_table.size()

println(rows_count //Total no rows
    )

boolean Value = false

'Loop will execute for all the rows of the table'
for (int i = 0; i < rows_count; i++) {
    'To locate columns(cells) of that specific row'
    List<WebElement> Columns_row = rows_table.get(i).findElements(By.tagName('td' //Identification of entire Column values
            ))

    'To calculate no of columns(cells) In that specific row'
    int columns_count = Columns_row.size()

    println((('Number of cells In Row ' + i) + ' are ') + columns_count //Total no of columns in each row
        )

    'Loop will execute till the last cell of that specific row'
    for (int j = 0; j < columns_count; j++) {
        'It will retrieve text from each cell'
        String celltext = Columns_row.get(j).getText()

        println((((('Cell Value Of row number ' + i) + ' and column number ') + j) + ' Is ') + celltext //Fetching All the Cell valuess
            )

        if (Value == false) {
            'Checking if Cell text is matching with the expected value'
            if (celltext == ExpectedValue) {
                'Clicking on the specified player given as a input'
                Columns_row.get(j).findElement(By.tagName('a')).click()

                WebUI.waitForPageLoad(10)

                'Clicking on the statistics of the Specified player'
                WebUI.click(findTestObject('Page_Heath Hembree Stats - Boston Red Sox - ESPN/a_Stats'))

                WebUI.waitForPageLoad(10)

                Value = true

                break
            }
        }
    }
    
    if (Value == true) {
        break
    }
}

