package Generic_Collection;

public class Product<T,M> {
	private T kind;
	private M model;
	public T getKind() {
		return kind;
	}
	public void setKind(T kind) {
		this.kind = kind;
	}
	public M getModel() {
		return model;
	}
	public void setModel(M model) {
		this.model = model;
	}
	
	public static void main(String[]args) {
		Product<Integer,String> product=new Product<Integer,String>();
		product.setKind(10);
		product.setModel("������");
		System.out.println("��ǰ�� ���� "+product.getModel()+"�̰� ���� ������ "+product.getKind()+"��");
	
	}
}
