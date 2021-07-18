package com.mvvm.kotlin.ui.base.listeners

import com.mvvm.kotlin.data.dto.recipes.RecipesItem

/**
 * Created by AhmedEltaher
 */

interface RecyclerItemListener {
    fun onItemSelected(recipe : RecipesItem)
}
