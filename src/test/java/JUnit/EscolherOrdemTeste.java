package JUnit;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
//@TestMethodOrder(MethodOrderer.DisplayName.class) - pelo displey ao invez da ordem
//@TestMethodOrder(MethodOrderer.Random.class) - aleatorio

public class EscolherOrdemTeste {

    @Order(4)
    @Test
    void validaTesteA(){}

    @Order(3)
    @Test
    void validaTesteb(){}

    @Order(2)
    @Test
    void validaTestec(){}

    @Order(1)
    @Test
    void validaTested(){}
}
