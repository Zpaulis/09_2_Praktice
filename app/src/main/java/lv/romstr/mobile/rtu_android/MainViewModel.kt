package lv.romstr.mobile.rtu_android

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import lv.romstr.mobile.rtu_android.shopping.ShoppingItem
import lv.romstr.mobile.rtu_android.shopping.ShoppingRepository

class MainViewModel(application: Application) : AndroidViewModel(application){
    private val repository = ShoppingRepository(application)
val shoppingItems: LiveData<List<ShoppingItem>>
    get() = repository.getAllShoppingItems()



}