package com.muru.learn.mathapp;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AddRepository extends JpaRepository<MathAdd, Long> {
}
