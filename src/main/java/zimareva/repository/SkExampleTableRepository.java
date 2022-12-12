package zimareva.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import zimareva.model.SkExampleTable;

@Repository
public interface SkExampleTableRepository extends CrudRepository<SkExampleTable, Long> {
}
