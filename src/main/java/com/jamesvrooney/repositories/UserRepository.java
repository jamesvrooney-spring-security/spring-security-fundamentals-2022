package com.jamesvrooney.repositories;

import com.jamesvrooney.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    @Query("""    
        SELECT u FROM User u WHERE u.username = :username
    """)
    Optional<User> findByUsername(String username);
}
