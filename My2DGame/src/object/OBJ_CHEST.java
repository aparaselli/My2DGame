package object;

import java.io.IOException;

import javax.imageio.ImageIO;

public class OBJ_CHEST extends SuperObject {
	
	public OBJ_CHEST() {
		name = "Chest";
		try {
			image = ImageIO.read(getClass().getResourceAsStream("/objects/chest.png"));
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
