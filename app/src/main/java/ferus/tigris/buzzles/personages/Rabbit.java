package ferus.tigris.buzzles.personages;

import ferus.tigris.buzzles.GameView;

public class Rabbit extends Mark {

	public Rabbit(BehaviorDelegate delegate, GameView gameView) {
		super(delegate, gameView, gameView.gameField());
	}

}
