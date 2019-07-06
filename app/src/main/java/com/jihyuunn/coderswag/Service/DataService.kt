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
        Product("HAT BLACK", "$10", "hat01"),
        Product("HAT WHITE", "$12", "hat02"),
        Product("HAT PINK", "$14", "hat03"),
        Product("HAT BLUE", "$16", "hat04")
    )

    val hoodies = listOf(
        Product("HOODIE BLACK", "$20", "hoodie01"),
        Product("HOODIE WHITE", "$22", "hoodie02"),
        Product("HOODIE PINK", "$24", "hoodie03"),
        Product("HOODIE BLUE", "$26", "hoodie04")
    )

    val shirts = listOf(
        Product("SHIRT BLACK", "$30", "shirt01"),
        Product("SHIRT WHITE", "$32", "shirt02"),
        Product("SHIRT PINK", "$34", "shirt03"),
        Product("SHIRT BLUE", "$36", "shirt04"),
        Product("SHIRT PURPLE", "$38", "shirt05")
    )
}