package com.example.marvel

import java.util.ArrayList

object constants {
    //function to get list of characters
    fun getCharacters():ArrayList<AllDataClass>{
        var arChar = ArrayList<AllDataClass>()
        arChar=addData(arChar,AllDataClass(1,R.drawable.ironman,"Iron Man","Tony Stark","Genius. Billionaire. Philanthropist. Tony Stark's confidence is only matched by his high-flying abilities as the hero called Iron Man.","https://www.marvel.com/characters/iron-man-tony-stark"))
        return arChar
    }
    //function to get list of movies
    fun getMovies():ArrayList<AllDataClass>{
        var arMovies=ArrayList<AllDataClass>()
        arMovies=addData(arMovies,AllDataClass(1,R.drawable.drstrangmovie,"Dr Strange","2016","Story of world-famous neurosurgeon Dr. Stephen Strange whose life changes forever after a horrific car accident robs him of the use of his hands.","https://www.marvel.com/movies/doctor-strange"))
        return arMovies
    }
    //function to get list of Comics
    fun getComics():ArrayList<AllDataClass>{
        var arComic=ArrayList<AllDataClass>()
        arComic= addData(arComic,AllDataClass(1,R.drawable.spidermancomic,"The Amazing Spider Man","Spider Man","An alien invasion hits New York City and the only one who can stop it is…Spider-Man?! And if even that's not enough, you'll see a new roommate, new love interests - and a new villain!",
            "https://www.marvel.com/comics/issue/67631/the_amazing_spider-man_2018_1"))
        return arComic
    }
    //adding new data to list
    private fun addData(arrayList: ArrayList<AllDataClass>, allDataClass: AllDataClass): ArrayList<AllDataClass> {
        arrayList.add(allDataClass)
        return arrayList
    }

}