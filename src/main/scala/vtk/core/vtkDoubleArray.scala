package vtk.core

import de.surfice.smacrotools.debug
import vtk.vtkIdType

import scala.scalanative._
import scala.scalanative.cxx._
import scala.scalanative.unsafe._

/**
 * @see [[https://vtk.org/doc/nightly/html/classvtkDoubleArray.html]]
 */
@Cxx
@include("<vtkDoubleArray.h>")
@debug
class vtkDoubleArray extends vtkDataArray with vtkAOSDataArrayTemplate[Double] {
  def GetValue(idx: vtkIdType): Double = extern
  def SetValue(idx: vtkIdType, value: Double): Unit = extern

  def GetTypedComponent(tupleIdx: vtkIdType, compIdx: vtkIdType): CDouble = extern
  def SetTypedComponent(tupleIdx: vtkIdType, compIdx: vtkIdType, value: CDouble): Unit = extern

  def SetArray(data: Ptr[Double], size: vtkIdType, save: Boolean): Unit = extern
  def SetArray(data: Ptr[Double], size: vtkIdType, save: Boolean, deleteMethod: VtkDataArrayDeleteMethod): Unit = extern

  def GetDataTypeSize(): VtkDataArrayDeleteMethod = extern

  def InsertNextValue(value: CDouble): Unit = extern
}

object vtkDoubleArray {
  @cxxName("New")
  def apply(): vtkDoubleArray = extern
}
