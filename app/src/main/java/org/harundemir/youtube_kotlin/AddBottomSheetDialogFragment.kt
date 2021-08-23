package org.harundemir.youtube_kotlin

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import org.harundemir.youtube_kotlin.databinding.FragmentAddBottomSheetDialogBinding

class AddBottomSheetDialogFragment : BottomSheetDialogFragment() {
    private lateinit var binding: FragmentAddBottomSheetDialogBinding

    companion object {
        const val TAG = "AddBottomSheetDialogFragment"
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentAddBottomSheetDialogBinding.inflate(inflater)
        requireActivity().setContentView(binding.root)

        val view = inflater.inflate(R.layout.fragment_add_bottom_sheet_dialog, container, false)
        val uploadVideoButton = view.findViewById<TextView>(R.id.upload_video_textView)

        uploadVideoButton.setOnClickListener {
            Toast.makeText(context, "Upload Video", Toast.LENGTH_SHORT).show()
        }

        return view
    }

//    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
//        super.onViewCreated(view, savedInstanceState)
//
//        binding.uploadVideoTextView.setOnClickListener {
//            Toast.makeText(context, "Upload Video", Toast.LENGTH_SHORT).show()
//        }
//
//        binding.closeImageButton.setOnClickListener {
//            dismiss()
//        }
//    }
}