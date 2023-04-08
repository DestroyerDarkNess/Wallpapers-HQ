B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=12.2
@EndOfDesignText@
Sub Class_Globals
	Private Root As B4XView 'ignore
	Private xui As XUI 'ignore
	
	Public ImageData As String
	
	Private ScaleImageView1 As ScaleImageView
	Private Panel1 As Panel
	
	Private gestures As GestureDetector
	
	Private TouchDown As Boolean = False
	
Dim viewx As Int
	Dim viewy As Int
	Dim imagex As Int
	Dim imagey As Int
	' Parameters for Viewer Activity
	Public	 ViewerTitle As String = "Viewer"
	'Public ViewerFolder As String =  File.DirRootExternal & "/Download/"
'	Public ViewerFilename As String =  "OS Search Map.jpg"
	Public ViewerX As Float = 0.5 ' Easting of map point, 0 to 1
	Public ViewerY As Float = 0.5 ' Northing of map point, 0 to 1
	Public ViewerZoom As Float = 2 ' Zoom level to open map
	Public CircleX As Float = 0.5 ' Easting of circle position, 0 to 1
	Public CircleY As Float = 0.5 ' Northing of circle position, 0 to 1
	
	Private FullImage As Bitmap
	Private B4XLoadingIndicator1 As B4XLoadingIndicator
	Private Button1 As Button
	Private Button3 As Button
	Private Button2 As Button
	Private Button4 As Button
End Sub

'You can add more parameters here.
Public Sub Initialize As Object
	
	Return Me
End Sub

'This event will be called once, before the page becomes visible.
Private Sub B4XPage_Created (Root1 As B4XView)
	Root = Root1
	'load the layout to Root
	
	Root.LoadLayout("Viewer")
	
'	B4XPages.SetTitle(Me, "ImageViewer")
	
	B4XPages.GetManager.ShowUpIndicator = False

'	ShowImage(ImageData)
	
End Sub

'You can see the list of page related events in the B4XPagesManager object. The event name is B4XPage.


Sub ShowImage(ImgDat As String)
	ImageData = ImgDat
	Button2.Visible = False
	Button3.Visible = False
	Button4.Visible = False
	ScaleImageView1.Visible = False
	ScaleImageView1.Recycle
	
	B4XLoadingIndicator1.Show
	
	ScaleImageView1.PanLimit = ScaleImageView1.PAN_LIMIT_CENTER
	gestures.SetOnGestureListener(Panel1, "Panel1")
	
	Dim Url As String = ImgDat
	
	Dim j As HttpJob
	j.Initialize("img", Me)
	j.Download(Url)
	Wait For (j) JobDone(j As HttpJob)
	
	If j.Success Then
		
		ToastMessageShow("Please Wait 5 seconds...", True)
		
		Dim bmp As Bitmap = j.GetBitmap
		FullImage = bmp
		
		ScaleImageView1.BringToFront
		ScaleImageView1.DoubleTapZoomDuration = 250
		ScaleImageView1.Orientation = ScaleImageView1.ORIENTATION_USE_EXIF
		'	ScaleImageView1.ImageFile = Starter.ViewerFolder & Starter.ViewerFilename
	
		ScaleImageView1.Image = bmp
	
		Dim loops As Int = 1
		Do Until ScaleImageView1.IsReady
			Sleep(100)
			loops = loops + 1
			If loops > 100 Then ' give it up to 10 seconds
				Exit
			End If
		Loop
		' restore scale and centre location
		ScaleImageView1.SetScaleAndCenter(ViewerZoom,ViewerX, ViewerY, 1)
		
		ScaleImageView1.EnableCircle = False
		
		' restore circle location
		ScaleImageView1.CircleX = CircleX
		ScaleImageView1.CircleY = CircleY
		
		Button2.Visible = True
		Button3.Visible = True
		ScaleImageView1.Visible = True
		
	Else
		
		ToastMessageShow("Error, No Internet Connection", True)
		
	End If
	B4XLoadingIndicator1.Hide
End Sub


