package vtk.core

import vtk.{vtkIdType, vtkObject}

import scalanative._
import unsafe._
import cxx._

/**
 * @see [[https://vtk.org/doc/nightly/html/classvtkAbstractArray.html]]
 */
@Cxx
@include("<vtkAbstractArray.h>")
class vtkAbstractArray extends vtkObject {

  def Allocate(numValues: vtkIdType): Boolean = extern

  def SetNumberOfComponents(n: Int): Unit = extern
  def GetNumberOfComponents(): Int = extern

  def GetNumberOfValues(): vtkIdType = extern

  def GetSize(): vtkIdType = extern

  def GetName(): CString = extern
  def SetName(name: CString): Unit = extern
}
