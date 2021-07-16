package com.example.demo._bank.Serivce;
/*속성
*은행이름은 상수로 정한다.
금액,계좌번호 입력후 입금후 잔액을 확인한다.
금액,계좌번호 입력후 출금후 잔액을 확인한다.
금액,계좌번호 입력후 잔액 확인 후 잔액을 본다
이름,을 입력하면 계좌가 생성된다. 단,계좌번호는 ****-****-****이고 랜덤값이다.
이름,계좌번호 입력후 계좌를 해지한다.
 */

import com.example.demo._bank.domain.BankAccountDTO;
import lombok.Data;
import java.util.List;

public interface BankAccountService {
   void add(BankAccountDTO bank);
   String count();
   List<? extends BankAccountDTO>findAll();
   String[] findAllAccountNumbers();
   void createAccount(BankAccountDTO bankAccount);
   String findBlance(BankAccountDTO bankAccount);
   void deposit(BankAccountDTO bankAccount);
   void withdraw(BankAccountDTO bankAccount);
   void dropAccount(BankAccountDTO bankAccount);


}
