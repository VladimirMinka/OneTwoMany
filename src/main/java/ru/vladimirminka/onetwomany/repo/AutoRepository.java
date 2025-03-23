package ru.vladimirminka.onetwomany.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.vladimirminka.onetwomany.entity.Auto;

public interface AutoRepository  extends JpaRepository<Auto, Integer> {
}
