package be.thomasmore.netmeet.repositories;

import be.thomasmore.netmeet.models.Netwerkevent;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface NetwerkeventRepository extends CrudRepository<Netwerkevent, Integer> {
    Optional<Netwerkevent> findFirstByIdLessThanOrderByIdDesc(Integer id);
    Optional<Netwerkevent> findFirstByIdGreaterThanOrderById(Integer id);
    Optional<Netwerkevent> findFirstByOrderByIdDesc();
    Optional<Netwerkevent> findFirstByOrderByIdAsc();

    @Query("SELECT n FROM Netwerkevent n WHERE (:provincieId IS NULL OR n.locatie.provincie.id = :provincieId) AND (:minAanwezigen IS NULL OR n.locatie.maxAanwezigen >= :minAanwezigen) AND (:maxAanwezigen IS NULL OR n.locatie.maxAanwezigen <= :maxAanwezigen)")
    Iterable<Netwerkevent> findByFilterQuery(@Param("provincieId") Integer provincieId, @Param("minAanwezigen") Integer minAanwezigen, @Param("maxAanwezigen") Integer maxAanwezigen);
}
