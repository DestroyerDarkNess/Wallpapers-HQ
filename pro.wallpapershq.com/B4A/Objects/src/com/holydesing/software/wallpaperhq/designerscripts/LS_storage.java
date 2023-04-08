package com.holydesing.software.wallpaperhq.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_storage{

public static void LS_general(anywheresoftware.b4a.BA ba, android.view.View parent, anywheresoftware.b4a.keywords.LayoutValues lv, java.util.Map props,
java.util.Map<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) throws Exception {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
//BA.debugLineNum = 2;BA.debugLine="AutoScaleAll"[Storage/General script]
anywheresoftware.b4a.keywords.LayoutBuilder.scaleAll(views);
//BA.debugLineNum = 4;BA.debugLine="ImageView1.Top = (Label2.top - ImageView1.Height) - 10"[Storage/General script]
views.get("imageview1").vw.setTop((int)(((views.get("label2").vw.getTop())-(views.get("imageview1").vw.getHeight()))-10d));
//BA.debugLineNum = 5;BA.debugLine="ImageView1.Left = (Panel1.Width / 2 ) -  (ImageView1.Width / 2 )"[Storage/General script]
views.get("imageview1").vw.setLeft((int)(((views.get("panel1").vw.getWidth())/2d)-((views.get("imageview1").vw.getWidth())/2d)));
//BA.debugLineNum = 7;BA.debugLine="DonatePaypal.Top = (MadeWithLove1.top - DonatePaypal.Height) - 5"[Storage/General script]
views.get("donatepaypal").vw.setTop((int)(((views.get("madewithlove1").vw.getTop())-(views.get("donatepaypal").vw.getHeight()))-5d));
//BA.debugLineNum = 8;BA.debugLine="DonatePaypal.Left = (Panel1.Width / 2 ) -  (DonatePaypal.Width / 2 )"[Storage/General script]
views.get("donatepaypal").vw.setLeft((int)(((views.get("panel1").vw.getWidth())/2d)-((views.get("donatepaypal").vw.getWidth())/2d)));
//BA.debugLineNum = 10;BA.debugLine="Label4.Top = (DonatePaypal.top - Label4.Height) - 5"[Storage/General script]
views.get("label4").vw.setTop((int)(((views.get("donatepaypal").vw.getTop())-(views.get("label4").vw.getHeight()))-5d));

}
}