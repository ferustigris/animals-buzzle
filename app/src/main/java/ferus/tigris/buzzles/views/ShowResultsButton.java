package ferus.tigris.buzzles.views;

import ferus.tigris.buzzles.GameManager;
import ferus.tigris.buzzles.GameView;
import ferus.tigris.buzzles.R;

import android.content.Intent;
import android.graphics.BitmapFactory;
import android.net.Uri;

public class ShowResultsButton extends ButtonView{
	GameView view;

	public ShowResultsButton(GameView view) {
		super(BitmapFactory.decodeResource(view.getResources(), R.drawable.top));
		this.view = view;
	}

	public void press(GameManager gameManager) {
		Intent intent = new Intent(Intent.ACTION_VIEW);
		intent.setData(Uri.parse("https://play.google.com/store/apps/details?id=ferus.tigris.buzzles"));
		gameManager.startActivity(intent);
	}

}
