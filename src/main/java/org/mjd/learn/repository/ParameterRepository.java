package org.mjd.learn.repository;

import org.mjd.learn.model.SimpleParameter;
import org.springframework.data.repository.CrudRepository;

import java.time.LocalDate;
import java.util.List;

public interface ParameterRepository extends CrudRepository<SimpleParameter, Long> {
}
