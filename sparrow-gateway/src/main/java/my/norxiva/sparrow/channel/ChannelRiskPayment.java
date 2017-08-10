package my.norxiva.sparrow.channel;

import lombok.Data;
import my.norxiva.sparrow.common.*;

import java.util.HashSet;
import java.util.Set;

@Data
public class ChannelRiskPayment {

    private ChannelType channelType;
    private PaymentType paymentType;
    private TransactionType transactionType;
    private BankCardType bankCardType;
    private boolean maintained = false;
    private boolean useRiskBankConfig = true;
    private Set<BankAcronym> supportedBanks = new HashSet<>();

}