package com.holydesing.software.wallpaperhq;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class imageviewerb4x extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "com.holydesing.software.wallpaperhq.imageviewerb4x");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", com.holydesing.software.wallpaperhq.imageviewerb4x.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _root = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public String _imagedata = "";
public String _wallpaperid = "";
public agraham.b4a.scaleimageview.ScaleImageViewWrapper _scaleimageview1 = null;
public anywheresoftware.b4a.objects.PanelWrapper _panel1 = null;
public flm.b4a.gesturedetector.GestureDetectorForB4A _gestures = null;
public boolean _touchdown = false;
public int _viewx = 0;
public int _viewy = 0;
public int _imagex = 0;
public int _imagey = 0;
public String _viewertitle = "";
public float _viewerx = 0f;
public float _viewery = 0f;
public float _viewerzoom = 0f;
public float _circlex = 0f;
public float _circley = 0f;
public anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _fullimage = null;
public com.holydesing.software.wallpaperhq.b4xloadingindicator _b4xloadingindicator1 = null;
public anywheresoftware.b4a.objects.ButtonWrapper _button1 = null;
public anywheresoftware.b4a.objects.ButtonWrapper _button3 = null;
public anywheresoftware.b4a.objects.ButtonWrapper _button2 = null;
public anywheresoftware.b4a.objects.ButtonWrapper _button4 = null;
public String _popupitemsethome = "";
public String _popupitemsetlock = "";
public String _popupitemsetboth = "";
public String _popupitemmorelike = "";
public String _popupitemshare = "";
public com.holydesing.software.wallpaperhq.mypopup _popexample = null;
public com.holydesing.software.wallpaperhq.fileprovider _provider = null;
public b4a.example.dateutils _dateutils = null;
public com.holydesing.software.wallpaperhq.main _main = null;
public com.holydesing.software.wallpaperhq.starter _starter = null;
public com.holydesing.software.wallpaperhq.activity2 _activity2 = null;
public com.holydesing.software.wallpaperhq.themecolors _themecolors = null;
public com.holydesing.software.wallpaperhq.viewer _viewer = null;
public com.holydesing.software.wallpaperhq.b4xpages _b4xpages = null;
public com.holydesing.software.wallpaperhq.b4xcollections _b4xcollections = null;
public com.holydesing.software.wallpaperhq.httputils2service _httputils2service = null;
public com.holydesing.software.wallpaperhq.xuiviewsutils _xuiviewsutils = null;
public String  _b4xpage_created(anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
 //BA.debugLineNum = 56;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
 //BA.debugLineNum = 57;BA.debugLine="Root = Root1";
_root = _root1;
 //BA.debugLineNum = 60;BA.debugLine="Root.LoadLayout(\"Viewer\")";
_root.LoadLayout("Viewer",ba);
 //BA.debugLineNum = 64;BA.debugLine="B4XPages.GetManager.ShowUpIndicator = False";
_b4xpages._getmanager /*com.holydesing.software.wallpaperhq.b4xpagesmanager*/ (ba)._showupindicator /*boolean*/  = __c.False;
 //BA.debugLineNum = 65;BA.debugLine="Provider.Initialize";
_provider._initialize /*String*/ (ba);
 //BA.debugLineNum = 67;BA.debugLine="popExample.Initialize( Root, Me, \"popExample\", Ar";
_popexample._initialize /*String*/ (ba,_root,this,"popExample",anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{_popupitemsethome,_popupitemsetlock,_popupitemsetboth,_popupitemmorelike,_popupitemshare}),__c.PerXToCurrent((float) (100),ba),__c.PerYToCurrent((float) (100),ba),(anywheresoftware.b4a.keywords.constants.TypefaceWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.constants.TypefaceWrapper(), (android.graphics.Typeface)(__c.Typeface.getFONTAWESOME())));
 //BA.debugLineNum = 68;BA.debugLine="End Sub";
