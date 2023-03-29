package pl.jordii.restapiready.services;

import pl.jordii.restapiready.domain.User;

import java.util.List;

public interface ApiService {

    List<User> getUsers(Integer limit);
}
