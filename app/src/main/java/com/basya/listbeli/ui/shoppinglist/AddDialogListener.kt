package com.basya.listbeli.ui.shoppinglist

import com.basya.listbeli.data.db.entities.ShoppingItem

interface AddDialogListener {
    fun onAddButtonClicked(item: ShoppingItem)
}