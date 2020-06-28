package com.backend.springboot;

import com.backend.springboot.models.ERole;
import com.backend.springboot.models.Role;
import com.backend.springboot.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootSecurityJwtApplication implements CommandLineRunner {
	@Autowired
	RoleRepository roleRepository;
	public static void main(String[] args) {
		SpringApplication.run(SpringBootSecurityJwtApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		//ADDING ROLES TO THE DATABASE...
//		roleRepository.save(new Role(ERole.ROLE_ADMIN));
//		roleRepository.save(new Role(ERole.ROLE_RESPONSABLEPROD));
//		roleRepository.save(new Role(ERole.ROLE_EMPLOYE));
	}

}
