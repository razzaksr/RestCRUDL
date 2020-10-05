package crudl.rest.RestCrudl;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@Repository
@RepositoryRestResource(collectionResourceRel = "hubs", path="hubs")
public interface RepoHub extends JpaRepository<Hub, Long>
{

}
