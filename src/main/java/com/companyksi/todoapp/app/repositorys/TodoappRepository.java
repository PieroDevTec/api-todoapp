package com.companyksi.todoapp.app.repositorys;

import com.companyksi.todoapp.app.models.Todoapp;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoappRepository extends JpaRepository<Todoapp,Long> {
}
