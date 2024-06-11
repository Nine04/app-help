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

public final class RowPasienBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ConstraintLayout cLPasien;

  @NonNull
  public final ImageView imgPasienRow;

  @NonNull
  public final TextView txAlamatPasienRow;

  @NonNull
  public final TextView txBeratPasienRow;

  @NonNull
  public final TextView txEkgPasienRow;

  @NonNull
  public final TextView txEmailPasienRow;

  @NonNull
  public final TextView txGoldarPasienRow;

  @NonNull
  public final TextView txHpPasienRow;

  @NonNull
  public final TextView txIdPasienRow;

  @NonNull
  public final TextView txNamaPasienRow;

  @NonNull
  public final TextView txPenyakitBawaanPasienRow;

  @NonNull
  public final TextView txSpesialisPasienRow;

  @NonNull
  public final TextView txTensiPasienRow;

  @NonNull
  public final TextView txTinggiPasienRow;

  private RowPasienBinding(@NonNull ConstraintLayout rootView, @NonNull ConstraintLayout cLPasien,
      @NonNull ImageView imgPasienRow, @NonNull TextView txAlamatPasienRow,
      @NonNull TextView txBeratPasienRow, @NonNull TextView txEkgPasienRow,
      @NonNull TextView txEmailPasienRow, @NonNull TextView txGoldarPasienRow,
      @NonNull TextView txHpPasienRow, @NonNull TextView txIdPasienRow,
      @NonNull TextView txNamaPasienRow, @NonNull TextView txPenyakitBawaanPasienRow,
      @NonNull TextView txSpesialisPasienRow, @NonNull TextView txTensiPasienRow,
      @NonNull TextView txTinggiPasienRow) {
    this.rootView = rootView;
    this.cLPasien = cLPasien;
    this.imgPasienRow = imgPasienRow;
    this.txAlamatPasienRow = txAlamatPasienRow;
    this.txBeratPasienRow = txBeratPasienRow;
    this.txEkgPasienRow = txEkgPasienRow;
    this.txEmailPasienRow = txEmailPasienRow;
    this.txGoldarPasienRow = txGoldarPasienRow;
    this.txHpPasienRow = txHpPasienRow;
    this.txIdPasienRow = txIdPasienRow;
    this.txNamaPasienRow = txNamaPasienRow;
    this.txPenyakitBawaanPasienRow = txPenyakitBawaanPasienRow;
    this.txSpesialisPasienRow = txSpesialisPasienRow;
    this.txTensiPasienRow = txTensiPasienRow;
    this.txTinggiPasienRow = txTinggiPasienRow;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static RowPasienBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static RowPasienBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.row_pasien, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static RowPasienBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      ConstraintLayout cLPasien = (ConstraintLayout) rootView;

      id = R.id.img_pasien_row;
      ImageView imgPasienRow = ViewBindings.findChildViewById(rootView, id);
      if (imgPasienRow == null) {
        break missingId;
      }

      id = R.id.tx_alamat_pasien_row;
      TextView txAlamatPasienRow = ViewBindings.findChildViewById(rootView, id);
      if (txAlamatPasienRow == null) {
        break missingId;
      }

      id = R.id.tx_berat_pasien_row;
      TextView txBeratPasienRow = ViewBindings.findChildViewById(rootView, id);
      if (txBeratPasienRow == null) {
        break missingId;
      }

      id = R.id.tx_ekg_pasien_row;
      TextView txEkgPasienRow = ViewBindings.findChildViewById(rootView, id);
      if (txEkgPasienRow == null) {
        break missingId;
      }

      id = R.id.tx_email_pasien_row;
      TextView txEmailPasienRow = ViewBindings.findChildViewById(rootView, id);
      if (txEmailPasienRow == null) {
        break missingId;
      }

      id = R.id.tx_goldar_pasien_row;
      TextView txGoldarPasienRow = ViewBindings.findChildViewById(rootView, id);
      if (txGoldarPasienRow == null) {
        break missingId;
      }

      id = R.id.tx_hp_pasien_row;
      TextView txHpPasienRow = ViewBindings.findChildViewById(rootView, id);
      if (txHpPasienRow == null) {
        break missingId;
      }

      id = R.id.tx_id_pasien_row;
      TextView txIdPasienRow = ViewBindings.findChildViewById(rootView, id);
      if (txIdPasienRow == null) {
        break missingId;
      }

      id = R.id.tx_nama_pasien_row;
      TextView txNamaPasienRow = ViewBindings.findChildViewById(rootView, id);
      if (txNamaPasienRow == null) {
        break missingId;
      }

      id = R.id.tx_penyakit_bawaan_pasien_row;
      TextView txPenyakitBawaanPasienRow = ViewBindings.findChildViewById(rootView, id);
      if (txPenyakitBawaanPasienRow == null) {
        break missingId;
      }

      id = R.id.tx_spesialis_pasien_row;
      TextView txSpesialisPasienRow = ViewBindings.findChildViewById(rootView, id);
      if (txSpesialisPasienRow == null) {
        break missingId;
      }

      id = R.id.tx_tensi_pasien_row;
      TextView txTensiPasienRow = ViewBindings.findChildViewById(rootView, id);
      if (txTensiPasienRow == null) {
        break missingId;
      }

      id = R.id.tx_tinggi_pasien_row;
      TextView txTinggiPasienRow = ViewBindings.findChildViewById(rootView, id);
      if (txTinggiPasienRow == null) {
        break missingId;
      }

      return new RowPasienBinding((ConstraintLayout) rootView, cLPasien, imgPasienRow,
          txAlamatPasienRow, txBeratPasienRow, txEkgPasienRow, txEmailPasienRow, txGoldarPasienRow,
          txHpPasienRow, txIdPasienRow, txNamaPasienRow, txPenyakitBawaanPasienRow,
          txSpesialisPasienRow, txTensiPasienRow, txTinggiPasienRow);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}