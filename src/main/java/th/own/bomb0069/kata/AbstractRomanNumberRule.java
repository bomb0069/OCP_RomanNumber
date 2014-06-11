package th.own.bomb0069.kata;

public abstract class AbstractRomanNumberRule implements RomanNumberRule{

	public boolean isMatch(int number){
		return (number >= getNumber());
	}

}
