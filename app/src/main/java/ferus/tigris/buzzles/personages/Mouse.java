package ferus.tigris.buzzles.personages;

import ferus.tigris.buzzles.GameView;

public class Mouse extends Mark {

	public Mouse(BehaviorDelegate delegate, GameView gameView) {
		super(delegate, gameView, gameView.gameField());
	}

}
