package com.github.rbaul.spring.boot.taskmanager.services;

import com.github.rbaul.spring.boot.taskmanager.domain.repository.GroupRepository;
import com.github.rbaul.spring.boot.taskmanager.domain.repository.TaskRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Slf4j
@RequiredArgsConstructor(onConstructor_ = @Autowired)
public class TaskManagerImpl {

    private final TaskRepository taskRepository;

    private final GroupRepository groupRepository;

    private final List<TaskExecution> taskExecutions;

}
