package edu.icet.controller;

import edu.icet.dto.UserDto;
import edu.icet.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    UserService service;

    @PostMapping("/add")
    public void addUser(@RequestBody UserDto userDto) {
        service.addUser(userDto);
    }

    @PutMapping("/update")
    public void updateUser(@RequestBody UserDto userDto) {
        service.updateUser(userDto);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteUser(@PathVariable Integer id) {
        service.deleteUser(id);
    }

    @GetMapping("/get/{id}")
    public UserDto getUserById(@PathVariable Integer id) {
        return service.searchById(id);
    }

    @GetMapping("/getAll")
    public List<UserDto> getAllUsers() {
        return service.getAll();
    }
}
