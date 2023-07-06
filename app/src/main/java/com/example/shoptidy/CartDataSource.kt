package com.example.shoptidy

object CartDataSource {
    private val cartItems: MutableList<CartItem> = mutableListOf()

    fun addItem(item: CartItem) {
        cartItems.add(item)
    }

    fun removeItem(item: CartItem) {
        cartItems.remove(item)
    }

    fun getCartItems(): List<CartItem> {
        return cartItems
    }
}
