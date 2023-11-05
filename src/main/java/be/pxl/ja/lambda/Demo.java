package be.pxl.ja.lambda;

public class Demo {

	public static void main(String[] args) {
		StringConverter upperCaseConverter = new StringConverter() {
			@Override
			public String convert(String original) {
				return original.toUpperCase();
			}
		};
		StringConverter reverseConverter = new StringConverter() {
			@Override
			public String convert(String original) {
				StringBuilder temporary = new StringBuilder(original);
				return temporary.reverse().toString();
			}
		};
		System.out.println(upperCaseConverter.convert("LuchtHavenPerSOneeL"));
		System.out.println(reverseConverter.convert("LuchtHavenPerSOneeL"));
	}
}
