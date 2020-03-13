package kodilla;

import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class Message {

    public static Text getMessage(String sign){
        Text text = new Text(sign);
        text.setFont(Font.font(100));
        text.setFill(Color.BLACK);
        return text;
    }
}
