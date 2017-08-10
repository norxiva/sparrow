package my.norxiva.sparrow.merchant;

import lombok.Data;

@Data
public class MerchantRiskConfig {

    private Long merchantId;
    private boolean allowAllBank = false;
    private boolean allowAllPayment = false;

}
