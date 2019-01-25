package com.fjcs.example.couchbase;



import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.couchbase.config.AbstractCouchbaseConfiguration;
import org.springframework.data.couchbase.core.mapping.event.ValidatingCouchbaseEventListener;
import org.springframework.data.couchbase.repository.config.EnableCouchbaseRepositories;


import java.util.Collections;
import java.util.List;


@Configuration
@EnableCouchbaseRepositories(basePackages = {"com.fjcs.example.couchbase.repository"})
public class CouchbaseConfig extends AbstractCouchbaseConfiguration {
	 @Override
	    protected List<String> getBootstrapHosts() {
	        return Collections.singletonList("127.0.0.1");
	    }

	    @Override
	    protected String getBucketName() {
	        return "travel-sample";
	    }

	    @Override
	    protected String getBucketPassword() {
	        return "travel-sample1234";
	    }
}