package Strategy;

public class CLlient {

	public static void main(String[] args) {
		LowercaseStrategy str1 = new LowercaseStrategy();
		UppercaseStrategy str2 = new UppercaseStrategy();
		RandomcaseStrategy str3 = new RandomcaseStrategy();
		String input = "LOREM ipsum DOLOR sit amet";
		
		Executor executor = new Executor(str1);
		executor.printString(input);
		
		executor.strategy = str2;
		executor.printString(input);
		
		executor.strategy = str3;
		executor.printString(input);
		
	}

}
