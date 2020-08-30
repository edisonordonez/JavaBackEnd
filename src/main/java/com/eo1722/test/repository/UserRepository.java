package com.eo1722.test.repository;

import com.eo1722.test.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * The interface User repository.
 *
 * @author Edinson Ordoñez
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {}