Sub ShowImageFromFile(ImgDat As String)
	Try
		ImageData = ImgDat
		Button2.Visible = False
		Button3.Visible = False
		Button4.Visible = True
		ScaleImageView1.Visible = False
		ScaleImageView1.Recycle
	
		B4XLoadingIndicator1.Show
	
		ScaleImageView1.PanLimit = ScaleImageView1.PAN_LIMIT_CENTER
		gestures.SetOnGestureListener(Panel1, "Panel1")
	
		Dim bmp As Bitmap = LoadBitmap(Main.DownloadedWallpapers,ImgDat )
	
		FullImage = bmp
		
		ScaleImageView1.BringToFront
		ScaleImageView1.DoubleTapZoomDuration = 250
		ScaleImageView1.Orientation = ScaleImageView1.ORIENTATION_USE_EXIF
		'	ScaleImageView1.ImageFile = Starter.ViewerFolder & Starter.ViewerFilename
	
		ScaleImageView1.Image = bmp
	
		Dim loops As Int = 1
		Do Until ScaleImageView1.IsReady
			Sleep(100)
			loops = loops + 1
			If loops > 100 Then ' give it up to 10 seconds
				Exit
			End If
		Loop
		' restore scale and centre location
		ScaleImageView1.SetScaleAndCenter(ViewerZoom,ViewerX, ViewerY, 1)
		
		ScaleImageView1.EnableCircle = False
		
		' restore circle location
		ScaleImageView1.CircleX = CircleX
		ScaleImageView1.CircleY = CircleY
		
		Button2.Visible = True
		'Button4.Visible = True
		ScaleImageView1.Visible = True
		
		B4XLoadingIndicator1.Hide
	Catch
		Log(LastException)
		ToastMessageShow("Image Corrupted!", False)
	End Try
End Sub



Sub ScaleImageView1_Click 'The user has tapped on the view. Use ClickImage or ClickView for the coordinates.
	Dim siv As ScaleImageView = Sender
	' Save the view and image coordinates of the point clicked.
	viewx =  siv.ClickViewX
	viewy =  siv.ClickViewY
	imagex =  siv.ClickImageX
	imagey =  siv.ClickImageY
	siv.Invalidate ' draw the new position
'	Dim msg As String = "Short: X=" & viewx & " Y=" & viewy
'	ToastMessageShow(msg, False)
End Sub

Sub ScaleImageView1_LongClick 'The user has long pressed the view. Use ClickImage or ClickView for the coordinates.
	Dim siv As ScaleImageView = Sender
	' Save the view and image coordinates of the point clicked.
	viewx = siv.ClickViewX
	viewy = siv.ClickViewY
	imagex =  siv.ClickImageX
	imagey =  siv.ClickImageY
'	Dim msg As String = "Long: X=" & imagex & " Y=" & imagey
	' move the circle to the selected location
'	siv.CircleXPixels = imagex
'	siv.CircleYPixels = imagey
''	siv.Invalidate ' draw the new position
	'ToastMessageShow(msg, False)
'	Panel1.BringToFront
'	ToastMessageShow("Panel on", False)
End Sub

Sub ScaleImageView1_OnDraw(viewcanvas As Canvas) 'The view is being redrawn. Use viewcanvas to draw on it.
	'Dim siv As ScaleImageView = Sender
	'Log("SIV_OnDraw: " & siv.CenterX)
	'Return
	' Find the pixel values for the present circle
'	Dim x As Float = siv.CircleX * siv.SrcWidth
	'Dim y As Float = siv.CircleY * siv.SrcHeight
	' Convert them to view pixel values
'	Dim viewxy() As Float = siv.SourceXYtoViewXY(x, y)
	'Dim radius As Float = siv.CircleDrawnRadius
	' Draw text that doesn't scale with the map to the right of the present circle
	'Dim tx As Float = viewxy(0) + radius*1.2
'	Dim ty As Float = viewxy(1)
	'viewcanvas.DrawText("Center", tx , ty, Typeface.DEFAULT, 20, Colors.Black, "LEFT")
	'Draw a circle and crosshair that scales with the map at the last Click or LongClick position
	'viewxy = siv.SourceXYtoViewXY(imagex, imagey )
	'viewcanvas.DrawLine(viewxy(0) - radius, viewxy(1), viewxy(0) + radius, viewxy(1), Colors.Black, siv.CircleWidth*radius/2)
	'viewcanvas.DrawLine(viewxy(0), viewxy(1) - radius, viewxy(0), viewxy(1) + radius, Colors.Black, siv.CircleWidth*radius/2)
'	viewcanvas.DrawCircle(viewxy(0), viewxy(1), radius, Colors.Red, False, siv.CircleWidth*radius)
End Sub



'Sub Panel1_Click
'	ToastMessageShow("Panel click", False)
'End Sub
'
'Sub Panel1_LongClick
'	Panel1.SendToBack
'	ToastMessageShow("Panel off", False)
'End Sub

' Action Down = 0, Up = 1, Move = 2, cancel = 3
Sub Panel1_onDoubleTap(X As Float, Y As Float, MotionEvent As Object)
	'Log("Panel1_onDoubleTap " & gestures.getAction(MotionEvent) & " : " & X & ", " & Y)
End Sub

Sub Panel1_onDown(X As Float, Y As Float, MotionEvent As Object)
	TouchDown = True
	'Log("***************************")
	'Log("Panel1_onDown " & gestures.getAction(MotionEvent) & " : " & X & ", " & Y)
