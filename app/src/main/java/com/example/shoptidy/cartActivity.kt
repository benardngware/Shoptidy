package com.example.shoptidy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class cartActivity : AppCompatActivity() {

    private lateinit var cartAdapter: CartAdapter
    private lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cart)

        recyclerView = findViewById(R.id.recyclerView)
        cartAdapter = CartAdapter(CartDataSource.getCartItems())
        recyclerView.adapter = cartAdapter
        recyclerView.layoutManager = LinearLayoutManager(this)

        // Receive the item details from intent extras
        val itemName = intent.getStringExtra("itemName")
        val itemPrice = intent.getDoubleExtra("itemPrice", 0.0)
        val itemQuantity = intent.getIntExtra("itemQuantity", 0)

        // Create a CartItem object
        val item = CartItem(itemName, itemPrice, itemQuantity)

        // Add the item to the data source
        CartDataSource.addItem(item)

        // Notify the adapter about the new item
        cartAdapter.notifyItemInserted(CartDataSource.getCartItems().size - 1)
    }
}
