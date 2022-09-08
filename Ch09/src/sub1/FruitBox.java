package sub1;

public class FruitBox<T> {
	
	private T fruit;
	
	
	public T getFruit() {
		return fruit;
	}
	
	public void setFruit(T fruit) { //애플만 선언해서 애플만 취급
		this.fruit = fruit;
	}

}
