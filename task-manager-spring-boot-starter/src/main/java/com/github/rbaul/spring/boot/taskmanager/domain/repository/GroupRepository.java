package com.github.rbaul.spring.boot.taskmanager.domain.repository;

import com.github.rbaul.spring.boot.taskmanager.domain.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GroupRepository extends JpaRepository<Task, Long> {
}
