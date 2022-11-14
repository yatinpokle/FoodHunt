package com.example.foodhunt

enum class Food(val label: String, val image: String) {
    BREAKFASTBURRITO("Breakfast Burrito", "breakfast_burrito.png"),
    BURRITO("Burrito", "burrito.png"),
    CAKE("Cake", "cake.png"),
    CLUBSODA("Club Soda", "club_soda.png"),
    DELUXEICECREAM("Deluxe Ice Cream", "deluxe_ice_cream.png"),
    FRIEDRICE("Fried Rice", "fried_rice.png"),
    FRUITSMOOTHIE("Fruit Smoothie", "fruit_smoothie.png"),
    HOTDOG("Hot Dog", "hot_dog.png"),
    PANCAKES("Pancakes", "pancakes.png"),
    PASTA("Pasta", "pasta.png"),
    PIZZA("Pizza", "pizza.png"),
    PUMPKINPIE("Pumpkin Pie", "pumpkin_pie.png"),
    SANDWICH("Sandwich", "sandwich.png"),
    SPECIALCOFFEE("Special Coffee", "special_coffee.png"),
    SPECIALSODA("Special Soda", "special_soda.png")
}

enum class Ingredient(val label: String, val image: String) {
    BANANAS("Bananas", "bananas.png"),
    BASIL("Basil", "basil.png"),
    BEANS("Beans", "beans.png"),
    BREAD("Bread", "bread.png"),
    BUTTER("Butter", "butter.png"),
    CANDY("Candy", "candy.png"),
    CARBONATEDWATER("Carbonated Water", "carbonated_water.png"),
    CARROTS("Carrots", "carrots.png"),
    CHEESE("Cheese", "cheese.png"),
    CHICKEN("Chicken", "chicken.png"),
    CHOCOLATE("Chocolate", "chocolate.png"),
    CINNAMON("Cinnamon", "cinnamon.png"),
    COFFEEBEANS("Coffee Beans", "coffee_beans.png"),
    CORNSYRUP("Corn Syrup", "corn_syrup.png"),
    EGGS("Eggs", "eggs.png"),
    FLOUR("Flour", "flour.png"),
    ICE("Ice", "ice.png"),
    KETCHUP("Ketchup", "ketchup.png"),
    LETTUCE("Lettuce", "lettuce.png"),
    MILK("Milk", "milk.png"),
    MUSTARD("Mustard", "mustard.png"),
    ONION("Onion", "onion.png"),
    ORANGE("Orange Juice", "orange_juice.png"),
    ORANGEJUICE("Orange", "orange.png"),
    PEAS("Peas", "peas.png"),
    PEPPERONI("Pepperoni", "pepperoni.png"),
    PUMPKIN("Pumpkin", "pumpkin.png"),
    PURIFIEDWATER("Purified Water", "purified_water.png"),
    RICE("Rice", "rice.png"),
    SAUSAGE("Sausage", "sausage.png"),
    SOYSAUCE("Soy Sauce", "soy_sauce.png"),
    STRAWBERRIES("Strawberries", "strawberries.png"),
    SUGAR("Sugar", "sugar.png"),
    TOMATO("Tomato", "tomato.png"),
    TORTILLA("Tortilla", "tortilla.png"),
    TURKEY("Turkey", "turkey.png"),
    WHIPPEDCREAM("Whipped Cream", "whipped_cream.png")
}

enum class SellLocation(val label: String, val image: String) {
    BAKERY("Bakery", "bakery.png"),
    BAR("Bar", "bar.png"),
    CAFE("Cafe", "cafe.png"),
    RESTAURANT("Restaurant", "restaurant.png")
}

