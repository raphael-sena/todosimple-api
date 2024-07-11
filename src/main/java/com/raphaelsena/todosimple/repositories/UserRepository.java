package com.raphaelsena.todosimple.repositories;

import com.raphaelsena.todosimple.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    @Transactional(readOnly = true)
    User findByUsername(String username);
}