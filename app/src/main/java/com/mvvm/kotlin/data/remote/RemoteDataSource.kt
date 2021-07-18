package com.mvvm.kotlin.data.remote

import com.mvvm.kotlin.data.Resource
import com.mvvm.kotlin.data.dto.recipes.Recipes

/**
 * Created by AhmedEltaher
 */

internal interface RemoteDataSource {
    suspend fun requestRecipes(): Resource<Recipes>
}
