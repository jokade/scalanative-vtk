package vtk.core

import vtk.{vtkIdType, vtkObject}

import scala.scalanative._
import scala.scalanative.cxx._
import scala.scalanative.unsafe._

/**
 * @see [[https://vtk.org/doc/nightly/html/classvtkDataArray.html]]
 */
@Cxx
@include("<vtkDataArray.h>")
class vtkDataArray extends vtkAbstractArray {

  def SetTuple1(idx: vtkIdType, val0: Double): Unit = extern
  def SetTuple2(idx: vtkIdType, val0: Double, val1: Double): Unit = extern
  def SetTuple3(idx: vtkIdType, val0: Double, val1: Double, val2: Double): Unit = extern

  def InsertNextTuple1(val0: Double): Unit = extern
  def InsertNextTuple2(val0: Double, val1: Double): Unit = extern
  def InsertNextTuple3(val0: Double, val1: Double, val3: Double): Unit = extern
}
