package ZSeleniumProject.PracticeMethods;


import ZSeleniumProject.Utilities.XLUtility;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;

public class DataDrivenTesting {


    @DataProvider(name = "LoginData")  // NO ; at the end **** IMP
    public String[][] getdata() throws IOException {

        String path = "C:\\Users\\bamar\\IdeaProjects\\PlaywriteProject\\SeleniumProject\\target\\DataFiles\\LoginData.xlsx";
        XLUtility xlutil = new XLUtility(path);

        int totalrows =xlutil.getRowCount("Sheet1");
        int totalCols =xlutil.getCellCount("Sheet1",1);

        String loginData[][] =new String[totalrows][totalCols];

        for (int i = 1; i < totalrows; i++) {
            for (int j = 0; j < totalCols; j++) {
                loginData[i-1][j] =xlutil.getCellData("Sheet1",i,j);
            }

        }

        return loginData;
    }

    @Test(dataProvider = "LoginData")    /// *** IMP NOTE NOT @Dataprovider its just dataProvider @ is there for Test
    public void loginTest(String userName, String password, String expectedValue) {

        System.out.println(userName +" " +password +" " + expectedValue);  // No For loop need to read all data from data Provider
        // it will run automatically 4 iterations

    }
}
