package tests;



import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.TestBase;


public class TestSigninPage extends TestBase {
	
	@BeforeClass
	public void classSetup(){
		menuBar.signinLink.click();
	}
	
	@Test
	public void TestWithValidCredentail(){
		signinPage.signin("shakil_ipe@yahoo.com", "365827");
		Assert.assertTrue(signinPage.getCurrentUrl().contains("profile"));
		menuBar.signoutLink.click();
	}
	
//	@DataProvider(name ="testData")
//	public Object[][] readExcel() throws BiffException, IOException{
//		File f = new File("/Users/mdislam/Desktop/Workbook2.xls");
//		Workbook wb = Workbook.getWorkbook(f);
//		Sheet s = wb.getSheet(0);
//		int rows = s.getRows();
//		int columns = s.getColumns();
//		System.out.println(rows);
//		System.out.println(columns);
//		
//		String [][]inputData = new String [rows][columns];
//		for(int i=0; i<rows; i++){
//			for(int j=0; j<columns; j++){
//				Cell c = s.getCell(j, i) ;
//				inputData [i][j] = c.getContents();
//				System.out.println(inputData [i][j]);
//			}
//		}
//		return inputData;
		
	//}

}
