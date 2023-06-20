package circular_Queue;

public class QueueException extends RuntimeException{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1;
	private String msg;
	public QueueException(String msg)
	{
		this.msg=msg;
	}
	public String getMessage() {
		return msg;
	}
}
