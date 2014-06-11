package th.own.bomb0069.kata;

public class NumberConvertor {

	public String getRomanNumber (int number) {
		String romanNum = "";
		while (number != 0) {
			romanNum += "I";
			number--;
		}
		return romanNum;
	}

}
