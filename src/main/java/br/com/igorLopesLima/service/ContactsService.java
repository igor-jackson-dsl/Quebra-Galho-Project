/**
 * 
 */
package br.com.igorLopesLima.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.igorLopesLima.repository.ContactsRepository;

/**
 * @author Igor Jackson Lopes Lima
 *
 */

@Service
public class ContactsService {
	
	@Autowired
	private ContactsRepository repository;

}
