package com.smarttoolfactory.tutorial8_1dynamicfeatures_navigation.fragment.blankfragment

import android.os.Bundle
import android.view.View
import androidx.navigation.fragment.findNavController
import com.smarttoolfactory.tutorial8_1dynamicfeatures_navigation.R
import com.smarttoolfactory.tutorial8_1dynamicfeatures_navigation.databinding.FragmentHome2Binding

class HomeFragment2 : BaseDataBindingFragment<FragmentHome2Binding>() {

    override fun getLayoutRes(): Int = R.layout.fragment_home2

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        dataBinding.btnNextPage.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment2_to_homeFragment3)
        }

    }

}
