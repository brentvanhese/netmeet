package be.thomasmore.netmeet.repositories;

import be.thomasmore.netmeet.models.Netwerkevent;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface NetwerkeventRepository extends CrudRepository<Netwerkevent, Integer> {
    @Query("SELECT n FROM Netwerkevent n WHERE (:provincieId IS NULL OR n.locatie.provincie.id = :provincieId) AND (:minAanwezigen IS NULL OR n.locatie.maxAanwezigen >= :minAanwezigen) AND (:maxAanwezigen IS NULL OR n.locatie.maxAanwezigen <= :maxAanwezigen)")
    Iterable<Netwerkevent> findByFilterQuery(@Param("provincieId") Integer provincieId, @Param("minAanwezigen") Integer minAanwezigen, @Param("maxAanwezigen") Integer maxAanwezigen);
}
