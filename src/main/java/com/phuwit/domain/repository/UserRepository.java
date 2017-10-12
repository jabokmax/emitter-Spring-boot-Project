package com.phuwit.domain.repository;

import com.phuwit.domain.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    User findOneByEmail(String email);


}
