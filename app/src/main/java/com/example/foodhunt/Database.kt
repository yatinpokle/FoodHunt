package com.example.foodhunt

val idLabel = "id"

val recipesTableLabel = "Recipes"
val ingredientItemsTableLabel = "IngredientItems"

val foodLabel = "food"
val sellPriceLabel = "sellPrice"
val sellLocationLabel = "sellLocation"
val ingredientItemLabel = "ingredientItem"
val ingredientLabel = "ingredient"
val latitudeLabel = "latitude"
val longitudeLabel = "longitude"
val isFoundLabel = "found"
val isCompleteLabel = "complete"


// Recipes Table
// CREATE TABLE $recipesTableLabel (
//     $idLabel INTEGER PRIMARY KEY,
//     $foodLabel TEXT NOT NULL,
//     $sellPriceLabel INTEGER NOT NULL,
//     $sellLocationLabel TEXT NOT NULL,
//     $isCompleteLabel INTEGER NOT NULL
// )

// Ingredient Items Table
// CREATE TABLE $ingredientItemsTableLabel (
//     $idLabel INTEGER PRIMARY KEY,
//     $ingredientLabel TEXT NOT NULL,
//     $latitudeLabel REAL NOT NULL,
//     $longitudeLabel REAL NOT NULL,
//     $isFoundLabel INTEGER NOT NULL,
//     recipe INTEGER NOT NULL,
//     FOREIGN KEY (recipe) REFERENCES $recipesTableLabel ($idLabel)
//       ON DELETE CASCADE ON UPDATE CASCADE
// )

