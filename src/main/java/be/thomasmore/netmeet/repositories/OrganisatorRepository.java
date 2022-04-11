package be.thomasmore.netmeet.repositories;

import be.thomasmore.netmeet.models.Netwerkevent;
import be.thomasmore.netmeet.models.Organisator;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface OrganisatorRepository extends CrudRepository<Organisator, Integer>{
    Optional<Organisator> findFirstByIdLessThanOrderByIdDesc(Integer id);
    Optional<Organisator> findFirstByIdGreaterThanOrderById(Integer id);
    Optional<Organisator> findFirstByOrderByIdDesc();
    Optional<Organisator> findFirstByOrderByIdAsc();

    @Query("SELECT o FROM Organisator o WHERE :keyword IS NULL OR LOWER(o.naam) LIKE LOWER(CONCAT('%',:keyword,'%'))")
    Iterable<Organisator> findByKeyword(@Param("keyword") String keyword);
}
