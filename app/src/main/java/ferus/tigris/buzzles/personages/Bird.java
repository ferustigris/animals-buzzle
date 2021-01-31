package ferus.tigris.buzzles.personages;

import ferus.tigris.buzzles.GameView;

public class Bird extends Mark {

	public Bird(BehaviorDelegate delegate, GameView gameView) {
		super(delegate, gameView, gameView.gameField());
	}

}
