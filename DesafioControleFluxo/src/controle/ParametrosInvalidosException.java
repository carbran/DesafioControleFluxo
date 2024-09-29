package controle;

public class ParametrosInvalidosException extends Exception{

	private static final long serialVersionUID = 1L;

	public ParametrosInvalidosException(String msg) {
		super(msg);
	}
	
	public ParametrosInvalidosException(String msg, Throwable exception) {
		super(msg, exception);
	}
	
}
