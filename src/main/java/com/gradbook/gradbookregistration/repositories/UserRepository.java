package com.gradbook.gradbookregistration.repositories;

import com.gradbook.gradbookregistration.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Munna on 24-Jun-17.
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
