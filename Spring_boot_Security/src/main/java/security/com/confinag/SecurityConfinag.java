package security.com.confinag;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class SecurityConfinag  {
	// UserDetailsService
	@Bean
	 public UserDetailsService detailsService() {
		 var uds = new InMemoryUserDetailsManager();
		 	var u1 = User.withUsername("NABI")
		 			.password("Nabi")
		 			.authorities("read")
		 			.build();
		 	uds.createUser(u1);
		 return uds;
	 }
	
	
	// password
	@Bean
	public PasswordEncoder passwordEncoder() {
		
		return NoOpPasswordEncoder.getInstance();
		
		
	}
	
	
}
