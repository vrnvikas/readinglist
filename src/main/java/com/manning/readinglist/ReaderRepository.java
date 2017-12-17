package com.manning.readinglist;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Repository;

public interface ReaderRepository extends JpaRepository<Reader, String> {

}
