//package com.shrawan.journal.controller;

package com.shrawan.journal.controller;

import com.shrawan.journal.entity.JournalEntry;
import org.springframework.web.bind.annotation.*;

import java.util.*;
import java.util.Map;

@RestController
@RequestMapping("journal")
public class JournalEntryControllerV2 {
    private Map<Long, JournalEntry> journalEntries = new HashMap<>();

    @GetMapping
    public List<JournalEntry> getAll(){
        return null;
    }

    @PostMapping
    public boolean createEntry(@RequestBody JournalEntry myEntry){
        return true;
    }

    @GetMapping("id/{myId}")
    public JournalEntry getEntryById(@PathVariable Long myId){
        return null;
    }

    @DeleteMapping("id/{myId}")
    public JournalEntry deleteEntryById(@PathVariable Long myId){
        return null;
    }

    @PutMapping("id/{id}")
    public JournalEntry updateEntryById(@PathVariable Long id, @RequestBody JournalEntry myEntry){
        return null;
    }

}
