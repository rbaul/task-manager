package com.github.rbaul.spring.boot.taskmanager;

import com.github.rbaul.spring.boot.taskmanager.config.TaskManagerConfig;
import org.springframework.boot.autoconfigure.AutoConfigurationPackage;
import org.springframework.context.annotation.Import;

@AutoConfigurationPackage
@Import(TaskManagerConfig.class)
public class TaskManagerAutoConfiguration {
}