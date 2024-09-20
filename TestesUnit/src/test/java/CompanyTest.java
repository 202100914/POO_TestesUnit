import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompanyTest {

    private Company company;
    private User client1;
    private User client2;
    private User seller1;
    private User seller2;


    @BeforeEach
    void setUp() {
        company = new Company();
        client1 = new User("José Manuel", "911111111", "zemanel@yahoo.com");
        client2 = new User("António Francisco", "922222222", "tochico@hotmail.com");
        seller1 = new User("Fernando Fernandes", "966777101", "fefe@remax.pt");
        seller2 = new User("Rodrigo Rodrigues", "966777152", "roro@remax.pt");

        company.registerClient(client1);
        company.registerClient(client2);
        company.registerSeller(seller1);
        company.registerSeller(seller2);
    }

    @Test
    void testConstructor(){
        assertNotNull(company.getClients());
        assertNotNull(company.getSellers());
    }

    @Test
    void testRegisterClient() {
        User newClient = new User("New Client", "933333333", "newClient@hotmail.com");
        company.registerClient(newClient);

        // Verifica se o cliente foi adicionado à lista de clientes
        assertTrue(company.getClients().contains(newClient));
    }


    @Test
    void testRegisterClients() {
        User newClient1 = new User("New Client0", "944444444", "newClient0@hotmail.com");
        User newClient2 = new User("New Client1", "955555555", "newClient1@hotmail.com");

        company.registerClient(newClient1);
        company.registerClient(newClient2);

        // Verifica se ambos os clientes foram adicionados à lista
        assertTrue(company.getClients().contains(newClient1));
        assertTrue(company.getClients().contains(newClient2));
    }


    @Test
    void testRegisterClientDuplicate() {
        User duplicateClient = new User("José Manuel", "911111111", "zemanel@yahoo.com");
        company.registerClient(duplicateClient);

        // Tenta registrar o cliente já existente
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            company.registerClient(duplicateClient);
        });

        // Verifica se a exceção foi lançada com a mensagem correta
        assertEquals("Client already exists", exception.getMessage());
    }


    @Test
    void testRegisterClientNull() {
        // Tenta registrar um cliente nulo
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            company.registerClient(null);
        });

        // Verifica se a exceção foi lançada com a mensagem correta
        assertEquals("Client cannot be null", exception.getMessage());
    }


    @Test
    void registerClient() {
    }

    @Test
    void registerSeller() {
    }

    @Test
    void registerProperty() {
    }

    @Test
    void registerSell() {
    }

    @Test
    void createSell() {
    }

    @Test
    void calculateSellsOfTheYear() {
    }

    @Test
    void findSellerOfTheYear() {
    }
}