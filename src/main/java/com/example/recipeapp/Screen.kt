package com.example.recipeapp

sealed class Screen (val route:String){
    data object RecipeScreen:Screen("recipeScreen")
    data object CategoryScreen:Screen("categoryScreen")
}