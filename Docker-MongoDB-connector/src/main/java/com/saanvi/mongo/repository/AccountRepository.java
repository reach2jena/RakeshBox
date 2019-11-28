package com.saanvi.mongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.saanvi.mongo.document.Account;

@Repository("acctrepo")
public interface AccountRepository extends MongoRepository<Account, Integer>{

}
