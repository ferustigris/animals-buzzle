package ferus.tigris.buzzles.personages;

import ferus.tigris.buzzles.GameView;

public class Pig extends Mark {

	public Pig(BehaviorDelegate delegate, GameView gameView) {
		super(delegate, gameView, gameView.gameField());
	}

}
