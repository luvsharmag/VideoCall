// Generated by view binder compiler. Do not edit!
package com.neatroots.samplesocial.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.github.florent37.diagonallayout.DiagonalLayout;
import com.neatroots.samplesocial.R;
import de.hdodenhof.circleimageview.CircleImageView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentProfile2Binding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ImageView addFriend;

  @NonNull
  public final View addFriendView;

  @NonNull
  public final ImageView call;

  @NonNull
  public final View callView;

  @NonNull
  public final CardView cardView;

  @NonNull
  public final DiagonalLayout diagonalLayout;

  @NonNull
  public final TextView followers;

  @NonNull
  public final TextView friends;

  @NonNull
  public final RecyclerView friendsRV;

  @NonNull
  public final ImageView imageView2;

  @NonNull
  public final ImageView message;

  @NonNull
  public final View messageView;

  @NonNull
  public final TextView photos;

  @NonNull
  public final CircleImageView profileImage;

  @NonNull
  public final TextView textView2;

  @NonNull
  public final TextView textView3;

  @NonNull
  public final TextView textView5;

  @NonNull
  public final TextView textView6;

  @NonNull
  public final TextView textView7;

  @NonNull
  public final TextView textView8;

  @NonNull
  public final TextView textView9;

  @NonNull
  public final View view;

  @NonNull
  public final View view2;

  @NonNull
  public final View view3;

  private FragmentProfile2Binding(@NonNull ConstraintLayout rootView, @NonNull ImageView addFriend,
      @NonNull View addFriendView, @NonNull ImageView call, @NonNull View callView,
      @NonNull CardView cardView, @NonNull DiagonalLayout diagonalLayout,
      @NonNull TextView followers, @NonNull TextView friends, @NonNull RecyclerView friendsRV,
      @NonNull ImageView imageView2, @NonNull ImageView message, @NonNull View messageView,
      @NonNull TextView photos, @NonNull CircleImageView profileImage, @NonNull TextView textView2,
      @NonNull TextView textView3, @NonNull TextView textView5, @NonNull TextView textView6,
      @NonNull TextView textView7, @NonNull TextView textView8, @NonNull TextView textView9,
      @NonNull View view, @NonNull View view2, @NonNull View view3) {
    this.rootView = rootView;
    this.addFriend = addFriend;
    this.addFriendView = addFriendView;
    this.call = call;
    this.callView = callView;
    this.cardView = cardView;
    this.diagonalLayout = diagonalLayout;
    this.followers = followers;
    this.friends = friends;
    this.friendsRV = friendsRV;
    this.imageView2 = imageView2;
    this.message = message;
    this.messageView = messageView;
    this.photos = photos;
    this.profileImage = profileImage;
    this.textView2 = textView2;
    this.textView3 = textView3;
    this.textView5 = textView5;
    this.textView6 = textView6;
    this.textView7 = textView7;
    this.textView8 = textView8;
    this.textView9 = textView9;
    this.view = view;
    this.view2 = view2;
    this.view3 = view3;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentProfile2Binding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentProfile2Binding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_profile2, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentProfile2Binding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.addFriend;
      ImageView addFriend = rootView.findViewById(id);
      if (addFriend == null) {
        break missingId;
      }

      id = R.id.addFriendView;
      View addFriendView = rootView.findViewById(id);
      if (addFriendView == null) {
        break missingId;
      }

      id = R.id.call;
      ImageView call = rootView.findViewById(id);
      if (call == null) {
        break missingId;
      }

      id = R.id.callView;
      View callView = rootView.findViewById(id);
      if (callView == null) {
        break missingId;
      }

      id = R.id.cardView;
      CardView cardView = rootView.findViewById(id);
      if (cardView == null) {
        break missingId;
      }

      id = R.id.diagonalLayout;
      DiagonalLayout diagonalLayout = rootView.findViewById(id);
      if (diagonalLayout == null) {
        break missingId;
      }

      id = R.id.followers;
      TextView followers = rootView.findViewById(id);
      if (followers == null) {
        break missingId;
      }

      id = R.id.friends;
      TextView friends = rootView.findViewById(id);
      if (friends == null) {
        break missingId;
      }

      id = R.id.friendsRV;
      RecyclerView friendsRV = rootView.findViewById(id);
      if (friendsRV == null) {
        break missingId;
      }

      id = R.id.imageView2;
      ImageView imageView2 = rootView.findViewById(id);
      if (imageView2 == null) {
        break missingId;
      }

      id = R.id.message;
      ImageView message = rootView.findViewById(id);
      if (message == null) {
        break missingId;
      }

      id = R.id.messageView;
      View messageView = rootView.findViewById(id);
      if (messageView == null) {
        break missingId;
      }

      id = R.id.photos;
      TextView photos = rootView.findViewById(id);
      if (photos == null) {
        break missingId;
      }

      id = R.id.profile_image;
      CircleImageView profileImage = rootView.findViewById(id);
      if (profileImage == null) {
        break missingId;
      }

      id = R.id.textView2;
      TextView textView2 = rootView.findViewById(id);
      if (textView2 == null) {
        break missingId;
      }

      id = R.id.textView3;
      TextView textView3 = rootView.findViewById(id);
      if (textView3 == null) {
        break missingId;
      }

      id = R.id.textView5;
      TextView textView5 = rootView.findViewById(id);
      if (textView5 == null) {
        break missingId;
      }

      id = R.id.textView6;
      TextView textView6 = rootView.findViewById(id);
      if (textView6 == null) {
        break missingId;
      }

      id = R.id.textView7;
      TextView textView7 = rootView.findViewById(id);
      if (textView7 == null) {
        break missingId;
      }

      id = R.id.textView8;
      TextView textView8 = rootView.findViewById(id);
      if (textView8 == null) {
        break missingId;
      }

      id = R.id.textView9;
      TextView textView9 = rootView.findViewById(id);
      if (textView9 == null) {
        break missingId;
      }

      id = R.id.view;
      View view = rootView.findViewById(id);
      if (view == null) {
        break missingId;
      }

      id = R.id.view2;
      View view2 = rootView.findViewById(id);
      if (view2 == null) {
        break missingId;
      }

      id = R.id.view3;
      View view3 = rootView.findViewById(id);
      if (view3 == null) {
        break missingId;
      }

      return new FragmentProfile2Binding((ConstraintLayout) rootView, addFriend, addFriendView,
          call, callView, cardView, diagonalLayout, followers, friends, friendsRV, imageView2,
          message, messageView, photos, profileImage, textView2, textView3, textView5, textView6,
          textView7, textView8, textView9, view, view2, view3);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
