package org.rdr.kesher.test.data;

import java.util.concurrent.atomic.AtomicReference;

import org.rdr.kesher.service.MongoServiceBase;
import org.springframework.context.annotation.Configuration;

import com.mongodb.MongoClient;

@Configuration
public class MongoTestBase extends MongoServiceBase {
	private AtomicReference<MongoClient> client = new AtomicReference<MongoClient>();
	
	protected String getDbName() {
		return "testCRUD";
	}
}
