package com.example.flavourapp

import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.viewpager2.adapter.FragmentStateAdapter
import androidx.viewpager2.widget.ViewPager2
import com.example.flavourapp.base.BaseActivity
import com.example.flavourapp.base.ViewControl.actionAnimation
import com.example.flavourapp.databinding.ActivityMainBinding
import com.example.flavourapp.fragment.CommunityFragment
import com.example.flavourapp.fragment.HomeFragment
import com.example.flavourapp.fragment.ProfileFragment
import com.example.flavourapp.fragment.SearchFragment


class MainActivity : BaseActivity() {
    val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)


        binding.vpHome.adapter = ViewPagerAdapter(this)
        binding.vpHome.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback() {
            override fun onPageSelected(position: Int) {
                super.onPageSelected(position)
                selectBottomNavBar(position)
            }
        })
        binding.vpHome.currentItem = 0
        binding.vpHome.isUserInputEnabled = false

        binding.btnHome.setOnClickListener {
            binding.vpHome.currentItem = 0
        }
        binding.btnSearch.setOnClickListener {
            binding.vpHome.currentItem = 1
        }
        binding.btnCommunity.setOnClickListener {
            binding.vpHome.currentItem = 2
        }
        binding.btnProfile.setOnClickListener {
            binding.vpHome.currentItem = 3
        }
    }


    private fun selectBottomNavBar(position: Int) {
        binding.lnBottomBar.actionAnimation()
        when (position) {
            0 -> {
                binding.icHome.setImageResource(R.drawable.ic_home_selected)
                binding.icSearch.setImageResource(R.drawable.ic_search)
                binding.icCommunity.setImageResource(R.drawable.icon)
                binding.icProfile.setImageResource(R.drawable.ic_profile)
            }
            1 -> {
                binding.icHome.setImageResource(R.drawable.ic_home)
                binding.icSearch.setImageResource(R.drawable.ic_search_selected)
                binding.icCommunity.setImageResource(R.drawable.icon)
                binding.icProfile.setImageResource(R.drawable.ic_profile)
            }
            2 -> {
                binding.icHome.setImageResource(R.drawable.ic_home)
                binding.icSearch.setImageResource(R.drawable.ic_search)
                binding.icCommunity.setImageResource(R.drawable.ic_community_selected)
                binding.icProfile.setImageResource(R.drawable.ic_profile)
            }
            3 -> {
                binding.icHome.setImageResource(R.drawable.ic_home)
                binding.icSearch.setImageResource(R.drawable.ic_search)
                binding.icCommunity.setImageResource(R.drawable.icon)
                binding.icProfile.setImageResource(R.drawable.ic_profile_selected)
            }

        }
    }
    inner class ViewPagerAdapter(fragmentActivity: FragmentActivity) :
        FragmentStateAdapter(fragmentActivity) {
        override fun getItemCount(): Int = 4

        override fun createFragment(position: Int): Fragment {
            return when (position) {
                0 -> HomeFragment()
                1 -> SearchFragment()
                2 -> CommunityFragment()
                3 -> ProfileFragment()
                else -> HomeFragment()
            }
        }
    }

//    private fun getExploreRecipes(): List<RecipeImage> {
//        return listOf(
//            RecipeImage(R.drawable.card1),
//            RecipeImage(R.drawable.card1)   //
//        )
//    }
//
//    // Define the Recipe data class
//    private fun getSearchRecipes(): List<Recipe> {
//        return listOf(
//            Recipe("Bánh mì nướng", "10 Min", "200 Kcal", R.drawable.image_recipe_detail),
//            Recipe("Salad rau củ", "15 Min", "180 Kcal", R.drawable.image_recipe_detail),
//            Recipe("Salad rau củ", "15 Min", "180 Kcal", R.drawable.image_recipe_detail)
//        )
//    }
//
//    // Define the Recipe3 data class
//    private fun getSuggestedRecipes(): List<Recipe3> {
//        return listOf(
//            Recipe3("Xốt Hummus", "20 Min", "120 Kcal", R.drawable.image_recipe_detail, "Beans fruits"),
//            Recipe3("Xốt Hummus", "20 Min", "120 Kcal", R.drawable.image_recipe_detail, "Beans fruits"),
//            Recipe3("Keto Salad", "15 Min", "150 Kcal", R.drawable.image_recipe_detail, "Fresh greens")
//        )
//    }
}