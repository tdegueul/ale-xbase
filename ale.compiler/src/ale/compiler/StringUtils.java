package ale.compiler;

public class StringUtils {
	public static String toFirstUpper(final String string) {
		return string.substring(0, 1).toUpperCase() + string.substring(1);
	}
}