return "";
}
public String  _button1_click() throws Exception{
 //BA.debugLineNum = 317;BA.debugLine="Private Sub Button1_Click";
 //BA.debugLineNum = 318;BA.debugLine="B4XPages.ClosePage(Me)";
_b4xpages._closepage /*String*/ (ba,this);
 //BA.debugLineNum = 319;BA.debugLine="End Sub";
return "";
}
public String  _button2_click() throws Exception{
 //BA.debugLineNum = 321;BA.debugLine="Private Sub Button2_Click";
 //BA.debugLineNum = 323;BA.debugLine="popExample.Show(Button2)";
_popexample._show /*String*/ ((anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(_button2.getObject())));
 //BA.debugLineNum = 325;BA.debugLine="End Sub";
return "";
}
public String  _button3_click() throws Exception{
String _filename = "";
 //BA.debugLineNum = 399;BA.debugLine="Private Sub Button3_Click";
 //BA.debugLineNum = 400;BA.debugLine="Try";
try { //BA.debugLineNum = 401;BA.debugLine="Button3.visible = False";
_button3.setVisible(__c.False);
 //BA.debugLineNum = 402;BA.debugLine="Dim FileName As String = WallpaperID & \".jpg\"";
_filename = _wallpaperid+".jpg";
 //BA.debugLineNum = 404;BA.debugLine="If File.Exists(Main.DownloadedWallpapers, FileNa";
if (__c.File.Exists(_main._downloadedwallpapers /*String*/ ,_filename)==__c.True) { 
 //BA.debugLineNum = 405;BA.debugLine="File.Delete(Main.DownloadedWallpapers, FileName";
__c.File.Delete(_main._downloadedwallpapers /*String*/ ,_filename);
 };
 //BA.debugLineNum = 408;BA.debugLine="DownloadWallpaper(FullImage, FileName)";
_downloadwallpaper(_fullimage,_filename);
 } 
       catch (Exception e9) {
			ba.setLastException(e9); //BA.debugLineNum = 411;BA.debugLine="Log(LastException)";
__c.LogImpl("34194316",BA.ObjectToString(__c.LastException(ba)),0);
 //BA.debugLineNum = 412;BA.debugLine="ToastMessageShow(LastException, False)";
__c.ToastMessageShow(BA.ObjectToCharSequence(__c.LastException(ba).getObject()),__c.False);
 };
 //BA.debugLineNum = 414;BA.debugLine="End Sub";
return "";
}
public String  _button4_click() throws Exception{
 //BA.debugLineNum = 433;BA.debugLine="Private Sub Button4_Click";
 //BA.debugLineNum = 434;BA.debugLine="Try";
try { //BA.debugLineNum = 435;BA.debugLine="If File.Exists(Main.DownloadedWallpapers, ImageD";
if (__c.File.Exists(_main._downloadedwallpapers /*String*/ ,_imagedata)==__c.True) { 
 //BA.debugLineNum = 436;BA.debugLine="File.Delete(Main.DownloadedWallpapers, ImageDat";
__c.File.Delete(_main._downloadedwallpapers /*String*/ ,_imagedata);
 };
 //BA.debugLineNum = 438;BA.debugLine="B4XPages.MainPage.ListSaved";
_b4xpages._mainpage /*com.holydesing.software.wallpaperhq.b4xmainpage*/ (ba)._listsaved /*String*/ ();
 //BA.debugLineNum = 439;BA.debugLine="B4XPages.ClosePage(Me)";
_b4xpages._closepage /*String*/ (ba,this);
 } 
       catch (Exception e8) {
			ba.setLastException(e8); //BA.debugLineNum = 441;BA.debugLine="Log(LastException)";
__c.LogImpl("34325384",BA.ObjectToString(__c.LastException(ba)),0);
 //BA.debugLineNum = 442;BA.debugLine="ToastMessageShow(LastException, False)";
__c.ToastMessageShow(BA.ObjectToCharSequence(__c.LastException(ba).getObject()),__c.False);
 };
 //BA.debugLineNum = 444;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private Root As B4XView 'ignore";
_root = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 3;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 5;BA.debugLine="Public ImageData As String";
_imagedata = "";
 //BA.debugLineNum = 6;BA.debugLine="Public WallpaperID As String";
_wallpaperid = "";
 //BA.debugLineNum = 8;BA.debugLine="Private ScaleImageView1 As ScaleImageView";
_scaleimageview1 = new agraham.b4a.scaleimageview.ScaleImageViewWrapper();
 //BA.debugLineNum = 9;BA.debugLine="Private Panel1 As Panel";
_panel1 = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 11;BA.debugLine="Private gestures As GestureDetector";
_gestures = new flm.b4a.gesturedetector.GestureDetectorForB4A();
 //BA.debugLineNum = 13;BA.debugLine="Private TouchDown As Boolean = False";
_touchdown = __c.False;
 //BA.debugLineNum = 15;BA.debugLine="Dim viewx As Int";
_viewx = 0;
 //BA.debugLineNum = 16;BA.debugLine="Dim viewy As Int";
_viewy = 0;
 //BA.debugLineNum = 17;BA.debugLine="Dim imagex As Int";
_imagex = 0;
 //BA.debugLineNum = 18;BA.debugLine="Dim imagey As Int";
_imagey = 0;
 //BA.debugLineNum = 20;BA.debugLine="Public	 ViewerTitle As String = \"Viewer\"";
_viewertitle = "Viewer";
 //BA.debugLineNum = 23;BA.debugLine="Public ViewerX As Float = 0.5 ' Easting of map po";
_viewerx = (float) (0.5);
 //BA.debugLineNum = 24;BA.debugLine="Public ViewerY As Float = 0.5 ' Northing of map p";
_viewery = (float) (0.5);
 //BA.debugLineNum = 25;BA.debugLine="Public ViewerZoom As Float = 2 ' Zoom level to op";
_viewerzoom = (float) (2);
 //BA.debugLineNum = 26;BA.debugLine="Public CircleX As Float = 0.5 ' Easting of circle";
_circlex = (float) (0.5);
 //BA.debugLineNum = 27;BA.debugLine="Public CircleY As Float = 0.5 ' Northing of circl";
_circley = (float) (0.5);
 //BA.debugLineNum = 29;BA.debugLine="Private FullImage As Bitmap";
_fullimage = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
 //BA.debugLineNum = 30;BA.debugLine="Private B4XLoadingIndicator1 As B4XLoadingIndicat";
_b4xloadingindicator1 = new com.holydesing.software.wallpaperhq.b4xloadingindicator();
 //BA.debugLineNum = 31;BA.debugLine="Private Button1 As Button";
_button1 = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 32;BA.debugLine="Private Button3 As Button";
_button3 = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 33;BA.debugLine="Private Button2 As Button";
_button2 = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 34;BA.debugLine="Private Button4 As Button";
_button4 = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 39;BA.debugLine="Dim const popupItemSetHome As String = Chr(0xF015";
_popupitemsethome = BA.ObjectToString(__c.Chr(((int)0xf015)))+" Home screen";
 //BA.debugLineNum = 40;BA.debugLine="Dim const popupItemSetLock As String = Chr(0xF023";
_popupitemsetlock = BA.ObjectToString(__c.Chr(((int)0xf023)))+" Lock screen";
 //BA.debugLineNum = 41;BA.debugLine="Dim const popupItemSetBoth As String = Chr(0xF10B";
_popupitemsetboth = BA.ObjectToString(__c.Chr(((int)0xf10b)))+" Both";
 //BA.debugLineNum = 42;BA.debugLine="Dim const popupItemMoreLike As String = Chr(0xF00";
_popupitemmorelike = BA.ObjectToString(__c.Chr(((int)0xf004)))+" More like this";
 //BA.debugLineNum = 43;BA.debugLine="Dim const popupItemShare As String = Chr(0xF1E1)";
_popupitemshare = BA.ObjectToString(__c.Chr(((int)0xf1e1)))+" Share";
 //BA.debugLineNum = 45;BA.debugLine="Dim popExample As myPopup";
_popexample = new com.holydesing.software.wallpaperhq.mypopup();
 //BA.debugLineNum = 46;BA.debugLine="Public Provider As FileProvider";
_provider = new com.holydesing.software.wallpaperhq.fileprovider();
 //BA.debugLineNum = 47;BA.debugLine="End Sub";
return "";
}
public String  _downloadwallpaper(anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _bmp,String _filenameex) throws Exception{
anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper _out = null;
String _exeption = "";
 //BA.debugLineNum = 417;BA.debugLine="Sub DownloadWallpaper(Bmp As Bitmap, FilenameEx As";
 //BA.debugLineNum = 418;BA.debugLine="Try";
try { //BA.debugLineNum = 419;BA.debugLine="Dim out As OutputStream = File.OpenOutput(Main.D";
_out = new anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper();
_out = __c.File.OpenOutput(_main._downloadedwallpapers /*String*/ ,_filenameex,__c.False);
 //BA.debugLineNum = 420;BA.debugLine="Bmp.WriteToStream(out, 100, \"JPEG\")";
_bmp.WriteToStream((java.io.OutputStream)(_out.getObject()),(int) (100),BA.getEnumFromString(android.graphics.Bitmap.CompressFormat.class,"JPEG"));
 //BA.debugLineNum = 421;BA.debugLine="out.Close";
_out.Close();
 //BA.debugLineNum = 423;BA.debugLine="ToastMessageShow(\"Wallpaper Has been saved!\", Fa";
__c.ToastMessageShow(BA.ObjectToCharSequence("Wallpaper Has been saved!"),__c.False);
 } 
       catch (Exception e7) {
			ba.setLastException(e7); //BA.debugLineNum = 425;BA.debugLine="Dim Exeption As String =LastException";
_exeption = BA.ObjectToString(__c.LastException(ba));
 //BA.debugLineNum = 426;BA.debugLine="Log(Exeption)";
__c.LogImpl("34259849",_exeption,0);
 //BA.debugLineNum = 427;BA.debugLine="ToastMessageShow(Exeption, True)";
__c.ToastMessageShow(BA.ObjectToCharSequence(_exeption),__c.True);
 //BA.debugLineNum = 428;BA.debugLine="Button3.visible = True";
_button3.setVisible(__c.True);
 };
 //BA.debugLineNum = 430;BA.debugLine="End Sub";
return "";
}
public String  _getfileid() throws Exception{
String[] _strsplit = null;
String _svfilenameex = "";
String _filename = "";
 //BA.debugLineNum = 446;BA.debugLine="Private Sub GetFileID As String";
 //BA.debugLineNum = 447;BA.debugLine="Try";
try { //BA.debugLineNum = 448;BA.debugLine="Dim strSplit() As String = Regex.Split(\"/\",Image";
_strsplit = __c.Regex.Split("/",_imagedata);
 //BA.debugLineNum = 449;BA.debugLine="Dim SvFilenameEx As String = strSplit(strSplit.L";
_svfilenameex = _strsplit[(int) (_strsplit.length-1)].replace("wallhaven","");
 //BA.debugLineNum = 450;BA.debugLine="Dim FileName As String = SvFilenameEx.Replace(\"-";
_filename = _svfilenameex.replace("-","").replace(".jpg","");
 //BA.debugLineNum = 452;BA.debugLine="Return FileName";
if (true) return _filename;
 } 
       catch (Exception e7) {
			ba.setLastException(e7); //BA.debugLineNum = 454;BA.debugLine="Log(LastException)";
__c.LogImpl("34390920",BA.ObjectToString(__c.LastException(ba)),0);
 //BA.debugLineNum = 455;BA.debugLine="Return \"Error\"";
if (true) return "Error";
 };
 //BA.debugLineNum = 457;BA.debugLine="End Sub";
return "";
}
public Object  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 50;BA.debugLine="Public Sub Initialize As Object";
 //BA.debugLineNum = 52;BA.debugLine="Return Me";
