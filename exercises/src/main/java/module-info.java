module exercisesmod {
    requires javafx.controls;
    requires javafx.fxml;
    requires transitive javafx.graphics;
    opens edu.barteldf.exercises18 to javafx.fxml;
    exports edu.barteldf.exercises02;
    exports edu.barteldf.exercises03;
    exports edu.barteldf.exercises04;
    exports edu.barteldf.exercises05;
    exports edu.barteldf.exercises06;
    exports edu.barteldf.exercises07;
    exports edu.barteldf.exercises09;
    exports edu.barteldf.exercises10;
    exports edu.barteldf.exercises11;
    exports edu.barteldf.exercises12;
    exports edu.barteldf.exercises13;
    exports edu.barteldf.exercises14;
    exports edu.barteldf.exercises15.observer;
    exports edu.barteldf.exercises15.strategy;
    exports edu.barteldf.exercises15.decorator;
    exports edu.barteldf.exercises16;
    exports edu.barteldf.exercises18;

}