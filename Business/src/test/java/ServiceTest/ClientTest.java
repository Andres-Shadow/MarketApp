package ServiceTest;

import co.uniquindio.sinfoci.Entities.Client;
import co.uniquindio.sinfoci.Repositories.ClientRepository;
import org.junit.jupiter.api.Test;
import org.springframework.test.context.jdbc.Sql;

public class ClientTest {

    private ClientRepository clientRepo;

    @Test
    @Sql("classpath:dataset.sql")
    public void createClient(){
        
    }
}
