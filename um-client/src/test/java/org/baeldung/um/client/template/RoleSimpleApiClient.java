package org.baeldung.um.client.template;

import org.baeldung.common.spring.util.Profiles;
import org.baeldung.um.persistence.model.Role;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile(Profiles.CLIENT)
public final class RoleSimpleApiClient extends GenericSimpleApiClient<Role> {

    public RoleSimpleApiClient() {
        super(Role.class);
    }

    // API

    @Override
    public final String getUri() {
        return paths.getRoleUri();
    }

}