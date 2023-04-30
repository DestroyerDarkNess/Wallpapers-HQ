package com.holydesing.software.wallpaperhq;


import anywheresoftware.b4a.B4AMenuItem;
import android.app.Activity;
import android.os.Bundle;
import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.B4AActivity;
import anywheresoftware.b4a.ObjectWrapper;
import anywheresoftware.b4a.objects.ActivityWrapper;
import java.lang.reflect.InvocationTargetException;
import anywheresoftware.b4a.B4AUncaughtException;
import anywheresoftware.b4a.debug.*;
import java.lang.ref.WeakReference;

public class viewer extends Activity implements B4AActivity{
	public static viewer mostCurrent;
	static boolean afterFirstLayout;
	static boolean isFirst = true;
    private static boolean processGlobalsRun = false;
	BALayout layout;
	public static BA processBA;
	BA activityBA;
    ActivityWrapper _activity;
    java.util.ArrayList<B4AMenuItem> menuItems;
	public static final boolean fullScreen = true;
	public static final boolean includeTitle = false;
    public static WeakReference<Activity> previousOne;
    public static boolean dontPause;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
        mostCurrent = this;
		if (processBA == null) {
			processBA = new BA(this.getApplicationContext(), null, null, "com.holydesing.software.wallpaperhq", "com.holydesing.software.wallpaperhq.viewer");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (viewer).");
				p.finish();
			}
		}
        processBA.setActivityPaused(true);
        processBA.runHook("oncreate", this, null);
		if (!includeTitle) {
        	this.getWindow().requestFeature(android.view.Window.FEATURE_NO_TITLE);
        }
        if (fullScreen) {
        	getWindow().setFlags(android.view.WindowManager.LayoutParams.FLAG_FULLSCREEN,   
        			android.view.WindowManager.LayoutParams.FLAG_FULLSCREEN);
        }
		
        processBA.sharedProcessBA.activityBA = null;
		layout = new BALayout(this);
		setContentView(layout);
		afterFirstLayout = false;
        WaitForLayout wl = new WaitForLayout();
        if (anywheresoftware.b4a.objects.ServiceHelper.StarterHelper.startFromActivity(this, processBA, wl, false))
		    BA.handler.postDelayed(wl, 5);

	}
	static class WaitForLayout implements Runnable {
		public void run() {
			if (afterFirstLayout)
				return;
			if (mostCurrent == null)
				return;
            
			if (mostCurrent.layout.getWidth() == 0) {
				BA.handler.postDelayed(this, 5);
				return;
			}
			mostCurrent.layout.getLayoutParams().height = mostCurrent.layout.getHeight();
			mostCurrent.layout.getLayoutParams().width = mostCurrent.layout.getWidth();
			afterFirstLayout = true;
			mostCurrent.afterFirstLayout();
		}
	}
	private void afterFirstLayout() {
        if (this != mostCurrent)
			return;
		activityBA = new BA(this, layout, processBA, "com.holydesing.software.wallpaperhq", "com.holydesing.software.wallpaperhq.viewer");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "com.holydesing.software.wallpaperhq.viewer", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (viewer) Create " + (isFirst ? "(first time)" : "") + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (viewer) Resume **");
        processBA.raiseEvent(null, "activity_resume");
        if (android.os.Build.VERSION.SDK_INT >= 11) {
			try {
				android.app.Activity.class.getMethod("invalidateOptionsMenu").invoke(this,(Object[]) null);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}
	public void addMenuItem(B4AMenuItem item) {
		if (menuItems == null)
			menuItems = new java.util.ArrayList<B4AMenuItem>();
		menuItems.add(item);
	}
	@Override
	public boolean onCreateOptionsMenu(android.view.Menu menu) {
		super.onCreateOptionsMenu(menu);
        try {
            if (processBA.subExists("activity_actionbarhomeclick")) {
                Class.forName("android.app.ActionBar").getMethod("setHomeButtonEnabled", boolean.class).invoke(
                    getClass().getMethod("getActionBar").invoke(this), true);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (processBA.runHook("oncreateoptionsmenu", this, new Object[] {menu}))
            return true;
		if (menuItems == null)
			return false;
		for (B4AMenuItem bmi : menuItems) {
			android.view.MenuItem mi = menu.add(bmi.title);
			if (bmi.drawable != null)
				mi.setIcon(bmi.drawable);
            if (android.os.Build.VERSION.SDK_INT >= 11) {
				try {
                    if (bmi.addToBar) {
				        android.view.MenuItem.class.getMethod("setShowAsAction", int.class).invoke(mi, 1);
                    }
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			mi.setOnMenuItemClickListener(new B4AMenuItemsClickListener(bmi.eventName.toLowerCase(BA.cul)));
		}
        
		return true;
	}   
 @Override
 public boolean onOptionsItemSelected(android.view.MenuItem item) {
    if (item.getItemId() == 16908332) {
        processBA.raiseEvent(null, "activity_actionbarhomeclick");
        return true;
    }
    else
        return super.onOptionsItemSelected(item); 
}
@Override
 public boolean onPrepareOptionsMenu(android.view.Menu menu) {
    super.onPrepareOptionsMenu(menu);
    processBA.runHook("onprepareoptionsmenu", this, new Object[] {menu});
    return true;
    
 }
 protected void onStart() {
    super.onStart();
    processBA.runHook("onstart", this, null);
}
 protected void onStop() {
    super.onStop();
    processBA.runHook("onstop", this, null);
}
    public void onWindowFocusChanged(boolean hasFocus) {
       super.onWindowFocusChanged(hasFocus);
       if (processBA.subExists("activity_windowfocuschanged"))
           processBA.raiseEvent2(null, true, "activity_windowfocuschanged", false, hasFocus);
    }
	private class B4AMenuItemsClickListener implements android.view.MenuItem.OnMenuItemClickListener {
		private final String eventName;
		public B4AMenuItemsClickListener(String eventName) {
			this.eventName = eventName;
		}
		public boolean onMenuItemClick(android.view.MenuItem item) {
			processBA.raiseEventFromUI(item.getTitle(), eventName + "_click");
			return true;
		}
	}
    public static Class<?> getObject() {
		return viewer.class;
	}
    private Boolean onKeySubExist = null;
    private Boolean onKeyUpSubExist = null;
	@Override
	public boolean onKeyDown(int keyCode, android.view.KeyEvent event) {
        if (processBA.runHook("onkeydown", this, new Object[] {keyCode, event}))
            return true;
		if (onKeySubExist == null)
			onKeySubExist = processBA.subExists("activity_keypress");
		if (onKeySubExist) {
			if (keyCode == anywheresoftware.b4a.keywords.constants.KeyCodes.KEYCODE_BACK &&
					android.os.Build.VERSION.SDK_INT >= 18) {
				HandleKeyDelayed hk = new HandleKeyDelayed();
				hk.kc = keyCode;
				BA.handler.post(hk);
				return true;
			}
			else {
				boolean res = new HandleKeyDelayed().runDirectly(keyCode);
				if (res)
					return true;
			}
		}
		return super.onKeyDown(keyCode, event);
	}
	private class HandleKeyDelayed implements Runnable {
		int kc;
		public void run() {
			runDirectly(kc);
		}
		public boolean runDirectly(int keyCode) {
			Boolean res =  (Boolean)processBA.raiseEvent2(_activity, false, "activity_keypress", false, keyCode);
			if (res == null || res == true) {
                return true;
            }
            else if (keyCode == anywheresoftware.b4a.keywords.constants.KeyCodes.KEYCODE_BACK) {
				finish();
				return true;
			}
            return false;
		}
		
	}
    @Override
	public boolean onKeyUp(int keyCode, android.view.KeyEvent event) {
        if (processBA.runHook("onkeyup", this, new Object[] {keyCode, event}))
            return true;
		if (onKeyUpSubExist == null)
			onKeyUpSubExist = processBA.subExists("activity_keyup");
		if (onKeyUpSubExist) {
			Boolean res =  (Boolean)processBA.raiseEvent2(_activity, false, "activity_keyup", false, keyCode);
			if (res == null || res == true)
				return true;
		}
		return super.onKeyUp(keyCode, event);
	}
	@Override
	public void onNewIntent(android.content.Intent intent) {
        super.onNewIntent(intent);
		this.setIntent(intent);
        processBA.runHook("onnewintent", this, new Object[] {intent});
	}
    @Override 
	public void onPause() {
		super.onPause();
        if (_activity == null)
            return;
        if (this != mostCurrent)
			return;
		anywheresoftware.b4a.Msgbox.dismiss(true);
        if (!dontPause)
            BA.LogInfo("** Activity (viewer) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
        else
            BA.LogInfo("** Activity (viewer) Pause event (activity is not paused). **");
        if (mostCurrent != null)
            processBA.raiseEvent2(_activity, true, "activity_pause", false, activityBA.activity.isFinishing());		
        if (!dontPause) {
            processBA.setActivityPaused(true);
            mostCurrent = null;
        }

        if (!activityBA.activity.isFinishing())
			previousOne = new WeakReference<Activity>(this);
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        processBA.runHook("onpause", this, null);
	}

	@Override
	public void onDestroy() {
        super.onDestroy();
		previousOne = null;
        processBA.runHook("ondestroy", this, null);
	}
    @Override 
	public void onResume() {
		super.onResume();
        mostCurrent = this;
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (activityBA != null) { //will be null during activity create (which waits for AfterLayout).
        	ResumeMessage rm = new ResumeMessage(mostCurrent);
        	BA.handler.post(rm);
        }
        processBA.runHook("onresume", this, null);
	}
    private static class ResumeMessage implements Runnable {
    	private final WeakReference<Activity> activity;
    	public ResumeMessage(Activity activity) {
    		this.activity = new WeakReference<Activity>(activity);
    	}
		public void run() {
            viewer mc = mostCurrent;
			if (mc == null || mc != activity.get())
				return;
			processBA.setActivityPaused(false);
            BA.LogInfo("** Activity (viewer) Resume **");
            if (mc != mostCurrent)
                return;
		    processBA.raiseEvent(mc._activity, "activity_resume", (Object[])null);
		}
    }
	@Override
	protected void onActivityResult(int requestCode, int resultCode,
	      android.content.Intent data) {
		processBA.onActivityResult(requestCode, resultCode, data);
        processBA.runHook("onactivityresult", this, new Object[] {requestCode, resultCode});
	}
	private static void initializeGlobals() {
		processBA.raiseEvent2(null, true, "globals", false, (Object[])null);
	}
    public void onRequestPermissionsResult(int requestCode,
        String permissions[], int[] grantResults) {
        for (int i = 0;i < permissions.length;i++) {
            Object[] o = new Object[] {permissions[i], grantResults[i] == 0};
            processBA.raiseEventFromDifferentThread(null,null, 0, "activity_permissionresult", true, o);
        }
            
    }

public anywheresoftware.b4a.keywords.Common __c = null;
public static int _viewx = 0;
public static int _viewy = 0;
public static int _imagex = 0;
public static int _imagey = 0;
public agraham.b4a.scaleimageview.ScaleImageViewWrapper _scaleimageview1 = null;
public anywheresoftware.b4a.objects.PanelWrapper _panel1 = null;
public flm.b4a.gesturedetector.GestureDetectorForB4A _gestures = null;
public static boolean _touchdown = false;
public static String _viewertitle = "";
public static float _viewerx = 0f;
public static float _viewery = 0f;
public static float _viewerzoom = 0f;
public static float _circlex = 0f;
public static float _circley = 0f;
public b4a.example.dateutils _dateutils = null;
public com.holydesing.software.wallpaperhq.main _main = null;
public com.holydesing.software.wallpaperhq.starter _starter = null;
public com.holydesing.software.wallpaperhq.activity2 _activity2 = null;
public com.holydesing.software.wallpaperhq.themecolors _themecolors = null;
public com.holydesing.software.wallpaperhq.b4xpages _b4xpages = null;
public com.holydesing.software.wallpaperhq.b4xcollections _b4xcollections = null;
public com.holydesing.software.wallpaperhq.httputils2service _httputils2service = null;
public com.holydesing.software.wallpaperhq.xuiviewsutils _xuiviewsutils = null;

public static void initializeProcessGlobals() {
             try {
                Class.forName(BA.applicationContext.getPackageName() + ".main").getMethod("initializeProcessGlobals").invoke(null, null);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
}
public static String  _activity_create(boolean _firsttime) throws Exception{
 //BA.debugLineNum = 41;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
 //BA.debugLineNum = 43;BA.debugLine="Activity.LoadLayout(\"Viewer\")";
mostCurrent._activity.LoadLayout("Viewer",mostCurrent.activityBA);
 //BA.debugLineNum = 47;BA.debugLine="gestures.SetOnGestureListener(Panel1, \"Panel1\")";
mostCurrent._gestures.SetOnGestureListener(processBA,(android.view.View)(mostCurrent._panel1.getObject()),"Panel1");
 //BA.debugLineNum = 48;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
 //BA.debugLineNum = 93;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
 //BA.debugLineNum = 95;BA.debugLine="ViewerZoom = ScaleImageView1.Scale";
_viewerzoom = mostCurrent._scaleimageview1.getScale();
 //BA.debugLineNum = 97;BA.debugLine="CircleX = ScaleImageView1.CircleX";
_circlex = mostCurrent._scaleimageview1.getCircleX();
 //BA.debugLineNum = 98;BA.debugLine="CircleY = ScaleImageView1.CircleY";
_circley = mostCurrent._scaleimageview1.getCircleY();
 //BA.debugLineNum = 100;BA.debugLine="Try";
try { //BA.debugLineNum = 101;BA.debugLine="ViewerX = ScaleImageView1.CenterX / ScaleImageVi";
_viewerx = (float) (mostCurrent._scaleimageview1.getCenterX()/(double)mostCurrent._scaleimageview1.getSrcWidth());
 //BA.debugLineNum = 102;BA.debugLine="ViewerY = ScaleImageView1.CenterY / ScaleImageVi";
_viewery = (float) (mostCurrent._scaleimageview1.getCenterY()/(double)mostCurrent._scaleimageview1.getSrcHeight());
 } 
       catch (Exception e8) {
			processBA.setLastException(e8); //BA.debugLineNum = 104;BA.debugLine="LogColor(\"Error in Pause: \" & LastException.Mess";
anywheresoftware.b4a.keywords.Common.LogImpl("39306123","Error in Pause: "+anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA).getMessage(),anywheresoftware.b4a.keywords.Common.Colors.Red);
 };
 //BA.debugLineNum = 106;BA.debugLine="End Sub";
return "";
}
public static void  _activity_resume() throws Exception{
ResumableSub_Activity_Resume rsub = new ResumableSub_Activity_Resume(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_Activity_Resume extends BA.ResumableSub {
public ResumableSub_Activity_Resume(com.holydesing.software.wallpaperhq.viewer parent) {
this.parent = parent;
}
com.holydesing.software.wallpaperhq.viewer parent;
String _url = "";
com.holydesing.software.wallpaperhq.httpjob _j = null;
anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _bmp = null;
int _loops = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 51;BA.debugLine="Dim Url As String = \"https://w.wallhaven.cc/full/";
_url = "https://w.wallhaven.cc/full/g7/wallhaven-g7zv67.jpg";
 //BA.debugLineNum = 53;BA.debugLine="Log(\"1\")";
anywheresoftware.b4a.keywords.Common.LogImpl("39240579","1",0);
 //BA.debugLineNum = 54;BA.debugLine="Dim j As HttpJob";
_j = new com.holydesing.software.wallpaperhq.httpjob();
 //BA.debugLineNum = 55;BA.debugLine="j.Initialize(\"img\", Me)";
_j._initialize /*String*/ (processBA,"img",viewer.getObject());
 //BA.debugLineNum = 56;BA.debugLine="j.Download(Url)";
_j._download /*String*/ (_url);
 //BA.debugLineNum = 57;BA.debugLine="Wait For (j) JobDone(j As HttpJob)";
anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", processBA, this, (Object)(_j));
this.state = 13;
return;
case 13:
//C
this.state = 1;
_j = (com.holydesing.software.wallpaperhq.httpjob) result[0];
;
 //BA.debugLineNum = 58;BA.debugLine="Log(\"2\")";
anywheresoftware.b4a.keywords.Common.LogImpl("39240584","2",0);
 //BA.debugLineNum = 59;BA.debugLine="If j.Success Then";
if (true) break;

case 1:
//if
this.state = 12;
if (_j._success /*boolean*/ ) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 60;BA.debugLine="ToastMessageShow(\"Downloaded\", True)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Downloaded"),anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 62;BA.debugLine="Dim bmp As Bitmap = j.GetBitmap";
_bmp = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
_bmp = _j._getbitmap /*anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper*/ ();
 //BA.debugLineNum = 65;BA.debugLine="ScaleImageView1.BringToFront";
parent.mostCurrent._scaleimageview1.BringToFront();
 //BA.debugLineNum = 66;BA.debugLine="ScaleImageView1.DoubleTapZoomDuration = 250";
parent.mostCurrent._scaleimageview1.setDoubleTapZoomDuration((int) (250));
 //BA.debugLineNum = 67;BA.debugLine="ScaleImageView1.Orientation = ScaleImageView1.OR";
parent.mostCurrent._scaleimageview1.setOrientation(parent.mostCurrent._scaleimageview1.getORIENTATION_USE_EXIF());
 //BA.debugLineNum = 70;BA.debugLine="ScaleImageView1.Image = bmp";
parent.mostCurrent._scaleimageview1.setImage((android.graphics.Bitmap)(_bmp.getObject()));
 //BA.debugLineNum = 72;BA.debugLine="Dim loops As Int = 1";
_loops = (int) (1);
 //BA.debugLineNum = 73;BA.debugLine="Do Until ScaleImageView1.IsReady";
if (true) break;

case 4:
//do until
this.state = 11;
while (!(parent.mostCurrent._scaleimageview1.getIsReady())) {
this.state = 6;
if (true) break;
}
if (true) break;

case 6:
//C
this.state = 7;
 //BA.debugLineNum = 74;BA.debugLine="Sleep(100)";
anywheresoftware.b4a.keywords.Common.Sleep(processBA,this,(int) (100));
this.state = 14;
return;
case 14:
//C
this.state = 7;
;
 //BA.debugLineNum = 75;BA.debugLine="loops = loops + 1";
_loops = (int) (_loops+1);
 //BA.debugLineNum = 76;BA.debugLine="If loops > 100 Then ' give it up to 10 seconds";
if (true) break;

case 7:
//if
this.state = 10;
if (_loops>100) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
 //BA.debugLineNum = 77;BA.debugLine="Exit";
this.state = 11;
if (true) break;
 if (true) break;

case 10:
//C
this.state = 4;
;
 if (true) break;

case 11:
//C
this.state = 12;
;
 //BA.debugLineNum = 81;BA.debugLine="ScaleImageView1.SetScaleAndCenter(ViewerZoom,Vie";
parent.mostCurrent._scaleimageview1.SetScaleAndCenter(parent._viewerzoom,parent._viewerx,parent._viewery,(int) (1));
 //BA.debugLineNum = 83;BA.debugLine="ScaleImageView1.CircleX = CircleX";
parent.mostCurrent._scaleimageview1.setCircleX(parent._circlex);
 //BA.debugLineNum = 84;BA.debugLine="ScaleImageView1.CircleY = CircleY";
parent.mostCurrent._scaleimageview1.setCircleY(parent._circley);
 //BA.debugLineNum = 85;BA.debugLine="Private TouchDown As Boolean = False";
parent._touchdown = anywheresoftware.b4a.keywords.Common.False;
 if (true) break;

case 12:
//C
this.state = -1;
;
 //BA.debugLineNum = 91;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _jobdone(com.holydesing.software.wallpaperhq.httpjob _j) throws Exception{
}
public static String  _globals() throws Exception{
 //BA.debugLineNum = 19;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 22;BA.debugLine="Dim ScaleImageView1 As ScaleImageView";
mostCurrent._scaleimageview1 = new agraham.b4a.scaleimageview.ScaleImageViewWrapper();
 //BA.debugLineNum = 23;BA.debugLine="Private Panel1 As Panel";
mostCurrent._panel1 = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 24;BA.debugLine="Private gestures As GestureDetector";
mostCurrent._gestures = new flm.b4a.gesturedetector.GestureDetectorForB4A();
 //BA.debugLineNum = 25;BA.debugLine="Private TouchDown As Boolean = False";
_touchdown = anywheresoftware.b4a.keywords.Common.False;
 //BA.debugLineNum = 29;BA.debugLine="Public	 ViewerTitle As String = \"Viewer\"";
mostCurrent._viewertitle = "Viewer";
 //BA.debugLineNum = 32;BA.debugLine="Public ViewerX As Float = 0.5 ' Easting of map po";
_viewerx = (float) (0.5);
 //BA.debugLineNum = 33;BA.debugLine="Public ViewerY As Float = 0.5 ' Northing of map p";
_viewery = (float) (0.5);
 //BA.debugLineNum = 34;BA.debugLine="Public ViewerZoom As Float = 2 ' Zoom level to op";
_viewerzoom = (float) (2);
 //BA.debugLineNum = 35;BA.debugLine="Public CircleX As Float = 0.5 ' Easting of circle";
_circlex = (float) (0.5);
 //BA.debugLineNum = 36;BA.debugLine="Public CircleY As Float = 0.5 ' Northing of circl";
_circley = (float) (0.5);
 //BA.debugLineNum = 39;BA.debugLine="End Sub";
return "";
}
public static String  _panel1_ondoubletap(float _x,float _y,Object _motionevent) throws Exception{
 //BA.debugLineNum = 171;BA.debugLine="Sub Panel1_onDoubleTap(X As Float, Y As Float, Mot";
 //BA.debugLineNum = 172;BA.debugLine="Log(\"Panel1_onDoubleTap \" & gestures.getAction(Mo";
anywheresoftware.b4a.keywords.Common.LogImpl("39568257","Panel1_onDoubleTap "+BA.NumberToString(mostCurrent._gestures.getAction((android.view.MotionEvent)(_motionevent)))+" : "+BA.NumberToString(_x)+", "+BA.NumberToString(_y),0);
 //BA.debugLineNum = 173;BA.debugLine="End Sub";
return "";
}
public static String  _panel1_ondown(float _x,float _y,Object _motionevent) throws Exception{
 //BA.debugLineNum = 175;BA.debugLine="Sub Panel1_onDown(X As Float, Y As Float, MotionEv";
 //BA.debugLineNum = 176;BA.debugLine="TouchDown = True";
_touchdown = anywheresoftware.b4a.keywords.Common.True;
 //BA.debugLineNum = 177;BA.debugLine="Log(\"***************************\")";
anywheresoftware.b4a.keywords.Common.LogImpl("39633794","***************************",0);
 //BA.debugLineNum = 178;BA.debugLine="Log(\"Panel1_onDown \" & gestures.getAction(MotionE";
anywheresoftware.b4a.keywords.Common.LogImpl("39633795","Panel1_onDown "+BA.NumberToString(mostCurrent._gestures.getAction((android.view.MotionEvent)(_motionevent)))+" : "+BA.NumberToString(_x)+", "+BA.NumberToString(_y),0);
 //BA.debugLineNum = 179;BA.debugLine="End Sub";
return "";
}
public static String  _panel1_ondrag(float _deltax,float _deltay,Object _motionevent) throws Exception{
 //BA.debugLineNum = 181;BA.debugLine="Sub Panel1_onDrag(deltaX As Float, deltaY As Float";
 //BA.debugLineNum = 182;BA.debugLine="If deltaX = 0 And deltaY = 0 Then Return";
if (_deltax==0 && _deltay==0) { 
if (true) return "";};
 //BA.debugLineNum = 183;BA.debugLine="Log(\"Panel1_onDrag \" & gestures.getAction(MotionE";
anywheresoftware.b4a.keywords.Common.LogImpl("39699330","Panel1_onDrag "+BA.NumberToString(mostCurrent._gestures.getAction((android.view.MotionEvent)(_motionevent)))+" : "+BA.NumberToString(_deltax)+", "+BA.NumberToString(_deltay),0);
 //BA.debugLineNum = 184;BA.debugLine="End Sub";
return "";
}
public static String  _panel1_onlongpress(float _x,float _y,Object _motionevent) throws Exception{
 //BA.debugLineNum = 186;BA.debugLine="Sub Panel1_onLongPress(X As Float, Y As Float, Mot";
 //BA.debugLineNum = 187;BA.debugLine="Log(\"Panel1_onLongPress \" & gestures.getAction(Mo";
anywheresoftware.b4a.keywords.Common.LogImpl("39764865","Panel1_onLongPress "+BA.NumberToString(mostCurrent._gestures.getAction((android.view.MotionEvent)(_motionevent)))+" : "+BA.NumberToString(_x)+", "+BA.NumberToString(_y),0);
 //BA.debugLineNum = 188;BA.debugLine="ScaleImageView1.BringToFront";
mostCurrent._scaleimageview1.BringToFront();
 //BA.debugLineNum = 189;BA.debugLine="End Sub";
return "";
}
public static String  _panel1_onpinchclose(float _newdistance,float _previousdistance,Object _motionevent) throws Exception{
 //BA.debugLineNum = 191;BA.debugLine="Sub Panel1_onPinchClose(NewDistance As Float, Prev";
 //BA.debugLineNum = 192;BA.debugLine="Log(\"Panel1_onPinchClose \" & gestures.getAction(M";
anywheresoftware.b4a.keywords.Common.LogImpl("39830401","Panel1_onPinchClose "+BA.NumberToString(mostCurrent._gestures.getAction((android.view.MotionEvent)(_motionevent)))+" : "+BA.NumberToString(_newdistance)+", "+BA.NumberToString(_previousdistance),0);
 //BA.debugLineNum = 193;BA.debugLine="End Sub";
return "";
}
public static String  _panel1_onpinchopen(float _newdistance,float _previousdistance,Object _motionevent) throws Exception{
 //BA.debugLineNum = 195;BA.debugLine="Sub Panel1_onPinchOpen(NewDistance As Float, Previ";
 //BA.debugLineNum = 196;BA.debugLine="Log(\"Panel1_onPinchOpen \" & gestures.getAction(Mo";
anywheresoftware.b4a.keywords.Common.LogImpl("39895937","Panel1_onPinchOpen "+BA.NumberToString(mostCurrent._gestures.getAction((android.view.MotionEvent)(_motionevent)))+" : "+BA.NumberToString(_newdistance)+", "+BA.NumberToString(_previousdistance),0);
 //BA.debugLineNum = 197;BA.debugLine="End Sub";
return "";
}
public static String  _panel1_onrotation(double _degrees,Object _motionevent) throws Exception{
 //BA.debugLineNum = 199;BA.debugLine="Sub Panel1_onRotation(Degrees As Double, MotionEve";
 //BA.debugLineNum = 200;BA.debugLine="Log(\"Panel1_onRotation \" & gestures.getAction(Mot";
anywheresoftware.b4a.keywords.Common.LogImpl("39961473","Panel1_onRotation "+BA.NumberToString(mostCurrent._gestures.getAction((android.view.MotionEvent)(_motionevent)))+" : "+BA.NumberToString(_degrees),0);
 //BA.debugLineNum = 201;BA.debugLine="End Sub";
return "";
}
public static String  _panel1_onscroll(float _distancex,float _distancey,Object _motionevent1,Object _motionevent2) throws Exception{
 //BA.debugLineNum = 203;BA.debugLine="Sub Panel1_onScroll(distanceX As Float, distanceY";
 //BA.debugLineNum = 204;BA.debugLine="Log(\"Panel1_onScroll \" & gestures.getAction(Motio";
anywheresoftware.b4a.keywords.Common.LogImpl("310027009","Panel1_onScroll "+BA.NumberToString(mostCurrent._gestures.getAction((android.view.MotionEvent)(_motionevent1)))+" "+BA.NumberToString(mostCurrent._gestures.getAction((android.view.MotionEvent)(_motionevent2)))+" : "+BA.NumberToString(_distancex)+", "+BA.NumberToString(_distancey),0);
 //BA.debugLineNum = 205;BA.debugLine="End Sub";
return "";
}
public static String  _panel1_onshowpress(float _x,float _y,Object _motionevent) throws Exception{
 //BA.debugLineNum = 207;BA.debugLine="Sub Panel1_onShowPress(X As Float, Y As Float, Mot";
 //BA.debugLineNum = 208;BA.debugLine="Log(\"Panel1_onShowPress \" & gestures.getAction(Mo";
anywheresoftware.b4a.keywords.Common.LogImpl("310092545","Panel1_onShowPress "+BA.NumberToString(mostCurrent._gestures.getAction((android.view.MotionEvent)(_motionevent)))+" : "+BA.NumberToString(_x)+", "+BA.NumberToString(_y),0);
 //BA.debugLineNum = 209;BA.debugLine="End Sub";
return "";
}
public static String  _panel1_onsingletapconfirmed(float _x,float _y,Object _motionevent) throws Exception{
 //BA.debugLineNum = 211;BA.debugLine="Sub Panel1_onSingleTapConfirmed(X As Float, Y As F";
 //BA.debugLineNum = 212;BA.debugLine="Log(\"Panel1_onSingleTapConfirmed \" & gestures.get";
anywheresoftware.b4a.keywords.Common.LogImpl("310158081","Panel1_onSingleTapConfirmed "+BA.NumberToString(mostCurrent._gestures.getAction((android.view.MotionEvent)(_motionevent)))+" : "+BA.NumberToString(_x)+", "+BA.NumberToString(_y),0);
 //BA.debugLineNum = 213;BA.debugLine="End Sub";
return "";
}
public static boolean  _panel1_ontouch(int _action,float _x,float _y,Object _motionevent) throws Exception{
 //BA.debugLineNum = 215;BA.debugLine="Sub Panel1_onTouch(Action As Int, X As Float, Y As";
 //BA.debugLineNum = 216;BA.debugLine="If Action = gestures.ACTION_UP Then";
if (_action==mostCurrent._gestures.ACTION_UP) { 
 //BA.debugLineNum = 217;BA.debugLine="TouchDown = False";
_touchdown = anywheresoftware.b4a.keywords.Common.False;
 //BA.debugLineNum = 218;BA.debugLine="Log(\"------------------------------------\")";
anywheresoftware.b4a.keywords.Common.LogImpl("310223619","------------------------------------",0);
 };
 //BA.debugLineNum = 220;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
 //BA.debugLineNum = 221;BA.debugLine="End Sub";
return false;
}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 9;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 12;BA.debugLine="Dim viewx As Int";
_viewx = 0;
 //BA.debugLineNum = 13;BA.debugLine="Dim viewy As Int";
_viewy = 0;
 //BA.debugLineNum = 14;BA.debugLine="Dim imagex As Int";
_imagex = 0;
 //BA.debugLineNum = 15;BA.debugLine="Dim imagey As Int";
_imagey = 0;
 //BA.debugLineNum = 17;BA.debugLine="End Sub";
return "";
}
public static String  _scaleimageview1_click() throws Exception{
agraham.b4a.scaleimageview.ScaleImageViewWrapper _siv = null;
String _msg = "";
 //BA.debugLineNum = 108;BA.debugLine="Sub ScaleImageView1_Click 'The user has tapped on";
 //BA.debugLineNum = 109;BA.debugLine="Dim siv As ScaleImageView = Sender";
_siv = new agraham.b4a.scaleimageview.ScaleImageViewWrapper();
_siv = (agraham.b4a.scaleimageview.ScaleImageViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new agraham.b4a.scaleimageview.ScaleImageViewWrapper(), (agraham.b4a.scaleimageview.ScaleImageViewWrapper.CircleView)(anywheresoftware.b4a.keywords.Common.Sender(mostCurrent.activityBA)));
 //BA.debugLineNum = 111;BA.debugLine="viewx =  siv.ClickViewX";
_viewx = (int) (_siv.getClickViewX());
 //BA.debugLineNum = 112;BA.debugLine="viewy =  siv.ClickViewY";
_viewy = (int) (_siv.getClickViewY());
 //BA.debugLineNum = 113;BA.debugLine="imagex =  siv.ClickImageX";
_imagex = (int) (_siv.getClickImageX());
 //BA.debugLineNum = 114;BA.debugLine="imagey =  siv.ClickImageY";
_imagey = (int) (_siv.getClickImageY());
 //BA.debugLineNum = 115;BA.debugLine="siv.Invalidate ' draw the new position";
_siv.Invalidate();
 //BA.debugLineNum = 116;BA.debugLine="Dim msg As String = \"Short: X=\" & viewx & \" Y=\" &";
_msg = "Short: X="+BA.NumberToString(_viewx)+" Y="+BA.NumberToString(_viewy);
 //BA.debugLineNum = 117;BA.debugLine="ToastMessageShow(msg, False)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence(_msg),anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 118;BA.debugLine="End Sub";
return "";
}
public static String  _scaleimageview1_longclick() throws Exception{
agraham.b4a.scaleimageview.ScaleImageViewWrapper _siv = null;
String _msg = "";
 //BA.debugLineNum = 120;BA.debugLine="Sub ScaleImageView1_LongClick 'The user has long p";
 //BA.debugLineNum = 121;BA.debugLine="Dim siv As ScaleImageView = Sender";
_siv = new agraham.b4a.scaleimageview.ScaleImageViewWrapper();
_siv = (agraham.b4a.scaleimageview.ScaleImageViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new agraham.b4a.scaleimageview.ScaleImageViewWrapper(), (agraham.b4a.scaleimageview.ScaleImageViewWrapper.CircleView)(anywheresoftware.b4a.keywords.Common.Sender(mostCurrent.activityBA)));
 //BA.debugLineNum = 123;BA.debugLine="viewx = siv.ClickViewX";
_viewx = (int) (_siv.getClickViewX());
 //BA.debugLineNum = 124;BA.debugLine="viewy = siv.ClickViewY";
_viewy = (int) (_siv.getClickViewY());
 //BA.debugLineNum = 125;BA.debugLine="imagex =  siv.ClickImageX";
_imagex = (int) (_siv.getClickImageX());
 //BA.debugLineNum = 126;BA.debugLine="imagey =  siv.ClickImageY";
_imagey = (int) (_siv.getClickImageY());
 //BA.debugLineNum = 127;BA.debugLine="Dim msg As String = \"Long: X=\" & imagex & \" Y=\" &";
_msg = "Long: X="+BA.NumberToString(_imagex)+" Y="+BA.NumberToString(_imagey);
 //BA.debugLineNum = 129;BA.debugLine="siv.CircleXPixels = imagex";
_siv.setCircleXPixels((float) (_imagex));
 //BA.debugLineNum = 130;BA.debugLine="siv.CircleYPixels = imagey";
_siv.setCircleYPixels((float) (_imagey));
 //BA.debugLineNum = 131;BA.debugLine="siv.Invalidate ' draw the new position";
_siv.Invalidate();
 //BA.debugLineNum = 132;BA.debugLine="ToastMessageShow(msg, False)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence(_msg),anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 133;BA.debugLine="Panel1.BringToFront";
mostCurrent._panel1.BringToFront();
 //BA.debugLineNum = 134;BA.debugLine="ToastMessageShow(\"Panel on\", False)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Panel on"),anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 136;BA.debugLine="End Sub";
return "";
}
public static String  _scaleimageview1_ondraw(anywheresoftware.b4a.objects.drawable.CanvasWrapper _viewcanvas) throws Exception{
agraham.b4a.scaleimageview.ScaleImageViewWrapper _siv = null;
float _x = 0f;
float _y = 0f;
float[] _viewxy = null;
float _radius = 0f;
float _tx = 0f;
float _ty = 0f;
 //BA.debugLineNum = 138;BA.debugLine="Sub ScaleImageView1_OnDraw(viewcanvas As Canvas) '";
 //BA.debugLineNum = 139;BA.debugLine="Dim siv As ScaleImageView = Sender";
_siv = new agraham.b4a.scaleimageview.ScaleImageViewWrapper();
_siv = (agraham.b4a.scaleimageview.ScaleImageViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new agraham.b4a.scaleimageview.ScaleImageViewWrapper(), (agraham.b4a.scaleimageview.ScaleImageViewWrapper.CircleView)(anywheresoftware.b4a.keywords.Common.Sender(mostCurrent.activityBA)));
 //BA.debugLineNum = 143;BA.debugLine="Dim x As Float = siv.CircleX * siv.SrcWidth";
_x = (float) (_siv.getCircleX()*_siv.getSrcWidth());
 //BA.debugLineNum = 144;BA.debugLine="Dim y As Float = siv.CircleY * siv.SrcHeight";
_y = (float) (_siv.getCircleY()*_siv.getSrcHeight());
 //BA.debugLineNum = 146;BA.debugLine="Dim viewxy() As Float = siv.SourceXYtoViewXY(x, y";
_viewxy = _siv.SourceXYtoViewXY((int) (_x),(int) (_y));
 //BA.debugLineNum = 147;BA.debugLine="Dim radius As Float = siv.CircleDrawnRadius";
_radius = _siv.getCircleDrawnRadius();
 //BA.debugLineNum = 149;BA.debugLine="Dim tx As Float = viewxy(0) + radius*1.2";
_tx = (float) (_viewxy[(int) (0)]+_radius*1.2);
 //BA.debugLineNum = 150;BA.debugLine="Dim ty As Float = viewxy(1)";
_ty = _viewxy[(int) (1)];
 //BA.debugLineNum = 151;BA.debugLine="viewcanvas.DrawText(\"Some Text\", tx , ty, Typefac";
_viewcanvas.DrawText(mostCurrent.activityBA,"Some Text",_tx,_ty,anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT,(float) (20),anywheresoftware.b4a.keywords.Common.Colors.Black,BA.getEnumFromString(android.graphics.Paint.Align.class,"LEFT"));
 //BA.debugLineNum = 153;BA.debugLine="viewxy = siv.SourceXYtoViewXY(imagex, imagey )";
_viewxy = _siv.SourceXYtoViewXY(_imagex,_imagey);
 //BA.debugLineNum = 154;BA.debugLine="viewcanvas.DrawLine(viewxy(0) - radius, viewxy(1)";
_viewcanvas.DrawLine((float) (_viewxy[(int) (0)]-_radius),_viewxy[(int) (1)],(float) (_viewxy[(int) (0)]+_radius),_viewxy[(int) (1)],anywheresoftware.b4a.keywords.Common.Colors.Black,(float) (_siv.getCircleWidth()*_radius/(double)2));
 //BA.debugLineNum = 155;BA.debugLine="viewcanvas.DrawLine(viewxy(0), viewxy(1) - radius";
_viewcanvas.DrawLine(_viewxy[(int) (0)],(float) (_viewxy[(int) (1)]-_radius),_viewxy[(int) (0)],(float) (_viewxy[(int) (1)]+_radius),anywheresoftware.b4a.keywords.Common.Colors.Black,(float) (_siv.getCircleWidth()*_radius/(double)2));
 //BA.debugLineNum = 156;BA.debugLine="viewcanvas.DrawCircle(viewxy(0), viewxy(1), radiu";
_viewcanvas.DrawCircle(_viewxy[(int) (0)],_viewxy[(int) (1)],_radius,anywheresoftware.b4a.keywords.Common.Colors.Red,anywheresoftware.b4a.keywords.Common.False,(float) (_siv.getCircleWidth()*_radius));
 //BA.debugLineNum = 157;BA.debugLine="End Sub";
return "";
}
}
