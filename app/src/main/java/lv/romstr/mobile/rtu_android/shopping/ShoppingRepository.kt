package lv.romstr.mobile.rtu_android.shopping

import android.content.Context
import androidx.lifecycle.LiveData

class ShoppingRepository(private val context: Context) {

    private val db get() = Database.getInstance(context)

fun getAllShoppingItems(): LiveData<List<ShoppingItem>> = db.shoppingItemDao().getAll()


}