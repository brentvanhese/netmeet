package be.thomasmore.netmeet.repositories;

import be.thomasmore.netmeet.models.Netwerkevent;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.Collection;
import java.util.Optional;

public interface NetwerkeventRepository extends CrudRepository<Netwerkevent, Integer> {
    Optional<Netwerkevent> findFirstByIdLessThanOrderByIdDesc(Integer id);
    Optional<Netwerkevent> findFirstByIdGreaterThanOrderById(Integer id);
    Optional<Netwerkevent> findFirstByOrderByIdDesc();
    Optional<Netwerkevent> findFirstByOrderByIdAsc();

    @Query("SELECT n FROM Netwerkevent n WHERE (:id IS NULL OR n.locatie.id = :id)")
    Collection<Netwerkevent> findNetwerkeventByLocatieId(@Param("id") Integer id);

    @Query("SELECT n FROM Netwerkevent n WHERE (:id IS NULL OR n.organisator.id = :id)")
    Collection<Netwerkevent> findNetwerkeventByOrganisatorId(@Param("id") Integer id);

    @Query("SELECT n FROM Netwerkevent n WHERE (:provincieId IS NULL OR n.locatie.provincie.id = :provincieId) AND (:minAanwezigen IS NULL OR n.locatie.maxAanwezigen >= :minAanwezigen) AND (:maxAanwezigen IS NULL OR n.locatie.maxAanwezigen <= :maxAanwezigen) AND (:keyword IS NULL OR LOWER(n.organisator.naam) LIKE LOWER(CONCAT('%',:keyword,'%')))")
    Iterable<Netwerkevent> findByFilterQuery(@Param("provincieId") Integer provincieId, @Param("minAanwezigen") Integer minAanwezigen, @Param("maxAanwezigen") Integer maxAanwezigen, @Param("keyword") String keyword);
}
