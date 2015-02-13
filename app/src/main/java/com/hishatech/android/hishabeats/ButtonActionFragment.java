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
public class ButtonActionFragment extends Fragment {

    TextView txtButtonAction;

    @Override
    public View onCreateView(LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_buttonaction, container,
                false);

        txtButtonAction = (TextView) v.findViewById(R.id.txtButtonAction);

        txtButtonAction.setText(AppConstants.frag_ButtonAction);

        return v;
    }

}
