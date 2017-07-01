package net.aimeizi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnClass(SampleService.class)
@EnableConfigurationProperties(SampleServiceProperties.class)
public class SampleAutoConfigure {

    @Autowired
    private SampleServiceProperties properties;

    @Bean
    @ConditionalOnMissingBean
    @ConfigurationProperties(SampleServiceProperties.SAMPLE_PREFIX)
    SampleService sampleService() {
        if (properties.isEnable() != null && properties.isEnable()) {
            return new SampleService(properties.getPrefix(), properties.getSuffix());
        } else {
            return new SampleService();
        }
    }

}
