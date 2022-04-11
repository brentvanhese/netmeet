package be.thomasmore.netmeet.repositories;

import be.thomasmore.netmeet.models.Locatie;
import be.thomasmore.netmeet.models.Netwerkevent;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface LocatieRepository extends CrudRepository<Locatie, Integer> {
    Optional<Locatie> findFirstByIdLessThanOrderByIdDesc(Integer id);
    Optional<Locatie> findFirstByIdGreaterThanOrderById(Integer id);
    Optional<Locatie> findFirstByOrderByIdDesc();
    Optional<Locatie> findFirstByOrderByIdAsc();
}
