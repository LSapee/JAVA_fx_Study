
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ButtonStudy extends Application {

	@Override
	public void start(Stage primaryStage) {
		// ()�ȿ��� ��ư�� �� ����
		Button bt =new Button("Ŭ��");
		
		VBox vb =new VBox(bt);
		
		bt.setOnAction(e -> {
			System.out.println("��ư�� Ŭ���Ͽ���");
		});
		
		Scene scene = new Scene(vb,500,500);
		
		primaryStage.setScene(scene);
		primaryStage.show();
		primaryStage.setTitle("��ưâ");
	}

	public static void main(String[] args) {
		launch(args);
	}
}