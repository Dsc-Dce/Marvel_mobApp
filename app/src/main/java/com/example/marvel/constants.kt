package com.example.marvel

import java.util.ArrayList

object constants {
    // function to get list of characters
    fun getCharacters(): ArrayList<AllDataClass> {
        var arChar = ArrayList<AllDataClass>()
        arChar = addData(
            arChar,
            AllDataClass(
                1,
                R.drawable.ironman,
                "Iron Man",
                "Tony Stark",
                "Genius. Billionaire. Philanthropist. Tony Stark's confidence is only matched by his high-flying abilities as the hero called Iron Man.",
                "https://www.marvel.com/characters/iron-man-tony-stark"
            )
        )
        return arChar
    }

    // function to get list of movies
    fun getMovies(): ArrayList<AllDataClass> {
        var arMovies = ArrayList<AllDataClass>()
        arMovies = addData(
            arMovies,
            AllDataClass(
                1,
                R.drawable.drstrangmovie,
                "Dr Strange",
                "2016",
                "Story of world-famous neurosurgeon Dr. Stephen Strange whose life changes forever after a horrific car accident robs him of the use of his hands.",
                "https://www.marvel.com/movies/doctor-strange"
            )
        )
        arMovies = addData(
            arMovies,
            AllDataClass(
                2,
                R.drawable.eternals,
                "Eternals",
                "2021",
                "The Eternals, a race of immortal beings with superhuman powers who have secretly lived on Earth for thousands of years, reunite to battle the evil Deviants.",
                "https://www.marvel.com/movies/eternals"
            )
        )
        arMovies = addData(
            arMovies,
            AllDataClass(
                3,
                R.drawable.black_widow,
                "Black Widow",
                "2021",
                "Natasha Romanoff, a former KGB spy, is shocked to find out that her ex handler, General Dreykov, is still alive. While evading capture by Taskmaster, she is forced to confront her dark past.",
                "https://www.marvel.com/movies/black-widow"
            )
        )
        arMovies = addData(
            arMovies,
            AllDataClass(
                4,
                R.drawable.thor,
                "Thor: The Dark World",
                "2013",
                "Thor sets out on a journey to defeat Malekith, the leader of the Dark Elves when he returns to Asgard to retrieve a dangerous weapon and fulfill his desire of destroying the Nine Realms.",
                "https://www.marvel.com/movies/thor-the-dark-world"
            )
        )
        arMovies = addData(
            arMovies,
            AllDataClass(
                5,
                R.drawable.hulk,
                "The Incredible Hulk",
                "2008",
                "Dr Bruce Banner subjects himself to high levels of gamma radiation which triggers his transformation into a huge green creature, the Hulk, whenever he experiences negative emotions such as anger.",
                "https://www.marvel.com/movies/doctor-strange"
            )
        )
        return arMovies
    }

    // function to get list of Comics
    fun getComics(): ArrayList<AllDataClass> {
        var arComic = ArrayList<AllDataClass>()
        arComic = addData(
            arComic,
            AllDataClass(
                1,
                R.drawable.spidermancomic,
                "The Amazing Spider Man",
                "Spider Man",
                "An alien invasion hits New York City and the only one who can stop it is…Spider-Man?! And if even that's not enough, you'll see a new roommate, new love interests - and a new villain!",
                "https://www.marvel.com/comics/issue/67631/the_amazing_spider-man_2018_1"
            )
        )
        return arComic
    }

    // adding new data to list
    private fun addData(
        arrayList: ArrayList<AllDataClass>,
        allDataClass: AllDataClass
    ): ArrayList<AllDataClass> {
        arrayList.add(allDataClass)
        return arrayList
    }
}
