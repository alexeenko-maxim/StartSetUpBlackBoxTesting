package braingame.amax.myapplication.BlackBoxTesting;

import android.os.Build;

import androidx.test.filters.MediumTest;
import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.uiautomator.By;
import androidx.test.uiautomator.UiDevice;
import androidx.test.uiautomator.UiObject;
import androidx.test.uiautomator.UiObject2;
import androidx.test.uiautomator.Until;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.platform.app.InstrumentationRegistry.getInstrumentation;

@RunWith(AndroidJUnit4.class)
@MediumTest
public class LaunchTest {

    @Before
    public void clearCacheAndData() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            InstrumentationRegistry.getInstrumentation().getUiAutomation()
                    .executeShellCommand("pm clear " + "ru.winelab");
        }
    }

    @Test
    public void launchApp() throws InterruptedException {

        UiDevice device = UiDevice.getInstance(getInstrumentation());
        device.wait(Until.hasObject(By.desc("WineLab")), 3000);
        UiObject2 appsButton = device.findObject(By.desc("WineLab"));
        appsButton.click();

        device.wait(Until.hasObject(By.desc("ПОДТВЕРДИТЬ И ВОЙТИ")), 7000);
        UiObject2 btnAcceptAge = device.findObject(By.text("ПОДТВЕРДИТЬ И ВОЙТИ"));
        btnAcceptAge.click();

        device.wait(Until.hasObject(By.desc("ЗАПРЕТИТЬ")), 2000);
        UiObject2 btnBlockGeo = device.findObject(By.text("ЗАПРЕТИТЬ"));
        btnBlockGeo.click();

        device.wait(Until.hasObject(By.desc("ПРОПУСТИТЬ")), 2000);
        UiObject2 btnPassLocation = device.findObject(By.text("ПРОПУСТИТЬ"));
        btnPassLocation.click();

        device.wait(Until.hasObject(By.desc("ЗАПРЕТИТЬ")), 2000);
        UiObject2 btnBlockGeo2 = device.findObject(By.text("ЗАПРЕТИТЬ"));
        btnBlockGeo2.click();

        device.wait(Until.hasObject(By.desc("ПРОПУСТИТЬ")), 2000);
        UiObject2 btnPassLocation2 = device.findObject(By.text("ПРОПУСТИТЬ"));
        btnPassLocation2.click();

        device.wait(Until.hasObject(By.desc("Продолжить как гость")), 2000);
        UiObject2 btnСontinueAsGuest = device.findObject(By.text("Продолжить как гость"));
        btnСontinueAsGuest.click();
    }

//    @Test
//    public void acceptAge() throws InterruptedException {
//
//        UiDevice device = UiDevice.getInstance(getInstrumentation());
//
//    }
}