package com.SpringbootCassandra.Repo;

import java.util.List;

import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

import com.SpringbootCassandra.Model.Imteyaz;

@Repository
public interface ImteyazRepo extends CassandraRepository<Imteyaz, Integer> {

	

	List<Imteyaz> findByAgeGreaterThan(int age);

	List<Imteyaz> findByAgeLessThan(int age);

}
