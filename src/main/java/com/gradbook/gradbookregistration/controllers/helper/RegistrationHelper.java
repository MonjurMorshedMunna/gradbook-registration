package com.gradbook.gradbookregistration.controllers.helper;

import com.gradbook.gradbookregistration.controllers.helper.RoleType;
import com.gradbook.gradbookregistration.models.Role;
import com.gradbook.gradbookregistration.models.User;
import com.gradbook.gradbookregistration.models.UserRole;
import com.gradbook.gradbookregistration.repositories.RoleRepository;
import com.gradbook.gradbookregistration.repositories.UserRepository;
import com.gradbook.gradbookregistration.repositories.UserRoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.sql.Timestamp;

/**
 * Created by Munna on 24-Jun-17.
 */
@Component
public class RegistrationHelper {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;


    @Autowired
    private UserRoleRepository userRoleRepository;

    public ResponseEntity<?> registerUser(final User user){
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        user.setLastModified(timestamp);
        //userRepository.save(user);
        Role role = roleRepository.findOne( Long.valueOf(RoleType.USER.getValue()) );
        UserRole userRole = new UserRole();
        userRole.setRoleId(role.getId());
        userRole.setUser(user);
        userRoleRepository.save(userRole);
        return ResponseEntity.ok("created");
    }
}
