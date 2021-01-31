package ferus.tigris.buzzles.views;

import ferus.tigris.buzzles.GameManager;
import ferus.tigris.buzzles.GameView;
import ferus.tigris.buzzles.R;
import android.graphics.BitmapFactory;

public class ResetLevelButton extends ButtonView{
	GameView view;

	public ResetLevelButton(GameView view) {
		super(BitmapFactory.decodeResource(view.getResources(), R.drawable.restart));
		this.view = view;
	}

	public void press(GameManager gameManager) {
		gameManager.restartLevel();
		if(gameManager.isLovesFinish()) {
			view.setResetButton(new StopGameButton(view));
		}
	}

}
