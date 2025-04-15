package cat.ohmushi.katasg.adapters.in.web;

import java.math.BigDecimal;

import cat.ohmushi.katasg.domain.Account;

public record AccountFindDto(
        String accountNumber,
        String accountHolderName,
        BigDecimal balance) {

    public static AccountFindDto fromAccount(Account a) {
        return new AccountFindDto(
                a.getAccountNumber(), a.getAccountHolderName(), a.getBalance());
    }
}
