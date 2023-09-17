package com.example.postgresdb.repo;

import com.example.postgresdb.models.TestUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo  extends JpaRepository<TestUser, Long> {

}
