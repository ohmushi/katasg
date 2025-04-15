package cat.ohmushi.katasg.application.services;

import java.math.BigDecimal;
import java.util.Optional;

import cat.ohmushi.katasg.application.ports.in.FindAccountByIdUseCase;
import cat.ohmushi.katasg.application.ports.in.RegisterAccountUseCase;
import cat.ohmushi.katasg.domain.Account;

public class AccountService implements
        RegisterAccountUseCase,
        FindAccountByIdUseCase {


    @Override
    public String registerAccount(BigDecimal initialMoney, String HolderName) {
        return "";
    }

    @Override
    public Optional<Account> findAccountById(String id) {
        return Optional.of(Account.of(id, "", BigDecimal.ZERO));
    }

}
