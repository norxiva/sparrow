package my.norxiva.sparrow.channel;

import lombok.Data;
import my.norxiva.sparrow.common.ChannelType;

@Data
public class ChannelSecret {

    private ChannelType channelType;
    private String base64PrivateKey;
    private String base64PublicKey;
    private String base64SecretKey;
    private String cipherAlgorithm;
    private String signatureAlgorithm;

}