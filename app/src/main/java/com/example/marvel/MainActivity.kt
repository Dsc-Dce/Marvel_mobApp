package com.example.marvel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.GridLayout
import androidx.recyclerview.widget.GridLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //default setting up character list
        setUprv(constants.getCharacters())
        //to change the list on change of radio button checked
        rg.setOnCheckedChangeListener { radioGroup, i ->
            if(i==R.id.rb_character){
                setUprv(constants.getCharacters())
            }else if(i==R.id.rb_movie){
                setUprv(constants.getMovies())
            }else if(i==R.id.rb_comic){
                setUprv(constants.getComics())
            }
        }
    }

    //to setup the recycler view accordance to the list
    fun setUprv(list:ArrayList<AllDataClass>){
        rv_cards.layoutManager=GridLayoutManager(this,2)
        val adapter=Adapter(this,list!!)
        rv_cards.adapter=adapter
    }
}