package my.norxiva.sparrow.channel;

import lombok.Data;
import my.norxiva.sparrow.common.*;

import java.math.BigDecimal;

@Data
public class ChannelRiskQuota {

    private ChannelType channelType;
    private PaymentType paymentType;
    private TransactionType transactionType;
    private BankAcronym bankAcronym;
    private BankCardType bankCardType;
    private BigDecimal dailyMaxQuota;
    private BigDecimal monthlyMaxQuota;

}