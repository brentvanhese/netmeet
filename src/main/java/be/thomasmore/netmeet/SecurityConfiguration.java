package be.thomasmore.netmeet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import javax.sql.DataSource;

@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/admin/**").hasAuthority("ROLE_ADMIN")
                .antMatchers("/organisator/**").hasAuthority("ROLE_ORGANISATOR")
                .anyRequest().permitAll();
        http.formLogin()
                .loginPage("/user/login");
        http.logout()
                .logoutUrl("/user/logout")
                .logoutSuccessUrl("/");
        http.csrf().ignoringAntMatchers("/h2-console/**")
                .and().headers().frameOptions().sameOrigin();
    }

    @Autowired
    private DataSource dataSource;

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        auth.jdbcAuthentication()
                .dataSource(dataSource)
                .usersByUsernameQuery(
                        "select username,password,true from user where username = ?")
                .authoritiesByUsernameQuery(
                        "select username, role from user where username = ?");
    }

    @Bean
    @Override
    public AuthenticationManager authenticationManagerBean()
            throws Exception {
        return super.authenticationManagerBean();
    }
}
