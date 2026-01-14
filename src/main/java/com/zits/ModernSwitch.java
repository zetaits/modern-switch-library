package com.zits;

import javafx.animation.FillTransition;
import javafx.animation.ParallelTransition;
import javafx.animation.TranslateTransition;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.util.Duration;

public class ModernSwitch extends Pane {

    private final BooleanProperty switchedOn = new SimpleBooleanProperty(false);
    private final TranslateTransition translateAnimation = new TranslateTransition(Duration.seconds(0.25));
    private final FillTransition fillAnimation = new FillTransition(Duration.seconds(0.25));
    private final ParallelTransition animation = new ParallelTransition(translateAnimation, fillAnimation);

    private final Rectangle background;
    private final Circle trigger;

    public ModernSwitch() {
        background = new Rectangle(100, 50);
        background.setArcWidth(50);
        background.setArcHeight(50);
        background.setFill(Color.WHITE);
        background.setStroke(Color.LIGHTGRAY);

        trigger = new Circle(25);
        trigger.setCenterX(25);
        trigger.setCenterY(25);
        trigger.setFill(Color.WHITE);
        trigger.setStroke(Color.LIGHTGRAY);

        getChildren().addAll(background, trigger);

        translateAnimation.setNode(trigger);
        fillAnimation.setShape(background);

        setOnMouseClicked(event -> {
            switchedOn.set(!switchedOn.get());
        });

        switchedOn.addListener((obs, oldState, newState) -> {
            boolean isOn = newState;
            translateAnimation.setToX(isOn ? 50 : 0);
            fillAnimation.setFromValue(isOn ? Color.WHITE : Color.LIGHTGREEN);
            fillAnimation.setToValue(isOn ? Color.LIGHTGREEN : Color.WHITE);
            animation.play();
        });
    }

    public BooleanProperty switchedOnProperty() { return switchedOn; }
    public boolean isSwitchedOn() { return switchedOn.get(); }
}