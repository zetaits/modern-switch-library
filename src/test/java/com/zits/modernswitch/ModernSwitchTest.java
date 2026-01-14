package com.zits.modernswitch;

import com.zits.ModernSwitch;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.testfx.api.FxRobot;
import org.testfx.framework.junit5.ApplicationExtension;
import org.testfx.framework.junit5.Start;
import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(ApplicationExtension.class)
class ModernSwitchTest {

    private ModernSwitch modernSwitch;

    @Start
    private void start(Stage stage) {
        modernSwitch = new ModernSwitch();
        stage.setScene(new Scene(modernSwitch, 200, 200));
        stage.show();
    }

    @Test
    void testClick(FxRobot robot) {
        robot.clickOn(modernSwitch);
        assertTrue(modernSwitch.isSwitchedOn());
        robot.clickOn(modernSwitch);
        assertFalse(modernSwitch.isSwitchedOn());
    }
}