package cat.ohmushi.katasg.domain;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import java.math.BigDecimal;

public class AccountTest {
    @Test
    void shouldCreateAnAccount() {
        assertThat(Account.of("123456", "Theo OMNES", BigDecimal.ZERO));
    }

    @Test
    void createAccountWithNullValueShouldThrowNullPointerException() {
        assertThatThrownBy(() -> Account.of(null, "Theo OMNES", BigDecimal.ZERO))
                .isInstanceOf(NullPointerException.class);
        assertThatThrownBy(() -> Account.of("123456", null, BigDecimal.ZERO))
                .isInstanceOf(NullPointerException.class);
        assertThatThrownBy(() -> Account.of("123456", "Theo OMNES", null))
                .isInstanceOf(NullPointerException.class);
    }
}
