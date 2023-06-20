package circular_queue_int;

public class QueueException extends RuntimeException{
	private String msg;

	public QueueException(String msg) {
		super();
		this.msg = msg;
	}
	public String getMessage() {
		return msg;
	}
}
