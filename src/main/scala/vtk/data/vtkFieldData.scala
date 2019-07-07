package vtk.data

import vtk.core.vtkAbstractArray
import vtk.vtkObject

import scalanative._
import unsafe._
import cxx._

/**
 * @see [[https://vtk.org/doc/nightly/html/classvtkFieldData.html]]
 */
@Cxx
@include("<vtkFieldData.h>")
class vtkFieldData extends vtkObject {
  def AddArray(array: vtkAbstractArray): Unit = extern
  def GetNumberOfArrays(): Int = extern
}
