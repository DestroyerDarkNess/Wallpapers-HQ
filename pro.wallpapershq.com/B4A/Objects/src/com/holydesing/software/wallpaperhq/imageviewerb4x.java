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
public b4a.example.dateutils _dateutils = null;
public com.holydesing.software.wallpaperhq.main _main = null;
public com.holydesing.software.wallpaperhq.activity2 _activity2 = null;
public com.holydesing.software.wallpaperhq.starter _starter = null;
public com.holydesing.software.wallpaperhq.viewer _viewer = null;
public com.holydesing.software.wallpaperhq.themecolors _themecolors = null;
public com.holydesing.software.wallpaperhq.b4xpages _b4xpages = null;
public com.holydesing.software.wallpaperhq.b4xcollections _b4xcollections = null;
public com.holydesing.software.wallpaperhq.httputils2service _httputils2service = null;
public com.holydesing.software.wallpaperhq.xuiviewsutils _xuiviewsutils = null;
public String  _b4xpage_created(anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
 //BA.debugLineNum = 43;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
 //BA.debugLineNum = 44;BA.debugLine="Root = Root1";
_root = _root1;
 //BA.debugLineNum = 47;BA.debugLine="Root.LoadLayout(\"Viewer\")";
_root.LoadLayout("Viewer",ba);
 //BA.debugLineNum = 51;BA.debugLine="B4XPages.GetManager.ShowUpIndicator = False";
_b4xpages._getmanager /*com.holydesing.software.wallpaperhq.b4xpagesmanager*/ (ba)._showupindicator /*boolean*/  = __c.False;
 //BA.debugLineNum = 55;BA.debugLine="End Sub";
return "";
}
public String  _button1_click() throws Exception{
 //BA.debugLineNum = 294;BA.debugLine="Private Sub Button1_Click";
 //BA.debugLineNum = 295;BA.debugLine="B4XPages.ClosePage(Me)";
_b4xpages._closepage /*String*/ (ba,this);
 //BA.debugLineNum = 296;BA.debugLine="End Sub";
return "";
}
public String  _button2_click() throws Exception{
 //BA.debugLineNum = 298;BA.debugLine="Private Sub Button2_Click";
 //BA.debugLineNum = 299;BA.debugLine="Dim FullImage As Bitmap = ScaleImageView1.Image";
_fullimage = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
_fullimage = (anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper(), (android.graphics.Bitmap)(_scaleimageview1.getImage()));
 //BA.debugLineNum = 300;BA.debugLine="SetWallPaper(FullImage)";
_setwallpaper(_fullimage);
 //BA.debugLineNum = 301;BA.debugLine="End Sub";
return "";
}
public String  _button3_click() throws Exception{
String[] _strsplit = null;
String _svfilenameex = "";
String _filename = "";
 //BA.debugLineNum = 318;BA.debugLine="Private Sub Button3_Click";
 //BA.debugLineNum = 319;BA.debugLine="Try";
try { //BA.debugLineNum = 320;BA.debugLine="Button3.visible = False";
_button3.setVisible(__c.False);
 //BA.debugLineNum = 321;BA.debugLine="Dim strSplit() As String = Regex.Split(\"/\",Image";
_strsplit = __c.Regex.Split("/",_imagedata);
 //BA.debugLineNum = 322;BA.debugLine="Dim SvFilenameEx As String = strSplit(strSplit.L";
_svfilenameex = _strsplit[(int) (_strsplit.length-1)].replace("wallhaven","");
 //BA.debugLineNum = 323;BA.debugLine="Dim FileName As String = SvFilenameEx.Replace(\"-";
_filename = _svfilenameex.replace("-","");
 //BA.debugLineNum = 325;BA.debugLine="If File.Exists(Main.DownloadedWallpapers, FileNa";
if (__c.File.Exists(_main._downloadedwallpapers /*String*/ ,_filename)==__c.True) { 
 //BA.debugLineNum = 326;BA.debugLine="File.Delete(Main.DownloadedWallpapers, FileName";
__c.File.Delete(_main._downloadedwallpapers /*String*/ ,_filename);
 };
 //BA.debugLineNum = 329;BA.debugLine="DownloadWallpaper(FullImage, FileName)";
_downloadwallpaper(_fullimage,_filename);
 } 
       catch (Exception e11) {
			ba.setLastException(e11); //BA.debugLineNum = 332;BA.debugLine="Log(LastException)";
__c.LogImpl("64063246",BA.ObjectToString(__c.LastException(ba)),0);
 //BA.debugLineNum = 333;BA.debugLine="ToastMessageShow(LastException, False)";
__c.ToastMessageShow(BA.ObjectToCharSequence(__c.LastException(ba).getObject()),__c.False);
 };
 //BA.debugLineNum = 335;BA.debugLine="End Sub";
return "";
}
public String  _button4_click() throws Exception{
 //BA.debugLineNum = 354;BA.debugLine="Private Sub Button4_Click";
 //BA.debugLineNum = 355;BA.debugLine="Try";
try { //BA.debugLineNum = 356;BA.debugLine="If File.Exists(Main.DownloadedWallpapers, ImageD";
if (__c.File.Exists(_main._downloadedwallpapers /*String*/ ,_imagedata)==__c.True) { 
 //BA.debugLineNum = 357;BA.debugLine="File.Delete(Main.DownloadedWallpapers, ImageDat";
__c.File.Delete(_main._downloadedwallpapers /*String*/ ,_imagedata);
 };
 //BA.debugLineNum = 359;BA.debugLine="B4XPages.MainPage.ListSaved";
_b4xpages._mainpage /*com.holydesing.software.wallpaperhq.b4xmainpage*/ (ba)._listsaved /*String*/ ();
 //BA.debugLineNum = 360;BA.debugLine="B4XPages.ClosePage(Me)";
_b4xpages._closepage /*String*/ (ba,this);
 } 
       catch (Exception e8) {
			ba.setLastException(e8); //BA.debugLineNum = 362;BA.debugLine="Log(LastException)";
__c.LogImpl("654394888",BA.ObjectToString(__c.LastException(ba)),0);
 //BA.debugLineNum = 363;BA.debugLine="ToastMessageShow(LastException, False)";
__c.ToastMessageShow(BA.ObjectToCharSequence(__c.LastException(ba).getObject()),__c.False);
 };
 //BA.debugLineNum = 365;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 7;BA.debugLine="Private ScaleImageView1 As ScaleImageView";
_scaleimageview1 = new agraham.b4a.scaleimageview.ScaleImageViewWrapper();
 //BA.debugLineNum = 8;BA.debugLine="Private Panel1 As Panel";
_panel1 = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 10;BA.debugLine="Private gestures As GestureDetector";
_gestures = new flm.b4a.gesturedetector.GestureDetectorForB4A();
 //BA.debugLineNum = 12;BA.debugLine="Private TouchDown As Boolean = False";
_touchdown = __c.False;
 //BA.debugLineNum = 14;BA.debugLine="Dim viewx As Int";
_viewx = 0;
 //BA.debugLineNum = 15;BA.debugLine="Dim viewy As Int";
_viewy = 0;
 //BA.debugLineNum = 16;BA.debugLine="Dim imagex As Int";
_imagex = 0;
 //BA.debugLineNum = 17;BA.debugLine="Dim imagey As Int";
_imagey = 0;
 //BA.debugLineNum = 19;BA.debugLine="Public	 ViewerTitle As String = \"Viewer\"";
_viewertitle = "Viewer";
 //BA.debugLineNum = 22;BA.debugLine="Public ViewerX As Float = 0.5 ' Easting of map po";
_viewerx = (float) (0.5);
 //BA.debugLineNum = 23;BA.debugLine="Public ViewerY As Float = 0.5 ' Northing of map p";
_viewery = (float) (0.5);
 //BA.debugLineNum = 24;BA.debugLine="Public ViewerZoom As Float = 2 ' Zoom level to op";
_viewerzoom = (float) (2);
 //BA.debugLineNum = 25;BA.debugLine="Public CircleX As Float = 0.5 ' Easting of circle";
_circlex = (float) (0.5);
 //BA.debugLineNum = 26;BA.debugLine="Public CircleY As Float = 0.5 ' Northing of circl";
_circley = (float) (0.5);
 //BA.debugLineNum = 28;BA.debugLine="Private FullImage As Bitmap";
_fullimage = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
 //BA.debugLineNum = 29;BA.debugLine="Private B4XLoadingIndicator1 As B4XLoadingIndicat";
_b4xloadingindicator1 = new com.holydesing.software.wallpaperhq.b4xloadingindicator();
 //BA.debugLineNum = 30;BA.debugLine="Private Button1 As Button";
_button1 = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 31;BA.debugLine="Private Button3 As Button";
_button3 = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 32;BA.debugLine="Private Button2 As Button";
_button2 = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 33;BA.debugLine="Private Button4 As Button";
_button4 = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 34;BA.debugLine="End Sub";
return "";
}
public String  _downloadwallpaper(anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _bmp,String _filenameex) throws Exception{
anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper _out = null;
String _exeption = "";
 //BA.debugLineNum = 338;BA.debugLine="Sub DownloadWallpaper(Bmp As Bitmap, FilenameEx As";
 //BA.debugLineNum = 339;BA.debugLine="Try";
try { //BA.debugLineNum = 340;BA.debugLine="Dim out As OutputStream = File.OpenOutput(Main.D";
_out = new anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper();
_out = __c.File.OpenOutput(_main._downloadedwallpapers /*String*/ ,_filenameex,__c.False);
 //BA.debugLineNum = 341;BA.debugLine="Bmp.WriteToStream(out, 100, \"JPEG\")";
_bmp.WriteToStream((java.io.OutputStream)(_out.getObject()),(int) (100),BA.getEnumFromString(android.graphics.Bitmap.CompressFormat.class,"JPEG"));
 //BA.debugLineNum = 342;BA.debugLine="out.Close";
_out.Close();
 //BA.debugLineNum = 344;BA.debugLine="ToastMessageShow(\"Wallpaper Has been saved!\", Fa";
__c.ToastMessageShow(BA.ObjectToCharSequence("Wallpaper Has been saved!"),__c.False);
 } 
       catch (Exception e7) {
			ba.setLastException(e7); //BA.debugLineNum = 346;BA.debugLine="Dim Exeption As String =LastException";
_exeption = BA.ObjectToString(__c.LastException(ba));
 //BA.debugLineNum = 347;BA.debugLine="Log(Exeption)";
__c.LogImpl("64128777",_exeption,0);
 //BA.debugLineNum = 348;BA.debugLine="ToastMessageShow(Exeption, True)";
__c.ToastMessageShow(BA.ObjectToCharSequence(_exeption),__c.True);
 //BA.debugLineNum = 349;BA.debugLine="Button3.visible = True";
_button3.setVisible(__c.True);
 };
 //BA.debugLineNum = 351;BA.debugLine="End Sub";
return "";
}
public Object  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 37;BA.debugLine="Public Sub Initialize As Object";
 //BA.debugLineNum = 39;BA.debugLine="Return Me";
