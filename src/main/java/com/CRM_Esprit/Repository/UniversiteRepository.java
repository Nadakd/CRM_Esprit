package com.CRM_Esprit.Repository;

import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import com.CRM_Esprit.Entity.Universités;

public interface UniversiteRepository extends CrudRepository <Universités,Integer> {
	

	@Query(value = "SELECT * FROM Universités ", nativeQuery = true)
	public List<Universités> findUniversités();

}
