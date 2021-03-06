package com.twokeys.twokeysweb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.twokeys.twokeysweb.entities.Company;

@Repository
public interface CompanyRepository extends JpaRepository<Company, Long> {

}


