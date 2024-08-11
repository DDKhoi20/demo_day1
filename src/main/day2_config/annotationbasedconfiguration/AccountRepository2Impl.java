package annotationbasedconfiguration;

import org.springframework.stereotype.Repository;
import pojobeans.Account;
import pojobeans.AccountRepository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class AccountRepository2Impl implements AccountRepository {

   private Map<Long, Account> accountsMap = new HashMap<>(); // Khởi tạo map tại đây

   {
      Account account1 = new Account();
      account1.setId(1);
      account1.setOwnerName("John");
      account1.setBalance(10.0);

      Account account2 = new Account();
      account2.setId(2);
      account2.setOwnerName("Mary");
      account2.setBalance(20.0);

      accountsMap.put(account1.getId(), account1);
      accountsMap.put(account2.getId(), account2);
   }

   @Override
   public void insert(Account account) {
      accountsMap.put(account.getId(), account);
   }

   @Override
   public void update(Account account) {
      accountsMap.put(account.getId(), account);
   }

   @Override
   public Account find(long accountId) {
      return accountsMap.get(accountId);
   }
}
