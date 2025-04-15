package cat.ohmushi.katasg.adapters.in.web;

import java.math.BigDecimal;

public record AccountCreateDto(
                String accountNumber,
                String accountHolderName,
                BigDecimal balance) {
}
