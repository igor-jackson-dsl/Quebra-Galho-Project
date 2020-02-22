/**
 * 
 */
package br.com.igorLopesLima.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.igorLopesLima.repository.UsersRepository;

/**
 * @author Igor Jackson Lopes Lima
 *
 */

@Service
public class UsersService {

	@Autowired
	private UsersRepository repository;
	
}
