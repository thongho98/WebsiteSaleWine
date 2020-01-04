package service;

import java.util.HashMap;

import dto.Cart;
import entity.User;

public interface ShoppingCartService {

	public boolean paying(HashMap<Integer, Cart> cartItem, User user, double total);
}
