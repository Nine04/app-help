// Generated by view binder compiler. Do not edit!
package toti.navio.alfian.help.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
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

public final class DialogFormRekamBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final TextView TextViewFormRekam;

  @NonNull
  public final EditText arahanFormRekam;

  @NonNull
  public final Button btnAddRekamForm;

  @NonNull
  public final EditText diagnosaFormRekam;

  @NonNull
  public final TextView dokterFormRekam;

  @NonNull
  public final TextView idFormRekam1;

  @NonNull
  public final EditText keluhanFormRekam;

  @NonNull
  public final ListView lvDiagnosaFormRekam;

  @NonNull
  public final TextView pasienFormRekam;

  @NonNull
  public final TextView tglFormRekam;

  @NonNull
  public final TextView tvFormRekam;

  @NonNull
  public final TextView tvFormRekam2;

  @NonNull
  public final TextView tvFormRekam3;

  @NonNull
  public final TextView tvFormRekam4;

  @NonNull
  public final TextView tvFormRekam5;

  @NonNull
  public final TextView tvFormRekam6;

  private DialogFormRekamBinding(@NonNull ConstraintLayout rootView,
      @NonNull TextView TextViewFormRekam, @NonNull EditText arahanFormRekam,
      @NonNull Button btnAddRekamForm, @NonNull EditText diagnosaFormRekam,
      @NonNull TextView dokterFormRekam, @NonNull TextView idFormRekam1,
      @NonNull EditText keluhanFormRekam, @NonNull ListView lvDiagnosaFormRekam,
      @NonNull TextView pasienFormRekam, @NonNull TextView tglFormRekam,
      @NonNull TextView tvFormRekam, @NonNull TextView tvFormRekam2, @NonNull TextView tvFormRekam3,
      @NonNull TextView tvFormRekam4, @NonNull TextView tvFormRekam5,
      @NonNull TextView tvFormRekam6) {
    this.rootView = rootView;
    this.TextViewFormRekam = TextViewFormRekam;
    this.arahanFormRekam = arahanFormRekam;
    this.btnAddRekamForm = btnAddRekamForm;
    this.diagnosaFormRekam = diagnosaFormRekam;
    this.dokterFormRekam = dokterFormRekam;
    this.idFormRekam1 = idFormRekam1;
    this.keluhanFormRekam = keluhanFormRekam;
    this.lvDiagnosaFormRekam = lvDiagnosaFormRekam;
    this.pasienFormRekam = pasienFormRekam;
    this.tglFormRekam = tglFormRekam;
    this.tvFormRekam = tvFormRekam;
    this.tvFormRekam2 = tvFormRekam2;
    this.tvFormRekam3 = tvFormRekam3;
    this.tvFormRekam4 = tvFormRekam4;
    this.tvFormRekam5 = tvFormRekam5;
    this.tvFormRekam6 = tvFormRekam6;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static DialogFormRekamBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static DialogFormRekamBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.dialog_form_rekam, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static DialogFormRekamBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.TextViewFormRekam;
      TextView TextViewFormRekam = ViewBindings.findChildViewById(rootView, id);
      if (TextViewFormRekam == null) {
        break missingId;
      }

      id = R.id.arahanFormRekam;
      EditText arahanFormRekam = ViewBindings.findChildViewById(rootView, id);
      if (arahanFormRekam == null) {
        break missingId;
      }

      id = R.id.btnAddRekam_Form;
      Button btnAddRekamForm = ViewBindings.findChildViewById(rootView, id);
      if (btnAddRekamForm == null) {
        break missingId;
      }

      id = R.id.diagnosaFormRekam;
      EditText diagnosaFormRekam = ViewBindings.findChildViewById(rootView, id);
      if (diagnosaFormRekam == null) {
        break missingId;
      }

      id = R.id.dokterFormRekam;
      TextView dokterFormRekam = ViewBindings.findChildViewById(rootView, id);
      if (dokterFormRekam == null) {
        break missingId;
      }

      id = R.id.idFormRekam1;
      TextView idFormRekam1 = ViewBindings.findChildViewById(rootView, id);
      if (idFormRekam1 == null) {
        break missingId;
      }

      id = R.id.keluhanFormRekam;
      EditText keluhanFormRekam = ViewBindings.findChildViewById(rootView, id);
      if (keluhanFormRekam == null) {
        break missingId;
      }

      id = R.id.lvDiagnosaFormRekam;
      ListView lvDiagnosaFormRekam = ViewBindings.findChildViewById(rootView, id);
      if (lvDiagnosaFormRekam == null) {
        break missingId;
      }

      id = R.id.pasienFormRekam;
      TextView pasienFormRekam = ViewBindings.findChildViewById(rootView, id);
      if (pasienFormRekam == null) {
        break missingId;
      }

      id = R.id.tglFormRekam;
      TextView tglFormRekam = ViewBindings.findChildViewById(rootView, id);
      if (tglFormRekam == null) {
        break missingId;
      }

      id = R.id.tvFormRekam;
      TextView tvFormRekam = ViewBindings.findChildViewById(rootView, id);
      if (tvFormRekam == null) {
        break missingId;
      }

      id = R.id.tvFormRekam2;
      TextView tvFormRekam2 = ViewBindings.findChildViewById(rootView, id);
      if (tvFormRekam2 == null) {
        break missingId;
      }

      id = R.id.tvFormRekam3;
      TextView tvFormRekam3 = ViewBindings.findChildViewById(rootView, id);
      if (tvFormRekam3 == null) {
        break missingId;
      }

      id = R.id.tvFormRekam4;
      TextView tvFormRekam4 = ViewBindings.findChildViewById(rootView, id);
      if (tvFormRekam4 == null) {
        break missingId;
      }

      id = R.id.tvFormRekam5;
      TextView tvFormRekam5 = ViewBindings.findChildViewById(rootView, id);
      if (tvFormRekam5 == null) {
        break missingId;
      }

      id = R.id.tvFormRekam6;
      TextView tvFormRekam6 = ViewBindings.findChildViewById(rootView, id);
      if (tvFormRekam6 == null) {
        break missingId;
      }

      return new DialogFormRekamBinding((ConstraintLayout) rootView, TextViewFormRekam,
          arahanFormRekam, btnAddRekamForm, diagnosaFormRekam, dokterFormRekam, idFormRekam1,
          keluhanFormRekam, lvDiagnosaFormRekam, pasienFormRekam, tglFormRekam, tvFormRekam,
          tvFormRekam2, tvFormRekam3, tvFormRekam4, tvFormRekam5, tvFormRekam6);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
