package com.sipdemo.dell.sip;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link Dialer.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link Dialer#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Dialer extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    private Button one , two , tree , four , five , six ,seven ,eight, nine , star,zero ,hashtag;
    private EditText EditNumer ;


    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    public Dialer() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Dialer.
     */
    // TODO: Rename and change types and number of parameters
    public static Dialer newInstance(String param1, String param2) {
        Dialer fragment = new Dialer();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_dialer, container, false);
        // casting
        one = (Button)view.findViewById(R.id.onebtm);
        two = (Button)view.findViewById(R.id.twobtm);
        tree = ( Button)view.findViewById(R.id.treebtm);
        four=(Button)view.findViewById(R.id.fourbtm);
        five=(Button)view.findViewById(R.id.fivebtm);
        six=(Button)view.findViewById(R.id.Sixbtm);
        seven=(Button)view.findViewById(R.id.sevenbtm);
        eight=(Button)view.findViewById(R.id.eightbtm);
        nine=(Button)view.findViewById(R.id.ninebtm);
        star=(Button)view.findViewById(R.id.starbtm);
        zero=(Button)view.findViewById(R.id.zero);
        hashtag = (Button)view.findViewById(R.id.hashtag);
        EditNumer=(EditText)view.findViewById(R.id.editText2);


        //add listener

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()){
                    case 0 :
                        String cache = EditNumer.getText().toString();
                        EditNumer.setText(cache+"1");
                        break;
                }
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()){
                    case 0 :
                        String cache = EditNumer.getText().toString();
                        EditNumer.setText(cache+"2");
                        break;
                }
            }
        });
        tree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()){
                    case 0 :
                        String cache = EditNumer.getText().toString();
                        EditNumer.setText(cache+"3");
                        break;
                }
            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()){
                    case 0 :
                        String cache = EditNumer.getText().toString();
                        EditNumer.setText(cache+"4");
                        break;
                }
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()){
                    case 0 :
                        String cache = EditNumer.getText().toString();
                        EditNumer.setText(cache+"5");
                        break;
                }
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()){
                    case 0 :
                        String cache = EditNumer.getText().toString();
                        EditNumer.setText(cache+"6");
                        break;
                }
            }
        });

        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()){
                    case 0 :
                        String cache = EditNumer.getText().toString();
                        EditNumer.setText(cache+"7");
                        break;
                }
            }
        }); eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()){
                    case 0 :
                        String cache = EditNumer.getText().toString();
                        EditNumer.setText(cache+"8");
                        break;
                }
            }
        }); nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()){
                    case 0 :
                        String cache = EditNumer.getText().toString();
                        EditNumer.setText(cache+"9");
                        break;
                }
            }
        }); star.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()){
                    case 0 :
                        String cache = EditNumer.getText().toString();
                        EditNumer.setText(cache+"*");
                        break;
                }
            }
        }); zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()){
                    case 0 :
                        String cache = EditNumer.getText().toString();
                        EditNumer.setText(cache+"0");
                        break;
                }
            }
        });
        hashtag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()){
                    case 0 :
                        String cache = EditNumer.getText().toString();
                        EditNumer.setText(cache+"#");
                        break;
                }
            }
        });
        return view;

    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
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

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
