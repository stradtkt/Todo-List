package com.stradtman.controller;


import com.stradtman.model.TodoData;
import com.stradtman.utils.Mappings;
import com.stradtman.utils.ViewNames;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class TodoItemController {
    @ModelAttribute
    public TodoData todoData() {
        return new TodoData();
    }
    @GetMapping(Mappings.ITEMS)
    public String items() {
        return ViewNames.ITEMS_LIST;
    }
}
