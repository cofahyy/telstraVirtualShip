package au.com.telstra.simcardactivator;

import au.com.telstra.simcardactivator.SimCardRecord;
import org.springframework.data.repository.CrudRepository;

public interface SimCardRecordRepository extends CrudRepository<SimCardRecord, Long> {

}