package vtk.core

import vtk.vtkIdType

import scala.scalanative.unsafe._

trait vtkAOSDataArrayTemplate[T] extends vtkGenericDataArray[T] {

  def SetArray(data: Ptr[T], size: vtkIdType, save: Boolean): Unit
  def SetArray(data: Ptr[Double], size: vtkIdType, save: Boolean, deleteMethod: VtkDataArrayDeleteMethod): Unit

}
