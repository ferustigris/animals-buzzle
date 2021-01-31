package ferus.tigris.buzzles.Builders;

import java.util.ArrayList;
import java.util.List;

import ferus.tigris.buzzles.GameView;
import ferus.tigris.buzzles.personages.Cat;
import ferus.tigris.buzzles.personages.Mark;
import ferus.tigris.buzzles.views.ComposeSprite;
import ferus.tigris.buzzles.views.LinearSprite;
import android.graphics.Bitmap;

public class CatBuilder extends EmptyMarkBuilder {

	protected Mark createPersonage(GameView view) {
		return new Cat(null, view, view.gameField());
	}

	protected ComposeSprite createSprite(GameView view) {
		List<LinearSprite>sprites = new ArrayList<LinearSprite>();
		
		Bitmap img = ImagesPool.instance(view).getCat1();
		sprites.add(new LinearSprite(img, 4, 30, 30));
		img = ImagesPool.instance(view).getCat2();
		sprites.add(new LinearSprite(img, 4, 30, 100));
		img = ImagesPool.instance(view).getCat3();
		sprites.add(new LinearSprite(img, 4, 30, 2000));
		
		ComposeSprite sprite = new ComposeSprite(sprites);
		return sprite;
	}
	
	protected boolean checkType(String type) {
		return type.contains("Cat");
	}
}
