package Hello;

import java.util.List;
import java.util*

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "ExecutionDetails", path = "ExecutionDetails")
public interface PersonRepository extends MongoRepository<ExecutionInformation, String> {

	List<ExecutionInformation> findByXML(@Param("test") String test);
	
}
