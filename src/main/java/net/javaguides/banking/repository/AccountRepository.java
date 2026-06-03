package net.javaguides.banking.repository;
import net.javaguides.banking.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;


/*
AccountRepository interface which extends jparepo....
AccountRepo gets crude db methods to perform db actions with the help of jparepo...
*/

public interface AccountRepository extends JpaRepository<Account, Long> {
}
