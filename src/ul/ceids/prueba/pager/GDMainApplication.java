package ul.ceids.prueba.pager;



import android.content.Intent;
import android.util.Log;
import greendroid.app.GDApplication;

public class GDMainApplication extends GDApplication{
	
	private final static String TAG = GDMainApplication.class.getSimpleName();
	
	@Override
	public Class<?> getHomeActivityClass() {
		// TODO Auto-generated method stub
		return Prueba_ViewPagerActivity.class;
	}
	
	@Override
	public Intent getMainApplicationIntent() {
		
//		Log.v(TAG, "Estoy en getMainApplicationIntent");
//		Log.v(TAG,"::::::::"+Ventana_Opciones2.MY_INTENT);
//		
//		Intent intent = new Intent(Intent.ACTION_DEFAULT);
//		intent.putExtras(Ventana_Opciones2.MY_INTENT.getExtras());
		
		return new Intent(Intent.ACTION_DEFAULT);
	}
	

}
