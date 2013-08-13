//
// DO NOT EDIT THIS FILE, IT HAS BEEN GENERATED USING AndroidAnnotations.
//


package nabhack.localz.activity;

import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import nabhack.localz.R.string;

public final class FacebookWallPostFragment_
    extends FacebookWallPostFragment
{

    private View contentView_;
    private Handler handler_ = new Handler();

    private void init_(Bundle savedInstanceState) {
        Resources resources_ = getActivity().getResources();
        facebookCaption = resources_.getString(string.facebook_share_to_wall_caption);
        facebookName = resources_.getString(string.facebook_share_to_wall_name);
        facebookRequestMoneyDesc = resources_.getString(string.facebook_share_to_wall_description);
        facebookLink = resources_.getString(string.facebook_share_to_wall_link);
        facebookDesc = resources_.getString(string.facebook_share_to_wall_description);
        facebookPicture = resources_.getString(string.facebook_share_to_wall_picture);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        init_(savedInstanceState);
        super.onCreate(savedInstanceState);
    }

    private void afterSetContentView_() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        contentView_ = super.onCreateView(inflater, container, savedInstanceState);
        return contentView_;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        afterSetContentView_();
    }

    public View findViewById(int id) {
        if (contentView_ == null) {
            return null;
        }
        return contentView_.findViewById(id);
    }

    public static FacebookWallPostFragment_.FragmentBuilder_ builder() {
        return new FacebookWallPostFragment_.FragmentBuilder_();
    }

    @Override
    public void publishFeedDialog(final String facebookId) {
        handler_.post(new Runnable() {


            @Override
            public void run() {
                try {
                    FacebookWallPostFragment_.super.publishFeedDialog(facebookId);
                } catch (RuntimeException e) {
                    Log.e("FacebookWallPostFragment_", "A runtime exception was thrown while executing code in a runnable", e);
                }
            }

        }
        );
    }

    public static class FragmentBuilder_ {

        private Bundle args_;

        private FragmentBuilder_() {
            args_ = new Bundle();
        }

        public FacebookWallPostFragment build() {
            FacebookWallPostFragment_ fragment_ = new FacebookWallPostFragment_();
            fragment_.setArguments(args_);
            return fragment_;
        }

    }

}
