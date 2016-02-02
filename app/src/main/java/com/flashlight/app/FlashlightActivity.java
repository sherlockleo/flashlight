//package com.flashlight.app;
//
//import android.content.Context;
//import android.content.pm.PackageManager;
//import android.hardware.Camera;
//import android.os.Bundle;
//import android.support.v7.app.AppCompatActivity;
//import android.view.View;
//import android.view.WindowManager;
//import android.widget.ToggleButton;
//
//public class FlashlightActivity extends AppCompatActivity implements View.OnClickListener {
//
//    private ToggleButton toggleButton;
////    private Camera2 camera2 = Camera2.open();
//    private Camera camera = Camera.open();
//    /** Called when the activity is first created. */
//    @Override
//    public void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_flashlight);
//
//        toggleButton = (ToggleButton) this.findViewById(R.id.toggleButton1);
//        toggleButton.setOnClickListener(this);
//
//        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
//        //保持屏幕
//    }
//
//    @Override
//    public void onClick(View v) {
//        ToggleButton tb = (ToggleButton) v;
//        Camera.Parameters param = camera.getParameters();
//        if(!tb.isChecked()){
//            param.setFlashMode(Camera.Parameters.FLASH_MODE_TORCH);
//            toggleButton.setBackgroundColor(0x30ffffff);
//        }else{
//            param.setFlashMode(Camera.Parameters.FLASH_MODE_OFF);
//            toggleButton.setBackgroundColor(0xffffffff);
//        }
//        camera.setParameters(param);
//    }
//
//    @Override
//    protected void onPause() {
////      camera.release();
////      Process.killProcess(Process.myPid());
//        super.onPause();
//    }
//
//
////    /** Check if this device has a camera */
////    private boolean checkCameraHardware(Context context) {
////        if (context.getPackageManager().hasSystemFeature(PackageManager.FEATURE_CAMERA)){
////            // this device has a camera
////            return true;
////        } else {
////            // no camera on this device
////            return false;
////        }
////    }
////
////    /** A safe way to get an instance of the Camera object. */
////    public static Camera getCameraInstance(){
////        Camera camera = null;
////        try {
////            camera = Camera.open(); // attempt to get a Camera instance
////        }
////        catch (Exception e){
////            // Camera is not available (in use or does not exist)
////        }
////        return camera; // returns null if camera is unavailable
////    }
//
//}
