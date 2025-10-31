<<<<<<< HEAD
package com.mysite.sbb.user;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<SiteUser, Long>{
	Optional<SiteUser> findByUsername(String username);
}
=======
package com.mysite.sbb.user;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<SiteUser, Long>{
	
}
>>>>>>> d33bc38e305935db62527ada7b813d773719fe6c
