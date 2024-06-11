// Generated by view binder compiler. Do not edit!
package toti.navio.alfian.help.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import toti.navio.alfian.help.R;

public final class ActivityProfilAdminBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button btnEditProfilAdmin;

  @NonNull
  public final Button btnEditPwAdmin;

  @NonNull
  public final ImageView imgAdminProfil;

  @NonNull
  public final TextView txEmailAdminProfil;

  @NonNull
  public final TextView txIdAdminProfil;

  @NonNull
  public final TextView txNamaAdminProfil;

  private ActivityProfilAdminBinding(@NonNull ConstraintLayout rootView,
      @NonNull Button btnEditProfilAdmin, @NonNull Button btnEditPwAdmin,
      @NonNull ImageView imgAdminProfil, @NonNull TextView txEmailAdminProfil,
      @NonNull TextView txIdAdminProfil, @NonNull TextView txNamaAdminProfil) {
    this.rootView = rootView;
    this.btnEditProfilAdmin = btnEditProfilAdmin;
    this.btnEditPwAdmin = btnEditPwAdmin;
    this.imgAdminProfil = imgAdminProfil;
    this.txEmailAdminProfil = txEmailAdminProfil;
    this.txIdAdminProfil = txIdAdminProfil;
    this.txNamaAdminProfil = txNamaAdminProfil;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityProfilAdminBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityProfilAdminBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_profil_admin, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityProfilAdminBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btn_editProfil_admin;
      Button btnEditProfilAdmin = ViewBindings.findChildViewById(rootView, id);
      if (btnEditProfilAdmin == null) {
        break missingId;
      }

      id = R.id.btn_editPw_admin;
      Button btnEditPwAdmin = ViewBindings.findChildViewById(rootView, id);
      if (btnEditPwAdmin == null) {
        break missingId;
      }

      id = R.id.img_admin_profil;
      ImageView imgAdminProfil = ViewBindings.findChildViewById(rootView, id);
      if (imgAdminProfil == null) {
        break missingId;
      }

      id = R.id.tx_email_admin_profil;
      TextView txEmailAdminProfil = ViewBindings.findChildViewById(rootView, id);
      if (txEmailAdminProfil == null) {
        break missingId;
      }

      id = R.id.tx_id_admin_profil;
      TextView txIdAdminProfil = ViewBindings.findChildViewById(rootView, id);
      if (txIdAdminProfil == null) {
        break missingId;
      }

      id = R.id.tx_nama_admin_profil;
      TextView txNamaAdminProfil = ViewBindings.findChildViewById(rootView, id);
      if (txNamaAdminProfil == null) {
        break missingId;
      }

      return new ActivityProfilAdminBinding((ConstraintLayout) rootView, btnEditProfilAdmin,
          btnEditPwAdmin, imgAdminProfil, txEmailAdminProfil, txIdAdminProfil, txNamaAdminProfil);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}