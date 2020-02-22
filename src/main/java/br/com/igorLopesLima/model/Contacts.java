/**
 * 
 */
package br.com.igorLopesLima.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

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
public class Contacts implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String Contact;

	@ManyToOne
	@JoinColumn(name = "id_User")
	private Users userContact;

}
