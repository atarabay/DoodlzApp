package com.deitel.doodlz;

import android.support.v4.app.DialogFragment;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link BackgroundImageFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link BackgroundImageFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class BackgroundImageFragment extends DialogFragment {

    private OnFragmentInteractionListener mListener;

    public BackgroundImageFragment() {
        // Required empty public constructor
    }


    public void setBackgroundImagje()
    {

    }



    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }


    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}