if (true) return this;
 //BA.debugLineNum = 53;BA.debugLine="End Sub";
return null;
}
public String  _panel1_ondoubletap(float _x,float _y,Object _motionevent) throws Exception{
 //BA.debugLineNum = 264;BA.debugLine="Sub Panel1_onDoubleTap(X As Float, Y As Float, Mot";
 //BA.debugLineNum = 266;BA.debugLine="End Sub";
return "";
}
public String  _panel1_ondown(float _x,float _y,Object _motionevent) throws Exception{
 //BA.debugLineNum = 268;BA.debugLine="Sub Panel1_onDown(X As Float, Y As Float, MotionEv";
 //BA.debugLineNum = 269;BA.debugLine="TouchDown = True";
_touchdown = __c.True;
 //BA.debugLineNum = 272;BA.debugLine="End Sub";
return "";
}
public String  _panel1_ondrag(float _deltax,float _deltay,Object _motionevent) throws Exception{
 //BA.debugLineNum = 274;BA.debugLine="Sub Panel1_onDrag(deltaX As Float, deltaY As Float";
 //BA.debugLineNum = 275;BA.debugLine="If deltaX = 0 And deltaY = 0 Then Return";
if (_deltax==0 && _deltay==0) { 
if (true) return "";};
 //BA.debugLineNum = 277;BA.debugLine="End Sub";
return "";
}
public String  _panel1_onlongpress(float _x,float _y,Object _motionevent) throws Exception{
 //BA.debugLineNum = 279;BA.debugLine="Sub Panel1_onLongPress(X As Float, Y As Float, Mot";
 //BA.debugLineNum = 281;BA.debugLine="ScaleImageView1.BringToFront";
_scaleimageview1.BringToFront();
 //BA.debugLineNum = 282;BA.debugLine="End Sub";
return "";
}
public String  _panel1_onpinchclose(float _newdistance,float _previousdistance,Object _motionevent) throws Exception{
 //BA.debugLineNum = 284;BA.debugLine="Sub Panel1_onPinchClose(NewDistance As Float, Prev";
 //BA.debugLineNum = 286;BA.debugLine="End Sub";
return "";
}
public String  _panel1_onpinchopen(float _newdistance,float _previousdistance,Object _motionevent) throws Exception{
 //BA.debugLineNum = 288;BA.debugLine="Sub Panel1_onPinchOpen(NewDistance As Float, Previ";
 //BA.debugLineNum = 290;BA.debugLine="End Sub";
return "";
}
public String  _panel1_onrotation(double _degrees,Object _motionevent) throws Exception{
 //BA.debugLineNum = 292;BA.debugLine="Sub Panel1_onRotation(Degrees As Double, MotionEve";
 //BA.debugLineNum = 294;BA.debugLine="End Sub";
return "";
}
public String  _panel1_onscroll(float _distancex,float _distancey,Object _motionevent1,Object _motionevent2) throws Exception{
 //BA.debugLineNum = 296;BA.debugLine="Sub Panel1_onScroll(distanceX As Float, distanceY";
 //BA.debugLineNum = 298;BA.debugLine="End Sub";
return "";
}
public String  _panel1_onshowpress(float _x,float _y,Object _motionevent) throws Exception{
 //BA.debugLineNum = 300;BA.debugLine="Sub Panel1_onShowPress(X As Float, Y As Float, Mot";
 //BA.debugLineNum = 302;BA.debugLine="End Sub";
return "";
}
public String  _panel1_onsingletapconfirmed(float _x,float _y,Object _motionevent) throws Exception{
 //BA.debugLineNum = 304;BA.debugLine="Sub Panel1_onSingleTapConfirmed(X As Float, Y As F";
 //BA.debugLineNum = 306;BA.debugLine="End Sub";
return "";
}
public boolean  _panel1_ontouch(int _action,float _x,float _y,Object _motionevent) throws Exception{
 //BA.debugLineNum = 308;BA.debugLine="Sub Panel1_onTouch(Action As Int, X As Float, Y As";
 //BA.debugLineNum = 309;BA.debugLine="If Action = gestures.ACTION_UP Then";
if (_action==_gestures.ACTION_UP) { 
 //BA.debugLineNum = 310;BA.debugLine="TouchDown = False";
_touchdown = __c.False;
 };
 //BA.debugLineNum = 313;BA.debugLine="Return True";
if (true) return __c.True;
 //BA.debugLineNum = 314;BA.debugLine="End Sub";
return false;
}
public String  _popexample_btnclick(String _btntext) throws Exception{
 //BA.debugLineNum = 328;BA.debugLine="Sub popExample_BtnClick( btnText As String )";
 //BA.debugLineNum = 329;BA.debugLine="Dim FullImage As Bitmap = ScaleImageView1.Image";
_fullimage = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
_fullimage = (anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper(), (android.graphics.Bitmap)(_scaleimageview1.getImage()));
 //BA.debugLineNum = 330;BA.debugLine="Select Case btnText";
switch (BA.switchObjectToInt(_btntext,_popupitemsethome,_popupitemsetlock,_popupitemsetboth,_popupitemmorelike,_popupitemshare)) {
case 0: {
 //BA.debugLineNum = 332;BA.debugLine="SetWallPaper(FullImage,1)";
_setwallpaper(_fullimage,(int) (1));
 //BA.debugLineNum = 333;BA.debugLine="ToastMessageShow(\"The wallpaper has been set Su";
__c.ToastMessageShow(BA.ObjectToCharSequence("The wallpaper has been set Successfully."),__c.True);
 break; }
case 1: {
 //BA.debugLineNum = 335;BA.debugLine="SetWallPaper(FullImage,2)";
_setwallpaper(_fullimage,(int) (2));
 //BA.debugLineNum = 336;BA.debugLine="ToastMessageShow(\"The wallpaper has been set Su";
__c.ToastMessageShow(BA.ObjectToCharSequence("The wallpaper has been set Successfully."),__c.True);
 break; }
case 2: {
 //BA.debugLineNum = 339;BA.debugLine="SetWallPaper(FullImage,1)";
_setwallpaper(_fullimage,(int) (1));
 //BA.debugLineNum = 340;BA.debugLine="SetWallPaper(FullImage,2)";
_setwallpaper(_fullimage,(int) (2));
 //BA.debugLineNum = 341;BA.debugLine="ToastMessageShow(\"The wallpaper has been set Su";
__c.ToastMessageShow(BA.ObjectToCharSequence("The wallpaper has been set Successfully."),__c.True);
 break; }
case 3: {
 //BA.debugLineNum = 343;BA.debugLine="B4XPages.ClosePage(Me)";
_b4xpages._closepage /*String*/ (ba,this);
 //BA.debugLineNum = 344;BA.debugLine="B4XPages.MainPage.B4XFloatTextField1.Text = \"li";
_b4xpages._mainpage /*com.holydesing.software.wallpaperhq.b4xmainpage*/ (ba)._b4xfloattextfield1 /*com.holydesing.software.wallpaperhq.b4xfloattextfield*/ ._settext /*String*/ ("like:"+_wallpaperid);
 //BA.debugLineNum = 345;BA.debugLine="B4XPages.MainPage.B4XFloatTextField1.Update";
_b4xpages._mainpage /*com.holydesing.software.wallpaperhq.b4xmainpage*/ (ba)._b4xfloattextfield1 /*com.holydesing.software.wallpaperhq.b4xfloattextfield*/ ._update /*String*/ ();
 //BA.debugLineNum = 346;BA.debugLine="B4XPages.MainPage.PageSelector.Text = \"1\"";
_b4xpages._mainpage /*com.holydesing.software.wallpaperhq.b4xmainpage*/ (ba)._pageselector /*com.holydesing.software.wallpaperhq.b4xfloattextfield*/ ._settext /*String*/ ("1");
 //BA.debugLineNum = 347;BA.debugLine="B4XPages.MainPage.PageSelector.Update";
_b4xpages._mainpage /*com.holydesing.software.wallpaperhq.b4xmainpage*/ (ba)._pageselector /*com.holydesing.software.wallpaperhq.b4xfloattextfield*/ ._update /*String*/ ();
 //BA.debugLineNum = 348;BA.debugLine="B4XPages.MainPage.ASViewPager1.CurrentIndex2 =";
_b4xpages._mainpage /*com.holydesing.software.wallpaperhq.b4xmainpage*/ (ba)._asviewpager1 /*com.holydesing.software.wallpaperhq.asviewpager*/ ._setcurrentindex2((int) (0));
 //BA.debugLineNum = 350;BA.debugLine="B4XPages.MainPage.AS_TabMenuAdvanced1.Refresh";
_b4xpages._mainpage /*com.holydesing.software.wallpaperhq.b4xmainpage*/ (ba)._as_tabmenuadvanced1 /*com.holydesing.software.wallpaperhq.as_tabmenuadvanced*/ ._refresh /*String*/ ();
 //BA.debugLineNum = 351;BA.debugLine="B4XPages.MainPage.Search";
_b4xpages._mainpage /*com.holydesing.software.wallpaperhq.b4xmainpage*/ (ba)._search /*void*/ ();
 break; }
case 4: {
 //BA.debugLineNum = 365;BA.debugLine="ShareImage";
_shareimage();
 break; }
}
;
 //BA.debugLineNum = 369;BA.debugLine="End Sub";
return "";
}
public String  _scaleimageview1_click() throws Exception{
agraham.b4a.scaleimageview.ScaleImageViewWrapper _siv = null;
 //BA.debugLineNum = 202;BA.debugLine="Sub ScaleImageView1_Click 'The user has tapped on";
 //BA.debugLineNum = 203;BA.debugLine="Dim siv As ScaleImageView = Sender";
_siv = new agraham.b4a.scaleimageview.ScaleImageViewWrapper();
_siv = (agraham.b4a.scaleimageview.ScaleImageViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new agraham.b4a.scaleimageview.ScaleImageViewWrapper(), (agraham.b4a.scaleimageview.ScaleImageViewWrapper.CircleView)(__c.Sender(ba)));
 //BA.debugLineNum = 205;BA.debugLine="viewx =  siv.ClickViewX";
_viewx = (int) (_siv.getClickViewX());
 //BA.debugLineNum = 206;BA.debugLine="viewy =  siv.ClickViewY";
_viewy = (int) (_siv.getClickViewY());
 //BA.debugLineNum = 207;BA.debugLine="imagex =  siv.ClickImageX";
_imagex = (int) (_siv.getClickImageX());
 //BA.debugLineNum = 208;BA.debugLine="imagey =  siv.ClickImageY";
_imagey = (int) (_siv.getClickImageY());
 //BA.debugLineNum = 209;BA.debugLine="siv.Invalidate ' draw the new position";
_siv.Invalidate();
 //BA.debugLineNum = 212;BA.debugLine="End Sub";
return "";
}
public String  _scaleimageview1_longclick() throws Exception{
agraham.b4a.scaleimageview.ScaleImageViewWrapper _siv = null;
 //BA.debugLineNum = 214;BA.debugLine="Sub ScaleImageView1_LongClick 'The user has long p";
 //BA.debugLineNum = 215;BA.debugLine="Dim siv As ScaleImageView = Sender";
_siv = new agraham.b4a.scaleimageview.ScaleImageViewWrapper();
_siv = (agraham.b4a.scaleimageview.ScaleImageViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new agraham.b4a.scaleimageview.ScaleImageViewWrapper(), (agraham.b4a.scaleimageview.ScaleImageViewWrapper.CircleView)(__c.Sender(ba)));
 //BA.debugLineNum = 217;BA.debugLine="viewx = siv.ClickViewX";
_viewx = (int) (_siv.getClickViewX());
 //BA.debugLineNum = 218;BA.debugLine="viewy = siv.ClickViewY";
_viewy = (int) (_siv.getClickViewY());
 //BA.debugLineNum = 219;BA.debugLine="imagex =  siv.ClickImageX";
_imagex = (int) (_siv.getClickImageX());
 //BA.debugLineNum = 220;BA.debugLine="imagey =  siv.ClickImageY";
_imagey = (int) (_siv.getClickImageY());
 //BA.debugLineNum = 229;BA.debugLine="End Sub";
return "";
}
public String  _scaleimageview1_ondraw(anywheresoftware.b4a.objects.drawable.CanvasWrapper _viewcanvas) throws Exception{
 //BA.debugLineNum = 231;BA.debugLine="Sub ScaleImageView1_OnDraw(viewcanvas As Canvas) '";
 //BA.debugLineNum = 250;BA.debugLine="End Sub";
return "";
}
public String  _setwallpaper(anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _bmp,int _typewall) throws Exception{
anywheresoftware.b4j.object.JavaObject _wallpaper = null;
anywheresoftware.b4j.object.JavaObject _context = null;
String _exeption = "";
 //BA.debugLineNum = 385;BA.debugLine="Sub SetWallPaper(Bmp As Bitmap, TypeWall As Int)";
 //BA.debugLineNum = 386;BA.debugLine="Try";
try { //BA.debugLineNum = 387;BA.debugLine="Dim wallpaper As JavaObject";
_wallpaper = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 388;BA.debugLine="Dim context As JavaObject";
_context = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 389;BA.debugLine="context.InitializeContext";
_context.InitializeContext(ba);
 //BA.debugLineNum = 390;BA.debugLine="wallpaper = wallpaper.InitializeStatic(\"android.";
_wallpaper = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_wallpaper.InitializeStatic("android.app.WallpaperManager").RunMethod("getInstance",new Object[]{(Object)(_context.getObject())})));
 //BA.debugLineNum = 391;BA.debugLine="wallpaper.RunMethod(\"setBitmap\", Array(Bmp,Null,";
