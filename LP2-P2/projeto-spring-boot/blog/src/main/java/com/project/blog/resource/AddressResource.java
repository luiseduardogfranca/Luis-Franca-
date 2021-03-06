package com.project.blog.resource;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import com.project.blog.domain.Address;
import com.project.blog.repository.AddressRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
public class AddressResource{
    @Autowired
    AddressRepository addressRepository;

    @GetMapping("/address")
    public List<Address> getAllAddress(){

        return addressRepository.findAll();
    }

    @PostMapping("/address")
    public ResponseEntity<Address> createAddress(@RequestBody Address address){
        Address addressSaved = addressRepository.save(address);

        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(addressSaved.getId()).toUri();

        return ResponseEntity.created(uri).body(addressSaved);
    }   

    @DeleteMapping("/address/{id}")
    public ResponseEntity deleteAddress(@PathVariable int id){

        Optional<Address> address = addressRepository.findById(id);

        if (address.isPresent()){
            addressRepository.deleteById(id);
        }

        return ResponseEntity.accepted().build();
    }
}