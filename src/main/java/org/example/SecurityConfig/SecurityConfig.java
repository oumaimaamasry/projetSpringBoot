package org.example.SecurityConfig;

/*
@EnableWebSecurity
@Configuration
public class SecurityConfig {
    @Autowired
    PasswordEncoder passwordEncoder;
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception {
        httpSecurity.formLogin();
        httpSecurity.authorizeHttpRequests().anyRequest().authenticated();
        return  httpSecurity.build();
    }
    @Bean
    public InMemoryUserDetailsManager inMemoryUserDetailsManager(){
        return new InMemoryUserDetailsManager(

                User.withUsername("admin").password(passwordEncoder.encode("123")).roles("ADMIN","USER").build(),
                User.withUsername("client").password(passwordEncoder.encode("123")).roles("USER").build()
        );
    }
}
*/