package com.brandverse.service;

import com.brandverse.entity.History;
import com.brandverse.repository.HistoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HistoryService {

    @Autowired
    private HistoryRepository repository;

    // Save History
    public History saveHistory(History history){

        return repository.save(history);

    }

    // Get User History
    public List<History> getHistory(Long userId){

        return repository.findByUserId(userId);

    }

    // Delete One History
    public void deleteHistory(Long id){

        repository.deleteById(id);

    }

    // Clear All History
    public void clearHistory(Long userId){

        List<History> list = repository.findByUserId(userId);

        repository.deleteAll(list);

    }

}