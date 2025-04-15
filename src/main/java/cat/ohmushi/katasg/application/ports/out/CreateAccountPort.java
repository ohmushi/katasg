package cat.ohmushi.katasg.application.ports.out;

import cat.ohmushi.katasg.domain.Account;

@FunctionalInterface
public interface CreateAccountPort {
    void create(Account account);
}