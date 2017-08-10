package my.norxiva.sparrow.merchant;

import lombok.Data;
import my.norxiva.sparrow.common.BankAcronym;
import my.norxiva.sparrow.common.BankCardType;
import my.norxiva.sparrow.common.PaymentType;
import my.norxiva.sparrow.common.TransactionType;

import java.math.BigDecimal;

@Data
public class MerchantRiskQuota {

    private Long merchantId;
    private PaymentType paymentType;
    private TransactionType transactionType;
    private BankAcronym bankAcronym;
    private BankCardType bankCardType;
    private BigDecimal dailyMaxQuota;
    private BigDecimal monthlyMaxQuota;

}
