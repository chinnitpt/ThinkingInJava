package interfaces.exercise19;

import java.util.Random;

public interface Tossable {
	public String toss();
}

interface TossableFactory {
	public Tossable getTossable();
}

class Coin implements Tossable {
	private static Random rand = new Random();

	@Override
	public String toss(){
		int t = rand.nextInt(2);
		switch(t){
		case 0:
			return "HEAD";
		case 1:
			return "TAIL";
		} 
		return "";
	}
}

class CoinTossableFactory implements TossableFactory{
	@Override
	public Tossable getTossable(){
		return new Coin();
	}
}

class DiceTossableFactory implements TossableFactory{
	@Override
	public Tossable getTossable(){
		return new Dice();
	}
}

class Dice implements Tossable{
	private static Random rand = new Random();

	@Override
	public String toss(){
		int t = rand.nextInt(6);
		switch(t){
		case 0:
			return "1";
		case 1:
			return "2";
		case 2:
			return "3";
		case 3:
			return "4";
		case 4:
			return "5";
		case 5:
			return "6";
		} 
		return "";
	}
}