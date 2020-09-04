/**
 * 
 */
package com.app.jpql.example.mappers;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.ReportingPolicy;

import com.app.jpql.example.dto.Product;
import com.app.jpql.example.entities.ProductEntity;

/**
 * @author Joseph T
 *
 */

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface ProductMapper {
	@Mappings({
		@Mapping(source = "detail.category", target = "category"),
		@Mapping(source = "detail.description", target = "description")
	})
	Product asProduct(ProductEntity productEntity);
	
	@InheritInverseConfiguration
	ProductEntity asProductEntity(Product product);

}
