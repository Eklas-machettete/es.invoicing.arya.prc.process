package com.invoicing.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.NestedConfigurationProperty;

import com.invoicing.plugin.BpmRunLdapPlugin;

@ConfigurationProperties("camunda.bpm.run")
public class BpmRunProperties {

    @NestedConfigurationProperty
    private BpmRunLdapPlugin ldap = new BpmRunLdapPlugin();

    public BpmRunLdapPlugin getLdap() {
        return this.ldap;
    }

    public void setLdap(BpmRunLdapPlugin ldap) {
        this.ldap = ldap;
    }

}