_wallpaper.RunMethod("setBitmap",new Object[]{(Object)(_bmp.getObject()),__c.Null,(Object)(__c.True),(Object)(_typewall)});
 } 
       catch (Exception e8) {
			ba.setLastException(e8); //BA.debugLineNum = 393;BA.debugLine="Dim Exeption As String =LastException";
_exeption = BA.ObjectToString(__c.LastException(ba));
 //BA.debugLineNum = 394;BA.debugLine="Log(Exeption)";
__c.LogImpl("34128777",_exeption,0);
 //BA.debugLineNum = 395;BA.debugLine="ToastMessageShow(Exeption, True)";
__c.ToastMessageShow(BA.ObjectToCharSequence(_exeption),__c.True);
 };
 //BA.debugLineNum = 397;BA.debugLine="End Sub";
return "";
}
public String  _setwallpaperold(anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _bmp) throws Exception{
anywheresoftware.b4a.agraham.reflection.Reflection _r = null;
String _exeption = "";
 //BA.debugLineNum = 371;BA.debugLine="Sub SetWallPaperOld(Bmp As Bitmap)";
 //BA.debugLineNum = 372;BA.debugLine="Try";
try { //BA.debugLineNum = 373;BA.debugLine="Dim r As Reflector";
_r = new anywheresoftware.b4a.agraham.reflection.Reflection();
 //BA.debugLineNum = 374;BA.debugLine="r.Target = r.RunStaticMethod(\"android.app.Wallpa";
_r.Target = _r.RunStaticMethod("android.app.WallpaperManager","getInstance",new Object[]{(Object)(_r.GetContext(ba))},new String[]{"android.content.Context"});
 //BA.debugLineNum = 376;BA.debugLine="r.RunMethod4(\"setBitmap\", Array As Object(Bmp),";
_r.RunMethod4("setBitmap",new Object[]{(Object)(_bmp.getObject())},new String[]{"android.graphics.Bitmap"});
 //BA.debugLineNum = 377;BA.debugLine="ToastMessageShow(\"The wallpaper has been set Suc";
__c.ToastMessageShow(BA.ObjectToCharSequence("The wallpaper has been set Successfully."),__c.True);
 } 
       catch (Exception e7) {
			ba.setLastException(e7); //BA.debugLineNum = 379;BA.debugLine="Dim Exeption As String =LastException";
_exeption = BA.ObjectToString(__c.LastException(ba));
 //BA.debugLineNum = 380;BA.debugLine="Log(Exeption)";
__c.LogImpl("34063241",_exeption,0);
 //BA.debugLineNum = 381;BA.debugLine="ToastMessageShow(Exeption, True)";
__c.ToastMessageShow(BA.ObjectToCharSequence(_exeption),__c.True);
 };
 //BA.debugLineNum = 383;BA.debugLine="End Sub";
return "";
}
public String  _shareimage() throws Exception{
String _filename = "";
anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _savedimage = null;
anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper _out = null;
anywheresoftware.b4a.objects.IntentWrapper _in = null;
 //BA.debugLineNum = 460;BA.debugLine="Sub ShareImage()";
 //BA.debugLineNum = 461;BA.debugLine="Try";
try { //BA.debugLineNum = 462;BA.debugLine="Dim FileName As String = \"ShareEx\" & \".jpg\"";
_filename = "ShareEx"+".jpg";
 //BA.debugLineNum = 464;BA.debugLine="If File.Exists(Provider.SharedFolder, FileName)";
if (__c.File.Exists(_provider._sharedfolder /*String*/ ,_filename)==__c.True) { 
 //BA.debugLineNum = 465;BA.debugLine="File.Delete(Provider.SharedFolder, FileName)";
__c.File.Delete(_provider._sharedfolder /*String*/ ,_filename);
 };
 //BA.debugLineNum = 468;BA.debugLine="Dim SavedImage As Bitmap = ScaleImageView1.Image";
_savedimage = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
_savedimage = (anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper(), (android.graphics.Bitmap)(_scaleimageview1.getImage()));
 //BA.debugLineNum = 469;BA.debugLine="Dim out As OutputStream = File.OpenOutput(Provid";
_out = new anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper();
_out = __c.File.OpenOutput(_provider._sharedfolder /*String*/ ,_filename,__c.False);
 //BA.debugLineNum = 470;BA.debugLine="SavedImage.WriteToStream(out, 100, \"JPEG\")";
_savedimage.WriteToStream((java.io.OutputStream)(_out.getObject()),(int) (100),BA.getEnumFromString(android.graphics.Bitmap.CompressFormat.class,"JPEG"));
 //BA.debugLineNum = 471;BA.debugLine="out.Close";
_out.Close();
 //BA.debugLineNum = 475;BA.debugLine="Dim in As Intent";
_in = new anywheresoftware.b4a.objects.IntentWrapper();
 //BA.debugLineNum = 476;BA.debugLine="in.Initialize(in.ACTION_VIEW, \"\")";
_in.Initialize(_in.ACTION_VIEW,"");
 //BA.debugLineNum = 477;BA.debugLine="Provider.SetFileUriAsIntentData(in, FileName)";
_provider._setfileuriasintentdata /*String*/ (_in,_filename);
 //BA.debugLineNum = 479;BA.debugLine="in.SetType(\"image/*\")";
_in.SetType("image/*");
 //BA.debugLineNum = 480;BA.debugLine="StartActivity(in)";
__c.StartActivity(ba,(Object)(_in.getObject()));
 } 
       catch (Exception e16) {
			ba.setLastException(e16); //BA.debugLineNum = 483;BA.debugLine="Log(LastException)";
__c.LogImpl("34456471",BA.ObjectToString(__c.LastException(ba)),0);
 //BA.debugLineNum = 484;BA.debugLine="ToastMessageShow(LastException, False)";
__c.ToastMessageShow(BA.ObjectToCharSequence(__c.LastException(ba).getObject()),__c.False);
 };
 //BA.debugLineNum = 486;BA.debugLine="End Sub";
return "";
}
public void  _showimage(String _imgdat) throws Exception{
ResumableSub_ShowImage rsub = new ResumableSub_ShowImage(this,_imgdat);
rsub.resume(ba, null);
}
public static class ResumableSub_ShowImage extends BA.ResumableSub {
public ResumableSub_ShowImage(com.holydesing.software.wallpaperhq.imageviewerb4x parent,String _imgdat) {
this.parent = parent;
this._imgdat = _imgdat;
}
com.holydesing.software.wallpaperhq.imageviewerb4x parent;
String _imgdat;
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
 //BA.debugLineNum = 74;BA.debugLine="ImageData = ImgDat";
parent._imagedata = _imgdat;
 //BA.debugLineNum = 75;BA.debugLine="WallpaperID = GetFileID";
parent._wallpaperid = parent._getfileid();
 //BA.debugLineNum = 78;BA.debugLine="Button2.Visible = False";
parent._button2.setVisible(parent.__c.False);
 //BA.debugLineNum = 79;BA.debugLine="Button3.Visible = False";
parent._button3.setVisible(parent.__c.False);
 //BA.debugLineNum = 80;BA.debugLine="Button4.Visible = False";
parent._button4.setVisible(parent.__c.False);
 //BA.debugLineNum = 81;BA.debugLine="ScaleImageView1.Visible = False";
parent._scaleimageview1.setVisible(parent.__c.False);
 //BA.debugLineNum = 82;BA.debugLine="ScaleImageView1.Recycle";
parent._scaleimageview1.Recycle();
 //BA.debugLineNum = 84;BA.debugLine="B4XLoadingIndicator1.Show";
parent._b4xloadingindicator1._show /*String*/ ();
 //BA.debugLineNum = 86;BA.debugLine="ScaleImageView1.PanLimit = ScaleImageView1.PAN_LI";
parent._scaleimageview1.setPanLimit(parent._scaleimageview1.getPAN_LIMIT_CENTER());
 //BA.debugLineNum = 87;BA.debugLine="gestures.SetOnGestureListener(Panel1, \"Panel1\")";
parent._gestures.SetOnGestureListener(ba,(android.view.View)(parent._panel1.getObject()),"Panel1");
 //BA.debugLineNum = 89;BA.debugLine="Dim Url As String = ImgDat";
_url = _imgdat;
 //BA.debugLineNum = 91;BA.debugLine="Dim j As HttpJob";
_j = new com.holydesing.software.wallpaperhq.httpjob();
 //BA.debugLineNum = 92;BA.debugLine="j.Initialize(\"img\", Me)";
_j._initialize /*String*/ (ba,"img",parent);
 //BA.debugLineNum = 93;BA.debugLine="j.Download(Url)";
_j._download /*String*/ (_url);
 //BA.debugLineNum = 94;BA.debugLine="Wait For (j) JobDone(j As HttpJob)";
parent.__c.WaitFor("jobdone", ba, this, (Object)(_j));
this.state = 15;
return;
case 15:
//C
this.state = 1;
_j = (com.holydesing.software.wallpaperhq.httpjob) result[0];
;
 //BA.debugLineNum = 96;BA.debugLine="If j.Success Then";
if (true) break;

case 1:
//if
this.state = 14;
if (_j._success /*boolean*/ ) { 
this.state = 3;
}else {
this.state = 13;
}if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 98;BA.debugLine="ToastMessageShow(\"Please Wait 5 seconds...\", Tru";
parent.__c.ToastMessageShow(BA.ObjectToCharSequence("Please Wait 5 seconds..."),parent.__c.True);
 //BA.debugLineNum = 100;BA.debugLine="Dim bmp As Bitmap = j.GetBitmap";
_bmp = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
_bmp = _j._getbitmap /*anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper*/ ();
 //BA.debugLineNum = 101;BA.debugLine="FullImage = bmp";
parent._fullimage = _bmp;
 //BA.debugLineNum = 103;BA.debugLine="ScaleImageView1.BringToFront";
parent._scaleimageview1.BringToFront();
 //BA.debugLineNum = 104;BA.debugLine="ScaleImageView1.DoubleTapZoomDuration = 250";
parent._scaleimageview1.setDoubleTapZoomDuration((int) (250));
 //BA.debugLineNum = 105;BA.debugLine="ScaleImageView1.Orientation = ScaleImageView1.OR";
parent._scaleimageview1.setOrientation(parent._scaleimageview1.getORIENTATION_USE_EXIF());
 //BA.debugLineNum = 108;BA.debugLine="ScaleImageView1.Image = bmp";
parent._scaleimageview1.setImage((android.graphics.Bitmap)(_bmp.getObject()));
 //BA.debugLineNum = 110;BA.debugLine="Dim loops As Int = 1";
_loops = (int) (1);
 //BA.debugLineNum = 111;BA.debugLine="Do Until ScaleImageView1.IsReady";
if (true) break;

case 4:
//do until
this.state = 11;
while (!(parent._scaleimageview1.getIsReady())) {
this.state = 6;
if (true) break;
}
if (true) break;

case 6:
//C
this.state = 7;
 //BA.debugLineNum = 112;BA.debugLine="Sleep(100)";
parent.__c.Sleep(ba,this,(int) (100));
this.state = 16;
return;
case 16:
//C
this.state = 7;
;
 //BA.debugLineNum = 113;BA.debugLine="loops = loops + 1";
_loops = (int) (_loops+1);
 //BA.debugLineNum = 114;BA.debugLine="If loops > 100 Then ' give it up to 10 seconds";
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
 //BA.debugLineNum = 115;BA.debugLine="Exit";
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
this.state = 14;
;
 //BA.debugLineNum = 120;BA.debugLine="ScaleImageView1.SetScaleAndCenter(ViewerZoom,Vie";
parent._scaleimageview1.SetScaleAndCenter(parent._viewerzoom,parent._viewerx,parent._viewery,(int) (1));
 //BA.debugLineNum = 122;BA.debugLine="ScaleImageView1.EnableCircle = False";
parent._scaleimageview1.setEnableCircle(parent.__c.False);
 //BA.debugLineNum = 125;BA.debugLine="ScaleImageView1.CircleX = CircleX";
parent._scaleimageview1.setCircleX(parent._circlex);
 //BA.debugLineNum = 126;BA.debugLine="ScaleImageView1.CircleY = CircleY";
parent._scaleimageview1.setCircleY(parent._circley);
 //BA.debugLineNum = 128;BA.debugLine="Button2.Visible = True";
parent._button2.setVisible(parent.__c.True);
 //BA.debugLineNum = 129;BA.debugLine="Button3.Visible = True";
parent._button3.setVisible(parent.__c.True);
 //BA.debugLineNum = 131;BA.debugLine="ScaleImageView1.Visible = True";
parent._scaleimageview1.setVisible(parent.__c.True);
 if (true) break;

case 13:
//C
this.state = 14;
 //BA.debugLineNum = 135;BA.debugLine="ToastMessageShow(\"Error, No Internet Connection\"";
parent.__c.ToastMessageShow(BA.ObjectToCharSequence("Error, No Internet Connection"),parent.__c.True);
 if (true) break;

case 14:
//C
this.state = -1;
;
 //BA.debugLineNum = 138;BA.debugLine="B4XLoadingIndicator1.Hide";
parent._b4xloadingindicator1._hide /*String*/ ();
 //BA.debugLineNum = 139;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _jobdone(com.holydesing.software.wallpaperhq.httpjob _j) throws Exception{
}
public void  _showimagefromfile(String _imgdat) throws Exception{
ResumableSub_ShowImageFromFile rsub = new ResumableSub_ShowImageFromFile(this,_imgdat);
rsub.resume(ba, null);
}
public static class ResumableSub_ShowImageFromFile extends BA.ResumableSub {
public ResumableSub_ShowImageFromFile(com.holydesing.software.wallpaperhq.imageviewerb4x parent,String _imgdat) {
this.parent = parent;
this._imgdat = _imgdat;
}
com.holydesing.software.wallpaperhq.imageviewerb4x parent;
String _imgdat;
anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _bmp = null;
int _loops = 0;

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
 //BA.debugLineNum = 143;BA.debugLine="Try";
if (true) break;

case 1:
//try
this.state = 14;
this.catchState = 13;
this.state = 3;
if (true) break;

case 3:
//C
this.state = 4;
this.catchState = 13;
 //BA.debugLineNum = 144;BA.debugLine="ImageData = ImgDat";
parent._imagedata = _imgdat;
 //BA.debugLineNum = 146;BA.debugLine="WallpaperID = ImageData.Replace(\".jpg\", \"\")";
parent._wallpaperid = parent._imagedata.replace(".jpg","");
 //BA.debugLineNum = 148;BA.debugLine="Button2.Visible = False";
parent._button2.setVisible(parent.__c.False);
 //BA.debugLineNum = 149;BA.debugLine="Button3.Visible = False";
parent._button3.setVisible(parent.__c.False);
 //BA.debugLineNum = 150;BA.debugLine="Button4.Visible = True";
parent._button4.setVisible(parent.__c.True);
 //BA.debugLineNum = 151;BA.debugLine="ScaleImageView1.Visible = False";
parent._scaleimageview1.setVisible(parent.__c.False);
 //BA.debugLineNum = 152;BA.debugLine="ScaleImageView1.Recycle";
parent._scaleimageview1.Recycle();
 //BA.debugLineNum = 154;BA.debugLine="B4XLoadingIndicator1.Show";
parent._b4xloadingindicator1._show /*String*/ ();
 //BA.debugLineNum = 156;BA.debugLine="ScaleImageView1.PanLimit = ScaleImageView1.PAN_L";
parent._scaleimageview1.setPanLimit(parent._scaleimageview1.getPAN_LIMIT_CENTER());
 //BA.debugLineNum = 157;BA.debugLine="gestures.SetOnGestureListener(Panel1, \"Panel1\")";
parent._gestures.SetOnGestureListener(ba,(android.view.View)(parent._panel1.getObject()),"Panel1");
 //BA.debugLineNum = 159;BA.debugLine="Dim bmp As Bitmap = LoadBitmap(Main.DownloadedWa";
_bmp = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
_bmp = parent.__c.LoadBitmap(parent._main._downloadedwallpapers /*String*/ ,_imgdat);
 //BA.debugLineNum = 161;BA.debugLine="FullImage = bmp";
parent._fullimage = _bmp;
 //BA.debugLineNum = 163;BA.debugLine="ScaleImageView1.BringToFront";
parent._scaleimageview1.BringToFront();
 //BA.debugLineNum = 164;BA.debugLine="ScaleImageView1.DoubleTapZoomDuration = 250";
parent._scaleimageview1.setDoubleTapZoomDuration((int) (250));
 //BA.debugLineNum = 165;BA.debugLine="ScaleImageView1.Orientation = ScaleImageView1.OR";
parent._scaleimageview1.setOrientation(parent._scaleimageview1.getORIENTATION_USE_EXIF());
 //BA.debugLineNum = 168;BA.debugLine="ScaleImageView1.Image = bmp";
parent._scaleimageview1.setImage((android.graphics.Bitmap)(_bmp.getObject()));
 //BA.debugLineNum = 170;BA.debugLine="Dim loops As Int = 1";
_loops = (int) (1);
 //BA.debugLineNum = 171;BA.debugLine="Do Until ScaleImageView1.IsReady";
if (true) break;

case 4:
//do until
this.state = 11;
while (!(parent._scaleimageview1.getIsReady())) {
this.state = 6;
if (true) break;
}
if (true) break;

case 6:
//C
this.state = 7;
 //BA.debugLineNum = 172;BA.debugLine="Sleep(100)";
parent.__c.Sleep(ba,this,(int) (100));
this.state = 15;
return;
case 15:
//C
this.state = 7;
;
 //BA.debugLineNum = 173;BA.debugLine="loops = loops + 1";
_loops = (int) (_loops+1);
 //BA.debugLineNum = 174;BA.debugLine="If loops > 100 Then ' give it up to 10 seconds";
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
 //BA.debugLineNum = 175;BA.debugLine="Exit";
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
this.state = 14;
;
 //BA.debugLineNum = 180;BA.debugLine="ScaleImageView1.SetScaleAndCenter(ViewerZoom,Vie";
parent._scaleimageview1.SetScaleAndCenter(parent._viewerzoom,parent._viewerx,parent._viewery,(int) (1));
 //BA.debugLineNum = 182;BA.debugLine="ScaleImageView1.EnableCircle = False";
parent._scaleimageview1.setEnableCircle(parent.__c.False);
 //BA.debugLineNum = 185;BA.debugLine="ScaleImageView1.CircleX = CircleX";
parent._scaleimageview1.setCircleX(parent._circlex);
 //BA.debugLineNum = 186;BA.debugLine="ScaleImageView1.CircleY = CircleY";
parent._scaleimageview1.setCircleY(parent._circley);
 //BA.debugLineNum = 188;BA.debugLine="Button2.Visible = True";
parent._button2.setVisible(parent.__c.True);
 //BA.debugLineNum = 191;BA.debugLine="ScaleImageView1.Visible = True";
parent._scaleimageview1.setVisible(parent.__c.True);
 //BA.debugLineNum = 193;BA.debugLine="B4XLoadingIndicator1.Hide";
parent._b4xloadingindicator1._hide /*String*/ ();
 if (true) break;

case 13:
//C
this.state = 14;
this.catchState = 0;
 //BA.debugLineNum = 195;BA.debugLine="Log(LastException)";
parent.__c.LogImpl("32883637",BA.ObjectToString(parent.__c.LastException(ba)),0);
 //BA.debugLineNum = 196;BA.debugLine="ToastMessageShow(\"Image Corrupted!\", False)";
parent.__c.ToastMessageShow(BA.ObjectToCharSequence("Image Corrupted!"),parent.__c.False);
 if (true) break;
if (true) break;

case 14:
//C
this.state = -1;
this.catchState = 0;
;
 //BA.debugLineNum = 198;BA.debugLine="End Sub";
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
ba.setLastException(e0);}
            }
        }
    }
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
if (BA.fastSubCompare(sub, "B4XPAGE_CREATED"))
	return _b4xpage_created((anywheresoftware.b4a.objects.B4XViewWrapper) args[0]);
return BA.SubDelegator.SubNotFound;
}
}
