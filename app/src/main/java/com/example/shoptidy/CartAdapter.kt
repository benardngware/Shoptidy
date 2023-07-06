package com.example.shoptidy
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.shoptidy.CartItem


class CartAdapter(private val cartItems: List<CartItem>) : RecyclerView.Adapter<CartAdapter.CartViewHolder>() {

    inner class CartViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val itemNameTextView: TextView = itemView.findViewById(R.id.tvProductCartName)
        private val itemPriceTextView: TextView = itemView.findViewById(R.id.tvProductCartPrice)
        private val itemQuantityTextView: TextView = itemView.findViewById(R.id.tvCartProductQuantity)

        fun bind(item: CartItem) {
            itemNameTextView.text = item.itemName
            itemPriceTextView.text = item.price.toString()
            itemQuantityTextView.text = item.quantity.toString()
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CartViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.activity_cart, parent, false)
        return CartViewHolder(view)
    }

    override fun onBindViewHolder(holder: CartViewHolder, position: Int) {
        val item = cartItems[position]
        holder.bind(item)
    }

    override fun getItemCount(): Int {
        return cartItems.size
    }
}