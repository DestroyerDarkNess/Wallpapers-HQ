B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=12.2
@EndOfDesignText@

Sub Class_Globals
	
	Private LocationX As Int = 4
	Private LocationY As Int = 4
	
	Private SeparationX As Int = 4
	Private SeparationY As Int = 4
	
	Private XSizeCupon As Int = 0
	Private YSizeCupon As Int = 0
	
	Public MargenP_X As Int = 4 ' As Point = New Point(4, 4)
	Public MargenP_Y As Int = 4
	
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize
	
End Sub

Public Sub Add( ContainerControl As ScrollView, ControlEx As View,  LimitedLocation As Boolean)
	If Not (ContainerControl = Null) Then
		ControlEx.Visible = False

		Dim TheLastControl As View = GetLastView(ContainerControl) 'Control = Nothing

		'If Not ContainerControl.Controls.Count = 0 Then
		'	TheLastControl = ContainerControl.Controls(ContainerControl.Controls.Count - 1)
		'End If
		'Log("Added: " & ControlEx.tag)
		If TheLastControl.IsInitialized = False Then ' TheLastControl = Null dont work :(
			
			'ContainerControl.Controls.Add(ControlEx)
			'ControlEx.Location = New Point(MargenP.X, MargenP.Y)
		
			'Dim size As Int = (screenWidth * percentage) / 100 ' Tamaño calculado en base al porcentaje
			
			'Log("SizeCount: " & ControlEx.Width & " Dip: " & DipToCurrent(ControlEx.Width))
			
			'ContainerControl.Panel.AddView(ControlEx, MargenP_X,MargenP_Y , 20%x, 20%y)
			
			ContainerControl.Panel.AddView(ControlEx, MargenP_X, MargenP_Y, ControlEx.Width, ControlEx.Height)
			
			
			'XSizeCupon = ContainerControl.Width - (ContainerControl.Controls(0).Location.X + ContainerControl.Controls(0).Width)
			'YSizeCupon = ContainerControl.Height - (ContainerControl.Controls(0).Location.X + ContainerControl.Controls(0).Height)
			
			XSizeCupon = ContainerControl.Width - (MargenP_X + ControlEx.Width)
			YSizeCupon = ContainerControl.Height - (MargenP_Y + ControlEx.Height)
			
		Else
			
			Dim NewPostX As Int = 0
			Dim NewPostY As Int = 0

			If LimitedLocation = False Then '

					NewPostX = TheLastControl.Left + TheLastControl.Width + SeparationX
					NewPostY = TheLastControl.Top

				Else

					If XSizeCupon >= (ControlEx.Width + SeparationX) Then

					NewPostX = TheLastControl.Left + TheLastControl.Width + SeparationX
					NewPostY = TheLastControl.Top

				Else

					NewPostX = MargenP_Y
					NewPostY = TheLastControl.Top + TheLastControl.Height + SeparationY

				End If

		End If


			

			LocationX = NewPostX
			LocationY = NewPostY


			'ContainerControl.Controls.Add(ControlEx)
			'ControlEx.Location = New Point(LocationX, LocationY)

			ContainerControl.Panel.AddView(ControlEx, LocationX, LocationY, ControlEx.Width, ControlEx.Height)

			TheLastControl = GetLastView(ContainerControl) 'ContainerControl.Controls(ContainerControl.Controls.Count - 1)
			
			'XSizeCupon = ContainerControl.Width - (TheLastControl.Location.X + ContainerControl.Controls(0).Width)
		    'YSizeCupon = ContainerControl.Height - (TheLastControl.Location.Y + ContainerControl.Controls(0).Height)
            
			XSizeCupon = ContainerControl.Width - (TheLastControl.Left + ContainerControl.panel.GetView(0).Width)
			YSizeCupon = ContainerControl.Height - (TheLastControl.Top + ContainerControl.panel.GetView(0).Height)
			
		End If

		ControlEx.Visible = True
	End If
End Sub

Private Sub GetLastView(SView As ScrollView) As View
	Dim panel As Panel = SView.Panel
	Dim numOfViews As Int = panel.NumberOfViews
	
If numOfViews = 0 Then
	 Return Null
 Else
	 Return  panel.GetView(numOfViews - 1)
End If
End Sub