package com.schb.application.repository;

import com.schb.application.document.ConfigDescriptors;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface ConfigDescriptorsRepository extends ElasticsearchRepository <ConfigDescriptors,String> {
}
