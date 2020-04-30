package com.example.praktikum5;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng spbu = new LatLng(-6.904038, 107.607042);
        mMap.addMarker(new MarkerOptions().position(spbu).title("Spbu Taman Sari Bandung"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(spbu));

        LatLng TSM = new LatLng(-6.924779, 107.634875);
        mMap.addMarker(new MarkerOptions().position(TSM).title("Trans Studio Mall"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(TSM));

        LatLng rm = new LatLng(-6.926952, 107.601945);
        mMap.addMarker(new MarkerOptions().position(rm).title("Rumah Makan Kong Hu"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(rm));

        LatLng polres = new LatLng(-6.914096, 107.6098398);
        mMap.addMarker(new MarkerOptions().position(polres).title("Polrestabes Bandung"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(polres));


    }
}
