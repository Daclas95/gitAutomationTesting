package test;

import pages.LoginPage;
import org.testng.annotations.Test;

import utils.TestBase;

public class LoginTest extends TestBase {

    @Test
    public void LoginTest() throws InterruptedException {
//        softAssert = new SoftAssert();
        softAssert.assertTrue(LoginPage.isHrmLoginPageDisplayed(),"HrmLogin Page Not Display") ;
//        LoginPage.setUserName("Admin");
//        LoginPage.setPass("admin123");
//        LoginPage.ClickLogin();
//        AdminPage.AdminPageDisplayed();
//
//        AdminPage.Qualification();
//        AdminPage.Skills();
//        AdminPage.AddBtn();
//        AdminPage.SkillsNameDescription("kummar","kaaaaa");
//        AdminPage.SaveCheckboxDelete();
//
//        AdminPage.Qualification();
//        AdminPage.Education();
//        AdminPage.AddBtn();
//        AdminPage.EduLevel("jjj");
//        AdminPage.SaveCheckboxDelete();
//
//        AdminPage.Qualification();
//        AdminPage.Licenses();
//        AdminPage.AddBtn();
//        AdminPage.LicenceName("Licence");
//        AdminPage.SaveCheckboxDelete();
//
//        AdminPage.Qualification();
//        AdminPage.Languages();
//        AdminPage.AddBtn();
//        AdminPage.LanguagesName("Java");
//        AdminPage.SaveCheckboxDelete();
//
//        AdminPage.Qualification();
//        AdminPage.Membership();
//        AdminPage.AddBtn();
//        AdminPage.Membershipname("QA");
//        AdminPage.MemSaveCheckboxDelete();

      //  AdminPage.Membershipname("kaaaai");
        // softAssert.assertTrue(DashboardPage.isHrmDashboardPageDisplayed(),"Hrm Dashboard Page Not Display") ;
      //  softAssert.assertAll();

    }
}
