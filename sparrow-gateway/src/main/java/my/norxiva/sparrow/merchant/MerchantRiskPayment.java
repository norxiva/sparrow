package my.norxiva.sparrow.merchant;

import lombok.Data;
import my.norxiva.sparrow.common.BankAcronym;
import my.norxiva.sparrow.common.BankCardType;
import my.norxiva.sparrow.common.PaymentType;
import my.norxiva.sparrow.common.TransactionType;

import java.util.HashSet;
import java.util.Set;

@Data
public class MerchantRiskPayment {

    private Long merchantId;
    private PaymentType paymentType;
    private TransactionType transactionType;
    private BankCardType bankCardType;
    private boolean maintained = false;
    private boolean useRiskBankConfig = true;
    private Set<BankAcronym> supportedBanks = new HashSet<>();
}
