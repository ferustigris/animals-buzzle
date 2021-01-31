package ferus.tigris.buzzles.Builders;

import java.util.ArrayList;
import java.util.List;

import android.graphics.Bitmap;
import ferus.tigris.buzzles.GameView;
import ferus.tigris.buzzles.personages.AbstractBehavior;
import ferus.tigris.buzzles.personages.AdditionViewBehavior;
import ferus.tigris.buzzles.personages.Cloud;
import ferus.tigris.buzzles.personages.KillerBehavior;
import ferus.tigris.buzzles.personages.KillerWithEffectBehavior;
import ferus.tigris.buzzles.personages.Mark;
import ferus.tigris.buzzles.personages.SlowViewBehavior;
import ferus.tigris.buzzles.personages.ViewsManager;
import ferus.tigris.buzzles.views.ComposeSprite;
import ferus.tigris.buzzles.views.LinearSprite;

public class EmptyMarkBuilder extends AbstractBehaviorBuilder {

	public AbstractBehavior create(GameView view) {
		Mark behavior = createPersonage(view);
		ViewsManager viewManager = new SlowViewBehavior(behavior, createSprite(view), view.gameField()); 
		KillerBehavior killer = new KillerWithEffectBehavior(viewManager); 

		AdditionViewBehavior additionView = new AdditionViewBehavior(killer, createSprite(view), view.gameField());
		return additionView;
	}

	protected Mark createPersonage(GameView view) {
		return new Cloud(null, view);
	}

	protected ComposeSprite createSprite(GameView view) {
		List<LinearSprite>sprites = new ArrayList<LinearSprite>();
		
		Bitmap img = ImagesPool.instance(view).getEmpty();
		sprites.add(new LinearSprite(img, 1, 1130, 0));
		
		ComposeSprite sprite = new ComposeSprite(sprites);
		return sprite;
	}

	
	protected boolean checkType(String type) {
		return type.contains("Cloud");
	}
}
