package ferus.tigris.buzzles.personages;

import ferus.tigris.buzzles.GameView;

public class Buggy extends Mark {

	public Buggy(BehaviorDelegate delegate, GameView gameView) {
		super(delegate, gameView, gameView.gameField());
	}

}
