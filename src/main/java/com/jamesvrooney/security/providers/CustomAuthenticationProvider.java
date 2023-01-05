package com.jamesvrooney.security.providers;

import com.jamesvrooney.security.authentication.CustomKeyAuthentication;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.stereotype.Component;

@Component
public class CustomAuthenticationProvider implements AuthenticationProvider {

    @Value("${key}")
    private String key;

    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        var ca = (CustomKeyAuthentication) authentication;

        if (ca.getKey().equals(key)) {
            return new CustomKeyAuthentication(true, null);
        }

        throw new BadCredentialsException("Invalid credentials key");
    }

    @Override
    public boolean supports(Class<?> authentication) {
        return CustomKeyAuthentication.class.equals(authentication);
    }
}
