package com.holydesing.software.wallpaperhq;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class wallhaven extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "com.holydesing.software.wallpaperhq.wallhaven");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", com.holydesing.software.wallpaperhq.wallhaven.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public uk.co.gingerscrack.jSoup.jSoup _js = null;
public String _homeurl = "";
public String _latest = "";
public String _hot = "";
public String _toplist = "";
public String _random = "";
public anywheresoftware.b4a.objects.collections.List _imageurls = null;
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
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 5;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 7;BA.debugLine="Private js As jSoup";
_js = new uk.co.gingerscrack.jSoup.jSoup();
 //BA.debugLineNum = 9;BA.debugLine="Private HomeUrl As String = \"https://wallhaven.cc";
_homeurl = "https://wallhaven.cc/";
 //BA.debugLineNum = 10;BA.debugLine="Public Latest As String = HomeUrl & \"latest\"";
_latest = _homeurl+"latest";
 //BA.debugLineNum = 11;BA.debugLine="Public Hot As String = HomeUrl & \"hot\"";
_hot = _homeurl+"hot";
 //BA.debugLineNum = 12;BA.debugLine="Public Toplist As String = HomeUrl & \"toplist\"";
_toplist = _homeurl+"toplist";
 //BA.debugLineNum = 13;BA.debugLine="Public Random As String = HomeUrl & \"random\"";
_random = _homeurl+"random";
 //BA.debugLineNum = 15;BA.debugLine="Public  ImageURLs As List";
