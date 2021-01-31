package ferus.tigris.buzzles.personages;

import ferus.tigris.buzzles.GameView;

public class Bear extends Mark {

	public Bear(BehaviorDelegate delegate, GameView gameView) {
		super(delegate, gameView, gameView.gameField());
	}

}
