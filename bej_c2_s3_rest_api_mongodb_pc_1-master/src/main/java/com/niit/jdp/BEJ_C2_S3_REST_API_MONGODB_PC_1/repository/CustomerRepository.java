package com.niit.jdp.BEJ_C2_S3_REST_API_MONGODB_PC_1.repository;

import com.niit.jdp.BEJ_C2_S3_REST_API_MONGODB_PC_1.domain.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

// A repository interface that extends MongoRepository.
@Repository
public interface CustomerRepository extends MongoRepository<Customer, Integer> {
    @Query("{'customerProduct.productName':{$in:[?0]}}")
    List<Customer> findAllCustomerProductName(String productName);
}
