package my.norxiva.sparrow.merchant;

import lombok.Data;
import my.norxiva.sparrow.common.BankAcronym;

@Data
public class MerchantRiskBank {

    private Long merchantId;
    private BankAcronym bankAcronym;
    private boolean closed = false;

}
