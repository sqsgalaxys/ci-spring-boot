package xyz.sydns.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import xyz.sydns.entity.MeUser;

/**
 * @author sqsgalaxys
 */
@RepositoryRestResource
public interface MeUserRepository extends JpaRepository<MeUser, String> {
// public interface MeUserRepository extends CrudRepository<MeUser, Long> {

}
