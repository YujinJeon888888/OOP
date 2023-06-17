package Generic_Collection;

public class MyStore<T> {
	public T data;
	public void set (T data) {
		this.data=data;
	}
	public T get() {
		return this.data;
	}
}
