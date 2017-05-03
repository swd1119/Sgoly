package com.libt.sgoly.fragment.main;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.libt.sgoly.R;
import com.libt.sgoly.manager.UIManager;


public class MineFragment extends Fragment {
    View view;
    private CardView personalInfo;
    private LinearLayout material;
    private LinearLayout collection;
    private LinearLayout setting;
    private TextView title;
    private TextView nickname;
    private TextView motto;
    private ImageView avatar;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.frag_wode, container, false);

        title = (TextView) view.findViewById(R.id.titlebar_text_title);
        title.setVisibility(View.VISIBLE);
        title.setText("我的");
        personalInfo = (CardView) view.findViewById(R.id.mine_info);
        collection = (LinearLayout) view.findViewById(R.id.mine_collection);
        setting = (LinearLayout) view.findViewById(R.id.mine_setting);
        nickname = (TextView) view.findViewById(R.id.mine_nickname);
        motto = (TextView) view.findViewById(R.id.mine_motto);
        avatar = (ImageView) view.findViewById(R.id.mine_avatar);

        personalInfo.setOnClickListener(clickListener);
        collection.setOnClickListener(clickListener);
        setting.setOnClickListener(clickListener);
        return view;
    }

    View.OnClickListener clickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            if (view == personalInfo) {
                UIManager.showPersonalInfo(getActivity());
            } else if (view == collection) {
                UIManager.showCollection(getActivity());
            } else if (view == setting) {
                UIManager.showSetting(getActivity());
            }
        }
    };

}
