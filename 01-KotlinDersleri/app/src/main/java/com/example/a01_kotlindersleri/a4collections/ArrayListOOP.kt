package com.example.a01_kotlindersleri.a4collections

fun main() {
    val f1 = Films(1,"Interstellar", 249.99)
    val f2 = Films(2,"Zindan Adas?", 179.99)
    val f3 = Films(3, "K?? Uykusu", 129.99)
    val f4 = Films(4, "Inception", 219.99)
    val f5 = Films(5, "Sherlock", 99.99)

    val filmList = ArrayList<Films>()
    filmList.add(f1)
    filmList.add(f2)
    filmList.add(f3)
    filmList.add(f4)
    filmList.add(f5)

    // Listeleme
    for(film in filmList){
        println("ID: ${film.id} | Name: ${film.name} | Price: ${film.price}")
    }


    // S?ralama - Sorting
    println("------------------Artan Fiyata göre----------------------")
    val siralama1 = filmList.sortedWith(compareBy { it.price }) // default olarak Ascending(ASC/artan) s?ralama yapar
    for(film in siralama1){
        println("ID: ${film.id} | Name: ${film.name} | Price: ${film.price}")
    }

    println("------------------Azalan Fiyata göre----------------------")
    val siralama2 = filmList.sortedWith(compareByDescending { it.price })
    for(film in siralama2){
        println("ID: ${film.id} | Name: ${film.name} | Price: ${film.price}")
    }

    println("------------------Artan Ada göre----------------------")
    val siralama3 = filmList.sortedWith(compareBy { it.name }) // default olarak Ascending(ASC/artan) s?ralama yapar
    for(film in siralama3){
        println("ID: ${film.id} | Name: ${film.name} | Price: ${film.price}")
    }

    println("------------------Azalan Ada göre----------------------")
    val siralama4 = filmList.sortedWith(compareByDescending { it.name })
    for(film in siralama4){
        println("ID: ${film.id} | Name: ${film.name} | Price: ${film.price}")
    }

    println("------------------Filtreleme(Fiyat)----------------------")
    val filtreleme1 = filmList.filter{it.price <= 200}
    for(film in filtreleme1){
        println("ID: ${film.id} | Name: ${film.name} | Price: ${film.price}")
    }

    println("------------------Filtreleme(Ad)----------------------")
    val filtreleme2 = filmList.filter{it.name.contains("r")}
    for(film in filtreleme2){
        println("ID: ${film.id} | Name: ${film.name} | Price: ${film.price}")
    }
}