package org.example.problem_solving.lambdaFunctions.homework

import org.example.problem_solving.lambdaFunctions.classwork.Product

data class Movie(
    val title: String,
    val rating: Double
)

fun main(){
    val movies = listOf(
        Movie("Leo", 5.0),
        Movie("Kathi", 8.0),
        Movie("VIP", 6.0),
        Movie("GOAT", 7.5),
        Movie("Theri", 10.0)
    )
    println("Original Movies      : $movies")
    println()

    val highRatedMovie = movies.filter { it.rating>=7.0 }

    println("Highly Rated Movies  : $highRatedMovie")
    println()
        val increaseRating = movies.map { if(it.rating<10.0) {
            Movie(it.title, it.rating + 0.5)
        } else{
            println("${it.title} - Already Rating 10.0")
            it
        }
    }
    val above8Rating = increaseRating.filter{it.rating>8.0 }




    println("Updated Ratings      : $increaseRating")
    println()
    println("Movies With Rating 8+: $above8Rating")




}