package junitstudy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class StringTest {
	@Test
	void split() {
		String testString1 = "1,2";
		String testString2 = "1";

		String[] result1 = testString1.split(",");
		String[] result2 = testString2.split(",");

		assertThat(result1).containsExactly("1", "2");
		assertThat(result2).containsExactly("1");
	}

	@Test
	void removeBracket() {
		String testString = "(1,2)";
		String result = testString.substring(1, testString.length() - 1);

		assertThat(result).isEqualTo("1,2");
	}

	@Test
	@DisplayName("특정 위치의 문자를 가져오는 테스트")
	void getChar() {
		String testString = "abc";
		char zero = testString.charAt(0);
		assertThat(zero).isEqualTo('a');
		assertThatThrownBy(() -> testString.charAt(testString.length()))
			.isInstanceOf(IndexOutOfBoundsException.class)
			.hasMessageContaining("String index out of range: 3");
	}
}
