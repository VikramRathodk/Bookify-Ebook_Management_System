package com.eBookManagementSytem.repos;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eBookManagementSytem.models.Cart;
import com.eBookManagementSytem.models.Users;

@Repository
public interface CartRepository extends JpaRepository<Cart, Integer> {

    List<Cart> findByUsername(String username);




}
