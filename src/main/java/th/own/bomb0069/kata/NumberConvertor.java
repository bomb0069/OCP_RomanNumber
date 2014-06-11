package th.own.bomb0069.kata;

import java.util.List;
import java.util.Arrays;

public class NumberConvertor {

	List<AbstractRomanNumberRule> allNumber = Arrays.asList(new VRule(),
															new IVRule(),
															new IRule());

	public String getRomanNumber (int number) {
		String romanNum = "";
		while (number != 0) {
			for (RomanNumberRule romanNumber : allNumber) {
				if (romanNumber.isMatch(number)) {
					romanNum += romanNumber.getRomanText();
					number -= romanNumber.getNumber();
				}				
			}
		}
		return romanNum;
	}

}
