package my.norxiva.sparrow.channel;

import lombok.Data;
import my.norxiva.sparrow.common.BankAcronym;
import my.norxiva.sparrow.common.ChannelType;

@Data
public class ChannelRiskBank {

    private ChannelType channelType;
    private BankAcronym bankAcronym;
    private boolean maintained = false;

}