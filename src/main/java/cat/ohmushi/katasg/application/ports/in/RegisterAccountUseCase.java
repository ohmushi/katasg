package cat.ohmushi.katasg.application.ports.in;

import java.math.BigDecimal;

@FunctionalInterface
public interface RegisterAccountUseCase {
    String registerAccount(BigDecimal initialMoney, String HolderName);
}
