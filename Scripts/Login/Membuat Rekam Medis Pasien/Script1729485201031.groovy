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

WebUI.setText(findTestObject('Object Repository/Page_Login HOS SISMEDIKA v2/input_Login__UserName'), 'fadhil')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login HOS SISMEDIKA v2/input_Login__Password'), 'aeHFOx8jV/A=')

WebUI.click(findTestObject('Object Repository/Page_Login HOS SISMEDIKA v2/button_Login'))

WebUI.click(findTestObject('Object Repository/Page_HOS SISMEDIKA v2/a_Transaksi'))

WebUI.click(findTestObject('Object Repository/Page_HOS SISMEDIKA v2/a_Pendaftaran RJ v2'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_HOS SISMEDIKA v2/select_Rawat Jalan'), 'KSRRJ', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_HOS SISMEDIKA v2/select_PagiSiangMalam'), 'PAGI', true)

WebUI.click(findTestObject('Object Repository/Page_HOS SISMEDIKA v2/input__buka_shift'))

WebUI.click(findTestObject('Object Repository/Page_HOS SISMEDIKA v2/input_Cari Pasien__btn_pendaftaran_rj'))

WebUI.click(findTestObject('Object Repository/Page_HOS SISMEDIKA v2/input_No. Rekam Medis__btn_medrec_baru'))

WebUI.setText(findTestObject('Object Repository/Page_HOS SISMEDIKA v2/input_Nama Pasien_Nama'), 'Pasien Katalon')

WebUI.setText(findTestObject('Object Repository/Page_HOS SISMEDIKA v2/input_Nama Panggilan_Panggilan'), 'Katalon')

WebUI.setText(findTestObject('Object Repository/Page_HOS SISMEDIKA v2/input_Pekerjaan_Pekerjaan'), 'Testing Aplikasi')

WebUI.setText(findTestObject('Object Repository/Page_HOS SISMEDIKA v2/input_Tempat Lahir_TempatLahir'), 'Testing')

WebUI.setText(findTestObject('Object Repository/Page_HOS SISMEDIKA v2/input_format ddmmyyyy_TanggalLahirMR'), '')

WebUI.click(findTestObject('Object Repository/Page_HOS SISMEDIKA v2/div_PrevNextJanFebMarAprMayJunJulAugSepOctN_cb01af'))

WebUI.click(findTestObject('Object Repository/Page_HOS SISMEDIKA v2/a_1'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_HOS SISMEDIKA v2/select_Belum MenikahCeraiMenikah'), 'BM', 
    true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_HOS SISMEDIKA v2/select_KITASKartu Tanda Penduduk -- KTPPasp_23ed04'), 
    'KTP', true)

WebUI.click(findTestObject('Object Repository/Page_HOS SISMEDIKA v2/input_Nomer Identitas_NomerSosial'))

WebUI.setText(findTestObject('Object Repository/Page_HOS SISMEDIKA v2/input_Nomer Identitas_NomerSosial'), '92839394821234564')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_HOS SISMEDIKA v2/select_AfghanistanAlbaniaAlgeriaAmerican Sa_79acee'), 
    'INA', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_HOS SISMEDIKA v2/select_- Pilih Propinsi - AcehSumatera Utar_4cfab2'), 
    '36', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_HOS SISMEDIKA v2/select_- Pilih Kabupaten  Kota - Kab. Pande_dd3b8c'), 
    '3603', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_HOS SISMEDIKA v2/select_- Pilih Kecamatan - CisokaSolearTiga_44a582'), 
    '3603131', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_HOS SISMEDIKA v2/select_- Pilih Kelurahan - JayantiPasir Mun_3830bd'), 
    '3603131003', true)

WebUI.click(findTestObject('Object Repository/Page_HOS SISMEDIKA v2/input_Kelurahan  Kode Pos_KodePos'))

WebUI.doubleClick(findTestObject('Object Repository/Page_HOS SISMEDIKA v2/input_Kelurahan  Kode Pos_KodePos'))

WebUI.setText(findTestObject('Object Repository/Page_HOS SISMEDIKA v2/input_Kelurahan  Kode Pos_KodePos'), '2222')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_HOS SISMEDIKA v2/select_Lain-lainPerum 1Perum 2Perum 3Perum _782d7a'), 
    'Perum 3', true)

WebUI.setText(findTestObject('Object Repository/Page_HOS SISMEDIKA v2/textarea_Alamat_Alamat'), 'Testing')

WebUI.setText(findTestObject('Object Repository/Page_HOS SISMEDIKA v2/input_Ponsel_Ponsel'), '089793737221')

WebUI.setText(findTestObject('Object Repository/Page_HOS SISMEDIKA v2/input_Telepon_Telepon'), '08987287322')

WebUI.setText(findTestObject('Object Repository/Page_HOS SISMEDIKA v2/input_E-mail_Email'), 'fadil@sismedika.com')

WebUI.click(findTestObject('Object Repository/Page_HOS SISMEDIKA v2/span_Simpan'))

WebUI.setText(findTestObject('Object Repository/Page_HOS SISMEDIKA v2/input_Nomer Identitas_NomerSosial'), '928393948212345642')

WebUI.click(findTestObject('Object Repository/Page_HOS SISMEDIKA v2/span_Simpan'))

WebUI.click(findTestObject('Object Repository/Page_HOS SISMEDIKA v2/font_harus diisi'))

WebUI.setText(findTestObject('Object Repository/Page_HOS SISMEDIKA v2/input_Nomer Identitas_NomerSosial'), '1234567891234567')

WebUI.click(findTestObject('Object Repository/Page_HOS SISMEDIKA v2/span_Simpan'))

WebUI.closeBrowser()

