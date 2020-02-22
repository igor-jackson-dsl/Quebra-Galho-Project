package br.com.igorLopesLima.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.igorLopesLima.model.Contacts;

public interface ContactsRepository extends JpaRepository<Contacts, Long> {

}
