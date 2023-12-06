module profexercisesmod {
    requires javafx.controls;
    requires javafx.fxml;
    requires transitive javafx.graphics;

    opens edu.realemj.exercises18 to javafx.fxml;

    exports edu.realemj.exercises02;
    exports edu.realemj.exercises03;
    exports edu.realemj.exercises04;
    exports edu.realemj.exercises05;
    exports edu.realemj.exercises06;
    exports edu.realemj.exercises18;
}