// Generated by view binder compiler. Do not edit!
package toti.navio.alfian.help.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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

public final class RowDokterBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ConstraintLayout cLDokter;

  @NonNull
  public final ImageView imgDokterRow;

  @NonNull
  public final TextView txEmailDokterRow;

  @NonNull
  public final TextView txHpDokterRow;

  @NonNull
  public final TextView txIdDokterRow;

  @NonNull
  public final TextView txNamaDokterRow;

  @NonNull
  public final TextView txSpesialisDokterRow;

  private RowDokterBinding(@NonNull ConstraintLayout rootView, @NonNull ConstraintLayout cLDokter,
      @NonNull ImageView imgDokterRow, @NonNull TextView txEmailDokterRow,
      @NonNull TextView txHpDokterRow, @NonNull TextView txIdDokterRow,
      @NonNull TextView txNamaDokterRow, @NonNull TextView txSpesialisDokterRow) {
    this.rootView = rootView;
    this.cLDokter = cLDokter;
    this.imgDokterRow = imgDokterRow;
    this.txEmailDokterRow = txEmailDokterRow;
    this.txHpDokterRow = txHpDokterRow;
    this.txIdDokterRow = txIdDokterRow;
    this.txNamaDokterRow = txNamaDokterRow;
    this.txSpesialisDokterRow = txSpesialisDokterRow;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static RowDokterBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static RowDokterBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.row_dokter, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static RowDokterBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      ConstraintLayout cLDokter = (ConstraintLayout) rootView;

      id = R.id.img_dokter_row;
      ImageView imgDokterRow = ViewBindings.findChildViewById(rootView, id);
      if (imgDokterRow == null) {
        break missingId;
      }

      id = R.id.tx_email_dokter_row;
      TextView txEmailDokterRow = ViewBindings.findChildViewById(rootView, id);
      if (txEmailDokterRow == null) {
        break missingId;
      }

      id = R.id.tx_hp_dokter_row;
      TextView txHpDokterRow = ViewBindings.findChildViewById(rootView, id);
      if (txHpDokterRow == null) {
        break missingId;
      }

      id = R.id.tx_id_dokter_row;
      TextView txIdDokterRow = ViewBindings.findChildViewById(rootView, id);
      if (txIdDokterRow == null) {
        break missingId;
      }

      id = R.id.tx_nama_dokter_row;
      TextView txNamaDokterRow = ViewBindings.findChildViewById(rootView, id);
      if (txNamaDokterRow == null) {
        break missingId;
      }

      id = R.id.tx_spesialis_dokter_row;
      TextView txSpesialisDokterRow = ViewBindings.findChildViewById(rootView, id);
      if (txSpesialisDokterRow == null) {
        break missingId;
      }

      return new RowDokterBinding((ConstraintLayout) rootView, cLDokter, imgDokterRow,
          txEmailDokterRow, txHpDokterRow, txIdDokterRow, txNamaDokterRow, txSpesialisDokterRow);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}