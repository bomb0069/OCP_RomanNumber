package th.own.bomb0069.kata;

public class IVRule implements RomanNumberRule{

	private final int NUMBER = 4;

	public boolean isMatch(int number){
		return (number >= NUMBER);
	}

	public String getRomanText() {
		return "IV";
	}

	public int getNumber() {
		return NUMBER;
	}
}
