package th.own.bomb0069.kata;

public class IRule implements RomanNumberRule{

	private final int NUMBER = 1;

	public boolean isMatch(int number){
		return (number >= NUMBER);
	}

	public String getRomanText() {
		return "I";
	}

	public int getNumber() {
		return NUMBER;
	}
}
