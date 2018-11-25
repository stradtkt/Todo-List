package com.stradtman.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Data
@EqualsAndHashCode(of = "id")
@Getter
@Setter
public class TodoItem {
    private int id;
    private String title;
    private String details;
    private LocalDate deadline;

    public TodoItem(String title, String details, LocalDate deadline) {
        this.title = title;
        this.details = details;
        this.deadline = deadline;
    }
}
