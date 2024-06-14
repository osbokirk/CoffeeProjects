module org.example.flashcards {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.almasb.fxgl.all;

    opens org.example.flashcards to javafx.fxml;
    exports org.example.flashcards;
}