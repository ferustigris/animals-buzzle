package ferus.tigris.buzzles.levels;

import java.util.Random;

import ferus.tigris.buzzles.GameManager;
import ferus.tigris.buzzles.Matrix;
import ferus.tigris.buzzles.Builders.AbstractBehaviorBuilder;
import ferus.tigris.buzzles.Builders.EmptyMarkBuilder;
import ferus.tigris.buzzles.personages.AbstractBehavior;

public class LevelWithNullInit extends StaticLevel {
	private GameManager gameManager;
	private LevelManager levelManager;
	private int maxScope = 100;
	private long startLevelTime = System.currentTimeMillis();
	private long timeoutForNullCreate = 10*1000;
	private int timeScale = 2;

	public LevelWithNullInit(LevelManager levelManager, GameManager gameManager, int maxScope) {
		super(levelManager, gameManager, maxScope);
		timeScale  = maxScope / 50;
		timeoutForNullCreate /= timeScale;
		this.gameManager = gameManager;
		this.levelManager = levelManager;
	}

	public AbstractLevel nextLevel() {
		return new LevelWithBlocks(levelManager, gameManager, maxScope);
	}

	public AbstractLevel clone() {
		return new LevelWithNullInit(levelManager, gameManager, maxScope);
	}

	protected void createNullMark() {
		Matrix m = marks();
		Random rnd = new Random();
		int x = rnd.nextInt(m.columns());
		int y = rnd.nextInt(m.rows());
		AddNullMark(x, y);
	}

	public void update() {
		super.update();
		long t = System.currentTimeMillis();
		if((t - startLevelTime > timeoutForNullCreate )) {
			createNullMark();
			timeoutForNullCreate = 60*1000 / timeScale;
			if(timeoutForNullCreate < 2*1000) {
				timeoutForNullCreate = 2*1000;
			}
			startLevelTime = t;
		}
	}

	protected void AddNullMark(int x, int y) {
		gameManager.playOnAddEmptyMark();
		AbstractBehaviorBuilder builder = new EmptyMarkBuilder();
		Matrix m = marks();
		AbstractBehavior mark = builder.create(gameManager.view());
		m.insertMark(x, y, mark);
	}

	protected void onDead() {
		if(timeoutForNullCreate < 5*1000) {
			startLevelTime = System.currentTimeMillis();
		}
	}

}
