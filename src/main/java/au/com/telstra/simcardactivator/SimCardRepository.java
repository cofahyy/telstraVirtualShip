package au.com.telstra.simcardactivator;

import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface SimCardRepository extends CrudRepository<SimCard, Long> {
    List<SimCard> findByIccid(String iccid);
    SimCard findbyId(long id);
}