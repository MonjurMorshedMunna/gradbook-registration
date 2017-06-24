package com.gradbook.gradbookregistration.repositories;

import com.gradbook.gradbookregistration.models.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Munna on 24-Jun-17.
 */
@Repository
public interface UserRoleRepository extends JpaRepository<UserRole, Long> {

}
