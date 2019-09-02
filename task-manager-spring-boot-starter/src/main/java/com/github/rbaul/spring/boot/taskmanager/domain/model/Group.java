package com.github.rbaul.spring.boot.taskmanager.domain.model;

import com.github.rbaul.spring.boot.taskmanager.domain.model.enums.TaskStatus;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
@EqualsAndHashCode(of = "id")
@Entity(name = "task_execution_group")
public class Group {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer threadsInUse;

    private Integer numberOfThreads;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "group")
    private List<Task> tasks;

}
