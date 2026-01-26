package edu.icet.service;

import edu.icet.dto.UserDto;

import java.util.List;

public interface UserService {
    void addUser(UserDto userDto);
    void updateUser(UserDto userDto);
    void deleteUser(Integer id);
    UserDto searchById(Integer id);
    List<UserDto> getAll();
}
