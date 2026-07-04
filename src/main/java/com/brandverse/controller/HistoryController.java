package com.brandverse.controller;

import com.brandverse.entity.History;
import com.brandverse.service.HistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/history")
@CrossOrigin(origins = "*")
public class HistoryController {

    @Autowired
    private HistoryService service;

    // Save History
    @PostMapping
    public History saveHistory(@RequestBody History history){

        return service.saveHistory(history);

    }

    // Get User History
    @GetMapping("/{userId}")
    public List<History> getHistory(@PathVariable Long userId){

        return service.getHistory(userId);

    }

    // Delete One History
    @DeleteMapping("/{id}")
    public void deleteHistory(@PathVariable Long id){

        service.deleteHistory(id);

    }

    // Clear All History
    @DeleteMapping("/clear/{userId}")
    public void clearHistory(@PathVariable Long userId){

        service.clearHistory(userId);

    }

}
