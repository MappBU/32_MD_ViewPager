package com.example.viewpager

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

// (fragmentActivity: FragmentActivity) - Сюда будем передавать наши фрагменты
// : FragmentStateAdapter(fragmentActivity) - Наследуемся и передаем сюда наш принятый фрагмент
class MoviesAdapter(fragmentActivity: FragmentActivity): FragmentStateAdapter(fragmentActivity) {

    // Количество карточек
    override fun getItemCount(): Int {
        return 4
    }

    // Определяем для каждого элемента слайдера свой фрагмент
    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> {
                BadBoys()
            }
            1 -> {
                Avenger()
            }
            2 -> {
                Fast()
            }
            3 -> {
                Transformers()
            }
            else -> {
                BadBoys()
            }
        }
    }
}
