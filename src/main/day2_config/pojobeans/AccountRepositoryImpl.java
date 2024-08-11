package pojobeans;

import java.util.HashMap;
import java.util.Map;

public class AccountRepositoryImpl implements AccountRepository {

   private Map<Long, Account> accountsMap = new HashMap<>();

   {
      Account account1 = new Account();
      account1.setId(1);
      account1.setOwnerName("John");
      account1.setBalance(10.0);
      System.out.println("Initialized Account 1: " + account1);
      System.out.println("Account 1 Balance: " + account1.getBalance());

      Account account2 = new Account();
      account2.setId(2);
      account2.setOwnerName("Mary");
      account2.setBalance(20.0);
      System.out.println("Initialized Account 2: " + account2);
      System.out.println("Account 2 Balance: " + account2.getBalance());

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

