package pl.samouczekprogramisty.informator.model.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.samouczekprogramisty.informator.model.Speaker;

@Repository
public interface SpeakerDao extends CrudRepository<Speaker, Integer> {
}
