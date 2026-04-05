package com.shrawan.journal.service;

import com.shrawan.journal.entity.JournalEntry;
import com.shrawan.journal.entity.User;
import com.shrawan.journal.repository.JournalEntryRepository;
import com.shrawan.journal.repository.UserRepository;
import org.bson.types.ObjectId;

import java.util.List;
import java.util.Optional;

public class UserService {

    private UserRepository userRepository;

    public void saveEntry(User user){
        userRepository.save(user);
    }

    public List<User> getAll(){
        return userRepository.findAll();
    }

    public Optional<User> findById(ObjectId id){
        return userRepository.findById(id);
    }


    public void deleteById(ObjectId id){
        userRepository.deleteById(id);
    }

    public User findByUserName(String userName){
        return userRepository.findByUserName(userName);
    }
}
