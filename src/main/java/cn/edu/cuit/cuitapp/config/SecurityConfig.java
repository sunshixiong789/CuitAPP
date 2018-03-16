package cn.edu.cuit.cuitapp.config;


import cn.edu.cuit.cuitapp.handler.CuitLogoutSuccessHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.logout.LogoutSuccessHandler;

/**
 * @author sunshixiong
 * @date 2018/2/28 16:09
 */
@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {



    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .formLogin()
                .loginPage("/login")
                .loginProcessingUrl("/form/login").failureUrl("/login?error=false")
                .and()
                .logout().logoutUrl("/logout").logoutSuccessHandler(new CuitLogoutSuccessHandler())
                .and()
                .authorizeRequests()
                .antMatchers("/**/*.js","/**/*.css","/**/*.png","/**/*.jpg","/**/fonts/**").permitAll()
                .antMatchers("/index/**","/assets/**","/static/**").permitAll()
                .antMatchers("/login","/").permitAll()
                .anyRequest()
                .authenticated()
                .and()
                .csrf().disable();//关掉这个跨站请求伪造才能使用postman测试api

    }
}
