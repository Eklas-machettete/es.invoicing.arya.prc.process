package com.invoicing.configuration;

import java.util.Objects;

import org.camunda.bpm.engine.impl.plugin.AdministratorAuthorizationPlugin;
import org.camunda.bpm.identity.impl.ldap.plugin.LdapIdentityProviderPlugin;
import org.camunda.bpm.spring.boot.starter.CamundaBpmAutoConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.StringUtils;

import com.invoicing.properties.BpmRunProperties;

@EnableConfigurationProperties({BpmRunProperties.class})
@Configuration
@AutoConfigureAfter({CamundaBpmAutoConfiguration.class})
public class BpmRunConfiguration {

    @Autowired
    BpmRunProperties bpmRunProperties;

    public BpmRunConfiguration() {
    }

    @Bean
    @ConditionalOnProperty(
            name = {"enabled"},
            havingValue = "true",
            prefix = "camunda.bpm.run.ldap"
    )
    public LdapIdentityProviderPlugin ldapIdentityProviderPlugin() {
        return this.bpmRunProperties.getLdap();
    }

    @Bean
    @ConditionalOnProperty(
            name = {"enabled"},
            havingValue = "true",
            prefix = "myapp.camunda.superadmin"
    )
    public AdministratorAuthorizationPlugin administratorAuthorizationPlugin(
            @Value("${myapp.camunda.superadmin.user:}") String adminUser,
            @Value("${myapp.camunda.superadmin.group:}") String adminGroup
            ){
        AdministratorAuthorizationPlugin administratorAuthorizationPlugin = new AdministratorAuthorizationPlugin();
        if(Objects.nonNull(adminUser) && !StringUtils.isEmpty(adminUser)) {
            administratorAuthorizationPlugin.setAdministratorUserName(adminUser);
        }
        if(Objects.nonNull(adminGroup) && !StringUtils.isEmpty(adminGroup)){
            administratorAuthorizationPlugin.setAdministratorGroupName(adminGroup);
        }
        return administratorAuthorizationPlugin;
    }

}