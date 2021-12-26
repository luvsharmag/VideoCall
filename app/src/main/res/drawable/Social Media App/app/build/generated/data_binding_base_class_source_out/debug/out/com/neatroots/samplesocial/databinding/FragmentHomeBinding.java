// Generated by view binder compiler. Do not edit!
package com.neatroots.samplesocial.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.makeramen.roundedimageview.RoundedImageView;
import com.neatroots.samplesocial.R;
import de.hdodenhof.circleimageview.CircleImageView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentHomeBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ImageView addStory;

  @NonNull
  public final RoundedImageView addStoryImg;

  @NonNull
  public final RecyclerView dashboardRV;

  @NonNull
  public final HorizontalScrollView horizontal;

  @NonNull
  public final CircleImageView profileImage;

  @NonNull
  public final RecyclerView storyRV;

  @NonNull
  public final TextView textView10;

  @NonNull
  public final TextView textView11;

  @NonNull
  public final View view4;

  @NonNull
  public final View view6;

  @NonNull
  public final View view7;

  @NonNull
  public final View view8;

  @NonNull
  public final View view9;

  private FragmentHomeBinding(@NonNull ConstraintLayout rootView, @NonNull ImageView addStory,
      @NonNull RoundedImageView addStoryImg, @NonNull RecyclerView dashboardRV,
      @NonNull HorizontalScrollView horizontal, @NonNull CircleImageView profileImage,
      @NonNull RecyclerView storyRV, @NonNull TextView textView10, @NonNull TextView textView11,
      @NonNull View view4, @NonNull View view6, @NonNull View view7, @NonNull View view8,
      @NonNull View view9) {
    this.rootView = rootView;
    this.addStory = addStory;
    this.addStoryImg = addStoryImg;
    this.dashboardRV = dashboardRV;
    this.horizontal = horizontal;
    this.profileImage = profileImage;
    this.storyRV = storyRV;
    this.textView10 = textView10;
    this.textView11 = textView11;
    this.view4 = view4;
    this.view6 = view6;
    this.view7 = view7;
    this.view8 = view8;
    this.view9 = view9;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentHomeBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentHomeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_home, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentHomeBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.addStory;
      ImageView addStory = rootView.findViewById(id);
      if (addStory == null) {
        break missingId;
      }

      id = R.id.addStoryImg;
      RoundedImageView addStoryImg = rootView.findViewById(id);
      if (addStoryImg == null) {
        break missingId;
      }

      id = R.id.dashboardRV;
      RecyclerView dashboardRV = rootView.findViewById(id);
      if (dashboardRV == null) {
        break missingId;
      }

      id = R.id.horizontal;
      HorizontalScrollView horizontal = rootView.findViewById(id);
      if (horizontal == null) {
        break missingId;
      }

      id = R.id.profile_image;
      CircleImageView profileImage = rootView.findViewById(id);
      if (profileImage == null) {
        break missingId;
      }

      id = R.id.storyRV;
      RecyclerView storyRV = rootView.findViewById(id);
      if (storyRV == null) {
        break missingId;
      }

      id = R.id.textView10;
      TextView textView10 = rootView.findViewById(id);
      if (textView10 == null) {
        break missingId;
      }

      id = R.id.textView11;
      TextView textView11 = rootView.findViewById(id);
      if (textView11 == null) {
        break missingId;
      }

      id = R.id.view4;
      View view4 = rootView.findViewById(id);
      if (view4 == null) {
        break missingId;
      }

      id = R.id.view6;
      View view6 = rootView.findViewById(id);
      if (view6 == null) {
        break missingId;
      }

      id = R.id.view7;
      View view7 = rootView.findViewById(id);
      if (view7 == null) {
        break missingId;
      }

      id = R.id.view8;
      View view8 = rootView.findViewById(id);
      if (view8 == null) {
        break missingId;
      }

      id = R.id.view9;
      View view9 = rootView.findViewById(id);
      if (view9 == null) {
        break missingId;
      }

      return new FragmentHomeBinding((ConstraintLayout) rootView, addStory, addStoryImg,
          dashboardRV, horizontal, profileImage, storyRV, textView10, textView11, view4, view6,
          view7, view8, view9);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}