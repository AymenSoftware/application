package com.schb.application.controller;

import com.schb.application.document.ConfigDescriptors;
import com.schb.application.repository.ConfigDescriptorsRepository;
import org.elasticsearch.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/configdescriptors")
public class ConfigDescriptorsController {

    @Autowired
    private ConfigDescriptorsRepository configdescriptorsRepository;

    @PostMapping("/api/configdescriptors")
    public ConfigDescriptors create(@RequestBody ConfigDescriptors configdescriptors){
        return configdescriptorsRepository.save(configdescriptors);
    }

    @GetMapping("/{id}")
    public ConfigDescriptors retrieve(@PathVariable String id){
        return configdescriptorsRepository.findById(id).orElseThrow(() ->new ResourceNotFoundException("ID: " + id));
    }

    @PutMapping("/{id}")
    public ConfigDescriptors update(@RequestBody ConfigDescriptors configdescriptors){
        return configdescriptorsRepository.save(configdescriptors);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable String id){
        configdescriptorsRepository.deleteById(id);
        return "Done";
    }

}
