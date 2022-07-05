package F2_Exceptions;

public class NameLengthException extends Exception {

	public NameLengthException() {
		super("Der Name hat weniger als 3 Zeichen");
	}
}
