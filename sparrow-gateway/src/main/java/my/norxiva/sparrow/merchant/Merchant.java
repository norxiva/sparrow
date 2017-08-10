package my.norxiva.sparrow.merchant;

import lombok.Data;
import my.norxiva.sparrow.common.MerchantStatus;

@Data
public class Merchant {

    private Long id;
    private String name;
    private String address;
    private String telephone;
    private String email;
    private MerchantStatus status;

}
