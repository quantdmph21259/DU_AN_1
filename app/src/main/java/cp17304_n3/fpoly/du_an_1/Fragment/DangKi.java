package cp17304_n3.fpoly.du_an_1.Fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import cp17304_n3.fpoly.du_an_1.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link DangKi#newInstance} factory method to
 * create an instance of this fragment.
 */
public class DangKi extends Fragment {





    public DangKi() {
        // Required empty public constructor
    }



    public static DangKi newInstance() {
        DangKi fragment = new DangKi();

        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_dang_ki, container, false);
    }
}