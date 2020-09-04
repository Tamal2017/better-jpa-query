/**
 * 
 */
package com.app.jpql.example.dto;

import java.io.Serializable;
import java.util.Date;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

/**
 * @author Joseph T
 *
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Product implements Serializable {

	static final long serialVersionUID = 1L;

	Long id;
	String label;
	String code;
	String category;
	String description;
	Date expirationDate;

}
