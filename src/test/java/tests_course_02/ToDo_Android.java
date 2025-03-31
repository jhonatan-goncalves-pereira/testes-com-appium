package tests_course_02;

import org.testng.annotations.Test;
import tests_course_02.taskList.CreateTaskPage;
import tests_course_02.taskList.TasksListPage;

import java.net.MalformedURLException;

public class ToDo_Android extends TestBase {

    CreateTaskPage createTaskPage ;
    TasksListPage tasksListPage;

    @Test
    public void test_add_task() throws MalformedURLException {
        Android_setUp();
        tasksListPage = new TasksListPage(driver);
        createTaskPage = new CreateTaskPage(driver);
        tasksListPage.clickAddTaskBtn();
        createTaskPage.enterTaskName("Finish Appium Course");
        createTaskPage.enterTaskDesc("Finishing my course ASAP");
        driver.hideKeyboard();
        createTaskPage.clickSaveBtn();
        tearDown();
    }
}