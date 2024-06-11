package toti.navio.alfian.help.database;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import toti.navio.alfian.help.model.Diagnosa;
import toti.navio.alfian.help.model.DiagnosaResponse;
import toti.navio.alfian.help.model.Dokter;
import toti.navio.alfian.help.model.DokterResponse;
import toti.navio.alfian.help.model.Pasien;
import toti.navio.alfian.help.model.PasienResponse;
import toti.navio.alfian.help.model.Rekam;
import toti.navio.alfian.help.model.RekamResponse;
import toti.navio.alfian.help.model.Resepsionis;
import toti.navio.alfian.help.model.ResepsionisResponse;

public interface ApiService {

    // Dokter endpoints
    @GET("dokters")
    Call<DokterResponse> getDokters();

    @POST("dokters")
    Call<Dokter> createDokter(@Body Dokter dokter);

    @GET("dokters/{id}")
    Call<Dokter> getDokter(@Path("id") int id);

    @PUT("dokters/{id}")
    Call<Dokter> updateDokter(@Path("id") int id, @Body Dokter dokter);

    @DELETE("dokters/{id}")
    Call<Response<Void>> deleteDokter(@Path("id") int id);

    // Pasien endpoints
    @GET("pasiens")
    Call<PasienResponse> getPasiens();

    @POST("pasiens")
    Call<Pasien> createPasien(@Body Pasien pasien);

    @GET("pasiens/{id}")
    Call<Pasien> getPasien(@Path("id") int id);

    @PUT("pasiens/{id}")
    Call<Pasien> updatePasien(@Path("id") int id, @Body Pasien pasien);

    @DELETE("pasiens/{id}")
    Call<Response<Void>> deletePasien(@Path("id") int id);

    // Resepsionis endpoints
    @GET("resepsionis")
    Call<ResepsionisResponse> getResepsionis();

    @POST("resepsionis")
    Call<Resepsionis> createResepsionis(@Body Resepsionis resepsionis);

    @GET("resepsionis/{id}")
    Call<Resepsionis> getResepsionis(@Path("id") int id);

    @PUT("resepsionis/{id}")
    Call<Resepsionis> updateResepsionis(@Path("id") int id, @Body Resepsionis resepsionis);

    @DELETE("resepsionis/{id}")
    Call<Response<Void>> deleteResepsionis(@Path("id") int id);

    // Diagnosa endpoints
    @GET("diagnosa")
    Call<DiagnosaResponse> getDiagnosa();

    @POST("diagnosa")
    Call<Diagnosa> createDiagnosa(@Body Diagnosa diagnosa);

    @GET("diagnosa/{id}")
    Call<Diagnosa> getDiagnosa(@Path("id") int id);

    @PUT("diagnosa/{id}")
    Call<Diagnosa> updateDiagnosa(@Path("id") int id, @Body Diagnosa diagnosa);

    @DELETE("diagnosa/{id}")
    Call<Response<Void>> deleteDiagnosa(@Path("id") int id);

    // Rekam endpoints
    @GET("rekam")
    Call<RekamResponse> getRekam();

    @POST("rekam")
    Call<Rekam> createRekam(@Body Rekam rekam);

    @GET("rekam/{id}")
    Call<Rekam> getRekam(@Path("id") int id);

    @PUT("rekam/{id}")
    Call<Rekam> updateRekam(@Path("id") int id, @Body Rekam rekam);

    @DELETE("rekam/{id}")
    Call<Response<Void>> deleteRekam(@Path("id") int id);
}
