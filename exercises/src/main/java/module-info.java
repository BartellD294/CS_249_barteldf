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
    exports edu.barteldf.exercises18;
    exports edu.barteldf.exercises19;

}