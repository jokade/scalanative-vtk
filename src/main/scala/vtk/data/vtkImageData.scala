package vtk.data

import vtk.{VtkType, vtkIdType}

import scalanative._
import unsafe._
import cxx._

/**
 * @see [[https://vtk.org/doc/nightly/html/classvtkImageData.html]]
 */
@Cxx
@include("<vtkImageData.h>")
class vtkImageData extends vtkDataSet {

  def SetDimensions(i: Int, j: Int, k: Int): Unit = extern

  def GetDataDimension(): Int = extern

  def AllocateScalars(dataType: VtkType, numComponents: Int): Unit = extern

  def GetScalarComponentAsDouble(x: Int, y: Int, z: Int, component: Int): Double = extern
  def SetScalarComponentFromDouble(x: Int, y: Int, z: Int, component: Int, value: Double): Unit = extern

  def SetSpacing(i: Double, j: Double, k: Double): Unit = extern

  def SetOrigin(i: Double, j: Double, k: Double): Unit = extern

  @inline final def apply(x: Int, y: Int, z: Int): Double = GetScalarComponentAsDouble(x,y,z,0)
  @inline final def apply(x: Int, y: Int, z: Int, component: Int): Double = GetScalarComponentAsDouble(x,y,z,component)
  @inline final def update(x: Int, y: Int, z: Int, component: Int, value: Double): Unit = SetScalarComponentFromDouble(x,y,z,component,value)
  @inline final def update(x: Int, y: Int, z: Int, value: Double): Unit = SetScalarComponentFromDouble(x,y,z,0,value)
}
