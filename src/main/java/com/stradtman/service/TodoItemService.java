package com.stradtman.service;

import com.stradtman.model.TodoData;
import com.stradtman.model.TodoItem;

public interface TodoItemService {
    void addItem(TodoItem todoItem);
    void removeItem(int id);
    TodoItem getItem(int id);
    void updateItem(TodoItem todoItem);
    TodoData getData();
}
