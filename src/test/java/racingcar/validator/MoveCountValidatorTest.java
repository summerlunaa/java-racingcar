package racingcar.validator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

import static racingcar.validator.MoveCountValidator.*;

class MoveCountValidatorTest {
	@ParameterizedTest
	@ValueSource(ints = {-1, 0})
	@DisplayName("입력값이 양수가 아닐 경우")
	void notPositive(int moveCount) {
		assertThatThrownBy(() -> MoveCountValidator.validateMoveCount(moveCount))
			.isInstanceOf(IllegalArgumentException.class)
			.hasMessageContaining(ERROR_NOT_POSITIVE);
	}
}