val recipeSellLocations = mapOf(
    Food.PASTA to SellLocation.RESTAURANT,
    Food.SANDWICH to SellLocation.CAFE,
    Food.HOTDOG to SellLocation.RESTAURANT,
    Food.BURRITO to SellLocation.RESTAURANT,
    Food.SPECIALCOFFEE to SellLocation.CAFE,
    Food.PIZZA to SellLocation.BAKERY,
    Food.DELUXEICECREAM to SellLocation.CAFE,
    Food.FRIEDRICE to SellLocation.RESTAURANT,
    Food.PUMPKINPIE to SellLocation.BAKERY,
    Food.PANCAKES to SellLocation.BAKERY,
    Food.FRUITSMOOTHIE to SellLocation.BAR,
    Food.SPECIALSODA to SellLocation.BAR,
    Food.BREAKFASTBURRITO to SellLocation.RESTAURANT,
    Food.CAKE to SellLocation.BAKERY,
    Food.CLUBSODA to SellLocation.BAR
)

val recipeIngredients = mapOf(
    Food.PASTA to listOf(
        Ingredient.TOMATO,
        Ingredient.FLOUR,
        Ingredient.EGGS,
        Ingredient.ONION,
        Ingredient.BASIL
    ),
    Food.SANDWICH to listOf(
        Ingredient.BREAD,
        Ingredient.TOMATO,
        Ingredient.LETTUCE,
        Ingredient.CHEESE,
        Ingredient.TURKEY
    ),
    Food.HOTDOG to listOf(
        Ingredient.SAUSAGE,
        Ingredient.BREAD,
        Ingredient.KETCHUP,
        Ingredient.MUSTARD
    ),
    Food.BURRITO to listOf(
        Ingredient.TORTILLA,
        Ingredient.CHEESE,
        Ingredient.BEANS,
        Ingredient.LETTUCE,
        Ingredient.CHICKEN
    ),
    Food.SPECIALCOFFEE to listOf(
        Ingredient.COFFEEBEANS,
        Ingredient.SUGAR,
        Ingredient.CHOCOLATE,
        Ingredient.WHIPPEDCREAM
    ),
    Food.PIZZA to listOf(
        Ingredient.FLOUR,
        Ingredient.CHEESE,
        Ingredient.PEPPERONI,
        Ingredient.TOMATO
    ),
    Food.DELUXEICECREAM to listOf(
        Ingredient.MILK,
        Ingredient.STRAWBERRIES,
        Ingredient.BANANAS,
        Ingredient.SUGAR,
        Ingredient.CHOCOLATE,
        Ingredient.CANDY
    ),
    Food.FRIEDRICE to listOf(
        Ingredient.RICE,
        Ingredient.CARROTS,
        Ingredient.PEAS,
        Ingredient.EGGS,
        Ingredient.SOYSAUCE
    ),
    Food.PUMPKINPIE to listOf(
        Ingredient.PUMPKIN,
        Ingredient.FLOUR,
        Ingredient.WHIPPEDCREAM,
        Ingredient.SUGAR,
        Ingredient.CINNAMON,
        Ingredient.EGGS
    ),
    Food.PANCAKES to listOf(
        Ingredient.FLOUR,
        Ingredient.BUTTER,
        Ingredient.EGGS,
        Ingredient.MILK,
        Ingredient.SUGAR
    ),
    Food.FRUITSMOOTHIE to listOf(
        Ingredient.MILK,
        Ingredient.ICE,
        Ingredient.ORANGE,
        Ingredient.STRAWBERRIES,
        Ingredient.BANANAS
    ),
    Food.SPECIALSODA to listOf(
        Ingredient.SUGAR,
        Ingredient.ORANGEJUICE,
        Ingredient.CORNSYRUP,
        Ingredient.PURIFIEDWATER
    ),
    Food.BREAKFASTBURRITO to listOf(
        Ingredient.TORTILLA,
        Ingredient.TOMATO,
        Ingredient.EGGS,
        Ingredient.CHEESE
    ),
    Food.CAKE to listOf(
        Ingredient.BUTTER,
        Ingredient.EGGS,
        Ingredient.FLOUR,
        Ingredient.WHIPPEDCREAM,
        Ingredient.CHOCOLATE,
        Ingredient.MILK
    ),
    Food.CLUBSODA to listOf(
        Ingredient.PURIFIEDWATER,
        Ingredient.CARBONATEDWATER
    )
)
