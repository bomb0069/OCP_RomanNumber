package th.own.bomb0069.kata;

import java.util.List;
import java.util.Arrays;

public class NumberConvertor {

	List<AbstractRomanNumberRule> allNumber = Arrays.asList(new XRule(),
															new IXRule(),
															new VRule(),
															new IVRule(),
															new IRule());

	public String getRomanNumber (int number) {
		String romanNum = "";
		for (RomanNumberRule romanNumber : allNumber) {
			while (romanNumber.isMatch(number)) {
				romanNum += romanNumber.getRomanText();
				number -= romanNumber.getNumber();
			}
		}
		return romanNum;
	}

}
