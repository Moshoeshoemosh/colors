/* doesn't work with source level 1.8:
module com.mycompany.colors {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.colors to javafx.fxml;
    exports com.mycompany.colors;
}
*/
