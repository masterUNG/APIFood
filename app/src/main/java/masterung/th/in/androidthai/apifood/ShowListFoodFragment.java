package masterung.th.in.androidthai.apifood;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class ShowListFoodFragment extends Fragment {

    private String ptPsgCodeString;


    public ShowListFoodFragment() {
        // Required empty public constructor
    }

    public static ShowListFoodFragment showListFoodInstance(String ptPsgCodeString) {

        ShowListFoodFragment showListFoodFragment = new ShowListFoodFragment();
        Bundle bundle = new Bundle();
        bundle.putString("ptPsgCode", ptPsgCodeString);
        showListFoodFragment.setArguments(bundle);
        return showListFoodFragment;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        ptPsgCodeString = getArguments().getString("ptPsgCode");
        Log.d("5MayV3", "Code Receive ==> " + ptPsgCodeString);

    }   // Main Method

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_show_list_food, container, false);
    }

}
