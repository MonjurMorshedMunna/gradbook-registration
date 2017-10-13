package com.gradbook.gradbookregistration.repositories;

import com.gradbook.gradbookregistration.models.Role;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Munna on 24-Jun-17.
 */
@Repository
@CacheConfig(cacheNames = "role")
public interface RoleRepository extends JpaRepository<Role, Long>{

}
