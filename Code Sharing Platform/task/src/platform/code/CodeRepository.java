package platform.code;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;

public interface CodeRepository extends JpaRepository<Code, UUID> {
  List<Code> findTop10ByIsTimeRestrictedFalseAndIsViewRestrictedFalseOrderByDateDesc();


}
