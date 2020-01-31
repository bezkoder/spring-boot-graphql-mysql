package com.bezkoder.springgraphql.mysql.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bezkoder.springgraphql.mysql.model.Tutorial;

public interface TutorialRepository extends JpaRepository<Tutorial, Long> {

}
