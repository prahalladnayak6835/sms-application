package pd.sms.example.demosmstrail;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DemoRepo extends JpaRepository<Demo,Long> {
}
