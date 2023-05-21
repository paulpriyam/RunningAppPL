package com.example.runningapppl.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.example.runningapppl.R
import com.example.runningapppl.databinding.FragmentRunBinding
import com.example.runningapppl.databinding.FragmentSetupBinding
import com.example.runningapppl.viewmodel.RunViewModel
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class SettingsFragment:Fragment(R.layout.fragment_settings) {

    private val viewModel: RunViewModel by viewModels()

    private lateinit var _binding: FragmentSetupBinding

    private val binding get() = _binding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentSetupBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }
}
