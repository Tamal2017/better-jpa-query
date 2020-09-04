/**
 * 
 */
package com.app.jpql.example.entities;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.TableGenerator;
import javax.validation.constraints.NotEmpty;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

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
@Table(name = "product")
@TableGenerator(name = "ProductGen", initialValue = 0, allocationSize = 1)
public class ProductEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ProductGen")
	@Column(name = "ID")
	Long id;
	
	@Column(name = "CODE")
	@NotEmpty
	@EqualsAndHashCode.Include
	String code;
	
	@Column(name = "LABEL")
	String label;
	
	@Column(name = "EXPIRATION_DATE")
	Date expirationDate;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "DETAIL_ID", referencedColumnName = "ID")
	DetailEntity detail;

}
