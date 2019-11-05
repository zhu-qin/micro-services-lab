package com.example.usersapi.repository;

import com.example.usersapi.model.User;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User,Long> {
  public List<User> findByFirstNameContainsOrLastNameContains(String firstName, String lastName);
}
