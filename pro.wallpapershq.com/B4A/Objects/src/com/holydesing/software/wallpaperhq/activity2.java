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

public class activity2 extends Activity implements B4AActivity{
	public static activity2 mostCurrent;
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
			processBA = new BA(this.getApplicationContext(), null, null, "com.holydesing.software.wallpaperhq", "com.holydesing.software.wallpaperhq.activity2");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (activity2).");
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
		activityBA = new BA(this, layout, processBA, "com.holydesing.software.wallpaperhq", "com.holydesing.software.wallpaperhq.activity2");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "com.holydesing.software.wallpaperhq.activity2", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (activity2) Create " + (isFirst ? "(first time)" : "") + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (activity2) Resume **");
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
		return activity2.class;
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
            BA.LogInfo("** Activity (activity2) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
        else
            BA.LogInfo("** Activity (activity2) Pause event (activity is not paused). **");
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
            activity2 mc = mostCurrent;
			if (mc == null || mc != activity.get())
				return;
			processBA.setActivityPaused(false);
            BA.LogInfo("** Activity (activity2) Resume **");
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
public static anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _mbmp = null;
public static String _imagedata = "";
public com.holydesing.software.wallpaperhq.simplemediamanager _mediamanager = null;
public anywheresoftware.b4a.objects.ButtonWrapper _button1 = null;
public anywheresoftware.b4a.objects.ButtonWrapper _button2 = null;
public anywheresoftware.b4a.objects.PanelWrapper _panelimageview = null;
public b4a.example.dateutils _dateutils = null;
public com.holydesing.software.wallpaperhq.main _main = null;
public com.holydesing.software.wallpaperhq.starter _starter = null;
public com.holydesing.software.wallpaperhq.themecolors _themecolors = null;
public com.holydesing.software.wallpaperhq.viewer _viewer = null;
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
 //BA.debugLineNum = 19;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
 //BA.debugLineNum = 21;BA.debugLine="Activity.LoadLayout(\"ImageViewer.bal\")";
mostCurrent._activity.LoadLayout("ImageViewer.bal",mostCurrent.activityBA);
 //BA.debugLineNum = 23;BA.debugLine="MediaManager.Initialize";
mostCurrent._mediamanager._initialize /*String*/ (mostCurrent.activityBA);
 //BA.debugLineNum = 25;BA.debugLine="If mBmp.IsInitialized Then";
if (_mbmp.IsInitialized()) { 
 //BA.debugLineNum = 26;BA.debugLine="Activity.SetBackgroundImage(mBmp)";
mostCurrent._activity.SetBackgroundImageNew((android.graphics.Bitmap)(_mbmp.getObject()));
 };
 //BA.debugLineNum = 29;BA.debugLine="End Sub";
return "";
}
public static String  _button1_click() throws Exception{
 //BA.debugLineNum = 38;BA.debugLine="Private Sub Button1_Click";
 //BA.debugLineNum = 39;BA.debugLine="If mBmp.IsInitialized Then";
if (_mbmp.IsInitialized()) { 
 //BA.debugLineNum = 40;BA.debugLine="SetWallPaper(mBmp)";
_setwallpaper(_mbmp);
 };
 //BA.debugLineNum = 42;BA.debugLine="End Sub";
return "";
}
public static String  _button2_click() throws Exception{
 //BA.debugLineNum = 75;BA.debugLine="Private Sub Button2_Click";
 //BA.debugLineNum = 76;BA.debugLine="If mBmp.IsInitialized Then";
if (_mbmp.IsInitialized()) { 
 //BA.debugLineNum = 77;BA.debugLine="Button2.visible = False";
mostCurrent._button2.setVisible(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 78;BA.debugLine="SaveBitmapToFile(mBmp, \"Wallp\")";
_savebitmaptofile(_mbmp,"Wallp");
 };
 //BA.debugLineNum = 80;BA.debugLine="End Sub";
return "";
}
public static String  _globals() throws Exception{
 //BA.debugLineNum = 12;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 13;BA.debugLine="Private MediaManager As SimpleMediaManager";
mostCurrent._mediamanager = new com.holydesing.software.wallpaperhq.simplemediamanager();
 //BA.debugLineNum = 14;BA.debugLine="Private Button1 As Button";
mostCurrent._button1 = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 15;BA.debugLine="Private Button2 As Button";
mostCurrent._button2 = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 16;BA.debugLine="Private PanelImageView As Panel";
mostCurrent._panelimageview = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 17;BA.debugLine="End Sub";
return "";
}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 7;BA.debugLine="Private mBmp As Bitmap";
_mbmp = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
 //BA.debugLineNum = 8;BA.debugLine="Public ImageData As String";
_imagedata = "";
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return "";
}
public static String  _savebitmaptofile(anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _bitmap,String _filename) throws Exception{
long _num = 0L;
anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper _out = null;
String _exeption = "";
 //BA.debugLineNum = 82;BA.debugLine="Sub SaveBitmapToFile(bitmap As Bitmap, filename As";
 //BA.debugLineNum = 83;BA.debugLine="Try";
try { //BA.debugLineNum = 85;BA.debugLine="ToastMessageShow(\"Wallpaper Has been saved!\", Fa";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Wallpaper Has been saved!"),anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 88;BA.debugLine="If File.Exists(Main.DownloadedWallpapers, \"\") =";
if (anywheresoftware.b4a.keywords.Common.File.Exists(mostCurrent._main._downloadedwallpapers /*String*/ ,"")==anywheresoftware.b4a.keywords.Common.False) { 
 //BA.debugLineNum = 89;BA.debugLine="File.MakeDir(Main.DownloadedWallpapers, \"\")";
anywheresoftware.b4a.keywords.Common.File.MakeDir(mostCurrent._main._downloadedwallpapers /*String*/ ,"");
 };
 //BA.debugLineNum = 92;BA.debugLine="Dim num As Long";
_num = 0L;
 //BA.debugLineNum = 93;BA.debugLine="num = Rnd(100, 1000000)";
_num = (long) (anywheresoftware.b4a.keywords.Common.Rnd((int) (100),(int) (1000000)));
 //BA.debugLineNum = 96;BA.debugLine="Dim out As OutputStream = File.OpenOutput(Main.D";
_out = new anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper();
_out = anywheresoftware.b4a.keywords.Common.File.OpenOutput(mostCurrent._main._downloadedwallpapers /*String*/ ,_filename+BA.NumberToString(_num),anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 97;BA.debugLine="bitmap.WriteToStream(out, 100, \"PNG\")";
_bitmap.WriteToStream((java.io.OutputStream)(_out.getObject()),(int) (100),BA.getEnumFromString(android.graphics.Bitmap.CompressFormat.class,"PNG"));
 //BA.debugLineNum = 98;BA.debugLine="out.Close";
_out.Close();
 } 
       catch (Exception e12) {
			processBA.setLastException(e12); //BA.debugLineNum = 101;BA.debugLine="Dim Exeption As String =LastException";
_exeption = BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA));
 //BA.debugLineNum = 102;BA.debugLine="Log(Exeption)";
anywheresoftware.b4a.keywords.Common.LogImpl("35505044",_exeption,0);
 //BA.debugLineNum = 103;BA.debugLine="ToastMessageShow(Exeption, True)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence(_exeption),anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 104;BA.debugLine="Button2.visible = True";
mostCurrent._button2.setVisible(anywheresoftware.b4a.keywords.Common.True);
 };
 //BA.debugLineNum = 106;BA.debugLine="End Sub";
