package ferus.tigris.buzzles.Builders;

import java.util.ArrayList;
import java.util.List;

import android.graphics.Bitmap;
import ferus.tigris.buzzles.GameView;
import ferus.tigris.buzzles.personages.Frog;
import ferus.tigris.buzzles.personages.Mark;
import ferus.tigris.buzzles.views.ComposeSprite;
import ferus.tigris.buzzles.views.LinearSprite;

public class FrogBuilder extends EmptyMarkBuilder {

	protected Mark createPersonage(GameView view) {
		return new Frog(null, view, view.gameField());
	}

	protected ComposeSprite createSprite(GameView view) {
		List<LinearSprite>sprites = new ArrayList<LinearSprite>();
		
		Bitmap img = ImagesPool.instance(view).getFrog1();
		sprites.add(new LinearSprite(img, 4, 30, 100));
		img = ImagesPool.instance(view).getFrog2();
		sprites.add(new LinearSprite(img, 4, 30, 100));
		
		ComposeSprite sprite = new ComposeSprite(sprites);
		return sprite;
	}
	
	protected boolean checkType(String type) {
		return type.contains("Frog");
	}

}