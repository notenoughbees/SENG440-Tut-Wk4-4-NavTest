package nz.ac.uclive.dsi61.navtest

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation

class ChooserFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_chooser, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<Button>(R.id.buttonChoice1)?.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.action_chooserFragment_to_choice1Fragment, null)
        )
        view.findViewById<Button>(R.id.buttonChoice2)?.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.action_chooserFragment_to_choice2Fragment, null)
        )
    }

}