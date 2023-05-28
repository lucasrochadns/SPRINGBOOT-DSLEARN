package com.devsuperior.capitulo23.services;


import com.devsuperior.capitulo23.domain.entities.User;
import com.devsuperior.capitulo23.domain.dto.UserAllDTO;
import com.devsuperior.capitulo23.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class UserServices {

    @Autowired
    private UserRepository userRepository;

    public List<UserAllDTO> findAll(){
        return userRepository.findAll().stream().map(u -> new UserAllDTO(u.getId(), u.getName(), u.getEmail(), u.getPhone(), u.getPassword(), u.getBirthDate())).collect(Collectors.toList());
    }

    public void save(UserAllDTO userAllDTO){
        userRepository.save(new User(userAllDTO));
    }

    public UserAllDTO findById(Long id){
        Optional<User> u = userRepository.findById(id);
        return new UserAllDTO(u.get().getId(), u.get().getName(), u.get().getEmail(), u.get().getPhone(), u.get().getPassword(), u.get().getBirthDate());
    }
}
