package javaStudy;

public class LedExam {

	public static void main(String[] args) {

		TV tv = new LedTV();
		tv.turnOn();
		tv.changeChannel(5);
		tv.changeVolume(3);
		tv.turnOff();
	}

}
