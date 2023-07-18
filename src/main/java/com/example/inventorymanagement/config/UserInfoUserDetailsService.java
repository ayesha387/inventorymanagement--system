package com.example.inventorymanagement.config;

import com.example.inventorymanagement.entity.Customer;
import com.example.inventorymanagement.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class UserInfoUserDetailsService implements UserDetailsService {
    @Autowired
    private CustomerRepository customerRepository;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<Customer> customer=customerRepository.findByName(username);

       return customer.map(UserInfoUserDetails::new)
                .orElseThrow(()->new UsernameNotFoundException("user not found"+username));
    }
}
