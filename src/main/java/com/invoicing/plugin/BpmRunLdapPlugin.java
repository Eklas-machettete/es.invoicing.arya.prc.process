package com.invoicing.plugin;

import org.camunda.bpm.identity.impl.ldap.plugin.LdapIdentityProviderPlugin;

public class BpmRunLdapPlugin extends LdapIdentityProviderPlugin {

    boolean enabled = true;

    public BpmRunLdapPlugin() {
    }

    public boolean isEnabled() {
        return this.enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

}