package my.norxiva.sparrow.merchant;

import lombok.Data;

@Data
public class MerchantSecret {

    private Long merchantId;
    private String base64PrivateKey;
    private String base64PublicKey;
    private String base64SecretKey;
    private String cipherAlgorithm;
    private String signatureAlgorithm;

}
