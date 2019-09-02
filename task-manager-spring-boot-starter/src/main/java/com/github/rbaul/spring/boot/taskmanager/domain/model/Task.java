package com.github.rbaul.spring.boot.taskmanager.domain.model;

import com.github.rbaul.spring.boot.taskmanager.domain.model.enums.TaskStatus;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Map;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
@EqualsAndHashCode(of = "id")
@Entity(name = "task_execution")
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private Class<?> type;

    @NotNull
    private Map<String, String> data;

    @NotNull
    private TaskStatus status;

    @ManyToOne
    private Group group;

}
