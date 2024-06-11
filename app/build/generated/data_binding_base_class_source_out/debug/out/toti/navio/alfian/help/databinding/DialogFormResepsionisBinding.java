// Generated by view binder compiler. Do not edit!
package toti.navio.alfian.help.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
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

public final class DialogFormResepsionisBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final EditText emailFormReseps;

  @NonNull
  public final TextView idFormReseps;

  @NonNull
  public final EditText namaFormReseps;

  @NonNull
  public final EditText noTelpFormReseps;

  @NonNull
  public final EditText passFormReseps;

  @NonNull
  public final TextView tvFormReseps;

  private DialogFormResepsionisBinding(@NonNull ConstraintLayout rootView,
      @NonNull EditText emailFormReseps, @NonNull TextView idFormReseps,
      @NonNull EditText namaFormReseps, @NonNull EditText noTelpFormReseps,
      @NonNull EditText passFormReseps, @NonNull TextView tvFormReseps) {
    this.rootView = rootView;
    this.emailFormReseps = emailFormReseps;
    this.idFormReseps = idFormReseps;
    this.namaFormReseps = namaFormReseps;
    this.noTelpFormReseps = noTelpFormReseps;
    this.passFormReseps = passFormReseps;
    this.tvFormReseps = tvFormReseps;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static DialogFormResepsionisBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static DialogFormResepsionisBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.dialog_form_resepsionis, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static DialogFormResepsionisBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.emailFormReseps;
      EditText emailFormReseps = ViewBindings.findChildViewById(rootView, id);
      if (emailFormReseps == null) {
        break missingId;
      }

      id = R.id.idFormReseps;
      TextView idFormReseps = ViewBindings.findChildViewById(rootView, id);
      if (idFormReseps == null) {
        break missingId;
      }

      id = R.id.namaFormReseps;
      EditText namaFormReseps = ViewBindings.findChildViewById(rootView, id);
      if (namaFormReseps == null) {
        break missingId;
      }

      id = R.id.noTelpFormReseps;
      EditText noTelpFormReseps = ViewBindings.findChildViewById(rootView, id);
      if (noTelpFormReseps == null) {
        break missingId;
      }

      id = R.id.passFormReseps;
      EditText passFormReseps = ViewBindings.findChildViewById(rootView, id);
      if (passFormReseps == null) {
        break missingId;
      }

      id = R.id.tvFormReseps;
      TextView tvFormReseps = ViewBindings.findChildViewById(rootView, id);
      if (tvFormReseps == null) {
        break missingId;
      }

      return new DialogFormResepsionisBinding((ConstraintLayout) rootView, emailFormReseps,
          idFormReseps, namaFormReseps, noTelpFormReseps, passFormReseps, tvFormReseps);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