_imageurls = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 16;BA.debugLine="End Sub";
return "";
}
public String  _getimage4k(String _url) throws Exception{
String _html_source = "";
String _wallelement = "";
String _wallpaperurl = "";
 //BA.debugLineNum = 37;BA.debugLine="public Sub GetImage4K(URL) As String";
 //BA.debugLineNum = 38;BA.debugLine="Try";
try { //BA.debugLineNum = 39;BA.debugLine="Dim Html_Source As String = js.connect(URL)";
_html_source = _js.connect(_url);
 //BA.debugLineNum = 41;BA.debugLine="Dim WallElement As String = js.getElementByID(Ht";
_wallelement = _js.getElementByID(_html_source,"wallpaper");
 //BA.debugLineNum = 43;BA.debugLine="Dim WallpaperURL As String = js.selectorElementA";
_wallpaperurl = BA.ObjectToString(_js.selectorElementAttr(_wallelement,"img[src]","src").Get((int) (0)));
 //BA.debugLineNum = 44;BA.debugLine="Return  WallpaperURL";
if (true) return _wallpaperurl;
 } 
       catch (Exception e7) {
			ba.setLastException(e7); //BA.debugLineNum = 46;BA.debugLine="Log(LastException)";
__c.LogImpl("61966089",BA.ObjectToString(__c.LastException(getActivityBA())),0);
 };
 //BA.debugLineNum = 48;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.List  _getimages(String _url) throws Exception{
String _html_main_source = "";
anywheresoftware.b4a.objects.collections.List _elementlist = null;
String _preelement = "";
anywheresoftware.b4a.objects.collections.List _previewurllist = null;
anywheresoftware.b4a.objects.collections.List _minimized = null;
String _previewurltag = "";
String _minimizedimgtag = "";
String _minimizedimg = "";
String _previewurl = "";
com.holydesing.software.wallpaperhq.imageserver _imgclass = null;
 //BA.debugLineNum = 51;BA.debugLine="Public Sub GetImages(URL) As  List";
 //BA.debugLineNum = 53;BA.debugLine="ImageURLs.Clear";
_imageurls.Clear();
 //BA.debugLineNum = 55;BA.debugLine="Try";
try { //BA.debugLineNum = 56;BA.debugLine="Dim Html_Main_Source As String =  js.connect(URL";
_html_main_source = _js.connect(_url);
 //BA.debugLineNum = 57;BA.debugLine="If  Html_Main_Source.Length > 0 Then";
if (_html_main_source.length()>0) { 
 //BA.debugLineNum = 58;BA.debugLine="Dim ElementList As List =  js.getElementsByTag(";
_elementlist = new anywheresoftware.b4a.objects.collections.List();
_elementlist = _js.getElementsByTag(_html_main_source,"li");
 //BA.debugLineNum = 60;BA.debugLine="For Each PreElement As String In  ElementList";
{
final anywheresoftware.b4a.BA.IterableList group6 = _elementlist;
final int groupLen6 = group6.getSize()
;int index6 = 0;
;
for (; index6 < groupLen6;index6++){
_preelement = BA.ObjectToString(group6.Get(index6));
 //BA.debugLineNum = 61;BA.debugLine="Try";
try { //BA.debugLineNum = 63;BA.debugLine="Dim PreviewUrlList As List = js.getElementsBy";
_previewurllist = new anywheresoftware.b4a.objects.collections.List();
_previewurllist = _js.getElementsByTag(_preelement,"a");
 //BA.debugLineNum = 64;BA.debugLine="Dim Minimized As List = js.getElementsByTag(P";
_minimized = new anywheresoftware.b4a.objects.collections.List();
_minimized = _js.getElementsByTag(_preelement,"img");
 //BA.debugLineNum = 67;BA.debugLine="If Not (PreviewUrlList.size = 0) Then";
if (__c.Not(_previewurllist.getSize()==0)) { 
 //BA.debugLineNum = 69;BA.debugLine="Dim PreviewUrlTag As String =PreviewUrlList.";
_previewurltag = BA.ObjectToString(_previewurllist.Get((int) (0)));
 //BA.debugLineNum = 71;BA.debugLine="If PreviewUrlTag.StartsWith(\"<a class=\"\"prev";
if (_previewurltag.startsWith("<a class=\"preview\" ")) { 
 //BA.debugLineNum = 73;BA.debugLine="Dim MinimizedIMGTag As String = Minimized.G";
_minimizedimgtag = BA.ObjectToString(_minimized.Get((int) (0)));
 //BA.debugLineNum = 74;BA.debugLine="Dim MinimizedIMG As String = js.selectorEle";
_minimizedimg = BA.ObjectToString(_js.selectorElementAttr(_minimizedimgtag,"img[data-src]","data-src").Get((int) (0)));
 //BA.debugLineNum = 76;BA.debugLine="Dim PreviewUrl As String = js.selectorEleme";
_previewurl = BA.ObjectToString(_js.selectorElementAttr(_previewurltag,"a[href]","href").Get((int) (0)));
 //BA.debugLineNum = 80;BA.debugLine="Dim ImgClass As ImageServer";
_imgclass = new com.holydesing.software.wallpaperhq.imageserver();
 //BA.debugLineNum = 81;BA.debugLine="ImgClass.Initialize(PreviewUrl , MinimizedI";
_imgclass._initialize /*String*/ (ba,_previewurl,_minimizedimg);
 //BA.debugLineNum = 82;BA.debugLine="ImageURLs.Add(ImgClass)";
_imageurls.Add((Object)(_imgclass));
 };
 };
 } 
       catch (Exception e22) {
			ba.setLastException(e22); //BA.debugLineNum = 90;BA.debugLine="Log(LastException)";
__c.LogImpl("62031655",BA.ObjectToString(__c.LastException(getActivityBA())),0);
 };
 }
};
 }else {
 //BA.debugLineNum = 95;BA.debugLine="Log(\"Error In Request!\")";
__c.LogImpl("62031660","Error In Request!",0);
 };
 } 
       catch (Exception e29) {
			ba.setLastException(e29); //BA.debugLineNum = 98;BA.debugLine="Log(LastException)";
__c.LogImpl("62031663",BA.ObjectToString(__c.LastException(getActivityBA())),0);
 //BA.debugLineNum = 99;BA.debugLine="ToastMessageShow(LastException, True)";
__c.ToastMessageShow(BA.ObjectToCharSequence(__c.LastException(getActivityBA()).getObject()),__c.True);
 };
 //BA.debugLineNum = 102;BA.debugLine="Return ImageURLs";
if (true) return _imageurls;
 //BA.debugLineNum = 104;BA.debugLine="End Sub";
return null;
}
public String  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 19;BA.debugLine="Public Sub Initialize";
 //BA.debugLineNum = 21;BA.debugLine="ImageURLs.Initialize";
_imageurls.Initialize();
 //BA.debugLineNum = 23;BA.debugLine="End Sub";
return "";
}
public String  _makepageurl(String _baseurl,int _page) throws Exception{
 //BA.debugLineNum = 33;BA.debugLine="Public Sub MakePageUrl(BaseUrl As String,   Page A";
 //BA.debugLineNum = 34;BA.debugLine="Return BaseUrl & \"?page=\" & Page";
if (true) return _baseurl+"?page="+BA.NumberToString(_page);
 //BA.debugLineNum = 35;BA.debugLine="End Sub";
return "";
}
public String  _makesearch(String _text,int _page) throws Exception{
 //BA.debugLineNum = 29;BA.debugLine="Public Sub MakeSearch( Text As String, Page As Int";
 //BA.debugLineNum = 30;BA.debugLine="Return HomeUrl & \"search?q=\" & Text.Replace(\" \",";
if (true) return _homeurl+"search?q="+_text.replace(" ","+")+"&page="+BA.NumberToString(_page);
 //BA.debugLineNum = 31;BA.debugLine="End Sub";
return "";
}
public String  _openimageview() throws Exception{
 //BA.debugLineNum = 25;BA.debugLine="Public Sub OpenImageView";
 //BA.debugLineNum = 26;BA.debugLine="StartActivity(Viewer)";
__c.StartActivity(ba,(Object)(_viewer.getObject()));
 //BA.debugLineNum = 27;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
