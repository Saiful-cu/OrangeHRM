package tests;

import constants.PageNavigation;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.MainPage;

public class NavigationTest extends BaseTest {
    private final SoftAssert aAssert = new SoftAssert();
    MainPage mainPage = new MainPage();

    @Test
    public void verifyAdminNavigationLink() {
        mainPage.clickNavigationLink(PageNavigation.ADMIN_PAGE);
        aAssert.assertEquals(mainPage.getPageName(), "Admin", "The Admin page is not opened");
    }

    @Test
    public void verifyPIM_NavigationLink() {
        mainPage.clickNavigationLink(PageNavigation.PIM_PAGE);
        aAssert.assertEquals(mainPage.getPageName(), "PIM", "The Pim page is not opened");
    }

    @Test
    public void verifyLeaveNavigationLink() {
        mainPage.clickNavigationLink(PageNavigation.LEAVE_PAGE);
        aAssert.assertEquals(mainPage.getPageName(), "Leave", "The Leave page is not opened");
    }

    @Test
    public void verifyTimeNavigationLink() {
        mainPage.clickNavigationLink(PageNavigation.TIME_PAGE);
        aAssert.assertEquals(mainPage.getPageName(), "Time", "The Time page is not opened");
    }

    @Test
    public void verifyRecruitmentNavigationLink() {
        mainPage.clickNavigationLink(PageNavigation.RECRUITMENT_PAGE);
        aAssert.assertEquals(mainPage.getPageName(), "Recruitment", "The Recruitment page is not opened");
    }

    @Test
    public void verifyDashboardNavigationLink() {
        mainPage.clickNavigationLink(PageNavigation.DASHBOARD_PAGE);
        aAssert.assertEquals(mainPage.getPageName(), "Dashboard", "The Dashboard page is not opened");
    }

    @Test
    public void verifyPerformanceNavigationLink() {
        mainPage.clickNavigationLink(PageNavigation.PERFORMANCE_PAGE);
        aAssert.assertEquals(mainPage.getPageName(), "Performance", "The Performance page is not opened");
    }

    @Test
    public void verifyDirectoryNavigationLink() {
        mainPage.clickNavigationLink(PageNavigation.DIRECTORY_PAGE);
        aAssert.assertEquals(mainPage.getPageName(), "Directory", "The Directory page is not opened");
    }

    @Test
    public void verifyClaimNavigationLink() {
        mainPage.clickNavigationLink(PageNavigation.CLAIM_PAGE);
        aAssert.assertEquals(mainPage.getPageName(), "Claim", "The Claim page is not opened");
    }

    @Test
    public void verifyBuzzNavigationLink() {
        mainPage.clickNavigationLink(PageNavigation.BUZZ_PAGE);
        aAssert.assertEquals(mainPage.getPageName(), "Buzz", "The Buzz page is not opened");
    }

    @Test
    public void verifyMyInfoNavigationLink() {
        mainPage.clickNavigationLink(PageNavigation.MY_INFO_PAGE);
        aAssert.assertEquals(mainPage.getPageName(), "My Info", "The My Info page is not opened");
        aAssert.assertAll();
    }

}
