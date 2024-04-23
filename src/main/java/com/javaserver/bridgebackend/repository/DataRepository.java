package com.javaserver.bridgebackend.repository;

import com.javaserver.bridgebackend.entity.Data;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DataRepository extends JpaRepository<Data, Long> {
}
