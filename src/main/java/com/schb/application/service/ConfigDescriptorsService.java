package com.schb.application.service;


import com.schb.application.document.ConfigDescriptors;
import com.schb.application.repository.ConfigDescriptorsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConfigDescriptorsService {

    private final ConfigDescriptorsRepository repository;

    @Autowired
    public ConfigDescriptorsService(ConfigDescriptorsRepository repository) {
        this.repository = repository;
    }

    public void save(final ConfigDescriptors configdescriptors){
        repository.save(configdescriptors);
    }

    public ConfigDescriptors findById(final String id){
        return repository.findById(id).orElse(null);
    }
}
