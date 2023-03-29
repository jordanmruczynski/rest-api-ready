package pl.jordii.restapiready.services;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import pl.jordii.restapiready.domain.User;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ApiServiceImplTest {

    @Autowired
    ApiServiceImpl apiService;

    @Test
    void getUsers() {
        List<User> users = apiService.getUsers(10);
        assertEquals(1, users.size());
    }
}