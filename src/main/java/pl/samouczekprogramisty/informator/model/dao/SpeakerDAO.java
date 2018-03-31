package pl.samouczekprogramisty.informator.model.dao;

import org.springframework.stereotype.Repository;
import pl.samouczekprogramisty.informator.model.Speaker;

@Repository
public class SpeakerDAO {
    public Speaker get(Integer id) {
        return new Speaker();
    }
}
