package course.labs.todomanger.test;

import android.test.ActivityInstrumentationTestCase2;

import com.robotium.solo.Solo;

import course.labs.todomanager.ToDoManagerActivity;

/**
 * Created by tyhurstrw on 2/22/2015.
 */
public class Test5_DumpLogTest extends ActivityInstrumentationTestCase2<ToDoManagerActivity> {


    private Solo solo;

    public Test5_DumpLogTest() {
        super(ToDoManagerActivity.class);
    }

    @Override
    public void setUp() throws Exception {
        solo = new Solo(getInstrumentation());
        getActivity();
    }

    @Override
    public void tearDown() throws Exception {
        solo.finishOpenedActivities();
    }

    public void testRun() throws Exception {
        solo.assertCurrentActivity("Check Activity launched",ToDoManagerActivity.class);
        fail();
    }
}
