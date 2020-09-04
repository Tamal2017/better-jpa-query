/**
 * 
 */
package com.app.jpql.example.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.TableGenerator;
import javax.validation.constraints.NotEmpty;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.app.jpql.example.dto.Category;

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
@Entity
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@EntityListeners(AuditingEntityListener.class)
@Table(name = "detail")
@TableGenerator(name = "DetailGen", initialValue = 0, allocationSize = 1)
public class DetailEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "DetailGen")
	@Column(name = "ID")
	Long id;
	
	@Column(name = "REFENCE")
	@NotEmpty
	@EqualsAndHashCode.Include
	String reference;

	@Enumerated(EnumType.STRING)
	@EqualsAndHashCode.Include
	@Column(name = "CATEGORY")
	Category category;

	@Column(name = "MAKER")
	String maker;
	
	@Column(name = "DESCRIPTION")
	String description;

}
