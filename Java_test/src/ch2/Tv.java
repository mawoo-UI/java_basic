package ch2;

public class Tv {

	boolean power;
	int channel;
	int volume;

	void powerUp() {

		power = !power;
	}

	void channelUp() {

		channel += 1;
	}
	void channelDown() {

		channel += 1;
	}
	void volumeUp() {

		volume += 5;
	}
	void volumeDown() {

		volume -= 5;
	}

}
