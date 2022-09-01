package sub3;

public class Cable implements Socket {
	
	private Bulb bulb;
	
	public Cable(Bulb bulb) {
		this.bulb = bulb;
	}

	@Override
	public void swittchOn() {
		bulb.lightOn();
	}

	@Override
	public void swittchOff() {
		bulb.lightOff();
	}

}
