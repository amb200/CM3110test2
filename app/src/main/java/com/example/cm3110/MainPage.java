package com.example.cm3110;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link MainPage#newInstance} factory method to
 * create an instance of this fragment.
 */
public class MainPage extends Fragment implements View.OnClickListener {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public MainPage() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment MainPage.
     */
    // TODO: Rename and change types and number of parameters
    public static MainPage newInstance(String param1, String param2) {
        MainPage fragment = new MainPage();
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
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_main_page, container, false);

        Button btn1 = view.findViewById(R.id.goToWorkouts);
        btn1.setOnClickListener(this);
        Button btn2 = view.findViewById(R.id.goToFood);
        btn2.setOnClickListener(this);
        Button btn3 = view.findViewById(R.id.goToInfo);
        btn3.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View v) {
        NavController navController = Navigation.findNavController(v);
        switch (v.getId()) {
            case R.id.goToWorkouts:
                navController.navigate(R.id.action_mainPage_to_workouts);
                break;
            case R.id.goToFood:
                navController.navigate(R.id.action_mainPage_to_food);
                break;
            case R.id.goToInfo:
                navController.navigate(R.id.action_mainPage_to_userInfo);
                break;
            default:
                break;
        }
    }
}