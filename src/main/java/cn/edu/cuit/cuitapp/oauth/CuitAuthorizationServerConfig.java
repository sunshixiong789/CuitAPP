package cn.edu.cuit.cuitapp.oauth;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

/**
 * @author sunshixiong
 * @date 2018/3/5 16:10
 */
@Configuration
@EnableAuthorizationServer
public class CuitAuthorizationServerConfig extends AuthorizationServerConfigurerAdapter {

    @Autowired
    PasswordEncoder passwordEncoder;

    @Override
    public void configure(ClientDetailsServiceConfigurer clients) throws Exception {

        clients
                .inMemory()
                .withClient("sunshixiong")
                .authorizedGrantTypes(/*"password", */"authorization_code", "refresh_token", "implicit")//四种授权模式
                .secret(passwordEncoder.encode("123456"))
                .scopes("read", "write", "trust")
                .refreshTokenValiditySeconds(10000)
                .authorizedGrantTypes();
    }
}
