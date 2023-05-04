package com.example.lunchtray.datasource

import com.example.lunchtray.model.MenuItem.AccompanimentItem
import com.example.lunchtray.model.MenuItem.EntreeItem
import com.example.lunchtray.model.MenuItem.SideDishItem

object DataSource {

    val entreeMenuItems = listOf(
        EntreeItem(
            name = "Pizza de Pepperoni",
            description = "Little Ceasers",
            price = 130.00,
        ),
        EntreeItem(
            name = " 10 Alitas",
            description = "Buffalo ",
            price = 110.00,
        ),
        EntreeItem(
            name = "Pizza de Queso",
            description = "Little Ceasers",
            price = 130.00,
        ),
        EntreeItem(
            name = "10 Alitas",
            description = "BBQ",
            price = 110.00,
        )
    )

    val sideDishMenuItems = listOf(
        SideDishItem(
            name = "Papas Fritas Bolzaza",
            description ="Sabritas",
            price = 25.00,
        ),
        SideDishItem(
            name = "Papas a la Francesa",
            description = "Plato Grande",
            price =60.00 ,
        ),
        SideDishItem(
            name = "Papas Picosas",
            description = "Papas marmoleadas, asadas y fritas en una mezcla de especias de la casa",
            price = 70.00,
        ),
        SideDishItem(
            name = "papas Asadas",
            description = "Sal, Limon, y Chile",
            price = 70.00,
        )
    )

    val accompanimentMenuItems = listOf(
        AccompanimentItem(
            name = "Coca Cola",
            description = "Bien Fria",
            price = 20.00,
        ),
        AccompanimentItem(
            name = "Limonada",
            description = "De limon natural y fresco",
            price = 18.00,
        ),
        AccompanimentItem(
            name = "Agua Natural",
            description = "Al tiempo",
            price = 15.00,
        )
    )
}
