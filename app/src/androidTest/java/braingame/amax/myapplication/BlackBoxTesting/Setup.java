package braingame.amax.myapplication.BlackBoxTesting;

import android.os.Build;

import androidx.test.platform.app.InstrumentationRegistry;

import java.io.IOException;

class Setup {



    public static void clearData (String packageName) {

        try {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                InstrumentationRegistry.getInstrumentation().getUiAutomation()
                        .executeShellCommand("pm clear " + packageName)
                        .close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
