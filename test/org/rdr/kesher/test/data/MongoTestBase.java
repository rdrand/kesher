package org.rdr.kesher.test.data;

import java.util.concurrent.atomic.AtomicReference;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoTemplate;

import com.mongodb.MongoClient;

@Configuration
public class MongoTestBase {
	private AtomicReference<MongoClient> client = new AtomicReference<MongoClient>();
	
  /*
   * Use the standard Mongo driver API to create a com.mongodb.MongoClient instance.
   */
   public @Bean MongoClient mongoClient() {
	   if (client.get() == null) {
		   client.set(new MongoClient("localhost"));
	   }
	   return client.get();
   }

   public MongoTemplate getTemplate()  {
	   return new MongoTemplate(mongoClient(), "testCRUD");
   }
}
