package com.example.cruddemo.controller;

import com.example.cruddemo.dto.*;
import com.example.cruddemo.service.CRUDUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
public class CRUDUserController {

    @Autowired
    private CRUDUserService service;

    @PostMapping
    public UserInstanceDto createUser(@RequestBody UserCreateUpdateDto dto) {
        return service.create(dto);
    }

    @PostMapping("/updateUser")
    public UserInstanceDto updateUser(@RequestBody UserInstanceDto dto){
        return service.update(dto);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Long id){ service.delete(id); }

    @GetMapping("/{id}")
    public UserInstanceDto getUser(@PathVariable Long id) {
        return service.get(id);
    }

    @GetMapping("/list")
    public PagedListDto<UserInstanceDto> listUsers(
            @RequestParam(required = true, defaultValue = "0") Integer page,
            @RequestParam(required = true, defaultValue = "20") Integer size
    ) {
        return service.list(page, size);
    }
}
