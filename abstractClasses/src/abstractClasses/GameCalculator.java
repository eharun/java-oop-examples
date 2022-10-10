package abstractClasses;

public abstract class GameCalculator {
	public abstract void calculate(); // Other classes should override calculate().
	
	public final void gameOver() {
		System.out.println("Game over."); // gameOver() should be used as is.
	}
}
