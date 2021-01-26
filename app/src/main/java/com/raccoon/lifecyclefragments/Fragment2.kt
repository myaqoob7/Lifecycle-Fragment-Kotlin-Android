package com.raccoon.lifecyclefragments

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class Fragment2 : Fragment() {

    private val TAG="myInformation"


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment1, container, false)
        Log.i(TAG,"onCreateView Fragment2")

        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        Log.i(TAG,"onViewCreated Fragment2")
    }


    override fun onStart() {
        super.onStart()
        Log.i(TAG,"OnStart Fragment2")
    }

    override fun onResume() {
        super.onResume()
        Log.i(TAG,"OnResume Fragment2")
    }

    override fun onPause() {
        super.onPause()
        Log.i(TAG,"OnPause Fragment2")
    }

    override fun onStop() {
        super.onStop()
        Log.i(TAG,"OnStop Fragment2")
    }


    override fun onDestroy() {
        super.onDestroy()
        Log.i(TAG,"OnDestroy Fragment2")
    }

}
