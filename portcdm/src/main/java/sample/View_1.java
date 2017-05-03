package sample;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;


public class View_1 {
    public static Scene Create_View(){
        GridPane grid = AppLayout.Setup_Grid();
        Scene scene = new Scene(grid, SizeAndGrid.getSceneWidth(), SizeAndGrid.getSceneHeight());
        HBox back = AppLayout.Back_Button();
        back.setAlignment(Pos.BOTTOM_LEFT);
        grid.add(back, SizeAndGrid.getBackButtonColumn(), SizeAndGrid.getBackButtonRow());
        final Text sceneTitle = new Text("Welcome to view 1");
        sceneTitle.setFont(Font.font(26));
        HBox text = new HBox(10);
        text.getChildren().add(sceneTitle);
        text.setAlignment(Pos.TOP_LEFT);
        grid.add(sceneTitle, SizeAndGrid.getSceneTitleColumn(), SizeAndGrid.getSceneTitleRow());
        return scene;
    }


}