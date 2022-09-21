package object;

import java.io.IOException;

import javax.imageio.ImageIO;

public class OBJ_KEY extends SuperObject {

	public OBJ_KEY() {
		name = "Key";
				try {
					image = ImageIO.read(getClass().getResourceAsStream("/objects/key.png"));
				}catch(IOException e) {
					e.printStackTrace();
				}
	}
}
