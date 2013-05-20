import java.util.StringTokenizer;

public class StringCalculator {

	public int add(String numbers) throws Exception {
		String delimiters = ",\n";

		if (numbers.startsWith("//")) {
			String delimeter = numbers.substring(3, 4);
			delimiters = delimiters + delimeter;
			numbers = numbers.substring(5);
		}

		StringTokenizer st = new StringTokenizer(numbers, delimiters);
		int suma = 0;
		StringBuffer numbersError = new StringBuffer();
		while (st.hasMoreElements()) {
			int currentNumber = Integer.parseInt(st.nextToken());
			if (0 > currentNumber) {
				numbersError.append(currentNumber + ",");
			}
			suma = suma + currentNumber;
		}
		if (0 < numbersError.length()) {
			throw new Exception("no se permiten negativos"
					+ numbersError.toString());

		}
		return suma;

	}
}
