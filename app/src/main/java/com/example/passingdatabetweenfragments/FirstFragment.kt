package com.example.passingdatabetweenfragments

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_first.view.*


class FirstFragment : Fragment() {
    var listener:OnFragmentInteraction? = null



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view =  inflater.inflate(R.layout.fragment_first, container, false)

        init(view)

        return view
    }

    private fun init(view: View) {
        view.button_send.setOnClickListener{
            var name = view.edit_text_name.text.toString()
            listener?.onButtonClicked(name)


        }


    }

    interface OnFragmentInteraction{
        fun onButtonClicked(name:String)
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        listener = context as MainActivity
    }



}