
public class MovimentoInvalidoException extends Exception{
	
	private int x;
	private int y;
	
	public MovimentoInvalidoException(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

}
