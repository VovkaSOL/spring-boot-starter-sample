package net.aimeizi;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = SampleServiceProperties.SAMPLE_PREFIX)
public class SampleServiceProperties {

    public static final String SAMPLE_PREFIX = "sample";

    private Boolean enable;
    private String prefix;
    private String suffix;

    public Boolean isEnable() {
        return enable;
    }

    public void setEnable(Boolean enable) {
        this.enable = enable;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }
}
