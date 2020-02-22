/**
 * 
 */
package br.com.igorLopesLima.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * @author Igor Jackson Lopes Lima
 *
 */

@Entity
@Getter
@Setter
@EqualsAndHashCode
public class Users implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String name;
	private String email;
	private String endereco;
	private boolean professional = false;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "userContact")
	private Set<Contacts> contactUsers;

}
