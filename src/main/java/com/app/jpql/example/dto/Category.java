/**
 * 
 */
package com.app.jpql.example.dto;

/**
 * @author Joseph T
 *
 */
public enum Category {
	
	EDIBLE("EDIBLE"), INEDIBLE("INEDIBLE"), VARIOUS("VARIOUS");
	
	private String value;

	Category(String value) {
		this.value = value;
	}
}
