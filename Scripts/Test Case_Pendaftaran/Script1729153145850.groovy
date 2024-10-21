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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://his.sismedika.online/awalbros/hisv2/login.php')

WebUI.setText(findTestObject('Object Repository/Test4/Page_Login HOS SISMEDIKA v2/input_Login__UserName'), 'fadhil')

WebUI.setEncryptedText(findTestObject('Object Repository/Test4/Page_Login HOS SISMEDIKA v2/input_Login__Password'), 'aeHFOx8jV/A=')

WebUI.click(findTestObject('Object Repository/Test4/Page_Login HOS SISMEDIKA v2/button_Login'))

WebUI.click(findTestObject('Object Repository/Test4/Page_HOS SISMEDIKA v2/a_Transaksi'))

WebUI.click(findTestObject('Object Repository/Test4/Page_HOS SISMEDIKA v2/a_Pendaftaran RJ v2'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Test4/Page_HOS SISMEDIKA v2/select_Rawat Jalan'), 'KSRRJ', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Test4/Page_HOS SISMEDIKA v2/select_PagiSiangMalam'), 'PAGI', 
    true)

WebUI.click(findTestObject('Object Repository/Test4/Page_HOS SISMEDIKA v2/input__buka_shift'))

WebUI.click(findTestObject('Object Repository/Test4/Page_HOS SISMEDIKA v2/input_Cari Pasien__btn_pendaftaran_rj'))

WebUI.click(findTestObject('Object Repository/Test4/Page_HOS SISMEDIKA v2/input_No. Rekam Medis__btn_cari_medrec'))

WebUI.setText(findTestObject('Object Repository/Test4/Page_HOS SISMEDIKA v2/input_Cari Nama_cari_nama'), 'test')

WebUI.click(findTestObject('Object Repository/Test4/Page_HOS SISMEDIKA v2/input_Cari Tanggal Lahir__btn_pencarian_mr'))

