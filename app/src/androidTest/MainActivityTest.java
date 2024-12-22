@RunWith(AndroidJUnit4.class)
public class MainActivityTest {
    @Rule
    public ActivityScenarioRule<MainActivity> activityRule =
            new ActivityScenarioRule<>(MainActivity.class);

    @Test
    public void testPDFViewer() {
        // Test UI dan interaksi pengguna
        onView(withId(R.id.pdfView))
                .check(matches(isDisplayed()));
    }
}