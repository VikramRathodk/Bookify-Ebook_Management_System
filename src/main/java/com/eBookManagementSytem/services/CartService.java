package com.eBookManagementSytem.services;




import com.eBookManagementSytem.models.Cart;
import com.eBookManagementSytem.models.Users;
import com.eBookManagementSytem.repos.CartRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CartService {
    @Autowired
    private CartRepository cartRepo;

    public void addToCart(Cart cartItem) {
        cartRepo.save(cartItem);
    }

    public List<Cart> getCartItemsByUsername(String username) {
        return cartRepo.findByUsername(username);
    }
    public void removeFromCart(int cartItemId) {
        cartRepo.deleteById(cartItemId);
    }
}

