package com.tuyano.web;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface MyDataEntityRepository extends JpaRepository<MyDataEntity, Integer> {

}
