package com.smarttoolfactory.tutorial1_3navigation_nestednavhost.blankfragment

import android.os.Bundle
import android.view.View
import androidx.navigation.fragment.findNavController
import com.smarttoolfactory.tutorial1_3navigation_nestednavhost.R
import com.smarttoolfactory.tutorial1_3navigation_nestednavhost.databinding.FragmentHome2Binding


class HomeFragment2 : BaseDataBindingFragment<FragmentHome2Binding>() {
    override fun getLayoutRes(): Int = R.layout.fragment_home2

    var count = 0

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        dataBinding.tvTitle.text = "${this.javaClass.simpleName} Count: $count"

        dataBinding.btnIncrease.setOnClickListener {
            dataBinding.tvTitle.text = "${this.javaClass.simpleName} Count: ${count++}"
        }

        dataBinding.btnNextPage.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment2_to_homeFragment3)
        }

    }

}
