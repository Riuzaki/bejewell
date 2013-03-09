package pl.bejewell;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.Game;
import org.newdawn.slick.SlickException;

public class Bejewell {
	public static void main(String[] args) {
		Game game = new BejewellGame("Bejewell");

		try {
			AppGameContainer container = new AppGameContainer(game);
			container.start();
		} catch (SlickException e) {
			throw new RuntimeException("Problem with slick engine", e);
		}
	}
}
