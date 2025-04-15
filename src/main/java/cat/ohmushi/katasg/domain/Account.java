package cat.ohmushi.katasg.domain;

import java.math.BigDecimal;
import java.util.Objects;

public class Account {
    private String accountNumber;
    private String accountHolderName;
    private BigDecimal balance;

    private Account(String accountNumber, String accountHolderName, BigDecimal balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public static Account of(String accountNumber, String accountHolderName, BigDecimal balance) {
        return new Account(
                Objects.requireNonNull(accountNumber),
                Objects.requireNonNull(accountHolderName),
                Objects.requireNonNull(balance));
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    
}
