package com.hishatech.android.hishabeats;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by smithkev on 2/13/2015.
 *
 * http://www.android4devs.com/2015/01/how-to-make-material-design-sliding-tabs.html
 *
 */
public class ButtonColorFragment extends Fragment {

    TextView txtButtonColor;

    @Override
    public View onCreateView(LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_buttoncolor, container,
                false);

        txtButtonColor = (TextView) v.findViewById(R.id.txtButtonColor);

        txtButtonColor.setText(AppConstants.frag_ButtonColor);

        return v;
    }

}
