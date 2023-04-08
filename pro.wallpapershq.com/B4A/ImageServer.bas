B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=12.2
@EndOfDesignText@
Sub Class_Globals
	Public PreviewURL As String
	Public MinimizedURL As String
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize(pre As String, mini As String)
	PreviewURL = pre
	MinimizedURL = mini
End Sub