return "";
}
public static void  _setwallpaper(anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _bmp) throws Exception{
ResumableSub_SetWallPaper rsub = new ResumableSub_SetWallPaper(null,_bmp);
rsub.resume(processBA, null);
}
public static class ResumableSub_SetWallPaper extends BA.ResumableSub {
public ResumableSub_SetWallPaper(com.holydesing.software.wallpaperhq.activity2 parent,anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _bmp) {
this.parent = parent;
this._bmp = _bmp;
}
com.holydesing.software.wallpaperhq.activity2 parent;
anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _bmp;
anywheresoftware.b4a.agraham.reflection.Reflection _r = null;
String _exeption = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 60;BA.debugLine="Try";
if (true) break;

case 1:
//try
this.state = 6;
this.catchState = 5;
this.state = 3;
if (true) break;

case 3:
//C
this.state = 6;
this.catchState = 5;
 //BA.debugLineNum = 61;BA.debugLine="Dim r As Reflector";
_r = new anywheresoftware.b4a.agraham.reflection.Reflection();
 //BA.debugLineNum = 62;BA.debugLine="r.Target = r.RunStaticMethod(\"android.app.Wallpa";
_r.Target = _r.RunStaticMethod("android.app.WallpaperManager","getInstance",new Object[]{(Object)(_r.GetContext(processBA))},new String[]{"android.content.Context"});
 //BA.debugLineNum = 64;BA.debugLine="r.RunMethod4(\"setBitmap\", Array As Object(Bmp),";
_r.RunMethod4("setBitmap",new Object[]{(Object)(_bmp.getObject())},new String[]{"android.graphics.Bitmap"});
 //BA.debugLineNum = 65;BA.debugLine="ToastMessageShow(\"The wallpaper has been set Suc";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("The wallpaper has been set Successfully."),anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 66;BA.debugLine="Sleep(500)";
anywheresoftware.b4a.keywords.Common.Sleep(processBA,this,(int) (500));
this.state = 7;
return;
case 7:
//C
this.state = 6;
;
 //BA.debugLineNum = 67;BA.debugLine="Activity.Finish()";
parent.mostCurrent._activity.Finish();
 if (true) break;

case 5:
//C
this.state = 6;
this.catchState = 0;
 //BA.debugLineNum = 69;BA.debugLine="Dim Exeption As String =LastException";
_exeption = BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA));
 //BA.debugLineNum = 70;BA.debugLine="Log(Exeption)";
