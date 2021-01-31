package ferus.tigris.buzzles.personages;

import android.graphics.Canvas;
import android.graphics.Point;
import android.util.Log;
import ferus.tigris.buzzles.HorizontalDirection;
import ferus.tigris.buzzles.Matrix;
import ferus.tigris.buzzles.VerticalDirection;

public class DeadBehavior implements AbstractBehavior {

	public void update() {}

	public void draw(Canvas canvas) {}

	public String getType() {
		return this.getClass().toString();
	}

	public boolean isDied() {
		return true;
	}

	public void kill() {}

	public void saveAt(Matrix m, Point pos) {}

	public void move(Point pos, VerticalDirection direction) {}

	public void move(Point pos, HorizontalDirection direction) {}

	public void moveFinish(Point displacement, VerticalDirection direction) {}

	public void moveFinish(Point displacement, HorizontalDirection direction) {}

	public boolean isAvailable() {
		Log.d(getClass().toString(), "avaiable");
		return true;
	}

}
