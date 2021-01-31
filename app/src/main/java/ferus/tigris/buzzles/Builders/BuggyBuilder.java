package ferus.tigris.buzzles.Builders;

import java.util.ArrayList;
import java.util.List;

import android.graphics.Bitmap;
import ferus.tigris.buzzles.GameView;
import ferus.tigris.buzzles.personages.Buggy;
import ferus.tigris.buzzles.personages.Mark;
import ferus.tigris.buzzles.views.ComposeSprite;
import ferus.tigris.buzzles.views.LinearSprite;

public class BuggyBuilder extends EmptyMarkBuilder {

	protected Mark createPersonage(GameView view) {
		return new Buggy(null, view);
	}

	protected ComposeSprite createSprite(GameView view) {
		List<LinearSprite>sprites = new ArrayList<LinearSprite>();
		
		Bitmap img = ImagesPool.instance(view).getBug1();
		sprites.add(new LinearSprite(img, 4, 30, 1000));
		img = ImagesPool.instance(view).getBug2();
		sprites.add(new LinearSprite(img, 4, 30, 1000));
		
		ComposeSprite sprite = new ComposeSprite(sprites);
		return sprite;
	}
	
	protected boolean checkType(String type) {
		return type.contains("Bug");
	}

}
