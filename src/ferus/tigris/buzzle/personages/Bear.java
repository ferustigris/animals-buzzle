package ferus.tigris.buzzle.personages;

import ferus.tigris.buzzle.GameView;

public class Bear extends Mark {

	public Bear(BehaviorDelegate delegate, GameView gameView) {
		super(delegate, gameView, gameView.gameField());
	}

}
