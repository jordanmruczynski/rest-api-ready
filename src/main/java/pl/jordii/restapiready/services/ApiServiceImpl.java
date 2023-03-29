package pl.jordii.restapiready.services;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import pl.jordii.restapiready.domain.User;
import pl.jordii.restapiready.domain.UserData;

import java.util.List;

@Service
public class ApiServiceImpl implements ApiService {

    private final RestTemplate restTemplate;

    public ApiServiceImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public List<User> getUsers(Integer limit) {
        UserData userData = restTemplate.getForObject("https://jsonplaceholder.typicode.com/users", UserData.class);
        return userData.getData();
    }

}
