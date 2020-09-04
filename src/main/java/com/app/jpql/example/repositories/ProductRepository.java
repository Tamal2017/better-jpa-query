/**
 * 
 */
package com.app.jpql.example.repositories;

import org.springframework.data.repository.CrudRepository;

import com.app.jpql.example.entities.ProductEntity;

/**
 * @author Joseph T
 *
 */
public interface ProductRepository extends CrudRepository<ProductEntity	, Long> {

}
