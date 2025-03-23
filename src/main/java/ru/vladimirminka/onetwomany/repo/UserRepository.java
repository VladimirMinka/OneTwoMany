package ru.vladimirminka.onetwomany.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import ru.vladimirminka.onetwomany.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
