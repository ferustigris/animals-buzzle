package ferus.tigris.buzzles.views;

import ferus.tigris.buzzles.GameManager;
import ferus.tigris.buzzles.GameView;
import ferus.tigris.buzzles.R;
import android.graphics.BitmapFactory;

public class StopGameButton extends ButtonView{
	GameView view;

	public StopGameButton(GameView view) {
		super(BitmapFactory.decodeResource(view.getResources(), R.drawable.shutdown));
		this.view = view;
	}

	public void press(GameManager gameManager) {
		gameManager.restartGame();
		if(!gameManager.isLovesFinish()) {
			view.setResetButton(new ResetLevelButton(view));
		}
	}

}