if (true) return this;
 //BA.debugLineNum = 40;BA.debugLine="End Sub";
return null;
}
public String  _panel1_ondoubletap(float _x,float _y,Object _motionevent) throws Exception{
 //BA.debugLineNum = 241;BA.debugLine="Sub Panel1_onDoubleTap(X As Float, Y As Float, Mot";
 //BA.debugLineNum = 243;BA.debugLine="End Sub";
return "";
}
public String  _panel1_ondown(float _x,float _y,Object _motionevent) throws Exception{
 //BA.debugLineNum = 245;BA.debugLine="Sub Panel1_onDown(X As Float, Y As Float, MotionEv";
 //BA.debugLineNum = 246;BA.debugLine="TouchDown = True";
_touchdown = __c.True;
 //BA.debugLineNum = 249;BA.debugLine="End Sub";
return "";
}
public String  _panel1_ondrag(float _deltax,float _deltay,Object _motionevent) throws Exception{
 //BA.debugLineNum = 251;BA.debugLine="Sub Panel1_onDrag(deltaX As Float, deltaY As Float";
 //BA.debugLineNum = 252;BA.debugLine="If deltaX = 0 And deltaY = 0 Then Return";
if (_deltax==0 && _deltay==0) { 
if (true) return "";};
 //BA.debugLineNum = 254;BA.debugLine="End Sub";
return "";
}
public String  _panel1_onlongpress(float _x,float _y,Object _motionevent) throws Exception{
 //BA.debugLineNum = 256;BA.debugLine="Sub Panel1_onLongPress(X As Float, Y As Float, Mot";
 //BA.debugLineNum = 258;BA.debugLine="ScaleImageView1.BringToFront";
_scaleimageview1.BringToFront();
 //BA.debugLineNum = 259;BA.debugLine="End Sub";
return "";
}
public String  _panel1_onpinchclose(float _newdistance,float _previousdistance,Object _motionevent) throws Exception{
 //BA.debugLineNum = 261;BA.debugLine="Sub Panel1_onPinchClose(NewDistance As Float, Prev";
 //BA.debugLineNum = 263;BA.debugLine="End Sub";
return "";
}
public String  _panel1_onpinchopen(float _newdistance,float _previousdistance,Object _motionevent) throws Exception{
 //BA.debugLineNum = 265;BA.debugLine="Sub Panel1_onPinchOpen(NewDistance As Float, Previ";
 //BA.debugLineNum = 267;BA.debugLine="End Sub";
return "";
}
public String  _panel1_onrotation(double _degrees,Object _motionevent) throws Exception{
 //BA.debugLineNum = 269;BA.debugLine="Sub Panel1_onRotation(Degrees As Double, MotionEve";
 //BA.debugLineNum = 271;BA.debugLine="End Sub";
return "";
}
public String  _panel1_onscroll(float _distancex,float _distancey,Object _motionevent1,Object _motionevent2) throws Exception{
 //BA.debugLineNum = 273;BA.debugLine="Sub Panel1_onScroll(distanceX As Float, distanceY";
 //BA.debugLineNum = 275;BA.debugLine="End Sub";
return "";
}
public String  _panel1_onshowpress(float _x,float _y,Object _motionevent) throws Exception{
 //BA.debugLineNum = 277;BA.debugLine="Sub Panel1_onShowPress(X As Float, Y As Float, Mot";
 //BA.debugLineNum = 279;BA.debugLine="End Sub";
return "";
}
public String  _panel1_onsingletapconfirmed(float _x,float _y,Object _motionevent) throws Exception{
 //BA.debugLineNum = 281;BA.debugLine="Sub Panel1_onSingleTapConfirmed(X As Float, Y As F";
 //BA.debugLineNum = 283;BA.debugLine="End Sub";
return "";
}
public boolean  _panel1_ontouch(int _action,float _x,float _y,Object _motionevent) throws Exception{
 //BA.debugLineNum = 285;BA.debugLine="Sub Panel1_onTouch(Action As Int, X As Float, Y As";
 //BA.debugLineNum = 286;BA.debugLine="If Action = gestures.ACTION_UP Then";
if (_action==_gestures.ACTION_UP) { 
 //BA.debugLineNum = 287;BA.debugLine="TouchDown = False";
_touchdown = __c.False;
 };
 //BA.debugLineNum = 290;BA.debugLine="Return True";
if (true) return __c.True;
 //BA.debugLineNum = 291;BA.debugLine="End Sub";
return false;
}
public String  _scaleimageview1_click() throws Exception{
agraham.b4a.scaleimageview.ScaleImageViewWrapper _siv = null;
 //BA.debugLineNum = 179;BA.debugLine="Sub ScaleImageView1_Click 'The user has tapped on";
 //BA.debugLineNum = 180;BA.debugLine="Dim siv As ScaleImageView = Sender";
_siv = new agraham.b4a.scaleimageview.ScaleImageViewWrapper();
_siv = (agraham.b4a.scaleimageview.ScaleImageViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new agraham.b4a.scaleimageview.ScaleImageViewWrapper(), (agraham.b4a.scaleimageview.ScaleImageViewWrapper.CircleView)(__c.Sender(ba)));
 //BA.debugLineNum = 182;BA.debugLine="viewx =  siv.ClickViewX";
_viewx = (int) (_siv.getClickViewX());
 //BA.debugLineNum = 183;BA.debugLine="viewy =  siv.ClickViewY";
_viewy = (int) (_siv.getClickViewY());
 //BA.debugLineNum = 184;BA.debugLine="imagex =  siv.ClickImageX";
_imagex = (int) (_siv.getClickImageX());
 //BA.debugLineNum = 185;BA.debugLine="imagey =  siv.ClickImageY";
_imagey = (int) (_siv.getClickImageY());
 //BA.debugLineNum = 186;BA.debugLine="siv.Invalidate ' draw the new position";
_siv.Invalidate();
 //BA.debugLineNum = 189;BA.debugLine="End Sub";
return "";
}
public String  _scaleimageview1_longclick() throws Exception{
agraham.b4a.scaleimageview.ScaleImageViewWrapper _siv = null;
 //BA.debugLineNum = 191;BA.debugLine="Sub ScaleImageView1_LongClick 'The user has long p";
 //BA.debugLineNum = 192;BA.debugLine="Dim siv As ScaleImageView = Sender";
_siv = new agraham.b4a.scaleimageview.ScaleImageViewWrapper();
_siv = (agraham.b4a.scaleimageview.ScaleImageViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new agraham.b4a.scaleimageview.ScaleImageViewWrapper(), (agraham.b4a.scaleimageview.ScaleImageViewWrapper.CircleView)(__c.Sender(ba)));
 //BA.debugLineNum = 194;BA.debugLine="viewx = siv.ClickViewX";
_viewx = (int) (_siv.getClickViewX());
 //BA.debugLineNum = 195;BA.debugLine="viewy = siv.ClickViewY";
_viewy = (int) (_siv.getClickViewY());
 //BA.debugLineNum = 196;BA.debugLine="imagex =  siv.ClickImageX";
_imagex = (int) (_siv.getClickImageX());
 //BA.debugLineNum = 197;BA.debugLine="imagey =  siv.ClickImageY";
_imagey = (int) (_siv.getClickImageY());
 //BA.debugLineNum = 206;BA.debugLine="End Sub";
return "";
}
public String  _scaleimageview1_ondraw(anywheresoftware.b4a.objects.drawable.CanvasWrapper _viewcanvas) throws Exception{
 //BA.debugLineNum = 208;BA.debugLine="Sub ScaleImageView1_OnDraw(viewcanvas As Canvas) '";
 //BA.debugLineNum = 227;BA.debugLine="End Sub";
return "";
}
public String  _setwallpaper(anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _bmp) throws Exception{
anywheresoftware.b4a.agraham.reflection.Reflection _r = null;
String _exeption = "";
 //BA.debugLineNum = 304;BA.debugLine="Sub SetWallPaper(Bmp As Bitmap)";
 //BA.debugLineNum = 305;BA.debugLine="Try";
try { //BA.debugLineNum = 306;BA.debugLine="Dim r As Reflector";
_r = new anywheresoftware.b4a.agraham.reflection.Reflection();
 //BA.debugLineNum = 307;BA.debugLine="r.Target = r.RunStaticMethod(\"android.app.Wallpa";
_r.Target = _r.RunStaticMethod("android.app.WallpaperManager","getInstance",new Object[]{(Object)(_r.GetContext(ba))},new String[]{"android.content.Context"});
 //BA.debugLineNum = 309;BA.debugLine="r.RunMethod4(\"setBitmap\", Array As Object(Bmp),";
_r.RunMethod4("setBitmap",new Object[]{(Object)(_bmp.getObject())},new String[]{"android.graphics.Bitmap"});
 //BA.debugLineNum = 310;BA.debugLine="ToastMessageShow(\"The wallpaper has been set Suc";
__c.ToastMessageShow(BA.ObjectToCharSequence("The wallpaper has been set Successfully."),__c.True);
 } 
       catch (Exception e7) {
			ba.setLastException(e7); //BA.debugLineNum = 312;BA.debugLine="Dim Exeption As String =LastException";
_exeption = BA.ObjectToString(__c.LastException(ba));
 //BA.debugLineNum = 313;BA.debugLine="Log(Exeption)";
__c.LogImpl("63997705",_exeption,0);
 //BA.debugLineNum = 314;BA.debugLine="ToastMessageShow(Exeption, True)";
__c.ToastMessageShow(BA.ObjectToCharSequence(_exeption),__c.True);
 };
 //BA.debugLineNum = 316;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 61;BA.debugLine="ImageData = ImgDat";
parent._imagedata = _imgdat;
 //BA.debugLineNum = 62;BA.debugLine="Button2.Visible = False";
parent._button2.setVisible(parent.__c.False);
 //BA.debugLineNum = 63;BA.debugLine="Button3.Visible = False";
parent._button3.setVisible(parent.__c.False);
 //BA.debugLineNum = 64;BA.debugLine="Button4.Visible = False";
parent._button4.setVisible(parent.__c.False);
 //BA.debugLineNum = 65;BA.debugLine="ScaleImageView1.Visible = False";
parent._scaleimageview1.setVisible(parent.__c.False);
 //BA.debugLineNum = 66;BA.debugLine="ScaleImageView1.Recycle";
parent._scaleimageview1.Recycle();
 //BA.debugLineNum = 68;BA.debugLine="B4XLoadingIndicator1.Show";
parent._b4xloadingindicator1._show /*String*/ ();
 //BA.debugLineNum = 70;BA.debugLine="ScaleImageView1.PanLimit = ScaleImageView1.PAN_LI";
parent._scaleimageview1.setPanLimit(parent._scaleimageview1.getPAN_LIMIT_CENTER());
 //BA.debugLineNum = 71;BA.debugLine="gestures.SetOnGestureListener(Panel1, \"Panel1\")";
parent._gestures.SetOnGestureListener(ba,(android.view.View)(parent._panel1.getObject()),"Panel1");
 //BA.debugLineNum = 73;BA.debugLine="Dim Url As String = ImgDat";
_url = _imgdat;
 //BA.debugLineNum = 75;BA.debugLine="Dim j As HttpJob";
_j = new com.holydesing.software.wallpaperhq.httpjob();
 //BA.debugLineNum = 76;BA.debugLine="j.Initialize(\"img\", Me)";
_j._initialize /*String*/ (ba,"img",parent);
 //BA.debugLineNum = 77;BA.debugLine="j.Download(Url)";
_j._download /*String*/ (_url);
 //BA.debugLineNum = 78;BA.debugLine="Wait For (j) JobDone(j As HttpJob)";
parent.__c.WaitFor("jobdone", ba, this, (Object)(_j));
this.state = 15;
return;
case 15:
//C
this.state = 1;
_j = (com.holydesing.software.wallpaperhq.httpjob) result[0];
;
 //BA.debugLineNum = 80;BA.debugLine="If j.Success Then";
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
 //BA.debugLineNum = 82;BA.debugLine="ToastMessageShow(\"Please Wait 5 seconds...\", Tru";
parent.__c.ToastMessageShow(BA.ObjectToCharSequence("Please Wait 5 seconds..."),parent.__c.True);
 //BA.debugLineNum = 84;BA.debugLine="Dim bmp As Bitmap = j.GetBitmap";
_bmp = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
_bmp = _j._getbitmap /*anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper*/ ();
 //BA.debugLineNum = 85;BA.debugLine="FullImage = bmp";
parent._fullimage = _bmp;
 //BA.debugLineNum = 87;BA.debugLine="ScaleImageView1.BringToFront";
parent._scaleimageview1.BringToFront();
 //BA.debugLineNum = 88;BA.debugLine="ScaleImageView1.DoubleTapZoomDuration = 250";
parent._scaleimageview1.setDoubleTapZoomDuration((int) (250));
 //BA.debugLineNum = 89;BA.debugLine="ScaleImageView1.Orientation = ScaleImageView1.OR";
parent._scaleimageview1.setOrientation(parent._scaleimageview1.getORIENTATION_USE_EXIF());
 //BA.debugLineNum = 92;BA.debugLine="ScaleImageView1.Image = bmp";
parent._scaleimageview1.setImage((android.graphics.Bitmap)(_bmp.getObject()));
 //BA.debugLineNum = 94;BA.debugLine="Dim loops As Int = 1";
_loops = (int) (1);
 //BA.debugLineNum = 95;BA.debugLine="Do Until ScaleImageView1.IsReady";
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
 //BA.debugLineNum = 96;BA.debugLine="Sleep(100)";
parent.__c.Sleep(ba,this,(int) (100));
this.state = 16;
return;
case 16:
//C
this.state = 7;
;
 //BA.debugLineNum = 97;BA.debugLine="loops = loops + 1";
_loops = (int) (_loops+1);
 //BA.debugLineNum = 98;BA.debugLine="If loops > 100 Then ' give it up to 10 seconds";
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
 //BA.debugLineNum = 99;BA.debugLine="Exit";
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
 //BA.debugLineNum = 103;BA.debugLine="ScaleImageView1.SetScaleAndCenter(ViewerZoom,Vie";
parent._scaleimageview1.SetScaleAndCenter(parent._viewerzoom,parent._viewerx,parent._viewery,(int) (1));
 //BA.debugLineNum = 105;BA.debugLine="ScaleImageView1.EnableCircle = False";
parent._scaleimageview1.setEnableCircle(parent.__c.False);
 //BA.debugLineNum = 108;BA.debugLine="ScaleImageView1.CircleX = CircleX";
parent._scaleimageview1.setCircleX(parent._circlex);
 //BA.debugLineNum = 109;BA.debugLine="ScaleImageView1.CircleY = CircleY";
parent._scaleimageview1.setCircleY(parent._circley);
 //BA.debugLineNum = 111;BA.debugLine="Button2.Visible = True";
parent._button2.setVisible(parent.__c.True);
 //BA.debugLineNum = 112;BA.debugLine="Button3.Visible = True";
parent._button3.setVisible(parent.__c.True);
 //BA.debugLineNum = 113;BA.debugLine="ScaleImageView1.Visible = True";
parent._scaleimageview1.setVisible(parent.__c.True);
 if (true) break;

case 13:
//C
this.state = 14;
 //BA.debugLineNum = 117;BA.debugLine="ToastMessageShow(\"Error, No Internet Connection\"";
parent.__c.ToastMessageShow(BA.ObjectToCharSequence("Error, No Internet Connection"),parent.__c.True);
 if (true) break;

case 14:
//C
this.state = -1;
;
 //BA.debugLineNum = 120;BA.debugLine="B4XLoadingIndicator1.Hide";
parent._b4xloadingindicator1._hide /*String*/ ();
 //BA.debugLineNum = 121;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 125;BA.debugLine="Try";
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
 //BA.debugLineNum = 126;BA.debugLine="ImageData = ImgDat";
parent._imagedata = _imgdat;
 //BA.debugLineNum = 127;BA.debugLine="Button2.Visible = False";
parent._button2.setVisible(parent.__c.False);
 //BA.debugLineNum = 128;BA.debugLine="Button3.Visible = False";
parent._button3.setVisible(parent.__c.False);
 //BA.debugLineNum = 129;BA.debugLine="Button4.Visible = True";
parent._button4.setVisible(parent.__c.True);
 //BA.debugLineNum = 130;BA.debugLine="ScaleImageView1.Visible = False";
parent._scaleimageview1.setVisible(parent.__c.False);
 //BA.debugLineNum = 131;BA.debugLine="ScaleImageView1.Recycle";
parent._scaleimageview1.Recycle();
 //BA.debugLineNum = 133;BA.debugLine="B4XLoadingIndicator1.Show";
parent._b4xloadingindicator1._show /*String*/ ();
 //BA.debugLineNum = 135;BA.debugLine="ScaleImageView1.PanLimit = ScaleImageView1.PAN_L";
parent._scaleimageview1.setPanLimit(parent._scaleimageview1.getPAN_LIMIT_CENTER());
 //BA.debugLineNum = 136;BA.debugLine="gestures.SetOnGestureListener(Panel1, \"Panel1\")";
parent._gestures.SetOnGestureListener(ba,(android.view.View)(parent._panel1.getObject()),"Panel1");
 //BA.debugLineNum = 138;BA.debugLine="Dim bmp As Bitmap = LoadBitmap(Main.DownloadedWa";
_bmp = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
_bmp = parent.__c.LoadBitmap(parent._main._downloadedwallpapers /*String*/ ,_imgdat);
 //BA.debugLineNum = 140;BA.debugLine="FullImage = bmp";
parent._fullimage = _bmp;
 //BA.debugLineNum = 142;BA.debugLine="ScaleImageView1.BringToFront";
parent._scaleimageview1.BringToFront();
 //BA.debugLineNum = 143;BA.debugLine="ScaleImageView1.DoubleTapZoomDuration = 250";
parent._scaleimageview1.setDoubleTapZoomDuration((int) (250));
 //BA.debugLineNum = 144;BA.debugLine="ScaleImageView1.Orientation = ScaleImageView1.OR";
parent._scaleimageview1.setOrientation(parent._scaleimageview1.getORIENTATION_USE_EXIF());
 //BA.debugLineNum = 147;BA.debugLine="ScaleImageView1.Image = bmp";
parent._scaleimageview1.setImage((android.graphics.Bitmap)(_bmp.getObject()));
 //BA.debugLineNum = 149;BA.debugLine="Dim loops As Int = 1";
_loops = (int) (1);
 //BA.debugLineNum = 150;BA.debugLine="Do Until ScaleImageView1.IsReady";
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
 //BA.debugLineNum = 151;BA.debugLine="Sleep(100)";
parent.__c.Sleep(ba,this,(int) (100));
this.state = 15;
return;
case 15:
//C
this.state = 7;
;
 //BA.debugLineNum = 152;BA.debugLine="loops = loops + 1";
_loops = (int) (_loops+1);
 //BA.debugLineNum = 153;BA.debugLine="If loops > 100 Then ' give it up to 10 seconds";
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
 //BA.debugLineNum = 154;BA.debugLine="Exit";
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
 //BA.debugLineNum = 158;BA.debugLine="ScaleImageView1.SetScaleAndCenter(ViewerZoom,Vie";
parent._scaleimageview1.SetScaleAndCenter(parent._viewerzoom,parent._viewerx,parent._viewery,(int) (1));
 //BA.debugLineNum = 160;BA.debugLine="ScaleImageView1.EnableCircle = False";
parent._scaleimageview1.setEnableCircle(parent.__c.False);
 //BA.debugLineNum = 163;BA.debugLine="ScaleImageView1.CircleX = CircleX";
parent._scaleimageview1.setCircleX(parent._circlex);
 //BA.debugLineNum = 164;BA.debugLine="ScaleImageView1.CircleY = CircleY";
parent._scaleimageview1.setCircleY(parent._circley);
 //BA.debugLineNum = 166;BA.debugLine="Button2.Visible = True";
parent._button2.setVisible(parent.__c.True);
 //BA.debugLineNum = 168;BA.debugLine="ScaleImageView1.Visible = True";
parent._scaleimageview1.setVisible(parent.__c.True);
 //BA.debugLineNum = 170;BA.debugLine="B4XLoadingIndicator1.Hide";
parent._b4xloadingindicator1._hide /*String*/ ();
 if (true) break;

case 13:
//C
this.state = 14;
this.catchState = 0;
 //BA.debugLineNum = 172;BA.debugLine="Log(LastException)";
parent.__c.LogImpl("654329392",BA.ObjectToString(parent.__c.LastException(ba)),0);
 //BA.debugLineNum = 173;BA.debugLine="ToastMessageShow(\"Image Corrupted!\", False)";
parent.__c.ToastMessageShow(BA.ObjectToCharSequence("Image Corrupted!"),parent.__c.False);
 if (true) break;
if (true) break;

case 14:
//C
this.state = -1;
this.catchState = 0;
;
 //BA.debugLineNum = 175;BA.debugLine="End Sub";
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
