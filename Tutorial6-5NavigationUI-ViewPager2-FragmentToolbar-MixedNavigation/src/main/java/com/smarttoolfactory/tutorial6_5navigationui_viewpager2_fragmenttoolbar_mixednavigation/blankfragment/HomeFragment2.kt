package com.smarttoolfactory.tutorial6_5navigationui_viewpager2_fragmenttoolbar_mixednavigation.blankfragment

import android.os.Bundle
import android.view.View
import androidx.navigation.fragment.findNavController
import com.smarttoolfactory.tutorial6_5navigationui_viewpager2_fragmenttoolbar_mixednavigation.R
import com.smarttoolfactory.tutorial6_5navigationui_viewpager2_fragmenttoolbar_mixednavigation.databinding.FragmentHome2Binding

class HomeFragment2 : BaseDataBindingFragment<FragmentHome2Binding>() {

    override fun getLayoutRes(): Int = R.layout.fragment_home2

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        dataBinding!!.btnNextPage.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment2_to_homeFragment3)
        }

    }

}