anywheresoftware.b4a.keywords.Common.LogImpl("35373963",_exeption,0);
 //BA.debugLineNum = 71;BA.debugLine="ToastMessageShow(Exeption, True)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence(_exeption),anywheresoftware.b4a.keywords.Common.True);
 if (true) break;
if (true) break;

case 6:
//C
this.state = -1;
this.catchState = 0;
;
 //BA.debugLineNum = 73;BA.debugLine="End Sub";
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
processBA.setLastException(e0);}
            }
        }
    }
}
public static void  _setzoomimageviewmedia(anywheresoftware.b4a.objects.B4XViewWrapper _panel,String _url,int _backgroundcolor) throws Exception{
ResumableSub_SetZoomImageViewMedia rsub = new ResumableSub_SetZoomImageViewMedia(null,_panel,_url,_backgroundcolor);
rsub.resume(processBA, null);
}
public static class ResumableSub_SetZoomImageViewMedia extends BA.ResumableSub {
public ResumableSub_SetZoomImageViewMedia(com.holydesing.software.wallpaperhq.activity2 parent,anywheresoftware.b4a.objects.B4XViewWrapper _panel,String _url,int _backgroundcolor) {
this.parent = parent;
this._panel = _panel;
this._url = _url;
this._backgroundcolor = _backgroundcolor;
}
com.holydesing.software.wallpaperhq.activity2 parent;
anywheresoftware.b4a.objects.B4XViewWrapper _panel;
String _url;
int _backgroundcolor;
boolean _success = false;
com.holydesing.software.wallpaperhq.simplemediamanager._smmedia _media = null;
com.holydesing.software.wallpaperhq.zoomimageview _zv = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 45;BA.debugLine="Try";
if (true) break;

case 1:
//try
this.state = 10;
this.catchState = 9;
this.state = 3;
if (true) break;

case 3:
//C
this.state = 4;
this.catchState = 9;
 //BA.debugLineNum = 46;BA.debugLine="MediaManager.SetMediaWithExtra(Panel, Url, \"\", C";
parent.mostCurrent._mediamanager._setmediawithextra /*String*/ (_panel,_url,"",anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)(parent.mostCurrent._mediamanager._request_resize_mode /*String*/ ),(Object)("FILL_NO_DISTORTIONS"),(Object)(parent.mostCurrent._mediamanager._request_callback /*String*/ ),activity2.getObject(),(Object)(parent.mostCurrent._mediamanager._request_zoomimageview /*String*/ ),(Object)(anywheresoftware.b4a.keywords.Common.True),(Object)(parent.mostCurrent._mediamanager._request_background /*String*/ ),(Object)(_backgroundcolor)}));
 //BA.debugLineNum = 48;BA.debugLine="Wait For (Panel) SMM_MediaReady (Success As Bool";
anywheresoftware.b4a.keywords.Common.WaitFor("smm_mediaready", processBA, this, (Object)(_panel.getObject()));
this.state = 11;
return;
case 11:
//C
this.state = 4;
_success = (Boolean) result[0];
_media = (com.holydesing.software.wallpaperhq.simplemediamanager._smmedia) result[1];
;
 //BA.debugLineNum = 49;BA.debugLine="If Success Then";
if (true) break;

case 4:
//if
this.state = 7;
if (_success) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 //BA.debugLineNum = 50;BA.debugLine="Dim zv As ZoomImageView = Panel.GetView(0).Tag";
_zv = (com.holydesing.software.wallpaperhq.zoomimageview)(_panel.GetView((int) (0)).getTag());
 //BA.debugLineNum = 51;BA.debugLine="zv.pnlBackground.Color = BackgroundColor";
_zv._pnlbackground /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setColor(_backgroundcolor);
 //BA.debugLineNum = 52;BA.debugLine="zv.mBase.Color = BackgroundColor";
_zv._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setColor(_backgroundcolor);
 if (true) break;

case 7:
//C
this.state = 10;
;
 if (true) break;

case 9:
//C
this.state = 10;
this.catchState = 0;
 //BA.debugLineNum = 55;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("35308427",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
 if (true) break;
if (true) break;

case 10:
//C
this.state = -1;
this.catchState = 0;
;
 //BA.debugLineNum = 57;BA.debugLine="End Sub";
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
processBA.setLastException(e0);}
            }
        }
    }
}
public static void  _smm_mediaready(boolean _success,com.holydesing.software.wallpaperhq.simplemediamanager._smmedia _media) throws Exception{
}
public static String  _showimage(String _imgdat) throws Exception{
 //BA.debugLineNum = 31;BA.debugLine="Sub ShowImage(ImgDat As String)";
 //BA.debugLineNum = 32;BA.debugLine="ImageData = ImgDat";
_imagedata = _imgdat;
 //BA.debugLineNum = 35;BA.debugLine="SetZoomImageViewMedia(PanelImageView, ImgDat, Col";
_setzoomimageviewmedia((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(mostCurrent._panelimageview.getObject())),_imgdat,anywheresoftware.b4a.keywords.Common.Colors.ARGB((int) (255),(int) (40),(int) (42),(int) (54)));
 //BA.debugLineNum = 36;BA.debugLine="End Sub";
return "";
}
}
