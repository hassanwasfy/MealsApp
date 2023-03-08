package com.wazzii_tech.mealsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.RecyclerView
import com.hamalawey.mealz.R
import dagger.hilt.EntryPoint
import kotlinx.coroutines.launch

@EntryPoint
class MainActivity : AppCompatActivity() {

    private val viewModel: MealsViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rv: RecyclerView = findViewById(R.id.category_rv)

        val mealsAdapter = MealsAdapter()

        viewModel.getMeals()
        lifecycleScope.launch {
            viewModel.categories.collect{
                mealsAdapter.submitList(it?.categories)
                rv.adapter = mealsAdapter
            }
        }

    }
}