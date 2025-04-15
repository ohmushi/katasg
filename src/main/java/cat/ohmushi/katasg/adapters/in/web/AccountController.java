package cat.ohmushi.katasg.adapters.in.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import cat.ohmushi.katasg.application.ports.in.FindAccountByIdUseCase;
import cat.ohmushi.katasg.application.ports.in.RegisterAccountUseCase;
import jakarta.websocket.server.PathParam;

import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/accounts")
public class AccountController {

    private final RegisterAccountUseCase registerAccount;
    private final FindAccountByIdUseCase findAccount;

    public AccountController(RegisterAccountUseCase registerAccount, FindAccountByIdUseCase findAccountByIdUseCase) {
        this.registerAccount = registerAccount;
        this.findAccount = findAccountByIdUseCase;
    }

    // POST /accounts: Create a new account.
    @PostMapping()
    public AccountCreateDto createNewAccount(@RequestBody AccountCreateDto command) {
        registerAccount.registerAccount(command.balance(), command.accountHolderName());
        return new AccountCreateDto(UUID.randomUUID().toString(), command.accountHolderName(), command.balance());
    }

    // GET /accounts/{id}: Retrieve account details by ID.
    @GetMapping("/{id}")
    public AccountFindDto getAccountById(@PathVariable String id) {
        var account = findAccount.findAccountById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
        return AccountFindDto.fromAccount(account);
    }
    // PUT /accounts/{id}: Update an existing account.
    // DELETE /accounts/{id}: Delete an account by ID.
}
