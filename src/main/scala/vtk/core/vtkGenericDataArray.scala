package vtk.core

import vtk.vtkIdType

import scalanative._
import unsafe._
import cxx._

/**
 * @see [[https://vtk.org/doc/nightly/html/classvtkGenericDataArray.html]]
 */
trait vtkGenericDataArray[T] extends vtkDataArray {
  def GetValue(idx: vtkIdType): T
  def SetValue(idx: vtkIdType, value: T): Unit

  def GetTypedComponent(tupleIdx: vtkIdType, compIdx: vtkIdType): T
  def SetTypedComponent(tupleIdx: vtkIdType, compIdx: vtkIdType, value: T): Unit

  def InsertNextValue(value: T): Unit

  def GetDataTypeSize(): Int

  @inline final def apply(idx: vtkIdType): T = GetTypedComponent(idx,0)
  @inline final def update(idx: vtkIdType, value: T): Unit = SetTypedComponent(idx,0,value)
}
