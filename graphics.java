package pksoftFX;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.effect.ColorAdjust;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.RadialGradient;
import javafx.scene.paint.Stop;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class graphics extends Application{
	public static void main(String[] args) {
		launch(args);
	}
	 
    @Override  
    public void start(Stage primaryStage) throws Exception {  
        // TODO Auto-generated method stub  
        Image img1 = new Image("https://i0.wp.com/pksoft.cf/wp-content/uploads/2018/04/29790164_1975789996071426_2453557292627147379_n.jpg?resize=150%2C266&ssl=1");  
        Image img2 = new Image("https://i0.wp.com/pksoft.cf/wp-content/uploads/2018/04/29790164_1975789996071426_2453557292627147379_n.jpg?resize=150%2C266&ssl=1");  
        ImageView imgview1 = new ImageView(img1);  
        ImageView imgview2 = new ImageView(img2);  
        Text text1 = new Text();  
        Text text2 = new Text();  
        text1.setText("ColorAdjust Effect Applied");  
        text2.setText("ColorAdjust Effect Not Applied");  
        text1.setX(50);  
        text1.setY(300);  
        text2.setX(355);  
        text2.setY(300);  
        text1.setFont(Font.font("Courier 10 Pitch",FontWeight.BOLD,FontPosture.REGULAR,16));  
        text2.setFont(Font.font("Courier 10 Pitch",FontWeight.BOLD,FontPosture.REGULAR,16));  
        text1.setFill(Color.RED);  
        text2.setFill(Color.RED);  
        text1.setStroke(Color.BLACK);  
        text2.setStroke(Color.BLACK);  
        text1.setStrokeWidth(0.2);  
        text2.setStrokeWidth(0.2);  
          
        imgview1.setX(100);  
        imgview1.setY(90);  
        imgview2.setX(400);  
        imgview2.setY(90);  
        ColorAdjust c = new ColorAdjust(); // creating the instance of the ColorAdjust effect.   
        c.setBrightness(0.1); // setting the brightness of the color.   
        c.setContrast(0.1); // setting the contrast of the color  
        c.setHue(0.3); // setting the hue of the color  
        c.setSaturation(0.5); // setting the hue of the color.   
        imgview1.setEffect(c); //applying effect on the image  
        imgview2.setEffect(c);
        Group root = new Group();  
          
        root.getChildren().addAll(imgview1,imgview2,text1,text2);  
        Scene scene = new Scene(root,700,400);  
        primaryStage.setScene(scene);  
  
        primaryStage.setTitle("Purushottam Kafle");  
        primaryStage.show();  
          
    }  
 
}
