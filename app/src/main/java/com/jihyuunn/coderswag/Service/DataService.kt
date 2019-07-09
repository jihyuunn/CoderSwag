package com.jihyuunn.coderswag.Service

import com.jihyuunn.coderswag.Model.Category
import com.jihyuunn.coderswag.Model.Product

object DataService {
    val categories = listOf(
        Category("SHIRTS", "shirtimage"),
        Category("HOODIES", "hoodieimage"),
        Category("HATS", "hatimage"),
        Category("DIGITAL", "digitalgoodsimage"),
        Category("SHIRTS", "shirtimage"),
        Category("HOODIES", "hoodieimage"),
        Category("HATS", "hatimage"),
        Category("DIGITAL", "digitalgoodsimage"),
        Category("SHIRTS", "shirtimage"),
        Category("HOODIES", "hoodieimage"),
        Category("HATS", "hatimage"),
        Category("DIGITAL", "digitalgoodsimage")

    )

    val hats = listOf(
        Product("HAT BLACK", "$10", "hat1"),
        Product("HAT WHITE", "$12", "hat2"),
        Product("HAT PINK", "$14", "hat3"),
        Product("HAT BLUE", "$16", "hat4"),
        Product("HAT BLACK", "$10", "hat1"),
        Product("HAT WHITE", "$12", "hat2"),
        Product("HAT PINK", "$14", "hat3"),
        Product("HAT BLUE", "$16", "hat4"),
        Product("HAT BLACK", "$10", "hat1"),
        Product("HAT WHITE", "$12", "hat2"),
        Product("HAT PINK", "$14", "hat3"),
        Product("HAT BLUE", "$16", "hat4")
    )

    val hoodies = listOf(
        Product("HOODIE BLACK", "$20", "hoodie1"),
        Product("HOODIE WHITE", "$22", "hoodie2"),
        Product("HOODIE PINK", "$24", "hoodie3"),
        Product("HOODIE BLUE", "$26", "hoodie4"),
        Product("HOODIE BLACK", "$20", "hoodie1"),
        Product("HOODIE WHITE", "$22", "hoodie2"),
        Product("HOODIE PINK", "$24", "hoodie3"),
        Product("HOODIE BLUE", "$26", "hoodie4"),
        Product("HOODIE BLACK", "$20", "hoodie1"),
        Product("HOODIE WHITE", "$22", "hoodie2"),
        Product("HOODIE PINK", "$24", "hoodie3"),
        Product("HOODIE BLUE", "$26", "hoodie4")
    )

    val shirts = listOf(
        Product("SHIRT BLACK", "$30", "shirt1"),
        Product("SHIRT WHITE", "$32", "shirt2"),
        Product("SHIRT PINK", "$34", "shirt3"),
        Product("SHIRT BLUE", "$36", "shirt4"),
        Product("SHIRT PURPLE", "$38", "shirt5"),
        Product("SHIRT BLACK", "$30", "shirt1"),
        Product("SHIRT WHITE", "$32", "shirt2"),
        Product("SHIRT PINK", "$34", "shirt3"),
        Product("SHIRT BLUE", "$36", "shirt4"),
        Product("SHIRT PURPLE", "$38", "shirt5"),
        Product("SHIRT BLACK", "$30", "shirt1"),
        Product("SHIRT WHITE", "$32", "shirt2"),
        Product("SHIRT PINK", "$34", "shirt3"),
        Product("SHIRT BLUE", "$36", "shirt4"),
        Product("SHIRT PURPLE", "$38", "shirt5")
    )

    val digitalGoods = listOf<Product>()

    fun getProducts(category: String?) : List<Product> {
        return when(category) {
            "SHIRTS" -> shirts
            "HATS" -> hats
            "HOODIES" -> hoodies
            else -> digitalGoods
        }
    }

}