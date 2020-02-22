package br.com.igorLopesLima.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.igorLopesLima.model.Users;

public interface UsersRepository extends JpaRepository<Users, Long> {

}
