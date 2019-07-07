package vtk.data

import vtk.vtkIdType

import scalanative._
import unsafe._
import cxx._

/**
 * @see [[https://vtk.org/doc/nightly/html/classvtkDataSet.html]]
 */
@Cxx
@include("<vtkDataSet.h>")
class vtkDataSet extends vtkDataObject {
  def GetNumberOfPoints(): vtkIdType = extern
  def GetNumberOfCells(): vtkIdType = extern
  def GetCellData(): vtkCellData = extern
  def GetPointData(): vtkPointData = extern
}
