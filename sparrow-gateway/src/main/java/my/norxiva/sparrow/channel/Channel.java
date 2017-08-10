package my.norxiva.sparrow.channel;

import lombok.Data;
import my.norxiva.sparrow.common.ChannelStatus;
import my.norxiva.sparrow.common.ChannelType;

@Data
public class Channel {

    private Long id;
    private String name;
    private ChannelType type;
    private ChannelStatus status;

}