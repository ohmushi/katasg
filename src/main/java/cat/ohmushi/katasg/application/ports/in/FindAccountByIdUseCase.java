package cat.ohmushi.katasg.application.ports.in;

import java.util.Optional;

import cat.ohmushi.katasg.domain.Account;

public interface FindAccountByIdUseCase {
    Optional<Account> findAccountById(String id);
}