End Sub

Sub Panel1_onDrag(deltaX As Float, deltaY As Float, MotionEvent As Object)
	If deltaX = 0 And deltaY = 0 Then Return
'	Log("Panel1_onDrag " & gestures.getAction(MotionEvent) & " : " & deltaX & ", " & deltaY)
End Sub

Sub Panel1_onLongPress(X As Float, Y As Float, MotionEvent As Object)
	'Log("Panel1_onLongPress " & gestures.getAction(MotionEvent) & " : " & X & ", " & Y)
	ScaleImageView1.BringToFront
End Sub

Sub Panel1_onPinchClose(NewDistance As Float, PreviousDistance As Float, MotionEvent As Object)
'	Log("Panel1_onPinchClose " & gestures.getAction(MotionEvent) & " : " & NewDistance & ", " & PreviousDistance)
End Sub

Sub Panel1_onPinchOpen(NewDistance As Float, PreviousDistance As Float, MotionEvent As Object)
'	Log("Panel1_onPinchOpen " & gestures.getAction(MotionEvent) & " : " & NewDistance & ", " & PreviousDistance)
End Sub

Sub Panel1_onRotation(Degrees As Double, MotionEvent As Object)
	'Log("Panel1_onRotation " & gestures.getAction(MotionEvent) & " : " & Degrees)
End Sub

Sub Panel1_onScroll(distanceX As Float, distanceY As Float, MotionEvent1 As Object, MotionEvent2 As Object)
	'Log("Panel1_onScroll " & gestures.getAction(MotionEvent1) & " " & gestures.getAction(MotionEvent2) & " : " & distanceX &  ", " & distanceY)
End Sub

Sub Panel1_onShowPress(X As Float, Y As Float, MotionEvent As Object)
'	Log("Panel1_onShowPress " & gestures.getAction(MotionEvent) & " : " & X & ", " & Y)
End Sub

Sub Panel1_onSingleTapConfirmed(X As Float, Y As Float, MotionEvent As Object)
	'Log("Panel1_onSingleTapConfirmed " & gestures.getAction(MotionEvent) & " : " & X & ", " & Y)
End Sub

Sub Panel1_onTouch(Action As Int, X As Float, Y As Float, MotionEvent As Object) As Boolean
	If Action = gestures.ACTION_UP Then
		TouchDown = False
	'	Log("------------------------------------")
	End If
	Return True
End Sub


Private Sub Button1_Click
	B4XPages.ClosePage(Me)
End Sub

Private Sub Button2_Click
	Dim FullImage As Bitmap = ScaleImageView1.Image
	SetWallPaper(FullImage)
End Sub


Sub SetWallPaper(Bmp As Bitmap)
	Try
		Dim r As Reflector
		r.Target = r.RunStaticMethod("android.app.WallpaperManager", "getInstance", _
      Array As Object(r.GetContext), Array As String("android.content.Context"))
		r.RunMethod4("setBitmap", Array As Object(Bmp), Array As String("android.graphics.Bitmap"))
		ToastMessageShow("The wallpaper has been set Successfully.", True)
	Catch
		Dim Exeption As String =LastException
		Log(Exeption)
		ToastMessageShow(Exeption, True)
	End Try
End Sub

Private Sub Button3_Click
	Try
		Button3.visible = False
		Dim strSplit() As String = Regex.Split("/",ImageData)
		Dim SvFilenameEx As String = strSplit(strSplit.Length - 1).Replace("wallhaven","")
		Dim FileName As String = SvFilenameEx.Replace("-","")
		
		If File.Exists(Main.DownloadedWallpapers, FileName) = True Then
			File.Delete(Main.DownloadedWallpapers, FileName)
		End If
		
		DownloadWallpaper(FullImage, FileName)
		
	Catch
		Log(LastException)
		ToastMessageShow(LastException, False)
	End Try
End Sub


Sub DownloadWallpaper(Bmp As Bitmap, FilenameEx As String)
	Try
		Dim out As OutputStream = File.OpenOutput(Main.DownloadedWallpapers, FilenameEx, False)
		Bmp.WriteToStream(out, 100, "JPEG")
		out.Close
		
		ToastMessageShow("Wallpaper Has been saved!", False)
	Catch
		Dim Exeption As String =LastException
		Log(Exeption)
		ToastMessageShow(Exeption, True)
		Button3.visible = True
	End Try
End Sub


Private Sub Button4_Click
	Try
		If File.Exists(Main.DownloadedWallpapers, ImageData) = True Then
			File.Delete(Main.DownloadedWallpapers, ImageData)
		End If
		B4XPages.MainPage.ListSaved
		B4XPages.ClosePage(Me)
	Catch
		Log(LastException)
		ToastMessageShow(LastException, False)
	End Try
End Sub