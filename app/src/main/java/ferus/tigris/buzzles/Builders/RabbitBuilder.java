package ferus.tigris.buzzles.Builders;

import java.util.ArrayList;
import java.util.List;

import android.graphics.Bitmap;
import ferus.tigris.buzzles.GameView;
import ferus.tigris.buzzles.personages.Mark;
import ferus.tigris.buzzles.personages.Rabbit;
import ferus.tigris.buzzles.views.ComposeSprite;
import ferus.tigris.buzzles.views.LinearSprite;

public class RabbitBuilder extends EmptyMarkBuilder {

	protected Mark createPersonage(GameView view) {
		return new Rabbit(null, view);
	}

	protected ComposeSprite createSprite(GameView view) {
		List<LinearSprite>sprites = new ArrayList<LinearSprite>();
		
		Bitmap img = ImagesPool.instance(view).getRabbit1();
		sprites.add(new LinearSprite(img, 4, 30, 2000));
		img = ImagesPool.instance(view).getRabbit2();
		sprites.add(new LinearSprite(img, 4, 30, 0));
		img = ImagesPool.instance(view).getRabbit3();
		sprites.add(new LinearSprite(img, 4, 30, 0));
		
		ComposeSprite sprite = new ComposeSprite(sprites);
		return sprite;
	}
	
	protected boolean checkType(String type) {
		return type.contains("Rabbit");
	}

}
