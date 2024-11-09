package cn.itcast.user.config;

import lombok.Data;
import org.bouncycastle.cms.PasswordRecipient;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @Author: hjm
 * @Date: 2024/11/03/19:44
 * @Description:
 */
@Data
@Component
@ConfigurationProperties(prefix = "pattern")
public class PatternProperties {
    private String dateformat;
    private String envSharedValue;
}
